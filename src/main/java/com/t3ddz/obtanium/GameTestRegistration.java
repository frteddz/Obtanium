package com.t3ddz.obtanium;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.RegisterGameTestsEvent;

public final class GameTestRegistration {

    @SubscribeEvent
    public static void registerGameTests(RegisterGameTestsEvent event) {
        event.register(PickupGameTests.class);
    }

    private GameTestRegistration() {}
}
