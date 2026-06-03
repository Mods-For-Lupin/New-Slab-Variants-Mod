package io.github.jason13official.new_slab_variants.impl.common.registry;

import io.github.jason13official.new_slab_variants.NewSlabVariants;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;

public class ModItems {

  // ── Mineral/gem blocks ────────────────────────────────────────────────────
  public static Item COAL_BLOCK_SLAB;
  public static Item DIAMOND_BLOCK_SLAB;
  public static Item EMERALD_BLOCK_SLAB;
  public static Item GOLD_BLOCK_SLAB;
  public static Item IRON_BLOCK_SLAB;
  public static Item LAPIS_BLOCK_SLAB;
  public static Item NETHERITE_BLOCK_SLAB;
  public static Item RAW_COPPER_BLOCK_SLAB;
  public static Item RAW_GOLD_BLOCK_SLAB;
  public static Item RAW_IRON_BLOCK_SLAB;

  // ── Ores ─────────────────────────────────────────────────────────────────
  public static Item COAL_ORE_SLAB;
  public static Item COPPER_ORE_SLAB;
  public static Item DIAMOND_ORE_SLAB;
  public static Item EMERALD_ORE_SLAB;
  public static Item GOLD_ORE_SLAB;
  public static Item IRON_ORE_SLAB;
  public static Item LAPIS_ORE_SLAB;
  public static Item NETHER_GOLD_ORE_SLAB;
  public static Item NETHER_QUARTZ_ORE_SLAB;
  public static Item REDSTONE_ORE_SLAB;
  public static Item DEEPSLATE_COAL_ORE_SLAB;
  public static Item DEEPSLATE_COPPER_ORE_SLAB;
  public static Item DEEPSLATE_DIAMOND_ORE_SLAB;
  public static Item DEEPSLATE_EMERALD_ORE_SLAB;
  public static Item DEEPSLATE_GOLD_ORE_SLAB;
  public static Item DEEPSLATE_IRON_ORE_SLAB;
  public static Item DEEPSLATE_LAPIS_ORE_SLAB;
  public static Item DEEPSLATE_REDSTONE_ORE_SLAB;

  // ── Stone / underground / nether ─────────────────────────────────────────
  public static Item BASALT_SLAB;
  public static Item CALCITE_SLAB;
  public static Item DRIPSTONE_BLOCK_SLAB;
  public static Item GILDED_BLACKSTONE_SLAB;
  public static Item GLOWSTONE_SLAB;
  public static Item LODESTONE_SLAB;
  public static Item MAGMA_BLOCK_SLAB;
  public static Item NETHERRACK_SLAB;
  public static Item OBSIDIAN_SLAB;
  public static Item POLISHED_BASALT_SLAB;
  public static Item QUARTZ_BRICKS_SLAB;

  // ── Stone — chiseled / cracked / special ─────────────────────────────────
  public static Item END_STONE_SLAB;
  public static Item SMOOTH_BASALT_SLAB;
  public static Item CHISELED_STONE_BRICKS_SLAB;
  public static Item CRACKED_STONE_BRICKS_SLAB;
  public static Item CHISELED_DEEPSLATE_SLAB;
  public static Item CRACKED_DEEPSLATE_BRICKS_SLAB;
  public static Item CRACKED_DEEPSLATE_TILES_SLAB;
  public static Item CHISELED_NETHER_BRICKS_SLAB;
  public static Item CRACKED_NETHER_BRICKS_SLAB;
  public static Item CHISELED_POLISHED_BLACKSTONE_SLAB;
  public static Item CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB;
  public static Item CHISELED_RESIN_BRICKS_SLAB;

  // ── Decorative stone ─────────────────────────────────────────────────────
  public static Item BONE_BLOCK_SLAB;
  public static Item PURPUR_PILLAR_SLAB;
  public static Item QUARTZ_PILLAR_SLAB;
  public static Item TERRACOTTA_SLAB;

  // ── Terrain ──────────────────────────────────────────────────────────────
  public static Item DIRT_SLAB;
  public static Item COARSE_DIRT_SLAB;
  public static Item GRAVEL_SLAB;
  public static Item SAND_SLAB;
  public static Item RED_SAND_SLAB;

  // ── Earthy / soft ────────────────────────────────────────────────────────
  public static Item CLAY_SLAB;
  public static Item MUD_SLAB;
  public static Item ROOTED_DIRT_SLAB;
  public static Item SOUL_SOIL_SLAB;

  // ── Natural / functional ─────────────────────────────────────────────────
  public static Item BEDROCK_SLAB;
  public static Item SCULK_SLAB;
  public static Item AMETHYST_BLOCK_SLAB;
  public static Item BUDDING_AMETHYST_SLAB;
  public static Item ICE_SLAB;
  public static Item PACKED_ICE_SLAB;
  public static Item BLUE_ICE_SLAB;
  public static Item SNOW_BLOCK_SLAB;
  public static Item SPONGE_SLAB;
  public static Item WET_SPONGE_SLAB;

  // ── Nether / light sources ───────────────────────────────────────────────
  public static Item SOUL_SAND_SLAB;
  public static Item NETHER_WART_BLOCK_SLAB;
  public static Item WARPED_WART_BLOCK_SLAB;
  public static Item SHROOMLIGHT_SLAB;
  public static Item SEA_LANTERN_SLAB;

  // ── Misc ─────────────────────────────────────────────────────────────────
  public static Item REDSTONE_BLOCK_SLAB;
  public static Item REDSTONE_LAMP_SLAB;
  public static Item HONEYCOMB_BLOCK_SLAB;
  public static Item PACKED_MUD_SLAB;
  public static Item CRYING_OBSIDIAN_SLAB;
  public static Item NOTE_BLOCK_SLAB;

  // ── Organic / plant ──────────────────────────────────────────────────────
  public static Item MOSS_BLOCK_SLAB;
  public static Item PALE_MOSS_BLOCK_SLAB;
  public static Item RESIN_BLOCK_SLAB;

  // ── Leaves ───────────────────────────────────────────────────────────────
  public static Item AZALEA_LEAVES_SLAB;
  public static Item FLOWERING_AZALEA_LEAVES_SLAB;

