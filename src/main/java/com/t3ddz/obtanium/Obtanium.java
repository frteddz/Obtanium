package com.t3ddz.obtanium;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(Obtanium.MOD_ID)
public final class Obtanium {
    public static final String MOD_ID = "obtanium";

    public Obtanium(IEventBus modEventBus, ModContainer modContainer) {
        ObtaniumAttachments.REGISTRY.register(modEventBus);
        NeoForge.EVENT_BUS.register(PickupHandler.class);
        modEventBus.register(GameTestRegistration.class);
    }
}
