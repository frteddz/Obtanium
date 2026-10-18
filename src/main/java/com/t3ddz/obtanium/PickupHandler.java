package com.t3ddz.obtanium;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.PlayerAdvancements;
import net.minecraft.server.ServerAdvancementManager;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;

public final class PickupHandler {

    @SubscribeEvent
    public static void onPickup(ItemEntityPickupEvent.Post event) {
        if (!(event.getPlayer() instanceof ServerPlayer player)) {
            return;
        }
        ItemStack stack = event.getOriginalStack();
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(stack.getItem());
        RenameTargets.Target target = null;
        for (RenameTargets.Target t : RenameTargets.TARGETS) {
            if (t.namespace().equals(id.getNamespace()) && t.path().equals(id.getPath())) {
                target = t;
                break;
            }
        }
        if (target == null) {
            return;
        }
        renameInventoryStacks(player, target);
        awardOnce(player, target);
    }

    private static void renameInventoryStacks(ServerPlayer player, RenameTargets.Target target) {
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (stack.isEmpty()) {
                continue;
            }
            ResourceLocation id = BuiltInRegistries.ITEM.getKey(stack.getItem());
            if (!id.getNamespace().equals(target.namespace()) || !id.getPath().equals(target.path())) {
                continue;
            }
            Component existing = stack.get(DataComponents.CUSTOM_NAME);
            if (existing != null && existing.getString().equals(target.display())) {
                continue;
            }
            stack.set(DataComponents.CUSTOM_NAME,
                Component.literal(target.display()).withStyle(Style.EMPTY.withItalic(false)));
        }
    }

    private static void awardOnce(ServerPlayer player, RenameTargets.Target target) {
        List<String> awarded = player.getData(ObtaniumAttachments.AWARDED.get());
        String prefix = target.path() + "_";
        for (String key : awarded) {
            if (key.equals(target.path()) || key.startsWith(prefix)) {
                return;
            }
        }
        int index = player.getRandom().nextInt(5);
        String advPath = target.path() + "_" + index;
        ResourceLocation advId = ResourceLocation.fromNamespaceAndPath(Obtanium.MOD_ID, advPath);
        ServerAdvancementManager manager = player.getServer().getAdvancements();
        AdvancementHolder holder = manager.get(advId);
        if (holder == null) {
            return;
        }
        PlayerAdvancements tracker = player.getAdvancements();
        boolean granted = tracker.award(holder, "grant");
        if (granted) {
            List<String> next = new ArrayList<>(awarded);
            next.add(target.path() + "_" + index);
            player.setData(ObtaniumAttachments.AWARDED.get(), next);
        }
    }

    private PickupHandler() {}
}