  // ── Mushroom blocks ──────────────────────────────────────────────────────
  public static Item BROWN_MUSHROOM_BLOCK_SLAB;
  public static Item RED_MUSHROOM_BLOCK_SLAB;
  public static Item MUSHROOM_STEM_SLAB;

  // ── Wood / fungal ────────────────────────────────────────────────────────
  public static Item BAMBOO_BLOCK_SLAB;
  public static Item CRIMSON_HYPHAE_SLAB;
  public static Item STRIPPED_BAMBOO_BLOCK_SLAB;
  public static Item STRIPPED_CRIMSON_HYPHAE_SLAB;
  public static Item STRIPPED_WARPED_HYPHAE_SLAB;
  public static Item WARPED_HYPHAE_SLAB;

  // ── Copper (block / raw) ─────────────────────────────────────────────────
  public static Item COPPER_BLOCK_SLAB;
  public static Item EXPOSED_COPPER_SLAB;
  public static Item OXIDIZED_COPPER_SLAB;
  public static Item WEATHERED_COPPER_SLAB;
  public static Item CHISELED_COPPER_SLAB;
  public static Item EXPOSED_CHISELED_COPPER_SLAB;
  public static Item OXIDIZED_CHISELED_COPPER_SLAB;
  public static Item WEATHERED_CHISELED_COPPER_SLAB;
  public static Item COPPER_BULB_SLAB;
  public static Item EXPOSED_COPPER_BULB_SLAB;
  public static Item OXIDIZED_COPPER_BULB_SLAB;
  public static Item WEATHERED_COPPER_BULB_SLAB;

  // ── Copper grates ────────────────────────────────────────────────────────
  public static Item COPPER_GRATE_SLAB;
  public static Item EXPOSED_COPPER_GRATE_SLAB;
  public static Item OXIDIZED_COPPER_GRATE_SLAB;
  public static Item WEATHERED_COPPER_GRATE_SLAB;

  // ── Coral blocks ─────────────────────────────────────────────────────────
  public static Item BRAIN_CORAL_BLOCK_SLAB;
  public static Item BUBBLE_CORAL_BLOCK_SLAB;
  public static Item FIRE_CORAL_BLOCK_SLAB;
  public static Item HORN_CORAL_BLOCK_SLAB;
  public static Item TUBE_CORAL_BLOCK_SLAB;
  public static Item DEAD_BRAIN_CORAL_BLOCK_SLAB;
  public static Item DEAD_BUBBLE_CORAL_BLOCK_SLAB;
  public static Item DEAD_FIRE_CORAL_BLOCK_SLAB;
  public static Item DEAD_HORN_CORAL_BLOCK_SLAB;
  public static Item DEAD_TUBE_CORAL_BLOCK_SLAB;

  // ── Wool ─────────────────────────────────────────────────────────────────
  public static Item WHITE_WOOL_SLAB;
  public static Item ORANGE_WOOL_SLAB;
  public static Item MAGENTA_WOOL_SLAB;
  public static Item LIGHT_BLUE_WOOL_SLAB;
  public static Item YELLOW_WOOL_SLAB;
  public static Item LIME_WOOL_SLAB;
  public static Item PINK_WOOL_SLAB;
  public static Item GRAY_WOOL_SLAB;
  public static Item LIGHT_GRAY_WOOL_SLAB;
  public static Item CYAN_WOOL_SLAB;
  public static Item PURPLE_WOOL_SLAB;
  public static Item BLUE_WOOL_SLAB;
  public static Item BROWN_WOOL_SLAB;
  public static Item GREEN_WOOL_SLAB;
  public static Item RED_WOOL_SLAB;
  public static Item BLACK_WOOL_SLAB;

  // ── Concrete ─────────────────────────────────────────────────────────────
  public static Item WHITE_CONCRETE_SLAB;
  public static Item ORANGE_CONCRETE_SLAB;
  public static Item MAGENTA_CONCRETE_SLAB;
  public static Item LIGHT_BLUE_CONCRETE_SLAB;
  public static Item YELLOW_CONCRETE_SLAB;
  public static Item LIME_CONCRETE_SLAB;
  public static Item PINK_CONCRETE_SLAB;
  public static Item GRAY_CONCRETE_SLAB;
  public static Item LIGHT_GRAY_CONCRETE_SLAB;
  public static Item CYAN_CONCRETE_SLAB;
  public static Item PURPLE_CONCRETE_SLAB;
  public static Item BLUE_CONCRETE_SLAB;
  public static Item BROWN_CONCRETE_SLAB;
  public static Item GREEN_CONCRETE_SLAB;
  public static Item RED_CONCRETE_SLAB;
  public static Item BLACK_CONCRETE_SLAB;

  // ── Concrete powder ──────────────────────────────────────────────────────
  public static Item WHITE_CONCRETE_POWDER_SLAB;
  public static Item ORANGE_CONCRETE_POWDER_SLAB;
  public static Item MAGENTA_CONCRETE_POWDER_SLAB;
  public static Item LIGHT_BLUE_CONCRETE_POWDER_SLAB;
  public static Item YELLOW_CONCRETE_POWDER_SLAB;
  public static Item LIME_CONCRETE_POWDER_SLAB;
  public static Item PINK_CONCRETE_POWDER_SLAB;
  public static Item GRAY_CONCRETE_POWDER_SLAB;
  public static Item LIGHT_GRAY_CONCRETE_POWDER_SLAB;
  public static Item CYAN_CONCRETE_POWDER_SLAB;
  public static Item PURPLE_CONCRETE_POWDER_SLAB;
  public static Item BLUE_CONCRETE_POWDER_SLAB;
  public static Item BROWN_CONCRETE_POWDER_SLAB;
  public static Item GREEN_CONCRETE_POWDER_SLAB;
  public static Item RED_CONCRETE_POWDER_SLAB;
  public static Item BLACK_CONCRETE_POWDER_SLAB;

