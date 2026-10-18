package com.t3ddz.obtanium;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.common.util.FakePlayerFactory;
import net.neoforged.neoforge.gametest.GameTestHolder;
import net.neoforged.neoforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(Obtanium.MOD_ID)
@PrefixGameTestTemplate(false)
public final class PickupGameTests {

    @GameTest(template = "empty")
    public static void ingotRenameOnPickup(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        Item item = BuiltInRegistries.ITEM
            .getOptional(ResourceLocation.fromNamespaceAndPath("allthemodium", "unobtainium_ingot"))
            .orElseThrow(() -> new IllegalStateException("unobtainium ingot not registered"));
        FakePlayer player = FakePlayerFactory.getMinecraft(level);
        ItemEntity entity = helper.spawnItem(item, new Vec3(1.5, 0.0, 1.5));
        entity.playerTouch(player);

        ItemStack inInventory = player.getInventory().getItem(0);
        helper.assertTrue(!inInventory.isEmpty(), "nothing entered the fake inventory");
        Component custom = inInventory.get(DataComponents.CUSTOM_NAME);
        helper.assertTrue(custom != null, "no custom name was set");
        helper.assertTrue(custom != null && custom.getString().equals("Obtanium Ingot"),
            "display name is: " + (custom == null ? "null" : custom.getString()));
        helper.succeed();
    }

    private PickupGameTests() {}
}
