package io.github.jason13official.new_slab_variants.datagen.server;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class NSVBlockTagProvider extends IntrinsicHolderTagsProvider<Block> {

  public NSVBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
    super(output, Registries.BLOCK, registries, block -> block.builtInRegistryHolder().key());
  }

  @Override
  public String getName() {
    return "New Slab Variants Block Tags";
  }

  @Override
  protected void addTags(HolderLookup.Provider registries) {
    // ── SLABS (all 207) ───────────────────────────────────────────────────────
    tag(BlockTags.SLABS)
        // Mineral/gem blocks
        .add(ModBlocks.COAL_BLOCK_SLAB).add(ModBlocks.DIAMOND_BLOCK_SLAB).add(ModBlocks.EMERALD_BLOCK_SLAB)
        .add(ModBlocks.GOLD_BLOCK_SLAB).add(ModBlocks.IRON_BLOCK_SLAB).add(ModBlocks.LAPIS_BLOCK_SLAB)
        .add(ModBlocks.NETHERITE_BLOCK_SLAB).add(ModBlocks.RAW_COPPER_BLOCK_SLAB)
        .add(ModBlocks.RAW_GOLD_BLOCK_SLAB).add(ModBlocks.RAW_IRON_BLOCK_SLAB)
        // Ores
        .add(ModBlocks.COAL_ORE_SLAB).add(ModBlocks.COPPER_ORE_SLAB).add(ModBlocks.DIAMOND_ORE_SLAB)
        .add(ModBlocks.EMERALD_ORE_SLAB).add(ModBlocks.GOLD_ORE_SLAB).add(ModBlocks.IRON_ORE_SLAB)
        .add(ModBlocks.LAPIS_ORE_SLAB).add(ModBlocks.NETHER_GOLD_ORE_SLAB).add(ModBlocks.NETHER_QUARTZ_ORE_SLAB)
        .add(ModBlocks.REDSTONE_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_COAL_ORE_SLAB).add(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB).add(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB).add(ModBlocks.DEEPSLATE_IRON_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB).add(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB)
        // Stone/underground/nether
        .add(ModBlocks.BASALT_SLAB).add(ModBlocks.CALCITE_SLAB).add(ModBlocks.DRIPSTONE_BLOCK_SLAB)
        .add(ModBlocks.GILDED_BLACKSTONE_SLAB).add(ModBlocks.GLOWSTONE_SLAB)
        .add(ModBlocks.LODESTONE_SLAB).add(ModBlocks.MAGMA_BLOCK_SLAB).add(ModBlocks.NETHERRACK_SLAB)
        .add(ModBlocks.OBSIDIAN_SLAB).add(ModBlocks.POLISHED_BASALT_SLAB).add(ModBlocks.QUARTZ_BRICKS_SLAB)
        // Stone — chiseled/cracked
        .add(ModBlocks.END_STONE_SLAB).add(ModBlocks.SMOOTH_BASALT_SLAB)
        .add(ModBlocks.CHISELED_STONE_BRICKS_SLAB).add(ModBlocks.CRACKED_STONE_BRICKS_SLAB)
        .add(ModBlocks.CHISELED_DEEPSLATE_SLAB).add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB)
        .add(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB).add(ModBlocks.CHISELED_NETHER_BRICKS_SLAB)
        .add(ModBlocks.CRACKED_NETHER_BRICKS_SLAB).add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB)
        .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB).add(ModBlocks.CHISELED_RESIN_BRICKS_SLAB)
        // Decorative stone
        .add(ModBlocks.BONE_BLOCK_SLAB).add(ModBlocks.PURPUR_PILLAR_SLAB).add(ModBlocks.QUARTZ_PILLAR_SLAB)
        .add(ModBlocks.TERRACOTTA_SLAB)
        // Terrain
        .add(ModBlocks.DIRT_SLAB).add(ModBlocks.COARSE_DIRT_SLAB).add(ModBlocks.GRASS_BLOCK_SLAB)
        .add(ModBlocks.GRAVEL_SLAB).add(ModBlocks.SAND_SLAB).add(ModBlocks.RED_SAND_SLAB)
        // Earthy/soft
        .add(ModBlocks.CLAY_SLAB).add(ModBlocks.MUD_SLAB)
        .add(ModBlocks.ROOTED_DIRT_SLAB).add(ModBlocks.SOUL_SOIL_SLAB)
        // Natural/functional
        .add(ModBlocks.BEDROCK_SLAB).add(ModBlocks.SCULK_SLAB).add(ModBlocks.AMETHYST_BLOCK_SLAB)
        .add(ModBlocks.BUDDING_AMETHYST_SLAB).add(ModBlocks.ICE_SLAB).add(ModBlocks.PACKED_ICE_SLAB)
        .add(ModBlocks.BLUE_ICE_SLAB).add(ModBlocks.SNOW_BLOCK_SLAB)
        .add(ModBlocks.SPONGE_SLAB).add(ModBlocks.WET_SPONGE_SLAB)
        // Nether/light
        .add(ModBlocks.SOUL_SAND_SLAB).add(ModBlocks.NETHER_WART_BLOCK_SLAB).add(ModBlocks.WARPED_WART_BLOCK_SLAB)
        .add(ModBlocks.SHROOMLIGHT_SLAB).add(ModBlocks.SEA_LANTERN_SLAB)
        // Misc
        .add(ModBlocks.REDSTONE_BLOCK_SLAB).add(ModBlocks.REDSTONE_LAMP_SLAB).add(ModBlocks.HONEYCOMB_BLOCK_SLAB)
        .add(ModBlocks.PACKED_MUD_SLAB).add(ModBlocks.CRYING_OBSIDIAN_SLAB).add(ModBlocks.NOTE_BLOCK_SLAB)
        // Organic/plant
        .add(ModBlocks.MOSS_BLOCK_SLAB).add(ModBlocks.PALE_MOSS_BLOCK_SLAB).add(ModBlocks.RESIN_BLOCK_SLAB)
        // Leaves
        .add(ModBlocks.AZALEA_LEAVES_SLAB).add(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB)
        // Mushroom blocks
        .add(ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB).add(ModBlocks.RED_MUSHROOM_BLOCK_SLAB).add(ModBlocks.MUSHROOM_STEM_SLAB)
        // Wood/fungal
        .add(ModBlocks.BAMBOO_BLOCK_SLAB).add(ModBlocks.CRIMSON_HYPHAE_SLAB)
        .add(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB).add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB)
        .add(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB).add(ModBlocks.WARPED_HYPHAE_SLAB)
        // Copper (block/raw/chiseled/bulb)
        .add(ModBlocks.COPPER_BLOCK_SLAB).add(ModBlocks.EXPOSED_COPPER_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_SLAB).add(ModBlocks.WEATHERED_COPPER_SLAB)
        .add(ModBlocks.CHISELED_COPPER_SLAB).add(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB)
        .add(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB).add(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB)
        .add(ModBlocks.COPPER_BULB_SLAB).add(ModBlocks.EXPOSED_COPPER_BULB_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_BULB_SLAB).add(ModBlocks.WEATHERED_COPPER_BULB_SLAB)
        // Copper grates
        .add(ModBlocks.COPPER_GRATE_SLAB).add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB).add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB)
        // Coral blocks
        .add(ModBlocks.BRAIN_CORAL_BLOCK_SLAB).add(ModBlocks.BUBBLE_CORAL_BLOCK_SLAB)
        .add(ModBlocks.FIRE_CORAL_BLOCK_SLAB).add(ModBlocks.HORN_CORAL_BLOCK_SLAB).add(ModBlocks.TUBE_CORAL_BLOCK_SLAB)
        .add(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB).add(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB)
        .add(ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB).add(ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB)
        .add(ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB)
        // Wool
        .add(ModBlocks.WHITE_WOOL_SLAB).add(ModBlocks.ORANGE_WOOL_SLAB).add(ModBlocks.MAGENTA_WOOL_SLAB)
        .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB).add(ModBlocks.YELLOW_WOOL_SLAB).add(ModBlocks.LIME_WOOL_SLAB)
        .add(ModBlocks.PINK_WOOL_SLAB).add(ModBlocks.GRAY_WOOL_SLAB).add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
        .add(ModBlocks.CYAN_WOOL_SLAB).add(ModBlocks.PURPLE_WOOL_SLAB).add(ModBlocks.BLUE_WOOL_SLAB)
        .add(ModBlocks.BROWN_WOOL_SLAB).add(ModBlocks.GREEN_WOOL_SLAB).add(ModBlocks.RED_WOOL_SLAB)
        .add(ModBlocks.BLACK_WOOL_SLAB)
        // Concrete
        .add(ModBlocks.WHITE_CONCRETE_SLAB).add(ModBlocks.ORANGE_CONCRETE_SLAB).add(ModBlocks.MAGENTA_CONCRETE_SLAB)
        .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB).add(ModBlocks.YELLOW_CONCRETE_SLAB).add(ModBlocks.LIME_CONCRETE_SLAB)
        .add(ModBlocks.PINK_CONCRETE_SLAB).add(ModBlocks.GRAY_CONCRETE_SLAB).add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
        .add(ModBlocks.CYAN_CONCRETE_SLAB).add(ModBlocks.PURPLE_CONCRETE_SLAB).add(ModBlocks.BLUE_CONCRETE_SLAB)
        .add(ModBlocks.BROWN_CONCRETE_SLAB).add(ModBlocks.GREEN_CONCRETE_SLAB).add(ModBlocks.RED_CONCRETE_SLAB)
        .add(ModBlocks.BLACK_CONCRETE_SLAB)
        // Concrete powder
        .add(ModBlocks.WHITE_CONCRETE_POWDER_SLAB).add(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB).add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB).add(ModBlocks.LIME_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.PINK_CONCRETE_POWDER_SLAB).add(ModBlocks.GRAY_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB).add(ModBlocks.CYAN_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB).add(ModBlocks.BLUE_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.BROWN_CONCRETE_POWDER_SLAB).add(ModBlocks.GREEN_CONCRETE_POWDER_SLAB)
        .add(ModBlocks.RED_CONCRETE_POWDER_SLAB).add(ModBlocks.BLACK_CONCRETE_POWDER_SLAB)
        // Glass/stained glass
        .add(ModBlocks.GLASS_SLAB).add(ModBlocks.TINTED_GLASS_SLAB)
        .add(ModBlocks.WHITE_STAINED_GLASS_SLAB).add(ModBlocks.ORANGE_STAINED_GLASS_SLAB)
        .add(ModBlocks.MAGENTA_STAINED_GLASS_SLAB).add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB)
        .add(ModBlocks.YELLOW_STAINED_GLASS_SLAB).add(ModBlocks.LIME_STAINED_GLASS_SLAB)
        .add(ModBlocks.PINK_STAINED_GLASS_SLAB).add(ModBlocks.GRAY_STAINED_GLASS_SLAB)
        .add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB).add(ModBlocks.CYAN_STAINED_GLASS_SLAB)
        .add(ModBlocks.PURPLE_STAINED_GLASS_SLAB).add(ModBlocks.BLUE_STAINED_GLASS_SLAB)
        .add(ModBlocks.BROWN_STAINED_GLASS_SLAB).add(ModBlocks.GREEN_STAINED_GLASS_SLAB)
        .add(ModBlocks.RED_STAINED_GLASS_SLAB).add(ModBlocks.BLACK_STAINED_GLASS_SLAB)
        // Colored terracotta
        .add(ModBlocks.WHITE_TERRACOTTA_SLAB).add(ModBlocks.ORANGE_TERRACOTTA_SLAB)
        .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB).add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
        .add(ModBlocks.YELLOW_TERRACOTTA_SLAB).add(ModBlocks.LIME_TERRACOTTA_SLAB)
        .add(ModBlocks.PINK_TERRACOTTA_SLAB).add(ModBlocks.GRAY_TERRACOTTA_SLAB)
        .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB).add(ModBlocks.CYAN_TERRACOTTA_SLAB)
        .add(ModBlocks.PURPLE_TERRACOTTA_SLAB).add(ModBlocks.BLUE_TERRACOTTA_SLAB)
        .add(ModBlocks.BROWN_TERRACOTTA_SLAB).add(ModBlocks.GREEN_TERRACOTTA_SLAB)
        .add(ModBlocks.RED_TERRACOTTA_SLAB).add(ModBlocks.BLACK_TERRACOTTA_SLAB)
        // Glazed terracotta
        .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
        // Infested blocks
        .add(ModBlocks.INFESTED_STONE_SLAB).add(ModBlocks.INFESTED_COBBLESTONE_SLAB)
        .add(ModBlocks.INFESTED_STONE_BRICKS_SLAB).add(ModBlocks.INFESTED_CRACKED_STONE_BRICKS_SLAB)
        .add(ModBlocks.INFESTED_CHISELED_STONE_BRICKS_SLAB).add(ModBlocks.INFESTED_MOSSY_STONE_BRICKS_SLAB)
        .add(ModBlocks.INFESTED_DEEPSLATE_SLAB)
        // Waxed copper
        .add(ModBlocks.WAXED_COPPER_BLOCK_SLAB).add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB)
        .add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB).add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB)
        // Froglights
        .add(ModBlocks.OCHRE_FROGLIGHT_SLAB).add(ModBlocks.PEARLESCENT_FROGLIGHT_SLAB).add(ModBlocks.VERDANT_FROGLIGHT_SLAB)
        // Nylium
        .add(ModBlocks.CRIMSON_NYLIUM_SLAB).add(ModBlocks.WARPED_NYLIUM_SLAB)
        // Wood logs/wood/leaves
        .add(ModBlocks.OAK_LOG_SLAB).add(ModBlocks.OAK_WOOD_SLAB).add(ModBlocks.STRIPPED_OAK_LOG_SLAB).add(ModBlocks.STRIPPED_OAK_WOOD_SLAB).add(ModBlocks.OAK_LEAVES_SLAB)
        .add(ModBlocks.BIRCH_LOG_SLAB).add(ModBlocks.BIRCH_WOOD_SLAB).add(ModBlocks.STRIPPED_BIRCH_LOG_SLAB).add(ModBlocks.STRIPPED_BIRCH_WOOD_SLAB).add(ModBlocks.BIRCH_LEAVES_SLAB)
        .add(ModBlocks.SPRUCE_LOG_SLAB).add(ModBlocks.SPRUCE_WOOD_SLAB).add(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB).add(ModBlocks.STRIPPED_SPRUCE_WOOD_SLAB).add(ModBlocks.SPRUCE_LEAVES_SLAB)
        .add(ModBlocks.JUNGLE_LOG_SLAB).add(ModBlocks.JUNGLE_WOOD_SLAB).add(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB).add(ModBlocks.STRIPPED_JUNGLE_WOOD_SLAB).add(ModBlocks.JUNGLE_LEAVES_SLAB)
        .add(ModBlocks.ACACIA_LOG_SLAB).add(ModBlocks.ACACIA_WOOD_SLAB).add(ModBlocks.STRIPPED_ACACIA_LOG_SLAB).add(ModBlocks.STRIPPED_ACACIA_WOOD_SLAB).add(ModBlocks.ACACIA_LEAVES_SLAB)
        .add(ModBlocks.DARK_OAK_LOG_SLAB).add(ModBlocks.DARK_OAK_WOOD_SLAB).add(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB).add(ModBlocks.STRIPPED_DARK_OAK_WOOD_SLAB).add(ModBlocks.DARK_OAK_LEAVES_SLAB)
        .add(ModBlocks.CHERRY_LOG_SLAB).add(ModBlocks.CHERRY_WOOD_SLAB).add(ModBlocks.STRIPPED_CHERRY_LOG_SLAB).add(ModBlocks.STRIPPED_CHERRY_WOOD_SLAB).add(ModBlocks.CHERRY_LEAVES_SLAB)
        .add(ModBlocks.MANGROVE_LOG_SLAB).add(ModBlocks.MANGROVE_WOOD_SLAB).add(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB).add(ModBlocks.STRIPPED_MANGROVE_WOOD_SLAB).add(ModBlocks.MANGROVE_LEAVES_SLAB)
        // Misc
        .add(ModBlocks.ANCIENT_DEBRIS_SLAB).add(ModBlocks.BOOKSHELF_SLAB).add(ModBlocks.CHISELED_QUARTZ_BLOCK_SLAB)
        .add(ModBlocks.CHISELED_RED_SANDSTONE_SLAB).add(ModBlocks.CHISELED_SANDSTONE_SLAB).add(ModBlocks.DEEPSLATE_SLAB)
        .add(ModBlocks.DRIED_KELP_BLOCK_SLAB).add(ModBlocks.HAY_BLOCK_SLAB).add(ModBlocks.HONEY_BLOCK_SLAB)
        .add(ModBlocks.LADDER_SLAB).add(ModBlocks.MELON_SLAB).add(ModBlocks.PUMPKIN_SLAB).add(ModBlocks.SCAFFOLDING_SLAB)
        .add(ModBlocks.SCULK_CATALYST_SLAB).add(ModBlocks.SLIME_BLOCK_SLAB).add(ModBlocks.TNT_SLAB).add(ModBlocks.TUFF_SLAB);

    // ── MINEABLE_WITH_PICKAXE ─────────────────────────────────────────────────
    tag(BlockTags.MINEABLE_WITH_PICKAXE)
        // Mineral/gem blocks
        .add(ModBlocks.COAL_BLOCK_SLAB).add(ModBlocks.NETHERRACK_SLAB)
        .add(ModBlocks.BASALT_SLAB).add(ModBlocks.POLISHED_BASALT_SLAB)
        .add(ModBlocks.CALCITE_SLAB).add(ModBlocks.DRIPSTONE_BLOCK_SLAB)
        .add(ModBlocks.GLOWSTONE_SLAB).add(ModBlocks.MAGMA_BLOCK_SLAB)
        .add(ModBlocks.GILDED_BLACKSTONE_SLAB).add(ModBlocks.BONE_BLOCK_SLAB)
        .add(ModBlocks.LODESTONE_SLAB).add(ModBlocks.QUARTZ_BRICKS_SLAB)
        .add(ModBlocks.QUARTZ_PILLAR_SLAB).add(ModBlocks.PURPUR_PILLAR_SLAB)
        .add(ModBlocks.TERRACOTTA_SLAB)
        // Stone tier
        .add(ModBlocks.IRON_BLOCK_SLAB).add(ModBlocks.RAW_IRON_BLOCK_SLAB)
        .add(ModBlocks.LAPIS_BLOCK_SLAB).add(ModBlocks.RAW_COPPER_BLOCK_SLAB)
        .add(ModBlocks.COPPER_GRATE_SLAB).add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
        .add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB).add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB)
        // Iron tier
        .add(ModBlocks.DIAMOND_BLOCK_SLAB).add(ModBlocks.EMERALD_BLOCK_SLAB)
        .add(ModBlocks.GOLD_BLOCK_SLAB).add(ModBlocks.RAW_GOLD_BLOCK_SLAB)
        // Diamond tier
        .add(ModBlocks.OBSIDIAN_SLAB).add(ModBlocks.NETHERITE_BLOCK_SLAB)
        // Ores (all pickaxe)
        .add(ModBlocks.COAL_ORE_SLAB).add(ModBlocks.COPPER_ORE_SLAB).add(ModBlocks.DIAMOND_ORE_SLAB)
        .add(ModBlocks.EMERALD_ORE_SLAB).add(ModBlocks.GOLD_ORE_SLAB).add(ModBlocks.IRON_ORE_SLAB)
        .add(ModBlocks.LAPIS_ORE_SLAB).add(ModBlocks.NETHER_GOLD_ORE_SLAB).add(ModBlocks.NETHER_QUARTZ_ORE_SLAB)
        .add(ModBlocks.REDSTONE_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_COAL_ORE_SLAB).add(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB).add(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB).add(ModBlocks.DEEPSLATE_IRON_ORE_SLAB)
        .add(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB).add(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB)
        // Stone — chiseled/cracked
        .add(ModBlocks.END_STONE_SLAB).add(ModBlocks.SMOOTH_BASALT_SLAB)
        .add(ModBlocks.CHISELED_STONE_BRICKS_SLAB).add(ModBlocks.CRACKED_STONE_BRICKS_SLAB)
        .add(ModBlocks.CHISELED_DEEPSLATE_SLAB).add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB)
        .add(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB).add(ModBlocks.CHISELED_NETHER_BRICKS_SLAB)
        .add(ModBlocks.CRACKED_NETHER_BRICKS_SLAB).add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB)
        .add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB).add(ModBlocks.CHISELED_RESIN_BRICKS_SLAB)
        // Natural/functional
        .add(ModBlocks.BEDROCK_SLAB).add(ModBlocks.SCULK_SLAB)
        .add(ModBlocks.AMETHYST_BLOCK_SLAB).add(ModBlocks.BUDDING_AMETHYST_SLAB)
        .add(ModBlocks.ICE_SLAB).add(ModBlocks.PACKED_ICE_SLAB).add(ModBlocks.BLUE_ICE_SLAB)
        .add(ModBlocks.SEA_LANTERN_SLAB)
        // Misc mineral
        .add(ModBlocks.REDSTONE_BLOCK_SLAB).add(ModBlocks.REDSTONE_LAMP_SLAB)
        .add(ModBlocks.CRYING_OBSIDIAN_SLAB).add(ModBlocks.PACKED_MUD_SLAB)
        // Copper (block/raw/chiseled/bulb — stone tier)
        .add(ModBlocks.COPPER_BLOCK_SLAB).add(ModBlocks.EXPOSED_COPPER_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_SLAB).add(ModBlocks.WEATHERED_COPPER_SLAB)
        .add(ModBlocks.CHISELED_COPPER_SLAB).add(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB)
        .add(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB).add(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB)
        .add(ModBlocks.COPPER_BULB_SLAB).add(ModBlocks.EXPOSED_COPPER_BULB_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_BULB_SLAB).add(ModBlocks.WEATHERED_COPPER_BULB_SLAB)
        // Coral blocks (no tool level)
        .add(ModBlocks.BRAIN_CORAL_BLOCK_SLAB).add(ModBlocks.BUBBLE_CORAL_BLOCK_SLAB)
        .add(ModBlocks.FIRE_CORAL_BLOCK_SLAB).add(ModBlocks.HORN_CORAL_BLOCK_SLAB).add(ModBlocks.TUBE_CORAL_BLOCK_SLAB)
        .add(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB).add(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB)
        .add(ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB).add(ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB)
        .add(ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB)
        // Concrete
        .add(ModBlocks.WHITE_CONCRETE_SLAB).add(ModBlocks.ORANGE_CONCRETE_SLAB).add(ModBlocks.MAGENTA_CONCRETE_SLAB)
        .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB).add(ModBlocks.YELLOW_CONCRETE_SLAB).add(ModBlocks.LIME_CONCRETE_SLAB)
        .add(ModBlocks.PINK_CONCRETE_SLAB).add(ModBlocks.GRAY_CONCRETE_SLAB).add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
        .add(ModBlocks.CYAN_CONCRETE_SLAB).add(ModBlocks.PURPLE_CONCRETE_SLAB).add(ModBlocks.BLUE_CONCRETE_SLAB)
        .add(ModBlocks.BROWN_CONCRETE_SLAB).add(ModBlocks.GREEN_CONCRETE_SLAB).add(ModBlocks.RED_CONCRETE_SLAB)
        .add(ModBlocks.BLACK_CONCRETE_SLAB)
        // Colored terracotta
        .add(ModBlocks.WHITE_TERRACOTTA_SLAB).add(ModBlocks.ORANGE_TERRACOTTA_SLAB)
        .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB).add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
        .add(ModBlocks.YELLOW_TERRACOTTA_SLAB).add(ModBlocks.LIME_TERRACOTTA_SLAB)
        .add(ModBlocks.PINK_TERRACOTTA_SLAB).add(ModBlocks.GRAY_TERRACOTTA_SLAB)
        .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB).add(ModBlocks.CYAN_TERRACOTTA_SLAB)
        .add(ModBlocks.PURPLE_TERRACOTTA_SLAB).add(ModBlocks.BLUE_TERRACOTTA_SLAB)
        .add(ModBlocks.BROWN_TERRACOTTA_SLAB).add(ModBlocks.GREEN_TERRACOTTA_SLAB)
        .add(ModBlocks.RED_TERRACOTTA_SLAB).add(ModBlocks.BLACK_TERRACOTTA_SLAB)
        // Glazed terracotta
        .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)
        .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB).add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
        // Infested blocks
        .add(ModBlocks.INFESTED_STONE_SLAB).add(ModBlocks.INFESTED_COBBLESTONE_SLAB)
        .add(ModBlocks.INFESTED_STONE_BRICKS_SLAB).add(ModBlocks.INFESTED_CRACKED_STONE_BRICKS_SLAB)
        .add(ModBlocks.INFESTED_CHISELED_STONE_BRICKS_SLAB).add(ModBlocks.INFESTED_MOSSY_STONE_BRICKS_SLAB)
        .add(ModBlocks.INFESTED_DEEPSLATE_SLAB)
        // Waxed copper
        .add(ModBlocks.WAXED_COPPER_BLOCK_SLAB).add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB)
        .add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB).add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB)
        // Froglights
        .add(ModBlocks.OCHRE_FROGLIGHT_SLAB).add(ModBlocks.PEARLESCENT_FROGLIGHT_SLAB).add(ModBlocks.VERDANT_FROGLIGHT_SLAB)
        // Nylium
        .add(ModBlocks.CRIMSON_NYLIUM_SLAB).add(ModBlocks.WARPED_NYLIUM_SLAB)
        // Misc (pickaxe-minable)
        .add(ModBlocks.ANCIENT_DEBRIS_SLAB).add(ModBlocks.CHISELED_QUARTZ_BLOCK_SLAB)
        .add(ModBlocks.CHISELED_RED_SANDSTONE_SLAB).add(ModBlocks.CHISELED_SANDSTONE_SLAB)
        .add(ModBlocks.DEEPSLATE_SLAB).add(ModBlocks.SCULK_CATALYST_SLAB).add(ModBlocks.TUFF_SLAB);

    // ── NEEDS_STONE_TOOL ──────────────────────────────────────────────────────
    tag(BlockTags.NEEDS_STONE_TOOL)
        // Original
        .add(ModBlocks.IRON_BLOCK_SLAB).add(ModBlocks.RAW_IRON_BLOCK_SLAB)
        .add(ModBlocks.LAPIS_BLOCK_SLAB).add(ModBlocks.RAW_COPPER_BLOCK_SLAB)
        .add(ModBlocks.COPPER_GRATE_SLAB).add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
        .add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB).add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB)
        // New ores requiring stone pickaxe
        .add(ModBlocks.IRON_ORE_SLAB).add(ModBlocks.DEEPSLATE_IRON_ORE_SLAB)
        .add(ModBlocks.COPPER_ORE_SLAB).add(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB)
        .add(ModBlocks.LAPIS_ORE_SLAB).add(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB)
        // New copper blocks requiring stone pickaxe
        .add(ModBlocks.COPPER_BLOCK_SLAB).add(ModBlocks.EXPOSED_COPPER_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_SLAB).add(ModBlocks.WEATHERED_COPPER_SLAB)
        .add(ModBlocks.CHISELED_COPPER_SLAB).add(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB)
        .add(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB).add(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB)
        .add(ModBlocks.COPPER_BULB_SLAB).add(ModBlocks.EXPOSED_COPPER_BULB_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_BULB_SLAB).add(ModBlocks.WEATHERED_COPPER_BULB_SLAB)
        // Amethyst/sculk
        .add(ModBlocks.AMETHYST_BLOCK_SLAB).add(ModBlocks.BUDDING_AMETHYST_SLAB)
        .add(ModBlocks.SCULK_SLAB)
        // Waxed copper (same tier as non-waxed)
        .add(ModBlocks.WAXED_COPPER_BLOCK_SLAB).add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB)
        .add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB).add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB);

    // ── NEEDS_IRON_TOOL ───────────────────────────────────────────────────────
    tag(BlockTags.NEEDS_IRON_TOOL)
        // Original
        .add(ModBlocks.DIAMOND_BLOCK_SLAB).add(ModBlocks.EMERALD_BLOCK_SLAB)
        .add(ModBlocks.GOLD_BLOCK_SLAB).add(ModBlocks.RAW_GOLD_BLOCK_SLAB)
        // New ores requiring iron pickaxe
        .add(ModBlocks.GOLD_ORE_SLAB).add(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB)
        .add(ModBlocks.REDSTONE_ORE_SLAB).add(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB)
        .add(ModBlocks.DIAMOND_ORE_SLAB).add(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB)
        .add(ModBlocks.EMERALD_ORE_SLAB).add(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB);

    // ── NEEDS_DIAMOND_TOOL ────────────────────────────────────────────────────
    tag(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(ModBlocks.OBSIDIAN_SLAB).add(ModBlocks.NETHERITE_BLOCK_SLAB)
        .add(ModBlocks.CRYING_OBSIDIAN_SLAB);

    // ── MINEABLE_WITH_AXE ────────────────────────────────────────────────────
    tag(BlockTags.MINEABLE_WITH_AXE)
        // Original
        .add(ModBlocks.BAMBOO_BLOCK_SLAB).add(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB)
        .add(ModBlocks.CRIMSON_HYPHAE_SLAB).add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB)
        .add(ModBlocks.WARPED_HYPHAE_SLAB).add(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB)
        // New
        .add(ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB).add(ModBlocks.RED_MUSHROOM_BLOCK_SLAB)
        .add(ModBlocks.MUSHROOM_STEM_SLAB)
        .add(ModBlocks.NOTE_BLOCK_SLAB)
        .add(ModBlocks.HONEYCOMB_BLOCK_SLAB)
        // Logs / wood / stripped
        .add(ModBlocks.OAK_LOG_SLAB).add(ModBlocks.OAK_WOOD_SLAB).add(ModBlocks.STRIPPED_OAK_LOG_SLAB).add(ModBlocks.STRIPPED_OAK_WOOD_SLAB)
        .add(ModBlocks.BIRCH_LOG_SLAB).add(ModBlocks.BIRCH_WOOD_SLAB).add(ModBlocks.STRIPPED_BIRCH_LOG_SLAB).add(ModBlocks.STRIPPED_BIRCH_WOOD_SLAB)
        .add(ModBlocks.SPRUCE_LOG_SLAB).add(ModBlocks.SPRUCE_WOOD_SLAB).add(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB).add(ModBlocks.STRIPPED_SPRUCE_WOOD_SLAB)
        .add(ModBlocks.JUNGLE_LOG_SLAB).add(ModBlocks.JUNGLE_WOOD_SLAB).add(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB).add(ModBlocks.STRIPPED_JUNGLE_WOOD_SLAB)
        .add(ModBlocks.ACACIA_LOG_SLAB).add(ModBlocks.ACACIA_WOOD_SLAB).add(ModBlocks.STRIPPED_ACACIA_LOG_SLAB).add(ModBlocks.STRIPPED_ACACIA_WOOD_SLAB)
        .add(ModBlocks.DARK_OAK_LOG_SLAB).add(ModBlocks.DARK_OAK_WOOD_SLAB).add(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB).add(ModBlocks.STRIPPED_DARK_OAK_WOOD_SLAB)
        .add(ModBlocks.CHERRY_LOG_SLAB).add(ModBlocks.CHERRY_WOOD_SLAB).add(ModBlocks.STRIPPED_CHERRY_LOG_SLAB).add(ModBlocks.STRIPPED_CHERRY_WOOD_SLAB)
        .add(ModBlocks.MANGROVE_LOG_SLAB).add(ModBlocks.MANGROVE_WOOD_SLAB).add(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB).add(ModBlocks.STRIPPED_MANGROVE_WOOD_SLAB)
        .add(ModBlocks.BOOKSHELF_SLAB).add(ModBlocks.DRIED_KELP_BLOCK_SLAB);

    // ── MINEABLE_WITH_SHOVEL ─────────────────────────────────────────────────
    tag(BlockTags.MINEABLE_WITH_SHOVEL)
        // Original
        .add(ModBlocks.CLAY_SLAB).add(ModBlocks.MUD_SLAB)
        .add(ModBlocks.ROOTED_DIRT_SLAB).add(ModBlocks.SOUL_SOIL_SLAB)
        // New
        .add(ModBlocks.DIRT_SLAB).add(ModBlocks.COARSE_DIRT_SLAB).add(ModBlocks.GRASS_BLOCK_SLAB)
        .add(ModBlocks.GRAVEL_SLAB).add(ModBlocks.SAND_SLAB).add(ModBlocks.RED_SAND_SLAB)
        .add(ModBlocks.SOUL_SAND_SLAB).add(ModBlocks.SNOW_BLOCK_SLAB);

    // ── MINEABLE_WITH_HOE ────────────────────────────────────────────────────
    tag(BlockTags.MINEABLE_WITH_HOE)
        // Original
        .add(ModBlocks.MOSS_BLOCK_SLAB).add(ModBlocks.PALE_MOSS_BLOCK_SLAB)
        // New
        .add(ModBlocks.NETHER_WART_BLOCK_SLAB).add(ModBlocks.WARPED_WART_BLOCK_SLAB)
        .add(ModBlocks.SHROOMLIGHT_SLAB)
        .add(ModBlocks.AZALEA_LEAVES_SLAB).add(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB)
        // All tree leaves
        .add(ModBlocks.OAK_LEAVES_SLAB).add(ModBlocks.BIRCH_LEAVES_SLAB).add(ModBlocks.SPRUCE_LEAVES_SLAB)
        .add(ModBlocks.JUNGLE_LEAVES_SLAB).add(ModBlocks.ACACIA_LEAVES_SLAB).add(ModBlocks.DARK_OAK_LEAVES_SLAB)
        .add(ModBlocks.CHERRY_LEAVES_SLAB).add(ModBlocks.MANGROVE_LEAVES_SLAB)
        // Misc hoe
        .add(ModBlocks.HAY_BLOCK_SLAB).add(ModBlocks.CRIMSON_NYLIUM_SLAB).add(ModBlocks.WARPED_NYLIUM_SLAB);
  }
}