  // ── Glass / stained glass ────────────────────────────────────────────────
  public static Item GLASS_SLAB;
  public static Item TINTED_GLASS_SLAB;
  public static Item WHITE_STAINED_GLASS_SLAB;
  public static Item ORANGE_STAINED_GLASS_SLAB;
  public static Item MAGENTA_STAINED_GLASS_SLAB;
  public static Item LIGHT_BLUE_STAINED_GLASS_SLAB;
  public static Item YELLOW_STAINED_GLASS_SLAB;
  public static Item LIME_STAINED_GLASS_SLAB;
  public static Item PINK_STAINED_GLASS_SLAB;
  public static Item GRAY_STAINED_GLASS_SLAB;
  public static Item LIGHT_GRAY_STAINED_GLASS_SLAB;
  public static Item CYAN_STAINED_GLASS_SLAB;
  public static Item PURPLE_STAINED_GLASS_SLAB;
  public static Item BLUE_STAINED_GLASS_SLAB;
  public static Item BROWN_STAINED_GLASS_SLAB;
  public static Item GREEN_STAINED_GLASS_SLAB;
  public static Item RED_STAINED_GLASS_SLAB;
  public static Item BLACK_STAINED_GLASS_SLAB;

  // ── Colored terracotta ───────────────────────────────────────────────────
  public static Item WHITE_TERRACOTTA_SLAB;
  public static Item ORANGE_TERRACOTTA_SLAB;
  public static Item MAGENTA_TERRACOTTA_SLAB;
  public static Item LIGHT_BLUE_TERRACOTTA_SLAB;
  public static Item YELLOW_TERRACOTTA_SLAB;
  public static Item LIME_TERRACOTTA_SLAB;
  public static Item PINK_TERRACOTTA_SLAB;
  public static Item GRAY_TERRACOTTA_SLAB;
  public static Item LIGHT_GRAY_TERRACOTTA_SLAB;
  public static Item CYAN_TERRACOTTA_SLAB;
  public static Item PURPLE_TERRACOTTA_SLAB;
  public static Item BLUE_TERRACOTTA_SLAB;
  public static Item BROWN_TERRACOTTA_SLAB;
  public static Item GREEN_TERRACOTTA_SLAB;
  public static Item RED_TERRACOTTA_SLAB;
  public static Item BLACK_TERRACOTTA_SLAB;

