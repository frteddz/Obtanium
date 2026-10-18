package com.t3ddz.obtanium;

import java.util.List;

public final class RenameTargets {
    public record Target(String namespace, String path, String display) {}

    public static final List<Target> TARGETS = List.of(
        new Target("allthemodium", "unobtainium_ore", "Obtanium Ore"),
        new Target("allthemodium", "raw_unobtainium", "Raw Obtanium Ore"),
        new Target("allthemodium", "raw_unobtainium_block", "Block of Raw Obtanium"),
        new Target("allthemodium", "crushed_unobtainium", "Crushed Obtanium"),
        new Target("allthemodium", "unobtainium_clump", "Obtanium Clump"),
        new Target("allthemodium", "unobtainium_shard", "Obtanium Shard"),
        new Target("allthemodium", "unobtainium_crystal", "Obtanium Crystal"),
        new Target("allthemodium", "dirty_unobtainium_dust", "Dirty Obtanium Dust"),
        new Target("allthemodium", "unobtainium_ingot", "Obtanium Ingot"),
        new Target("allthemodium", "unobtainium_nugget", "Obtanium Nugget"),
        new Target("allthemodium", "unobtainium_dust", "Obtanium Dust"),
        new Target("allthemodium", "unobtainium_block", "Block of Obtanium"),
        new Target("allthemodium", "unobtainium_plate", "Obtanium Plate"),
        new Target("allthemodium", "unobtainium_rod", "Obtanium Rod"),
        new Target("allthemodium", "unobtainium_gear", "Obtanium Gear"),
        new Target("allthemodium", "unobtainium_helmet", "Obtanium Helmet"),
        new Target("allthemodium", "unobtainium_chestplate", "Obtanium Chestplate"),
        new Target("allthemodium", "unobtainium_leggings", "Obtanium Leggings"),
        new Target("allthemodium", "unobtainium_boots", "Obtanium Boots"),
        new Target("allthemodium", "unobtainium_pickaxe", "Obtanium Pickaxe"),
        new Target("allthemodium", "unobtainium_axe", "Obtanium Axe"),
        new Target("allthemodium", "unobtainium_shovel", "Obtanium Shovel"),
        new Target("allthemodium", "unobtainium_hoe", "Obtanium Hoe"),
        new Target("allthemodium", "unobtainium_sword", "Obtanium Sword"),
        new Target("allthemodium", "unobtainium_crossbow", "Obtanium Crossbow"),
        new Target("allthemodium", "unobtainium_mace", "Obtanium Mace"),
        new Target("allthemodium", "unobtainium_brush", "Obtanium Brush"),
        new Target("allthemodium", "unobtainium_vibranium_alloy_ingot", "Obtanium - Vibranium Alloy Ingot"),
        new Target("allthemodium", "unobtainium_vibranium_alloy_dust", "Obtanium - Vibranium Alloy Dust"),
        new Target("allthemodium", "unobtainium_vibranium_alloy_block", "Block of Obtanium - Vibranium Alloy"),
        new Target("allthemodium", "unobtainium_allthemodium_alloy_ingot", "Obtanium - Allthemodium Alloy Ingot"),
        new Target("allthemodium", "unobtainium_allthemodium_alloy_dust", "Obtanium - Allthemodium Alloy Dust"),
        new Target("allthemodium", "unobtainium_allthemodium_alloy_block", "Block of Obtanium - Allthemodium Alloy"),
        new Target("allthemodium", "molten_unobtainium", "Molten Obtanium"),
        new Target("allthemodium", "molten_unobtainium_bucket", "Molten Obtanium Bucket"),
        new Target("allthemodium", "vapor_unobtainium", "Obtanium Vapor"),
        new Target("allthemodium", "vapor_unobtainium_bucket", "Obtanium Vapor Bucket"),
        new Target("allthemodium", "molten_vibunob", "Obtanium-Vibranium Alloy"),
        new Target("allthemodium", "molten_atmunob", "Obtanium-Allthemodium Alloy"),
        new Target("allthemodium", "clean_unobtainium", "Clean Obtanium Slurry"),
        new Target("allthemodium", "dirty_unobtainium", "Dirty Obtanium Slurry"),
        new Target("allthemodium", "unobtainium_upgrade_smithing_template", "Obtanium Smithing Template"),
        new Target("iceandfire", "unobtainium_pile", "Obtanium Nugget Pile")
    );

    private RenameTargets() {}
}
