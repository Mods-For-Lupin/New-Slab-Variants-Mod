package io.github.jason13official.new_slab_variants.impl.common.registry;

import io.github.jason13official.new_slab_variants.NewSlabVariants;
import io.github.jason13official.new_slab_variants.impl.common.block.TranslucentSlabBlock;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ModBlocks {

  // ── Mineral/gem blocks ────────────────────────────────────────────────────
  public static Block COAL_BLOCK_SLAB;
  public static Block DIAMOND_BLOCK_SLAB;
  public static Block EMERALD_BLOCK_SLAB;
  public static Block GOLD_BLOCK_SLAB;
  public static Block IRON_BLOCK_SLAB;
  public static Block LAPIS_BLOCK_SLAB;
  public static Block NETHERITE_BLOCK_SLAB;
  public static Block RAW_COPPER_BLOCK_SLAB;
  public static Block RAW_GOLD_BLOCK_SLAB;
  public static Block RAW_IRON_BLOCK_SLAB;

  // ── Ores ─────────────────────────────────────────────────────────────────
  public static Block COAL_ORE_SLAB;
  public static Block COPPER_ORE_SLAB;
  public static Block DIAMOND_ORE_SLAB;
  public static Block EMERALD_ORE_SLAB;
  public static Block GOLD_ORE_SLAB;
  public static Block IRON_ORE_SLAB;
  public static Block LAPIS_ORE_SLAB;
  public static Block NETHER_GOLD_ORE_SLAB;
  public static Block NETHER_QUARTZ_ORE_SLAB;
  public static Block REDSTONE_ORE_SLAB; // TODO: has lit state — slab won't glow when walked on
  public static Block DEEPSLATE_COAL_ORE_SLAB;
  public static Block DEEPSLATE_COPPER_ORE_SLAB;
  public static Block DEEPSLATE_DIAMOND_ORE_SLAB;
  public static Block DEEPSLATE_EMERALD_ORE_SLAB;
  public static Block DEEPSLATE_GOLD_ORE_SLAB;
  public static Block DEEPSLATE_IRON_ORE_SLAB;
  public static Block DEEPSLATE_LAPIS_ORE_SLAB;
  public static Block DEEPSLATE_REDSTONE_ORE_SLAB; // TODO: has lit state — slab won't glow when walked on

  // ── Stone / underground / nether ─────────────────────────────────────────
  public static Block BASALT_SLAB;
  public static Block CALCITE_SLAB;
  public static Block DRIPSTONE_BLOCK_SLAB;
  public static Block GILDED_BLACKSTONE_SLAB;
  public static Block GLOWSTONE_SLAB;
  public static Block LODESTONE_SLAB;
  public static Block MAGMA_BLOCK_SLAB;
  public static Block NETHERRACK_SLAB;
  public static Block OBSIDIAN_SLAB;
  public static Block POLISHED_BASALT_SLAB;
  public static Block QUARTZ_BRICKS_SLAB;

  // ── Stone — chiseled / cracked / special ─────────────────────────────────
  public static Block END_STONE_SLAB;
  public static Block SMOOTH_BASALT_SLAB;
  public static Block CHISELED_STONE_BRICKS_SLAB;
  public static Block CRACKED_STONE_BRICKS_SLAB;
  public static Block CHISELED_DEEPSLATE_SLAB;
  public static Block CRACKED_DEEPSLATE_BRICKS_SLAB;
  public static Block CRACKED_DEEPSLATE_TILES_SLAB;
  public static Block CHISELED_NETHER_BRICKS_SLAB;
  public static Block CRACKED_NETHER_BRICKS_SLAB;
  public static Block CHISELED_POLISHED_BLACKSTONE_SLAB;
  public static Block CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB;
  public static Block CHISELED_RESIN_BRICKS_SLAB;

  // ── Decorative stone ─────────────────────────────────────────────────────
  public static Block BONE_BLOCK_SLAB;
  public static Block PURPUR_PILLAR_SLAB;
  public static Block QUARTZ_PILLAR_SLAB;
  public static Block TERRACOTTA_SLAB;

  // ── Terrain ──────────────────────────────────────────────────────────────
  public static Block DIRT_SLAB;
  public static Block COARSE_DIRT_SLAB;
  public static Block GRASS_BLOCK_SLAB;
  public static Block GRAVEL_SLAB;
  public static Block SAND_SLAB;
  public static Block RED_SAND_SLAB;

  // ── Earthy / soft ────────────────────────────────────────────────────────
  public static Block CLAY_SLAB;
  public static Block MUD_SLAB;
  public static Block ROOTED_DIRT_SLAB;
  public static Block SOUL_SOIL_SLAB;

  // ── Natural / functional ─────────────────────────────────────────────────
  public static Block BEDROCK_SLAB;
  public static Block SCULK_SLAB;
  public static Block AMETHYST_BLOCK_SLAB;
  public static Block BUDDING_AMETHYST_SLAB; // TODO: BuddingAmethystBlock grows amethyst clusters — slab won't
  public static Block ICE_SLAB; // TODO: IceBlock melts in warm light — slab won't
  public static Block PACKED_ICE_SLAB;
  public static Block BLUE_ICE_SLAB;
  public static Block SNOW_BLOCK_SLAB;
  public static Block SPONGE_SLAB; // TODO: SpongeBlock absorbs water — slab won't
  public static Block WET_SPONGE_SLAB; // TODO: SpongeBlock absorbs water — slab won't

  // ── Nether / light sources ───────────────────────────────────────────────
  public static Block SOUL_SAND_SLAB;
  public static Block NETHER_WART_BLOCK_SLAB;
  public static Block WARPED_WART_BLOCK_SLAB;
  public static Block SHROOMLIGHT_SLAB;
  public static Block SEA_LANTERN_SLAB;

  // ── Misc ─────────────────────────────────────────────────────────────────
  public static Block REDSTONE_BLOCK_SLAB;
  public static Block REDSTONE_LAMP_SLAB; // TODO: has powered state — slab uses static off texture
  public static Block HONEYCOMB_BLOCK_SLAB;
  public static Block PACKED_MUD_SLAB;
  public static Block CRYING_OBSIDIAN_SLAB;
  public static Block NOTE_BLOCK_SLAB; // TODO: NoteBlock has instrument/note state — slab won't play sounds

  // ── Organic / plant ──────────────────────────────────────────────────────
  public static Block MOSS_BLOCK_SLAB;
  public static Block PALE_MOSS_BLOCK_SLAB;
  public static Block RESIN_BLOCK_SLAB;

  // ── Leaves ───────────────────────────────────────────────────────────────
  public static Block AZALEA_LEAVES_SLAB;
  public static Block FLOWERING_AZALEA_LEAVES_SLAB;

  // ── Mushroom blocks ──────────────────────────────────────────────────────
  public static Block BROWN_MUSHROOM_BLOCK_SLAB;
  public static Block RED_MUSHROOM_BLOCK_SLAB;
  public static Block MUSHROOM_STEM_SLAB;

  // ── Wood / fungal ────────────────────────────────────────────────────────
  public static Block BAMBOO_BLOCK_SLAB;
  public static Block CRIMSON_HYPHAE_SLAB;
  public static Block STRIPPED_BAMBOO_BLOCK_SLAB;
  public static Block STRIPPED_CRIMSON_HYPHAE_SLAB;
  public static Block STRIPPED_WARPED_HYPHAE_SLAB;
  public static Block WARPED_HYPHAE_SLAB;

  // ── Copper (block / raw) ─────────────────────────────────────────────────
  public static Block COPPER_BLOCK_SLAB;
  public static Block EXPOSED_COPPER_SLAB;
  public static Block OXIDIZED_COPPER_SLAB;
  public static Block WEATHERED_COPPER_SLAB;
  public static Block CHISELED_COPPER_SLAB;
  public static Block EXPOSED_CHISELED_COPPER_SLAB;
  public static Block OXIDIZED_CHISELED_COPPER_SLAB;
  public static Block WEATHERED_CHISELED_COPPER_SLAB;
  public static Block COPPER_BULB_SLAB; // TODO: CopperBulbBlock has lit/powered states — slab static
  public static Block EXPOSED_COPPER_BULB_SLAB; // TODO: has lit/powered states — slab static
  public static Block OXIDIZED_COPPER_BULB_SLAB; // TODO: has lit/powered states — slab static
  public static Block WEATHERED_COPPER_BULB_SLAB; // TODO: has lit/powered states — slab static

  // ── Copper grates ────────────────────────────────────────────────────────
  public static Block COPPER_GRATE_SLAB;
  public static Block EXPOSED_COPPER_GRATE_SLAB;
  public static Block OXIDIZED_COPPER_GRATE_SLAB;
  public static Block WEATHERED_COPPER_GRATE_SLAB;

  // ── Coral blocks ─────────────────────────────────────────────────────────
  public static Block BRAIN_CORAL_BLOCK_SLAB;
  public static Block BUBBLE_CORAL_BLOCK_SLAB;
  public static Block FIRE_CORAL_BLOCK_SLAB;
  public static Block HORN_CORAL_BLOCK_SLAB;
  public static Block TUBE_CORAL_BLOCK_SLAB;
  public static Block DEAD_BRAIN_CORAL_BLOCK_SLAB;
  public static Block DEAD_BUBBLE_CORAL_BLOCK_SLAB;
  public static Block DEAD_FIRE_CORAL_BLOCK_SLAB;
  public static Block DEAD_HORN_CORAL_BLOCK_SLAB;
  public static Block DEAD_TUBE_CORAL_BLOCK_SLAB;

  // ── Wool ─────────────────────────────────────────────────────────────────
  public static Block WHITE_WOOL_SLAB;
  public static Block ORANGE_WOOL_SLAB;
  public static Block MAGENTA_WOOL_SLAB;
  public static Block LIGHT_BLUE_WOOL_SLAB;
  public static Block YELLOW_WOOL_SLAB;
  public static Block LIME_WOOL_SLAB;
  public static Block PINK_WOOL_SLAB;
  public static Block GRAY_WOOL_SLAB;
  public static Block LIGHT_GRAY_WOOL_SLAB;
  public static Block CYAN_WOOL_SLAB;
  public static Block PURPLE_WOOL_SLAB;
  public static Block BLUE_WOOL_SLAB;
  public static Block BROWN_WOOL_SLAB;
  public static Block GREEN_WOOL_SLAB;
  public static Block RED_WOOL_SLAB;
  public static Block BLACK_WOOL_SLAB;

  // ── Concrete ─────────────────────────────────────────────────────────────
  public static Block WHITE_CONCRETE_SLAB;
  public static Block ORANGE_CONCRETE_SLAB;
  public static Block MAGENTA_CONCRETE_SLAB;
  public static Block LIGHT_BLUE_CONCRETE_SLAB;
  public static Block YELLOW_CONCRETE_SLAB;
  public static Block LIME_CONCRETE_SLAB;
  public static Block PINK_CONCRETE_SLAB;
  public static Block GRAY_CONCRETE_SLAB;
  public static Block LIGHT_GRAY_CONCRETE_SLAB;
  public static Block CYAN_CONCRETE_SLAB;
  public static Block PURPLE_CONCRETE_SLAB;
  public static Block BLUE_CONCRETE_SLAB;
  public static Block BROWN_CONCRETE_SLAB;
  public static Block GREEN_CONCRETE_SLAB;
  public static Block RED_CONCRETE_SLAB;
  public static Block BLACK_CONCRETE_SLAB;

  // ── Concrete powder ──────────────────────────────────────────────────────
  public static Block WHITE_CONCRETE_POWDER_SLAB;
  public static Block ORANGE_CONCRETE_POWDER_SLAB;
  public static Block MAGENTA_CONCRETE_POWDER_SLAB;
  public static Block LIGHT_BLUE_CONCRETE_POWDER_SLAB;
  public static Block YELLOW_CONCRETE_POWDER_SLAB;
  public static Block LIME_CONCRETE_POWDER_SLAB;
  public static Block PINK_CONCRETE_POWDER_SLAB;
  public static Block GRAY_CONCRETE_POWDER_SLAB;
  public static Block LIGHT_GRAY_CONCRETE_POWDER_SLAB;
  public static Block CYAN_CONCRETE_POWDER_SLAB;
  public static Block PURPLE_CONCRETE_POWDER_SLAB;
  public static Block BLUE_CONCRETE_POWDER_SLAB;
  public static Block BROWN_CONCRETE_POWDER_SLAB;
  public static Block GREEN_CONCRETE_POWDER_SLAB;
  public static Block RED_CONCRETE_POWDER_SLAB;
  public static Block BLACK_CONCRETE_POWDER_SLAB;

  // ── Glass / stained glass ────────────────────────────────────────────────
  // TODO: glass/stained glass blocks are transparent — slabs will render opaque without cutout renderType
  public static Block GLASS_SLAB;
  public static Block TINTED_GLASS_SLAB;
  public static Block WHITE_STAINED_GLASS_SLAB;
  public static Block ORANGE_STAINED_GLASS_SLAB;
  public static Block MAGENTA_STAINED_GLASS_SLAB;
  public static Block LIGHT_BLUE_STAINED_GLASS_SLAB;
  public static Block YELLOW_STAINED_GLASS_SLAB;
  public static Block LIME_STAINED_GLASS_SLAB;
  public static Block PINK_STAINED_GLASS_SLAB;
  public static Block GRAY_STAINED_GLASS_SLAB;
  public static Block LIGHT_GRAY_STAINED_GLASS_SLAB;
  public static Block CYAN_STAINED_GLASS_SLAB;
  public static Block PURPLE_STAINED_GLASS_SLAB;
  public static Block BLUE_STAINED_GLASS_SLAB;
  public static Block BROWN_STAINED_GLASS_SLAB;
  public static Block GREEN_STAINED_GLASS_SLAB;
  public static Block RED_STAINED_GLASS_SLAB;
  public static Block BLACK_STAINED_GLASS_SLAB;

  // ── Colored terracotta ───────────────────────────────────────────────────
  public static Block WHITE_TERRACOTTA_SLAB;
  public static Block ORANGE_TERRACOTTA_SLAB;
  public static Block MAGENTA_TERRACOTTA_SLAB;
  public static Block LIGHT_BLUE_TERRACOTTA_SLAB;
  public static Block YELLOW_TERRACOTTA_SLAB;
  public static Block LIME_TERRACOTTA_SLAB;
  public static Block PINK_TERRACOTTA_SLAB;
  public static Block GRAY_TERRACOTTA_SLAB;
  public static Block LIGHT_GRAY_TERRACOTTA_SLAB;
  public static Block CYAN_TERRACOTTA_SLAB;
  public static Block PURPLE_TERRACOTTA_SLAB;
  public static Block BLUE_TERRACOTTA_SLAB;
  public static Block BROWN_TERRACOTTA_SLAB;
  public static Block GREEN_TERRACOTTA_SLAB;
  public static Block RED_TERRACOTTA_SLAB;
  public static Block BLACK_TERRACOTTA_SLAB;

  public static void register(BiConsumer<Block, Identifier> consumer) {
    // Mineral/gem blocks
    COAL_BLOCK_SLAB        = slab("coal_block_slab",        Blocks.COAL_BLOCK,        consumer);
    DIAMOND_BLOCK_SLAB     = slab("diamond_block_slab",     Blocks.DIAMOND_BLOCK,     consumer);
    EMERALD_BLOCK_SLAB     = slab("emerald_block_slab",     Blocks.EMERALD_BLOCK,     consumer);
    GOLD_BLOCK_SLAB        = slab("gold_block_slab",        Blocks.GOLD_BLOCK,        consumer);
    IRON_BLOCK_SLAB        = slab("iron_block_slab",        Blocks.IRON_BLOCK,        consumer);
    LAPIS_BLOCK_SLAB       = slab("lapis_block_slab",       Blocks.LAPIS_BLOCK,       consumer);
    NETHERITE_BLOCK_SLAB   = slab("netherite_block_slab",   Blocks.NETHERITE_BLOCK,   consumer);
    RAW_COPPER_BLOCK_SLAB  = slab("raw_copper_block_slab",  Blocks.RAW_COPPER_BLOCK,  consumer);
    RAW_GOLD_BLOCK_SLAB    = slab("raw_gold_block_slab",    Blocks.RAW_GOLD_BLOCK,    consumer);
    RAW_IRON_BLOCK_SLAB    = slab("raw_iron_block_slab",    Blocks.RAW_IRON_BLOCK,    consumer);

    // Ores
    COAL_ORE_SLAB              = slab("coal_ore_slab",              Blocks.COAL_ORE,              consumer);
    COPPER_ORE_SLAB            = slab("copper_ore_slab",            Blocks.COPPER_ORE,            consumer);
    DIAMOND_ORE_SLAB           = slab("diamond_ore_slab",           Blocks.DIAMOND_ORE,           consumer);
    EMERALD_ORE_SLAB           = slab("emerald_ore_slab",           Blocks.EMERALD_ORE,           consumer);
    GOLD_ORE_SLAB              = slab("gold_ore_slab",              Blocks.GOLD_ORE,              consumer);
    IRON_ORE_SLAB              = slab("iron_ore_slab",              Blocks.IRON_ORE,              consumer);
    LAPIS_ORE_SLAB             = slab("lapis_ore_slab",             Blocks.LAPIS_ORE,             consumer);
    NETHER_GOLD_ORE_SLAB       = slab("nether_gold_ore_slab",       Blocks.NETHER_GOLD_ORE,       consumer);
    NETHER_QUARTZ_ORE_SLAB     = slab("nether_quartz_ore_slab",     Blocks.NETHER_QUARTZ_ORE,     consumer);
    REDSTONE_ORE_SLAB          = litSlab("redstone_ore_slab",          Blocks.REDSTONE_ORE,          consumer);
    DEEPSLATE_COAL_ORE_SLAB    = slab("deepslate_coal_ore_slab",    Blocks.DEEPSLATE_COAL_ORE,    consumer);
    DEEPSLATE_COPPER_ORE_SLAB  = slab("deepslate_copper_ore_slab",  Blocks.DEEPSLATE_COPPER_ORE,  consumer);
    DEEPSLATE_DIAMOND_ORE_SLAB = slab("deepslate_diamond_ore_slab", Blocks.DEEPSLATE_DIAMOND_ORE, consumer);
    DEEPSLATE_EMERALD_ORE_SLAB = slab("deepslate_emerald_ore_slab", Blocks.DEEPSLATE_EMERALD_ORE, consumer);
    DEEPSLATE_GOLD_ORE_SLAB    = slab("deepslate_gold_ore_slab",    Blocks.DEEPSLATE_GOLD_ORE,    consumer);
    DEEPSLATE_IRON_ORE_SLAB    = slab("deepslate_iron_ore_slab",    Blocks.DEEPSLATE_IRON_ORE,    consumer);
    DEEPSLATE_LAPIS_ORE_SLAB   = slab("deepslate_lapis_ore_slab",   Blocks.DEEPSLATE_LAPIS_ORE,   consumer);
    DEEPSLATE_REDSTONE_ORE_SLAB = litSlab("deepslate_redstone_ore_slab", Blocks.DEEPSLATE_REDSTONE_ORE, consumer);

    // Stone/underground/nether
    BASALT_SLAB            = slab("basalt_slab",            Blocks.BASALT,            consumer);
    CALCITE_SLAB           = slab("calcite_slab",           Blocks.CALCITE,           consumer);
    DRIPSTONE_BLOCK_SLAB   = slab("dripstone_block_slab",   Blocks.DRIPSTONE_BLOCK,   consumer);
    GILDED_BLACKSTONE_SLAB = slab("gilded_blackstone_slab", Blocks.GILDED_BLACKSTONE, consumer);
    GLOWSTONE_SLAB         = slab("glowstone_slab",         Blocks.GLOWSTONE,         consumer);
    LODESTONE_SLAB         = slab("lodestone_slab",         Blocks.LODESTONE,         consumer);
    MAGMA_BLOCK_SLAB       = slab("magma_block_slab",       Blocks.MAGMA_BLOCK,       consumer);
    NETHERRACK_SLAB        = slab("netherrack_slab",        Blocks.NETHERRACK,        consumer);
    OBSIDIAN_SLAB          = slab("obsidian_slab",          Blocks.OBSIDIAN,          consumer);
    POLISHED_BASALT_SLAB   = slab("polished_basalt_slab",   Blocks.POLISHED_BASALT,   consumer);
    QUARTZ_BRICKS_SLAB     = slab("quartz_bricks_slab",     Blocks.QUARTZ_BRICKS,     consumer);

    // Stone — chiseled / cracked / special
    END_STONE_SLAB                       = slab("end_stone_slab",                       Blocks.END_STONE,                       consumer);
    SMOOTH_BASALT_SLAB                   = slab("smooth_basalt_slab",                   Blocks.SMOOTH_BASALT,                   consumer);
    CHISELED_STONE_BRICKS_SLAB          = slab("chiseled_stone_bricks_slab",          Blocks.CHISELED_STONE_BRICKS,          consumer);
    CRACKED_STONE_BRICKS_SLAB           = slab("cracked_stone_bricks_slab",           Blocks.CRACKED_STONE_BRICKS,           consumer);
    CHISELED_DEEPSLATE_SLAB             = slab("chiseled_deepslate_slab",             Blocks.CHISELED_DEEPSLATE,             consumer);
    CRACKED_DEEPSLATE_BRICKS_SLAB       = slab("cracked_deepslate_bricks_slab",       Blocks.CRACKED_DEEPSLATE_BRICKS,       consumer);
    CRACKED_DEEPSLATE_TILES_SLAB        = slab("cracked_deepslate_tiles_slab",        Blocks.CRACKED_DEEPSLATE_TILES,        consumer);
    CHISELED_NETHER_BRICKS_SLAB         = slab("chiseled_nether_bricks_slab",         Blocks.CHISELED_NETHER_BRICKS,         consumer);
    CRACKED_NETHER_BRICKS_SLAB          = slab("cracked_nether_bricks_slab",          Blocks.CRACKED_NETHER_BRICKS,          consumer);
    CHISELED_POLISHED_BLACKSTONE_SLAB   = slab("chiseled_polished_blackstone_slab",   Blocks.CHISELED_POLISHED_BLACKSTONE,   consumer);
    CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = slab("cracked_polished_blackstone_bricks_slab", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, consumer);
    CHISELED_RESIN_BRICKS_SLAB          = slab("chiseled_resin_bricks_slab",          Blocks.CHISELED_RESIN_BRICKS,          consumer);

    // Decorative stone
    BONE_BLOCK_SLAB        = slab("bone_block_slab",        Blocks.BONE_BLOCK,        consumer);
    PURPUR_PILLAR_SLAB     = slab("purpur_pillar_slab",     Blocks.PURPUR_PILLAR,     consumer);
    QUARTZ_PILLAR_SLAB     = slab("quartz_pillar_slab",     Blocks.QUARTZ_PILLAR,     consumer);
    TERRACOTTA_SLAB        = slab("terracotta_slab",        Blocks.TERRACOTTA,        consumer);

    // Terrain
    DIRT_SLAB              = slab("dirt_slab",              Blocks.DIRT,              consumer);
    COARSE_DIRT_SLAB       = slab("coarse_dirt_slab",       Blocks.COARSE_DIRT,       consumer);
    GRASS_BLOCK_SLAB       = slab("grass_block_slab",       Blocks.GRASS_BLOCK,       consumer);
    GRAVEL_SLAB            = slab("gravel_slab",            Blocks.GRAVEL,            consumer);
    SAND_SLAB              = slab("sand_slab",              Blocks.SAND,              consumer);
    RED_SAND_SLAB          = slab("red_sand_slab",          Blocks.RED_SAND,          consumer);

    // Earthy/soft
    CLAY_SLAB              = slab("clay_slab",              Blocks.CLAY,              consumer);
    MUD_SLAB               = slab("mud_slab",               Blocks.MUD,               consumer);
    ROOTED_DIRT_SLAB       = slab("rooted_dirt_slab",       Blocks.ROOTED_DIRT,       consumer);
    SOUL_SOIL_SLAB         = slab("soul_soil_slab",         Blocks.SOUL_SOIL,         consumer);

    // Natural/functional
    BEDROCK_SLAB           = slab("bedrock_slab",           Blocks.BEDROCK,           consumer);
    SCULK_SLAB             = slab("sculk_slab",             Blocks.SCULK,             consumer);
    AMETHYST_BLOCK_SLAB    = slab("amethyst_block_slab",    Blocks.AMETHYST_BLOCK,    consumer);
    BUDDING_AMETHYST_SLAB  = slab("budding_amethyst_slab",  Blocks.BUDDING_AMETHYST,  consumer);
    ICE_SLAB               = slab("ice_slab",               Blocks.ICE,               consumer);
    PACKED_ICE_SLAB        = slab("packed_ice_slab",        Blocks.PACKED_ICE,        consumer);
    BLUE_ICE_SLAB          = slab("blue_ice_slab",          Blocks.BLUE_ICE,          consumer);
    SNOW_BLOCK_SLAB        = slab("snow_block_slab",        Blocks.SNOW_BLOCK,        consumer);
    SPONGE_SLAB            = slab("sponge_slab",            Blocks.SPONGE,            consumer);
    WET_SPONGE_SLAB        = slab("wet_sponge_slab",        Blocks.WET_SPONGE,        consumer);

    // Nether/light
    SOUL_SAND_SLAB         = slab("soul_sand_slab",         Blocks.SOUL_SAND,         consumer);
    NETHER_WART_BLOCK_SLAB = slab("nether_wart_block_slab", Blocks.NETHER_WART_BLOCK, consumer);
    WARPED_WART_BLOCK_SLAB = slab("warped_wart_block_slab", Blocks.WARPED_WART_BLOCK, consumer);
    SHROOMLIGHT_SLAB       = slab("shroomlight_slab",       Blocks.SHROOMLIGHT,       consumer);
    SEA_LANTERN_SLAB       = slab("sea_lantern_slab",       Blocks.SEA_LANTERN,       consumer);

    // Misc
    REDSTONE_BLOCK_SLAB    = slab("redstone_block_slab",    Blocks.REDSTONE_BLOCK,    consumer);
    REDSTONE_LAMP_SLAB     = litSlab("redstone_lamp_slab",     Blocks.REDSTONE_LAMP,     consumer);
    HONEYCOMB_BLOCK_SLAB   = slab("honeycomb_block_slab",   Blocks.HONEYCOMB_BLOCK,   consumer);
    PACKED_MUD_SLAB        = slab("packed_mud_slab",        Blocks.PACKED_MUD,        consumer);
    CRYING_OBSIDIAN_SLAB   = slab("crying_obsidian_slab",   Blocks.CRYING_OBSIDIAN,   consumer);
    NOTE_BLOCK_SLAB        = slab("note_block_slab",        Blocks.NOTE_BLOCK,        consumer);

    // Organic/plant
    MOSS_BLOCK_SLAB        = slab("moss_block_slab",        Blocks.MOSS_BLOCK,        consumer);
    PALE_MOSS_BLOCK_SLAB   = slab("pale_moss_block_slab",   Blocks.PALE_MOSS_BLOCK,   consumer);
    RESIN_BLOCK_SLAB       = slab("resin_block_slab",       Blocks.RESIN_BLOCK,       consumer);

    // Leaves
    AZALEA_LEAVES_SLAB           = slab("azalea_leaves_slab",           Blocks.AZALEA_LEAVES,           consumer);
    FLOWERING_AZALEA_LEAVES_SLAB = slab("flowering_azalea_leaves_slab", Blocks.FLOWERING_AZALEA_LEAVES, consumer);

    // Mushroom blocks
    BROWN_MUSHROOM_BLOCK_SLAB = slab("brown_mushroom_block_slab", Blocks.BROWN_MUSHROOM_BLOCK, consumer);
    RED_MUSHROOM_BLOCK_SLAB   = slab("red_mushroom_block_slab",   Blocks.RED_MUSHROOM_BLOCK,   consumer);
    MUSHROOM_STEM_SLAB        = slab("mushroom_stem_slab",        Blocks.MUSHROOM_STEM,        consumer);

    // logProperties() uses axis-dependent mapColor — must use explicit Properties
    BAMBOO_BLOCK_SLAB            = slab("bamboo_block_slab",            bambooProps(MapColor.COLOR_YELLOW), consumer);
    CRIMSON_HYPHAE_SLAB          = slab("crimson_hyphae_slab",          Blocks.CRIMSON_HYPHAE,              consumer);
    STRIPPED_BAMBOO_BLOCK_SLAB   = slab("stripped_bamboo_block_slab",   bambooProps(MapColor.COLOR_YELLOW), consumer);
    STRIPPED_CRIMSON_HYPHAE_SLAB = slab("stripped_crimson_hyphae_slab", Blocks.STRIPPED_CRIMSON_HYPHAE,     consumer);
    STRIPPED_WARPED_HYPHAE_SLAB  = slab("stripped_warped_hyphae_slab",  Blocks.STRIPPED_WARPED_HYPHAE,      consumer);
    WARPED_HYPHAE_SLAB           = slab("warped_hyphae_slab",           Blocks.WARPED_HYPHAE,               consumer);

    // Copper (block/raw)
    COPPER_BLOCK_SLAB             = slab("copper_block_slab",             Blocks.COPPER_BLOCK,             consumer);
    EXPOSED_COPPER_SLAB           = slab("exposed_copper_slab",           Blocks.EXPOSED_COPPER,           consumer);
    OXIDIZED_COPPER_SLAB          = slab("oxidized_copper_slab",          Blocks.OXIDIZED_COPPER,          consumer);
    WEATHERED_COPPER_SLAB         = slab("weathered_copper_slab",         Blocks.WEATHERED_COPPER,         consumer);
    CHISELED_COPPER_SLAB          = slab("chiseled_copper_slab",          Blocks.CHISELED_COPPER,          consumer);
    EXPOSED_CHISELED_COPPER_SLAB  = slab("exposed_chiseled_copper_slab",  Blocks.EXPOSED_CHISELED_COPPER,  consumer);
    OXIDIZED_CHISELED_COPPER_SLAB = slab("oxidized_chiseled_copper_slab", Blocks.OXIDIZED_CHISELED_COPPER, consumer);
    WEATHERED_CHISELED_COPPER_SLAB = slab("weathered_chiseled_copper_slab", Blocks.WEATHERED_CHISELED_COPPER, consumer);
    COPPER_BULB_SLAB              = copperBulbSlab("copper_bulb_slab",              Blocks.COPPER_BULB,              MapColor.METAL,       consumer);
    EXPOSED_COPPER_BULB_SLAB      = copperBulbSlab("exposed_copper_bulb_slab",      Blocks.EXPOSED_COPPER_BULB,      MapColor.METAL,       consumer);
    OXIDIZED_COPPER_BULB_SLAB     = copperBulbSlab("oxidized_copper_bulb_slab",     Blocks.OXIDIZED_COPPER_BULB,     MapColor.WARPED_STEM, consumer);
    WEATHERED_COPPER_BULB_SLAB    = copperBulbSlab("weathered_copper_bulb_slab",    Blocks.WEATHERED_COPPER_BULB,    MapColor.COLOR_GREEN, consumer);

    // Copper grates
    COPPER_GRATE_SLAB           = slab("copper_grate_slab",           Blocks.COPPER_GRATE,           consumer);
    EXPOSED_COPPER_GRATE_SLAB   = slab("exposed_copper_grate_slab",   Blocks.EXPOSED_COPPER_GRATE,   consumer);
    OXIDIZED_COPPER_GRATE_SLAB  = slab("oxidized_copper_grate_slab",  Blocks.OXIDIZED_COPPER_GRATE,  consumer);
    WEATHERED_COPPER_GRATE_SLAB = slab("weathered_copper_grate_slab", Blocks.WEATHERED_COPPER_GRATE, consumer);

    // Coral blocks
    BRAIN_CORAL_BLOCK_SLAB      = slab("brain_coral_block_slab",      Blocks.BRAIN_CORAL_BLOCK,      consumer);
    BUBBLE_CORAL_BLOCK_SLAB     = slab("bubble_coral_block_slab",     Blocks.BUBBLE_CORAL_BLOCK,     consumer);
    FIRE_CORAL_BLOCK_SLAB       = slab("fire_coral_block_slab",       Blocks.FIRE_CORAL_BLOCK,       consumer);
    HORN_CORAL_BLOCK_SLAB       = slab("horn_coral_block_slab",       Blocks.HORN_CORAL_BLOCK,       consumer);
    TUBE_CORAL_BLOCK_SLAB       = slab("tube_coral_block_slab",       Blocks.TUBE_CORAL_BLOCK,       consumer);
    DEAD_BRAIN_CORAL_BLOCK_SLAB = slab("dead_brain_coral_block_slab", Blocks.DEAD_BRAIN_CORAL_BLOCK, consumer);
    DEAD_BUBBLE_CORAL_BLOCK_SLAB = slab("dead_bubble_coral_block_slab", Blocks.DEAD_BUBBLE_CORAL_BLOCK, consumer);
    DEAD_FIRE_CORAL_BLOCK_SLAB  = slab("dead_fire_coral_block_slab",  Blocks.DEAD_FIRE_CORAL_BLOCK,  consumer);
    DEAD_HORN_CORAL_BLOCK_SLAB  = slab("dead_horn_coral_block_slab",  Blocks.DEAD_HORN_CORAL_BLOCK,  consumer);
    DEAD_TUBE_CORAL_BLOCK_SLAB  = slab("dead_tube_coral_block_slab",  Blocks.DEAD_TUBE_CORAL_BLOCK,  consumer);

    // Wool
    WHITE_WOOL_SLAB      = slab("white_wool_slab",      Blocks.WHITE_WOOL,      consumer);
    ORANGE_WOOL_SLAB     = slab("orange_wool_slab",     Blocks.ORANGE_WOOL,     consumer);
    MAGENTA_WOOL_SLAB    = slab("magenta_wool_slab",    Blocks.MAGENTA_WOOL,    consumer);
    LIGHT_BLUE_WOOL_SLAB = slab("light_blue_wool_slab", Blocks.LIGHT_BLUE_WOOL, consumer);
    YELLOW_WOOL_SLAB     = slab("yellow_wool_slab",     Blocks.YELLOW_WOOL,     consumer);
    LIME_WOOL_SLAB       = slab("lime_wool_slab",       Blocks.LIME_WOOL,       consumer);
    PINK_WOOL_SLAB       = slab("pink_wool_slab",       Blocks.PINK_WOOL,       consumer);
    GRAY_WOOL_SLAB       = slab("gray_wool_slab",       Blocks.GRAY_WOOL,       consumer);
    LIGHT_GRAY_WOOL_SLAB = slab("light_gray_wool_slab", Blocks.LIGHT_GRAY_WOOL, consumer);
    CYAN_WOOL_SLAB       = slab("cyan_wool_slab",       Blocks.CYAN_WOOL,       consumer);
    PURPLE_WOOL_SLAB     = slab("purple_wool_slab",     Blocks.PURPLE_WOOL,     consumer);
    BLUE_WOOL_SLAB       = slab("blue_wool_slab",       Blocks.BLUE_WOOL,       consumer);
    BROWN_WOOL_SLAB      = slab("brown_wool_slab",      Blocks.BROWN_WOOL,      consumer);
    GREEN_WOOL_SLAB      = slab("green_wool_slab",      Blocks.GREEN_WOOL,      consumer);
    RED_WOOL_SLAB        = slab("red_wool_slab",        Blocks.RED_WOOL,        consumer);
    BLACK_WOOL_SLAB      = slab("black_wool_slab",      Blocks.BLACK_WOOL,      consumer);

    // Concrete
    WHITE_CONCRETE_SLAB      = slab("white_concrete_slab",      Blocks.WHITE_CONCRETE,      consumer);
    ORANGE_CONCRETE_SLAB     = slab("orange_concrete_slab",     Blocks.ORANGE_CONCRETE,     consumer);
    MAGENTA_CONCRETE_SLAB    = slab("magenta_concrete_slab",    Blocks.MAGENTA_CONCRETE,    consumer);
    LIGHT_BLUE_CONCRETE_SLAB = slab("light_blue_concrete_slab", Blocks.LIGHT_BLUE_CONCRETE, consumer);
    YELLOW_CONCRETE_SLAB     = slab("yellow_concrete_slab",     Blocks.YELLOW_CONCRETE,     consumer);
    LIME_CONCRETE_SLAB       = slab("lime_concrete_slab",       Blocks.LIME_CONCRETE,       consumer);
    PINK_CONCRETE_SLAB       = slab("pink_concrete_slab",       Blocks.PINK_CONCRETE,       consumer);
    GRAY_CONCRETE_SLAB       = slab("gray_concrete_slab",       Blocks.GRAY_CONCRETE,       consumer);
    LIGHT_GRAY_CONCRETE_SLAB = slab("light_gray_concrete_slab", Blocks.LIGHT_GRAY_CONCRETE, consumer);
    CYAN_CONCRETE_SLAB       = slab("cyan_concrete_slab",       Blocks.CYAN_CONCRETE,       consumer);
    PURPLE_CONCRETE_SLAB     = slab("purple_concrete_slab",     Blocks.PURPLE_CONCRETE,     consumer);
    BLUE_CONCRETE_SLAB       = slab("blue_concrete_slab",       Blocks.BLUE_CONCRETE,       consumer);
    BROWN_CONCRETE_SLAB      = slab("brown_concrete_slab",      Blocks.BROWN_CONCRETE,      consumer);
    GREEN_CONCRETE_SLAB      = slab("green_concrete_slab",      Blocks.GREEN_CONCRETE,      consumer);
    RED_CONCRETE_SLAB        = slab("red_concrete_slab",        Blocks.RED_CONCRETE,        consumer);
    BLACK_CONCRETE_SLAB      = slab("black_concrete_slab",      Blocks.BLACK_CONCRETE,      consumer);

    // Concrete powder
    WHITE_CONCRETE_POWDER_SLAB      = slab("white_concrete_powder_slab",      Blocks.WHITE_CONCRETE_POWDER,      consumer);
    ORANGE_CONCRETE_POWDER_SLAB     = slab("orange_concrete_powder_slab",     Blocks.ORANGE_CONCRETE_POWDER,     consumer);
    MAGENTA_CONCRETE_POWDER_SLAB    = slab("magenta_concrete_powder_slab",    Blocks.MAGENTA_CONCRETE_POWDER,    consumer);
    LIGHT_BLUE_CONCRETE_POWDER_SLAB = slab("light_blue_concrete_powder_slab", Blocks.LIGHT_BLUE_CONCRETE_POWDER, consumer);
    YELLOW_CONCRETE_POWDER_SLAB     = slab("yellow_concrete_powder_slab",     Blocks.YELLOW_CONCRETE_POWDER,     consumer);
    LIME_CONCRETE_POWDER_SLAB       = slab("lime_concrete_powder_slab",       Blocks.LIME_CONCRETE_POWDER,       consumer);
    PINK_CONCRETE_POWDER_SLAB       = slab("pink_concrete_powder_slab",       Blocks.PINK_CONCRETE_POWDER,       consumer);
    GRAY_CONCRETE_POWDER_SLAB       = slab("gray_concrete_powder_slab",       Blocks.GRAY_CONCRETE_POWDER,       consumer);
    LIGHT_GRAY_CONCRETE_POWDER_SLAB = slab("light_gray_concrete_powder_slab", Blocks.LIGHT_GRAY_CONCRETE_POWDER, consumer);
    CYAN_CONCRETE_POWDER_SLAB       = slab("cyan_concrete_powder_slab",       Blocks.CYAN_CONCRETE_POWDER,       consumer);
    PURPLE_CONCRETE_POWDER_SLAB     = slab("purple_concrete_powder_slab",     Blocks.PURPLE_CONCRETE_POWDER,     consumer);
    BLUE_CONCRETE_POWDER_SLAB       = slab("blue_concrete_powder_slab",       Blocks.BLUE_CONCRETE_POWDER,       consumer);
    BROWN_CONCRETE_POWDER_SLAB      = slab("brown_concrete_powder_slab",      Blocks.BROWN_CONCRETE_POWDER,      consumer);
    GREEN_CONCRETE_POWDER_SLAB      = slab("green_concrete_powder_slab",      Blocks.GREEN_CONCRETE_POWDER,      consumer);
    RED_CONCRETE_POWDER_SLAB        = slab("red_concrete_powder_slab",        Blocks.RED_CONCRETE_POWDER,        consumer);
    BLACK_CONCRETE_POWDER_SLAB      = slab("black_concrete_powder_slab",      Blocks.BLACK_CONCRETE_POWDER,      consumer);

    // Glass / stained glass
    GLASS_SLAB              = glassSlab("glass_slab",              Blocks.GLASS,              consumer);
    TINTED_GLASS_SLAB       = glassSlab("tinted_glass_slab",       Blocks.TINTED_GLASS,       consumer);
    WHITE_STAINED_GLASS_SLAB      = glassSlab("white_stained_glass_slab",      Blocks.WHITE_STAINED_GLASS,      consumer);
    ORANGE_STAINED_GLASS_SLAB     = glassSlab("orange_stained_glass_slab",     Blocks.ORANGE_STAINED_GLASS,     consumer);
    MAGENTA_STAINED_GLASS_SLAB    = glassSlab("magenta_stained_glass_slab",    Blocks.MAGENTA_STAINED_GLASS,    consumer);
    LIGHT_BLUE_STAINED_GLASS_SLAB = glassSlab("light_blue_stained_glass_slab", Blocks.LIGHT_BLUE_STAINED_GLASS, consumer);
    YELLOW_STAINED_GLASS_SLAB     = glassSlab("yellow_stained_glass_slab",     Blocks.YELLOW_STAINED_GLASS,     consumer);
    LIME_STAINED_GLASS_SLAB       = glassSlab("lime_stained_glass_slab",       Blocks.LIME_STAINED_GLASS,       consumer);
    PINK_STAINED_GLASS_SLAB       = glassSlab("pink_stained_glass_slab",       Blocks.PINK_STAINED_GLASS,       consumer);
    GRAY_STAINED_GLASS_SLAB       = glassSlab("gray_stained_glass_slab",       Blocks.GRAY_STAINED_GLASS,       consumer);
    LIGHT_GRAY_STAINED_GLASS_SLAB = glassSlab("light_gray_stained_glass_slab", Blocks.LIGHT_GRAY_STAINED_GLASS, consumer);
    CYAN_STAINED_GLASS_SLAB       = glassSlab("cyan_stained_glass_slab",       Blocks.CYAN_STAINED_GLASS,       consumer);
    PURPLE_STAINED_GLASS_SLAB     = glassSlab("purple_stained_glass_slab",     Blocks.PURPLE_STAINED_GLASS,     consumer);
    BLUE_STAINED_GLASS_SLAB       = glassSlab("blue_stained_glass_slab",       Blocks.BLUE_STAINED_GLASS,       consumer);
    BROWN_STAINED_GLASS_SLAB      = glassSlab("brown_stained_glass_slab",      Blocks.BROWN_STAINED_GLASS,      consumer);
    GREEN_STAINED_GLASS_SLAB      = glassSlab("green_stained_glass_slab",      Blocks.GREEN_STAINED_GLASS,      consumer);
    RED_STAINED_GLASS_SLAB        = glassSlab("red_stained_glass_slab",        Blocks.RED_STAINED_GLASS,        consumer);
    BLACK_STAINED_GLASS_SLAB      = glassSlab("black_stained_glass_slab",      Blocks.BLACK_STAINED_GLASS,      consumer);

    // Colored terracotta
    WHITE_TERRACOTTA_SLAB      = slab("white_terracotta_slab",      Blocks.WHITE_TERRACOTTA,      consumer);
    ORANGE_TERRACOTTA_SLAB     = slab("orange_terracotta_slab",     Blocks.ORANGE_TERRACOTTA,     consumer);
    MAGENTA_TERRACOTTA_SLAB    = slab("magenta_terracotta_slab",    Blocks.MAGENTA_TERRACOTTA,    consumer);
    LIGHT_BLUE_TERRACOTTA_SLAB = slab("light_blue_terracotta_slab", Blocks.LIGHT_BLUE_TERRACOTTA, consumer);
    YELLOW_TERRACOTTA_SLAB     = slab("yellow_terracotta_slab",     Blocks.YELLOW_TERRACOTTA,     consumer);
    LIME_TERRACOTTA_SLAB       = slab("lime_terracotta_slab",       Blocks.LIME_TERRACOTTA,       consumer);
    PINK_TERRACOTTA_SLAB       = slab("pink_terracotta_slab",       Blocks.PINK_TERRACOTTA,       consumer);
    GRAY_TERRACOTTA_SLAB       = slab("gray_terracotta_slab",       Blocks.GRAY_TERRACOTTA,       consumer);
    LIGHT_GRAY_TERRACOTTA_SLAB = slab("light_gray_terracotta_slab", Blocks.LIGHT_GRAY_TERRACOTTA, consumer);
    CYAN_TERRACOTTA_SLAB       = slab("cyan_terracotta_slab",       Blocks.CYAN_TERRACOTTA,       consumer);
    PURPLE_TERRACOTTA_SLAB     = slab("purple_terracotta_slab",     Blocks.PURPLE_TERRACOTTA,     consumer);
    BLUE_TERRACOTTA_SLAB       = slab("blue_terracotta_slab",       Blocks.BLUE_TERRACOTTA,       consumer);
    BROWN_TERRACOTTA_SLAB      = slab("brown_terracotta_slab",      Blocks.BROWN_TERRACOTTA,      consumer);
    GREEN_TERRACOTTA_SLAB      = slab("green_terracotta_slab",      Blocks.GREEN_TERRACOTTA,      consumer);
    RED_TERRACOTTA_SLAB        = slab("red_terracotta_slab",        Blocks.RED_TERRACOTTA,        consumer);
    BLACK_TERRACOTTA_SLAB      = slab("black_terracotta_slab",      Blocks.BLACK_TERRACOTTA,      consumer);
  }

  private static Block slab(String name, Properties props, BiConsumer<Block, Identifier> consumer) {
    return construct(name, SlabBlock::new, props, consumer);
  }

  // blocks whose Properties.lightLevel is a lambda that reads LIT — override with constant so
  // our slab (which has no lit property) doesn't crash during NeoForge postRegisterEvents
  @SuppressWarnings("deprecation")
  private static Block litSlab(String name, Block source, BiConsumer<Block, Identifier> consumer) {
    return construct(name, SlabBlock::new, BlockBehaviour.Properties.ofLegacyCopy(source).lightLevel(state -> 0), consumer);
  }

  // copper_bulb variants have BOTH a state-dependent mapColor (reads LIT) and lightLevel (reads LIT)
  @SuppressWarnings("deprecation")
  private static Block copperBulbSlab(String name, Block source, MapColor unlitColor, BiConsumer<Block, Identifier> consumer) {
    return construct(name, SlabBlock::new,
        BlockBehaviour.Properties.ofLegacyCopy(source).mapColor(unlitColor).lightLevel(state -> 0), consumer);
  }

  // bamboo_block and stripped_bamboo_block use logProperties() whose mapColor lambda reads
  // RotatedPillarBlock.AXIS — a property slabs don't have. Copy just the safe fields manually.
  private static Properties bambooProps(MapColor mapColor) {
    return BlockBehaviour.Properties.of()
        .mapColor(mapColor)
        .instrument(NoteBlockInstrument.BASS)
        .strength(2.0F)
        .sound(SoundType.BAMBOO_WOOD)
        .ignitedByLava();
  }

  @SuppressWarnings("deprecation")
  private static Block slab(String name, Block source, BiConsumer<Block, Identifier> consumer) {
    return construct(name, SlabBlock::new, BlockBehaviour.Properties.ofLegacyCopy(source), consumer);
  }

  @SuppressWarnings("deprecation")
  private static Block glassSlab(String name, Block source, BiConsumer<Block, Identifier> consumer) {
    return construct(name, TranslucentSlabBlock::new, BlockBehaviour.Properties.ofLegacyCopy(source), consumer);
  }

  private static Block construct(String name, Function<Properties, Block> constructor, Properties properties, BiConsumer<Block, Identifier> consumer) {
    Identifier id = NewSlabVariants.id(name);
    Block block = constructor.apply(properties.setId(ResourceKey.create(Registries.BLOCK, id)));
    consumer.accept(block, id);
    return block;
  }
}