  public static void register(BiConsumer<Item, Identifier> consumer) {
    // Mineral/gem blocks
    COAL_BLOCK_SLAB        = blockItem("coal_block_slab",        ModBlocks.COAL_BLOCK_SLAB,        consumer);
    DIAMOND_BLOCK_SLAB     = blockItem("diamond_block_slab",     ModBlocks.DIAMOND_BLOCK_SLAB,     consumer);
    EMERALD_BLOCK_SLAB     = blockItem("emerald_block_slab",     ModBlocks.EMERALD_BLOCK_SLAB,     consumer);
    GOLD_BLOCK_SLAB        = blockItem("gold_block_slab",        ModBlocks.GOLD_BLOCK_SLAB,        consumer);
    IRON_BLOCK_SLAB        = blockItem("iron_block_slab",        ModBlocks.IRON_BLOCK_SLAB,        consumer);
    LAPIS_BLOCK_SLAB       = blockItem("lapis_block_slab",       ModBlocks.LAPIS_BLOCK_SLAB,       consumer);
    NETHERITE_BLOCK_SLAB   = blockItem("netherite_block_slab",   ModBlocks.NETHERITE_BLOCK_SLAB,   consumer);
    RAW_COPPER_BLOCK_SLAB  = blockItem("raw_copper_block_slab",  ModBlocks.RAW_COPPER_BLOCK_SLAB,  consumer);
    RAW_GOLD_BLOCK_SLAB    = blockItem("raw_gold_block_slab",    ModBlocks.RAW_GOLD_BLOCK_SLAB,    consumer);
    RAW_IRON_BLOCK_SLAB    = blockItem("raw_iron_block_slab",    ModBlocks.RAW_IRON_BLOCK_SLAB,    consumer);

    // Ores
    COAL_ORE_SLAB               = blockItem("coal_ore_slab",               ModBlocks.COAL_ORE_SLAB,               consumer);
    COPPER_ORE_SLAB             = blockItem("copper_ore_slab",             ModBlocks.COPPER_ORE_SLAB,             consumer);
    DIAMOND_ORE_SLAB            = blockItem("diamond_ore_slab",            ModBlocks.DIAMOND_ORE_SLAB,            consumer);
    EMERALD_ORE_SLAB            = blockItem("emerald_ore_slab",            ModBlocks.EMERALD_ORE_SLAB,            consumer);
    GOLD_ORE_SLAB               = blockItem("gold_ore_slab",               ModBlocks.GOLD_ORE_SLAB,               consumer);
    IRON_ORE_SLAB               = blockItem("iron_ore_slab",               ModBlocks.IRON_ORE_SLAB,               consumer);
    LAPIS_ORE_SLAB              = blockItem("lapis_ore_slab",              ModBlocks.LAPIS_ORE_SLAB,              consumer);
    NETHER_GOLD_ORE_SLAB        = blockItem("nether_gold_ore_slab",        ModBlocks.NETHER_GOLD_ORE_SLAB,        consumer);
    NETHER_QUARTZ_ORE_SLAB      = blockItem("nether_quartz_ore_slab",      ModBlocks.NETHER_QUARTZ_ORE_SLAB,      consumer);
    REDSTONE_ORE_SLAB           = blockItem("redstone_ore_slab",           ModBlocks.REDSTONE_ORE_SLAB,           consumer);
    DEEPSLATE_COAL_ORE_SLAB     = blockItem("deepslate_coal_ore_slab",     ModBlocks.DEEPSLATE_COAL_ORE_SLAB,     consumer);
    DEEPSLATE_COPPER_ORE_SLAB   = blockItem("deepslate_copper_ore_slab",   ModBlocks.DEEPSLATE_COPPER_ORE_SLAB,   consumer);
    DEEPSLATE_DIAMOND_ORE_SLAB  = blockItem("deepslate_diamond_ore_slab",  ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB,  consumer);
    DEEPSLATE_EMERALD_ORE_SLAB  = blockItem("deepslate_emerald_ore_slab",  ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB,  consumer);
    DEEPSLATE_GOLD_ORE_SLAB     = blockItem("deepslate_gold_ore_slab",     ModBlocks.DEEPSLATE_GOLD_ORE_SLAB,     consumer);
    DEEPSLATE_IRON_ORE_SLAB     = blockItem("deepslate_iron_ore_slab",     ModBlocks.DEEPSLATE_IRON_ORE_SLAB,     consumer);
    DEEPSLATE_LAPIS_ORE_SLAB    = blockItem("deepslate_lapis_ore_slab",    ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB,    consumer);
    DEEPSLATE_REDSTONE_ORE_SLAB = blockItem("deepslate_redstone_ore_slab", ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, consumer);

    // Stone/underground/nether
    BASALT_SLAB            = blockItem("basalt_slab",            ModBlocks.BASALT_SLAB,            consumer);
    CALCITE_SLAB           = blockItem("calcite_slab",           ModBlocks.CALCITE_SLAB,           consumer);
    DRIPSTONE_BLOCK_SLAB   = blockItem("dripstone_block_slab",   ModBlocks.DRIPSTONE_BLOCK_SLAB,   consumer);
    GILDED_BLACKSTONE_SLAB = blockItem("gilded_blackstone_slab", ModBlocks.GILDED_BLACKSTONE_SLAB, consumer);
    GLOWSTONE_SLAB         = blockItem("glowstone_slab",         ModBlocks.GLOWSTONE_SLAB,         consumer);
    LODESTONE_SLAB         = blockItem("lodestone_slab",         ModBlocks.LODESTONE_SLAB,         consumer);
    MAGMA_BLOCK_SLAB       = blockItem("magma_block_slab",       ModBlocks.MAGMA_BLOCK_SLAB,       consumer);
    NETHERRACK_SLAB        = blockItem("netherrack_slab",        ModBlocks.NETHERRACK_SLAB,        consumer);
    OBSIDIAN_SLAB          = blockItem("obsidian_slab",          ModBlocks.OBSIDIAN_SLAB,          consumer);
    POLISHED_BASALT_SLAB   = blockItem("polished_basalt_slab",   ModBlocks.POLISHED_BASALT_SLAB,   consumer);
    QUARTZ_BRICKS_SLAB     = blockItem("quartz_bricks_slab",     ModBlocks.QUARTZ_BRICKS_SLAB,     consumer);

    // Stone — chiseled / cracked / special
    END_STONE_SLAB                          = blockItem("end_stone_slab",                          ModBlocks.END_STONE_SLAB,                          consumer);
    SMOOTH_BASALT_SLAB                      = blockItem("smooth_basalt_slab",                      ModBlocks.SMOOTH_BASALT_SLAB,                      consumer);
    CHISELED_STONE_BRICKS_SLAB             = blockItem("chiseled_stone_bricks_slab",             ModBlocks.CHISELED_STONE_BRICKS_SLAB,             consumer);
    CRACKED_STONE_BRICKS_SLAB              = blockItem("cracked_stone_bricks_slab",              ModBlocks.CRACKED_STONE_BRICKS_SLAB,              consumer);
    CHISELED_DEEPSLATE_SLAB                = blockItem("chiseled_deepslate_slab",                ModBlocks.CHISELED_DEEPSLATE_SLAB,                consumer);
    CRACKED_DEEPSLATE_BRICKS_SLAB          = blockItem("cracked_deepslate_bricks_slab",          ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB,          consumer);
    CRACKED_DEEPSLATE_TILES_SLAB           = blockItem("cracked_deepslate_tiles_slab",           ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB,           consumer);
    CHISELED_NETHER_BRICKS_SLAB            = blockItem("chiseled_nether_bricks_slab",            ModBlocks.CHISELED_NETHER_BRICKS_SLAB,            consumer);
    CRACKED_NETHER_BRICKS_SLAB             = blockItem("cracked_nether_bricks_slab",             ModBlocks.CRACKED_NETHER_BRICKS_SLAB,             consumer);
    CHISELED_POLISHED_BLACKSTONE_SLAB      = blockItem("chiseled_polished_blackstone_slab",      ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,      consumer);
    CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = blockItem("cracked_polished_blackstone_bricks_slab", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, consumer);
    CHISELED_RESIN_BRICKS_SLAB             = blockItem("chiseled_resin_bricks_slab",             ModBlocks.CHISELED_RESIN_BRICKS_SLAB,             consumer);

    // Decorative stone
    BONE_BLOCK_SLAB        = blockItem("bone_block_slab",        ModBlocks.BONE_BLOCK_SLAB,        consumer);
    PURPUR_PILLAR_SLAB     = blockItem("purpur_pillar_slab",     ModBlocks.PURPUR_PILLAR_SLAB,     consumer);
    QUARTZ_PILLAR_SLAB     = blockItem("quartz_pillar_slab",     ModBlocks.QUARTZ_PILLAR_SLAB,     consumer);
    TERRACOTTA_SLAB        = blockItem("terracotta_slab",        ModBlocks.TERRACOTTA_SLAB,        consumer);

    // Terrain
    DIRT_SLAB              = blockItem("dirt_slab",              ModBlocks.DIRT_SLAB,              consumer);
    COARSE_DIRT_SLAB       = blockItem("coarse_dirt_slab",       ModBlocks.COARSE_DIRT_SLAB,       consumer);
    GRAVEL_SLAB            = blockItem("gravel_slab",            ModBlocks.GRAVEL_SLAB,            consumer);
    SAND_SLAB              = blockItem("sand_slab",              ModBlocks.SAND_SLAB,              consumer);
    RED_SAND_SLAB          = blockItem("red_sand_slab",          ModBlocks.RED_SAND_SLAB,          consumer);

    // Earthy/soft
    CLAY_SLAB              = blockItem("clay_slab",              ModBlocks.CLAY_SLAB,              consumer);
    MUD_SLAB               = blockItem("mud_slab",               ModBlocks.MUD_SLAB,               consumer);
    ROOTED_DIRT_SLAB       = blockItem("rooted_dirt_slab",       ModBlocks.ROOTED_DIRT_SLAB,       consumer);
    SOUL_SOIL_SLAB         = blockItem("soul_soil_slab",         ModBlocks.SOUL_SOIL_SLAB,         consumer);

    // Natural/functional
    BEDROCK_SLAB           = blockItem("bedrock_slab",           ModBlocks.BEDROCK_SLAB,           consumer);
    SCULK_SLAB             = blockItem("sculk_slab",             ModBlocks.SCULK_SLAB,             consumer);
    AMETHYST_BLOCK_SLAB    = blockItem("amethyst_block_slab",    ModBlocks.AMETHYST_BLOCK_SLAB,    consumer);
    BUDDING_AMETHYST_SLAB  = blockItem("budding_amethyst_slab",  ModBlocks.BUDDING_AMETHYST_SLAB,  consumer);
    ICE_SLAB               = blockItem("ice_slab",               ModBlocks.ICE_SLAB,               consumer);
    PACKED_ICE_SLAB        = blockItem("packed_ice_slab",        ModBlocks.PACKED_ICE_SLAB,        consumer);
    BLUE_ICE_SLAB          = blockItem("blue_ice_slab",          ModBlocks.BLUE_ICE_SLAB,          consumer);
    SNOW_BLOCK_SLAB        = blockItem("snow_block_slab",        ModBlocks.SNOW_BLOCK_SLAB,        consumer);
    SPONGE_SLAB            = blockItem("sponge_slab",            ModBlocks.SPONGE_SLAB,            consumer);
    WET_SPONGE_SLAB        = blockItem("wet_sponge_slab",        ModBlocks.WET_SPONGE_SLAB,        consumer);

    // Nether/light
    SOUL_SAND_SLAB         = blockItem("soul_sand_slab",         ModBlocks.SOUL_SAND_SLAB,         consumer);
    NETHER_WART_BLOCK_SLAB = blockItem("nether_wart_block_slab", ModBlocks.NETHER_WART_BLOCK_SLAB, consumer);
    WARPED_WART_BLOCK_SLAB = blockItem("warped_wart_block_slab", ModBlocks.WARPED_WART_BLOCK_SLAB, consumer);
    SHROOMLIGHT_SLAB       = blockItem("shroomlight_slab",       ModBlocks.SHROOMLIGHT_SLAB,       consumer);
    SEA_LANTERN_SLAB       = blockItem("sea_lantern_slab",       ModBlocks.SEA_LANTERN_SLAB,       consumer);

    // Misc
    REDSTONE_BLOCK_SLAB    = blockItem("redstone_block_slab",    ModBlocks.REDSTONE_BLOCK_SLAB,    consumer);
    REDSTONE_LAMP_SLAB     = blockItem("redstone_lamp_slab",     ModBlocks.REDSTONE_LAMP_SLAB,     consumer);
    HONEYCOMB_BLOCK_SLAB   = blockItem("honeycomb_block_slab",   ModBlocks.HONEYCOMB_BLOCK_SLAB,   consumer);
    PACKED_MUD_SLAB        = blockItem("packed_mud_slab",        ModBlocks.PACKED_MUD_SLAB,        consumer);
    CRYING_OBSIDIAN_SLAB   = blockItem("crying_obsidian_slab",   ModBlocks.CRYING_OBSIDIAN_SLAB,   consumer);
    NOTE_BLOCK_SLAB        = blockItem("note_block_slab",        ModBlocks.NOTE_BLOCK_SLAB,        consumer);

    // Organic/plant
    MOSS_BLOCK_SLAB        = blockItem("moss_block_slab",        ModBlocks.MOSS_BLOCK_SLAB,        consumer);
    PALE_MOSS_BLOCK_SLAB   = blockItem("pale_moss_block_slab",   ModBlocks.PALE_MOSS_BLOCK_SLAB,   consumer);
    RESIN_BLOCK_SLAB       = blockItem("resin_block_slab",       ModBlocks.RESIN_BLOCK_SLAB,       consumer);

    // Leaves
    AZALEA_LEAVES_SLAB           = blockItem("azalea_leaves_slab",           ModBlocks.AZALEA_LEAVES_SLAB,           consumer);
    FLOWERING_AZALEA_LEAVES_SLAB = blockItem("flowering_azalea_leaves_slab", ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB, consumer);

    // Mushroom blocks
    BROWN_MUSHROOM_BLOCK_SLAB = blockItem("brown_mushroom_block_slab", ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB, consumer);
    RED_MUSHROOM_BLOCK_SLAB   = blockItem("red_mushroom_block_slab",   ModBlocks.RED_MUSHROOM_BLOCK_SLAB,   consumer);
    MUSHROOM_STEM_SLAB        = blockItem("mushroom_stem_slab",        ModBlocks.MUSHROOM_STEM_SLAB,        consumer);

    // Wood/fungal
    BAMBOO_BLOCK_SLAB            = blockItem("bamboo_block_slab",            ModBlocks.BAMBOO_BLOCK_SLAB,            consumer);
    CRIMSON_HYPHAE_SLAB          = blockItem("crimson_hyphae_slab",          ModBlocks.CRIMSON_HYPHAE_SLAB,          consumer);
    STRIPPED_BAMBOO_BLOCK_SLAB   = blockItem("stripped_bamboo_block_slab",   ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,   consumer);
    STRIPPED_CRIMSON_HYPHAE_SLAB = blockItem("stripped_crimson_hyphae_slab", ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, consumer);
    STRIPPED_WARPED_HYPHAE_SLAB  = blockItem("stripped_warped_hyphae_slab",  ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  consumer);
    WARPED_HYPHAE_SLAB           = blockItem("warped_hyphae_slab",           ModBlocks.WARPED_HYPHAE_SLAB,           consumer);

    // Copper (block/raw)
    COPPER_BLOCK_SLAB              = blockItem("copper_block_slab",              ModBlocks.COPPER_BLOCK_SLAB,              consumer);
    EXPOSED_COPPER_SLAB            = blockItem("exposed_copper_slab",            ModBlocks.EXPOSED_COPPER_SLAB,            consumer);
    OXIDIZED_COPPER_SLAB           = blockItem("oxidized_copper_slab",           ModBlocks.OXIDIZED_COPPER_SLAB,           consumer);
    WEATHERED_COPPER_SLAB          = blockItem("weathered_copper_slab",          ModBlocks.WEATHERED_COPPER_SLAB,          consumer);
    CHISELED_COPPER_SLAB           = blockItem("chiseled_copper_slab",           ModBlocks.CHISELED_COPPER_SLAB,           consumer);
    EXPOSED_CHISELED_COPPER_SLAB   = blockItem("exposed_chiseled_copper_slab",   ModBlocks.EXPOSED_CHISELED_COPPER_SLAB,   consumer);
    OXIDIZED_CHISELED_COPPER_SLAB  = blockItem("oxidized_chiseled_copper_slab",  ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB,  consumer);
    WEATHERED_CHISELED_COPPER_SLAB = blockItem("weathered_chiseled_copper_slab", ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, consumer);
    COPPER_BULB_SLAB               = blockItem("copper_bulb_slab",               ModBlocks.COPPER_BULB_SLAB,               consumer);
    EXPOSED_COPPER_BULB_SLAB       = blockItem("exposed_copper_bulb_slab",       ModBlocks.EXPOSED_COPPER_BULB_SLAB,       consumer);
    OXIDIZED_COPPER_BULB_SLAB      = blockItem("oxidized_copper_bulb_slab",      ModBlocks.OXIDIZED_COPPER_BULB_SLAB,      consumer);
    WEATHERED_COPPER_BULB_SLAB     = blockItem("weathered_copper_bulb_slab",     ModBlocks.WEATHERED_COPPER_BULB_SLAB,     consumer);

    // Copper grates
    COPPER_GRATE_SLAB           = blockItem("copper_grate_slab",           ModBlocks.COPPER_GRATE_SLAB,           consumer);
    EXPOSED_COPPER_GRATE_SLAB   = blockItem("exposed_copper_grate_slab",   ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   consumer);
    OXIDIZED_COPPER_GRATE_SLAB  = blockItem("oxidized_copper_grate_slab",  ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  consumer);
    WEATHERED_COPPER_GRATE_SLAB = blockItem("weathered_copper_grate_slab", ModBlocks.WEATHERED_COPPER_GRATE_SLAB, consumer);

    // Coral blocks
    BRAIN_CORAL_BLOCK_SLAB       = blockItem("brain_coral_block_slab",       ModBlocks.BRAIN_CORAL_BLOCK_SLAB,       consumer);
    BUBBLE_CORAL_BLOCK_SLAB      = blockItem("bubble_coral_block_slab",      ModBlocks.BUBBLE_CORAL_BLOCK_SLAB,      consumer);
    FIRE_CORAL_BLOCK_SLAB        = blockItem("fire_coral_block_slab",        ModBlocks.FIRE_CORAL_BLOCK_SLAB,        consumer);
    HORN_CORAL_BLOCK_SLAB        = blockItem("horn_coral_block_slab",        ModBlocks.HORN_CORAL_BLOCK_SLAB,        consumer);
    TUBE_CORAL_BLOCK_SLAB        = blockItem("tube_coral_block_slab",        ModBlocks.TUBE_CORAL_BLOCK_SLAB,        consumer);
    DEAD_BRAIN_CORAL_BLOCK_SLAB  = blockItem("dead_brain_coral_block_slab",  ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB,  consumer);
    DEAD_BUBBLE_CORAL_BLOCK_SLAB = blockItem("dead_bubble_coral_block_slab", ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB, consumer);
    DEAD_FIRE_CORAL_BLOCK_SLAB   = blockItem("dead_fire_coral_block_slab",   ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB,   consumer);
    DEAD_HORN_CORAL_BLOCK_SLAB   = blockItem("dead_horn_coral_block_slab",   ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB,   consumer);
    DEAD_TUBE_CORAL_BLOCK_SLAB   = blockItem("dead_tube_coral_block_slab",   ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB,   consumer);

    // Wool
    WHITE_WOOL_SLAB      = blockItem("white_wool_slab",      ModBlocks.WHITE_WOOL_SLAB,      consumer);
    ORANGE_WOOL_SLAB     = blockItem("orange_wool_slab",     ModBlocks.ORANGE_WOOL_SLAB,     consumer);
    MAGENTA_WOOL_SLAB    = blockItem("magenta_wool_slab",    ModBlocks.MAGENTA_WOOL_SLAB,    consumer);
    LIGHT_BLUE_WOOL_SLAB = blockItem("light_blue_wool_slab", ModBlocks.LIGHT_BLUE_WOOL_SLAB, consumer);
    YELLOW_WOOL_SLAB     = blockItem("yellow_wool_slab",     ModBlocks.YELLOW_WOOL_SLAB,     consumer);
    LIME_WOOL_SLAB       = blockItem("lime_wool_slab",       ModBlocks.LIME_WOOL_SLAB,       consumer);
    PINK_WOOL_SLAB       = blockItem("pink_wool_slab",       ModBlocks.PINK_WOOL_SLAB,       consumer);
    GRAY_WOOL_SLAB       = blockItem("gray_wool_slab",       ModBlocks.GRAY_WOOL_SLAB,       consumer);
    LIGHT_GRAY_WOOL_SLAB = blockItem("light_gray_wool_slab", ModBlocks.LIGHT_GRAY_WOOL_SLAB, consumer);
    CYAN_WOOL_SLAB       = blockItem("cyan_wool_slab",       ModBlocks.CYAN_WOOL_SLAB,       consumer);
    PURPLE_WOOL_SLAB     = blockItem("purple_wool_slab",     ModBlocks.PURPLE_WOOL_SLAB,     consumer);
    BLUE_WOOL_SLAB       = blockItem("blue_wool_slab",       ModBlocks.BLUE_WOOL_SLAB,       consumer);
    BROWN_WOOL_SLAB      = blockItem("brown_wool_slab",      ModBlocks.BROWN_WOOL_SLAB,      consumer);
    GREEN_WOOL_SLAB      = blockItem("green_wool_slab",      ModBlocks.GREEN_WOOL_SLAB,      consumer);
    RED_WOOL_SLAB        = blockItem("red_wool_slab",        ModBlocks.RED_WOOL_SLAB,        consumer);
    BLACK_WOOL_SLAB      = blockItem("black_wool_slab",      ModBlocks.BLACK_WOOL_SLAB,      consumer);

    // Concrete
    WHITE_CONCRETE_SLAB      = blockItem("white_concrete_slab",      ModBlocks.WHITE_CONCRETE_SLAB,      consumer);
    ORANGE_CONCRETE_SLAB     = blockItem("orange_concrete_slab",     ModBlocks.ORANGE_CONCRETE_SLAB,     consumer);
    MAGENTA_CONCRETE_SLAB    = blockItem("magenta_concrete_slab",    ModBlocks.MAGENTA_CONCRETE_SLAB,    consumer);
    LIGHT_BLUE_CONCRETE_SLAB = blockItem("light_blue_concrete_slab", ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, consumer);
    YELLOW_CONCRETE_SLAB     = blockItem("yellow_concrete_slab",     ModBlocks.YELLOW_CONCRETE_SLAB,     consumer);
    LIME_CONCRETE_SLAB       = blockItem("lime_concrete_slab",       ModBlocks.LIME_CONCRETE_SLAB,       consumer);
    PINK_CONCRETE_SLAB       = blockItem("pink_concrete_slab",       ModBlocks.PINK_CONCRETE_SLAB,       consumer);
    GRAY_CONCRETE_SLAB       = blockItem("gray_concrete_slab",       ModBlocks.GRAY_CONCRETE_SLAB,       consumer);
    LIGHT_GRAY_CONCRETE_SLAB = blockItem("light_gray_concrete_slab", ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, consumer);
    CYAN_CONCRETE_SLAB       = blockItem("cyan_concrete_slab",       ModBlocks.CYAN_CONCRETE_SLAB,       consumer);
    PURPLE_CONCRETE_SLAB     = blockItem("purple_concrete_slab",     ModBlocks.PURPLE_CONCRETE_SLAB,     consumer);
    BLUE_CONCRETE_SLAB       = blockItem("blue_concrete_slab",       ModBlocks.BLUE_CONCRETE_SLAB,       consumer);
    BROWN_CONCRETE_SLAB      = blockItem("brown_concrete_slab",      ModBlocks.BROWN_CONCRETE_SLAB,      consumer);
    GREEN_CONCRETE_SLAB      = blockItem("green_concrete_slab",      ModBlocks.GREEN_CONCRETE_SLAB,      consumer);
    RED_CONCRETE_SLAB        = blockItem("red_concrete_slab",        ModBlocks.RED_CONCRETE_SLAB,        consumer);
    BLACK_CONCRETE_SLAB      = blockItem("black_concrete_slab",      ModBlocks.BLACK_CONCRETE_SLAB,      consumer);

    // Concrete powder
    WHITE_CONCRETE_POWDER_SLAB      = blockItem("white_concrete_powder_slab",      ModBlocks.WHITE_CONCRETE_POWDER_SLAB,      consumer);
    ORANGE_CONCRETE_POWDER_SLAB     = blockItem("orange_concrete_powder_slab",     ModBlocks.ORANGE_CONCRETE_POWDER_SLAB,     consumer);
    MAGENTA_CONCRETE_POWDER_SLAB    = blockItem("magenta_concrete_powder_slab",    ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB,    consumer);
    LIGHT_BLUE_CONCRETE_POWDER_SLAB = blockItem("light_blue_concrete_powder_slab", ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, consumer);
    YELLOW_CONCRETE_POWDER_SLAB     = blockItem("yellow_concrete_powder_slab",     ModBlocks.YELLOW_CONCRETE_POWDER_SLAB,     consumer);
    LIME_CONCRETE_POWDER_SLAB       = blockItem("lime_concrete_powder_slab",       ModBlocks.LIME_CONCRETE_POWDER_SLAB,       consumer);
    PINK_CONCRETE_POWDER_SLAB       = blockItem("pink_concrete_powder_slab",       ModBlocks.PINK_CONCRETE_POWDER_SLAB,       consumer);
    GRAY_CONCRETE_POWDER_SLAB       = blockItem("gray_concrete_powder_slab",       ModBlocks.GRAY_CONCRETE_POWDER_SLAB,       consumer);
    LIGHT_GRAY_CONCRETE_POWDER_SLAB = blockItem("light_gray_concrete_powder_slab", ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, consumer);
    CYAN_CONCRETE_POWDER_SLAB       = blockItem("cyan_concrete_powder_slab",       ModBlocks.CYAN_CONCRETE_POWDER_SLAB,       consumer);
    PURPLE_CONCRETE_POWDER_SLAB     = blockItem("purple_concrete_powder_slab",     ModBlocks.PURPLE_CONCRETE_POWDER_SLAB,     consumer);
    BLUE_CONCRETE_POWDER_SLAB       = blockItem("blue_concrete_powder_slab",       ModBlocks.BLUE_CONCRETE_POWDER_SLAB,       consumer);
    BROWN_CONCRETE_POWDER_SLAB      = blockItem("brown_concrete_powder_slab",      ModBlocks.BROWN_CONCRETE_POWDER_SLAB,      consumer);
    GREEN_CONCRETE_POWDER_SLAB      = blockItem("green_concrete_powder_slab",      ModBlocks.GREEN_CONCRETE_POWDER_SLAB,      consumer);
    RED_CONCRETE_POWDER_SLAB        = blockItem("red_concrete_powder_slab",        ModBlocks.RED_CONCRETE_POWDER_SLAB,        consumer);
    BLACK_CONCRETE_POWDER_SLAB      = blockItem("black_concrete_powder_slab",      ModBlocks.BLACK_CONCRETE_POWDER_SLAB,      consumer);

    // Glass / stained glass
    GLASS_SLAB                    = blockItem("glass_slab",                    ModBlocks.GLASS_SLAB,                    consumer);
    TINTED_GLASS_SLAB             = blockItem("tinted_glass_slab",             ModBlocks.TINTED_GLASS_SLAB,             consumer);
    WHITE_STAINED_GLASS_SLAB      = blockItem("white_stained_glass_slab",      ModBlocks.WHITE_STAINED_GLASS_SLAB,      consumer);
    ORANGE_STAINED_GLASS_SLAB     = blockItem("orange_stained_glass_slab",     ModBlocks.ORANGE_STAINED_GLASS_SLAB,     consumer);
    MAGENTA_STAINED_GLASS_SLAB    = blockItem("magenta_stained_glass_slab",    ModBlocks.MAGENTA_STAINED_GLASS_SLAB,    consumer);
    LIGHT_BLUE_STAINED_GLASS_SLAB = blockItem("light_blue_stained_glass_slab", ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, consumer);
    YELLOW_STAINED_GLASS_SLAB     = blockItem("yellow_stained_glass_slab",     ModBlocks.YELLOW_STAINED_GLASS_SLAB,     consumer);
    LIME_STAINED_GLASS_SLAB       = blockItem("lime_stained_glass_slab",       ModBlocks.LIME_STAINED_GLASS_SLAB,       consumer);
    PINK_STAINED_GLASS_SLAB       = blockItem("pink_stained_glass_slab",       ModBlocks.PINK_STAINED_GLASS_SLAB,       consumer);
    GRAY_STAINED_GLASS_SLAB       = blockItem("gray_stained_glass_slab",       ModBlocks.GRAY_STAINED_GLASS_SLAB,       consumer);
    LIGHT_GRAY_STAINED_GLASS_SLAB = blockItem("light_gray_stained_glass_slab", ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, consumer);
    CYAN_STAINED_GLASS_SLAB       = blockItem("cyan_stained_glass_slab",       ModBlocks.CYAN_STAINED_GLASS_SLAB,       consumer);
    PURPLE_STAINED_GLASS_SLAB     = blockItem("purple_stained_glass_slab",     ModBlocks.PURPLE_STAINED_GLASS_SLAB,     consumer);
    BLUE_STAINED_GLASS_SLAB       = blockItem("blue_stained_glass_slab",       ModBlocks.BLUE_STAINED_GLASS_SLAB,       consumer);
    BROWN_STAINED_GLASS_SLAB      = blockItem("brown_stained_glass_slab",      ModBlocks.BROWN_STAINED_GLASS_SLAB,      consumer);
    GREEN_STAINED_GLASS_SLAB      = blockItem("green_stained_glass_slab",      ModBlocks.GREEN_STAINED_GLASS_SLAB,      consumer);
    RED_STAINED_GLASS_SLAB        = blockItem("red_stained_glass_slab",        ModBlocks.RED_STAINED_GLASS_SLAB,        consumer);
    BLACK_STAINED_GLASS_SLAB      = blockItem("black_stained_glass_slab",      ModBlocks.BLACK_STAINED_GLASS_SLAB,      consumer);

    // Colored terracotta
    WHITE_TERRACOTTA_SLAB      = blockItem("white_terracotta_slab",      ModBlocks.WHITE_TERRACOTTA_SLAB,      consumer);
    ORANGE_TERRACOTTA_SLAB     = blockItem("orange_terracotta_slab",     ModBlocks.ORANGE_TERRACOTTA_SLAB,     consumer);
    MAGENTA_TERRACOTTA_SLAB    = blockItem("magenta_terracotta_slab",    ModBlocks.MAGENTA_TERRACOTTA_SLAB,    consumer);
    LIGHT_BLUE_TERRACOTTA_SLAB = blockItem("light_blue_terracotta_slab", ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, consumer);
    YELLOW_TERRACOTTA_SLAB     = blockItem("yellow_terracotta_slab",     ModBlocks.YELLOW_TERRACOTTA_SLAB,     consumer);
    LIME_TERRACOTTA_SLAB       = blockItem("lime_terracotta_slab",       ModBlocks.LIME_TERRACOTTA_SLAB,       consumer);
    PINK_TERRACOTTA_SLAB       = blockItem("pink_terracotta_slab",       ModBlocks.PINK_TERRACOTTA_SLAB,       consumer);
    GRAY_TERRACOTTA_SLAB       = blockItem("gray_terracotta_slab",       ModBlocks.GRAY_TERRACOTTA_SLAB,       consumer);
    LIGHT_GRAY_TERRACOTTA_SLAB = blockItem("light_gray_terracotta_slab", ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, consumer);
    CYAN_TERRACOTTA_SLAB       = blockItem("cyan_terracotta_slab",       ModBlocks.CYAN_TERRACOTTA_SLAB,       consumer);
    PURPLE_TERRACOTTA_SLAB     = blockItem("purple_terracotta_slab",     ModBlocks.PURPLE_TERRACOTTA_SLAB,     consumer);
    BLUE_TERRACOTTA_SLAB       = blockItem("blue_terracotta_slab",       ModBlocks.BLUE_TERRACOTTA_SLAB,       consumer);
    BROWN_TERRACOTTA_SLAB      = blockItem("brown_terracotta_slab",      ModBlocks.BROWN_TERRACOTTA_SLAB,      consumer);
    GREEN_TERRACOTTA_SLAB      = blockItem("green_terracotta_slab",      ModBlocks.GREEN_TERRACOTTA_SLAB,      consumer);
    RED_TERRACOTTA_SLAB        = blockItem("red_terracotta_slab",        ModBlocks.RED_TERRACOTTA_SLAB,        consumer);
    BLACK_TERRACOTTA_SLAB      = blockItem("black_terracotta_slab",      ModBlocks.BLACK_TERRACOTTA_SLAB,      consumer);
  }

  private static Item blockItem(String name, Block block, BiConsumer<Item, Identifier> consumer) {
    return construct(name, p -> new BlockItem(block, p), new Properties(), consumer);
  }

  private static Item construct(String name, Function<Properties, Item> constructor, Properties properties, BiConsumer<Item, Identifier> consumer) {
    Identifier id = NewSlabVariants.id(name);
    Item item = constructor.apply(properties.setId(ResourceKey.create(Registries.ITEM, id)));
    consumer.accept(item, id);
    return item;
  }
}
