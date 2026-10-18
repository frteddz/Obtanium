package com.t3ddz.obtanium;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public final class ObtaniumAttachments {
    public static final DeferredRegister<AttachmentType<?>> REGISTRY =
        DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, Obtanium.MOD_ID);

    public static final Supplier<AttachmentType<List<String>>> AWARDED =
        REGISTRY.register(
            "awarded_advancements",
            () -> AttachmentType.<List<String>>builder(() -> List.<String>of())
                .serialize(Codec.STRING.listOf())
                .copyOnDeath()
                .build()
        );

    private ObtaniumAttachments() {}
}
