package io.github.jason13official.new_slab_variants.datagen.server;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import java.util.List;
import java.util.Set;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

public class NSVBlockLootProvider extends BlockLootSubProvider {

  public NSVBlockLootProvider(HolderLookup.Provider registries) {
    super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
  }

  @Override
  protected void generate() {
    // Mineral/gem blocks
    this.add(ModBlocks.COAL_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.DIAMOND_BLOCK_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.EMERALD_BLOCK_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.GOLD_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.IRON_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.LAPIS_BLOCK_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.NETHERITE_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.RAW_COPPER_BLOCK_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.RAW_GOLD_BLOCK_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.RAW_IRON_BLOCK_SLAB,    this::createSlabItemTable);

    // Ores
    this.add(ModBlocks.COAL_ORE_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.COPPER_ORE_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.DIAMOND_ORE_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.EMERALD_ORE_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.GOLD_ORE_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.IRON_ORE_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.LAPIS_ORE_SLAB,             this::createSlabItemTable);
    this.add(ModBlocks.NETHER_GOLD_ORE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.NETHER_QUARTZ_ORE_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.REDSTONE_ORE_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_COAL_ORE_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_IRON_ORE_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, this::createSlabItemTable);

    // Stone/underground/nether
    this.add(ModBlocks.BASALT_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.CALCITE_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.DRIPSTONE_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.GILDED_BLACKSTONE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.GLOWSTONE_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.LODESTONE_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.MAGMA_BLOCK_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.NETHERRACK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.OBSIDIAN_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.POLISHED_BASALT_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.QUARTZ_BRICKS_SLAB,     this::createSlabItemTable);

    // Stone — chiseled/cracked
    this.add(ModBlocks.END_STONE_SLAB,                       this::createSlabItemTable);
    this.add(ModBlocks.SMOOTH_BASALT_SLAB,                   this::createSlabItemTable);
    this.add(ModBlocks.CHISELED_STONE_BRICKS_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.CRACKED_STONE_BRICKS_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.CHISELED_DEEPSLATE_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.CHISELED_NETHER_BRICKS_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.CRACKED_NETHER_BRICKS_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.CHISELED_RESIN_BRICKS_SLAB,           this::createSlabItemTable);

    // Decorative stone
    this.add(ModBlocks.BONE_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.PURPUR_PILLAR_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.QUARTZ_PILLAR_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.TERRACOTTA_SLAB,        this::createSlabItemTable);

    // Terrain
    this.add(ModBlocks.DIRT_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.COARSE_DIRT_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.GRASS_BLOCK_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.GRAVEL_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.SAND_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.RED_SAND_SLAB,    this::createSlabItemTable);

    // Earthy/soft
    this.add(ModBlocks.CLAY_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.MUD_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.ROOTED_DIRT_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.SOUL_SOIL_SLAB,   this::createSlabItemTable);

    // Natural/functional
    this.add(ModBlocks.BEDROCK_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.SCULK_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.AMETHYST_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.BUDDING_AMETHYST_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.ICE_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.PACKED_ICE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BLUE_ICE_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.SNOW_BLOCK_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.SPONGE_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.WET_SPONGE_SLAB,       this::createSlabItemTable);

    // Nether/light
    this.add(ModBlocks.SOUL_SAND_SLAB,         this::createSlabItemTable);
    this.add(ModBlocks.NETHER_WART_BLOCK_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.WARPED_WART_BLOCK_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.SHROOMLIGHT_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.SEA_LANTERN_SLAB,       this::createSlabItemTable);

    // Misc
    this.add(ModBlocks.REDSTONE_BLOCK_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.REDSTONE_LAMP_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.HONEYCOMB_BLOCK_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.PACKED_MUD_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.CRYING_OBSIDIAN_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.NOTE_BLOCK_SLAB,      this::createSlabItemTable);

    // Organic/plant
    this.add(ModBlocks.MOSS_BLOCK_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.PALE_MOSS_BLOCK_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.RESIN_BLOCK_SLAB,     this::createSlabItemTable);

    // Leaves
    this.add(ModBlocks.AZALEA_LEAVES_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB, this::createSlabItemTable);

    // Mushroom blocks
    this.add(ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.RED_MUSHROOM_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.MUSHROOM_STEM_SLAB,        this::createSlabItemTable);

    // Wood/fungal
    this.add(ModBlocks.BAMBOO_BLOCK_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.CRIMSON_HYPHAE_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.WARPED_HYPHAE_SLAB,           this::createSlabItemTable);

    // Copper (block/raw/chiseled/bulb)
    this.add(ModBlocks.COPPER_BLOCK_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.EXPOSED_COPPER_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.OXIDIZED_COPPER_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.WEATHERED_COPPER_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.CHISELED_COPPER_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.COPPER_BULB_SLAB,               this::createSlabItemTable);
    this.add(ModBlocks.EXPOSED_COPPER_BULB_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.OXIDIZED_COPPER_BULB_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.WEATHERED_COPPER_BULB_SLAB,     this::createSlabItemTable);

    // Copper grates
    this.add(ModBlocks.COPPER_GRATE_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, this::createSlabItemTable);

    // Coral blocks
    this.add(ModBlocks.BRAIN_CORAL_BLOCK_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BUBBLE_CORAL_BLOCK_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.FIRE_CORAL_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.HORN_CORAL_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.TUBE_CORAL_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB,   this::createSlabItemTable);

    // Wool
    this.add(ModBlocks.WHITE_WOOL_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.ORANGE_WOOL_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.MAGENTA_WOOL_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.YELLOW_WOOL_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.LIME_WOOL_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PINK_WOOL_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.GRAY_WOOL_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.CYAN_WOOL_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PURPLE_WOOL_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.BLUE_WOOL_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BROWN_WOOL_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.GREEN_WOOL_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.RED_WOOL_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.BLACK_WOOL_SLAB,      this::createSlabItemTable);

    // Concrete
    this.add(ModBlocks.WHITE_CONCRETE_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.ORANGE_CONCRETE_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.MAGENTA_CONCRETE_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.YELLOW_CONCRETE_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.LIME_CONCRETE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PINK_CONCRETE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.GRAY_CONCRETE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.CYAN_CONCRETE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PURPLE_CONCRETE_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.BLUE_CONCRETE_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BROWN_CONCRETE_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.GREEN_CONCRETE_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.RED_CONCRETE_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.BLACK_CONCRETE_SLAB,      this::createSlabItemTable);

    // Concrete powder
    this.add(ModBlocks.WHITE_CONCRETE_POWDER_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.LIME_CONCRETE_POWDER_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PINK_CONCRETE_POWDER_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.GRAY_CONCRETE_POWDER_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.CYAN_CONCRETE_POWDER_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.BLUE_CONCRETE_POWDER_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BROWN_CONCRETE_POWDER_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.GREEN_CONCRETE_POWDER_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.RED_CONCRETE_POWDER_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.BLACK_CONCRETE_POWDER_SLAB,      this::createSlabItemTable);

    // Glass/stained glass
    this.add(ModBlocks.GLASS_SLAB,                    this::createSlabItemTable);
    this.add(ModBlocks.TINTED_GLASS_SLAB,             this::createSlabItemTable);
    this.add(ModBlocks.WHITE_STAINED_GLASS_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.ORANGE_STAINED_GLASS_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.MAGENTA_STAINED_GLASS_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.YELLOW_STAINED_GLASS_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.LIME_STAINED_GLASS_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PINK_STAINED_GLASS_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.GRAY_STAINED_GLASS_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.CYAN_STAINED_GLASS_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PURPLE_STAINED_GLASS_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.BLUE_STAINED_GLASS_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BROWN_STAINED_GLASS_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.GREEN_STAINED_GLASS_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.RED_STAINED_GLASS_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.BLACK_STAINED_GLASS_SLAB,      this::createSlabItemTable);

    // Colored terracotta
    this.add(ModBlocks.WHITE_TERRACOTTA_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.ORANGE_TERRACOTTA_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB,    this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.YELLOW_TERRACOTTA_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.LIME_TERRACOTTA_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PINK_TERRACOTTA_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.GRAY_TERRACOTTA_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.CYAN_TERRACOTTA_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.PURPLE_TERRACOTTA_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.BLUE_TERRACOTTA_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.BROWN_TERRACOTTA_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.GREEN_TERRACOTTA_SLAB,      this::createSlabItemTable);
    this.add(ModBlocks.RED_TERRACOTTA_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.BLACK_TERRACOTTA_SLAB,      this::createSlabItemTable);
  }

  @Override
  protected Iterable<Block> getKnownBlocks() {
    return List.of(
        // Mineral/gem blocks
        ModBlocks.COAL_BLOCK_SLAB, ModBlocks.DIAMOND_BLOCK_SLAB, ModBlocks.EMERALD_BLOCK_SLAB,
        ModBlocks.GOLD_BLOCK_SLAB, ModBlocks.IRON_BLOCK_SLAB, ModBlocks.LAPIS_BLOCK_SLAB,
        ModBlocks.NETHERITE_BLOCK_SLAB, ModBlocks.RAW_COPPER_BLOCK_SLAB,
        ModBlocks.RAW_GOLD_BLOCK_SLAB, ModBlocks.RAW_IRON_BLOCK_SLAB,
        // Ores
        ModBlocks.COAL_ORE_SLAB, ModBlocks.COPPER_ORE_SLAB, ModBlocks.DIAMOND_ORE_SLAB,
        ModBlocks.EMERALD_ORE_SLAB, ModBlocks.GOLD_ORE_SLAB, ModBlocks.IRON_ORE_SLAB,
        ModBlocks.LAPIS_ORE_SLAB, ModBlocks.NETHER_GOLD_ORE_SLAB, ModBlocks.NETHER_QUARTZ_ORE_SLAB,
        ModBlocks.REDSTONE_ORE_SLAB,
        ModBlocks.DEEPSLATE_COAL_ORE_SLAB, ModBlocks.DEEPSLATE_COPPER_ORE_SLAB,
        ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB,
        ModBlocks.DEEPSLATE_GOLD_ORE_SLAB, ModBlocks.DEEPSLATE_IRON_ORE_SLAB,
        ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB, ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB,
        // Stone/underground/nether
        ModBlocks.BASALT_SLAB, ModBlocks.CALCITE_SLAB, ModBlocks.DRIPSTONE_BLOCK_SLAB,
        ModBlocks.GILDED_BLACKSTONE_SLAB, ModBlocks.GLOWSTONE_SLAB, ModBlocks.LODESTONE_SLAB,
        ModBlocks.MAGMA_BLOCK_SLAB, ModBlocks.NETHERRACK_SLAB, ModBlocks.OBSIDIAN_SLAB,
        ModBlocks.POLISHED_BASALT_SLAB, ModBlocks.QUARTZ_BRICKS_SLAB,
        // Stone — chiseled/cracked
        ModBlocks.END_STONE_SLAB, ModBlocks.SMOOTH_BASALT_SLAB,
        ModBlocks.CHISELED_STONE_BRICKS_SLAB, ModBlocks.CRACKED_STONE_BRICKS_SLAB,
        ModBlocks.CHISELED_DEEPSLATE_SLAB, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB,
        ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB, ModBlocks.CHISELED_NETHER_BRICKS_SLAB,
        ModBlocks.CRACKED_NETHER_BRICKS_SLAB, ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,
        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, ModBlocks.CHISELED_RESIN_BRICKS_SLAB,
        // Decorative stone
        ModBlocks.BONE_BLOCK_SLAB, ModBlocks.PURPUR_PILLAR_SLAB, ModBlocks.QUARTZ_PILLAR_SLAB,
        ModBlocks.TERRACOTTA_SLAB,
        // Terrain
        ModBlocks.DIRT_SLAB, ModBlocks.COARSE_DIRT_SLAB, ModBlocks.GRASS_BLOCK_SLAB, ModBlocks.GRAVEL_SLAB,
        ModBlocks.SAND_SLAB, ModBlocks.RED_SAND_SLAB,
        // Earthy/soft
        ModBlocks.CLAY_SLAB, ModBlocks.MUD_SLAB, ModBlocks.ROOTED_DIRT_SLAB, ModBlocks.SOUL_SOIL_SLAB,
        // Natural/functional
        ModBlocks.BEDROCK_SLAB, ModBlocks.SCULK_SLAB, ModBlocks.AMETHYST_BLOCK_SLAB,
        ModBlocks.BUDDING_AMETHYST_SLAB, ModBlocks.ICE_SLAB, ModBlocks.PACKED_ICE_SLAB,
        ModBlocks.BLUE_ICE_SLAB, ModBlocks.SNOW_BLOCK_SLAB, ModBlocks.SPONGE_SLAB, ModBlocks.WET_SPONGE_SLAB,
        // Nether/light
        ModBlocks.SOUL_SAND_SLAB, ModBlocks.NETHER_WART_BLOCK_SLAB, ModBlocks.WARPED_WART_BLOCK_SLAB,
        ModBlocks.SHROOMLIGHT_SLAB, ModBlocks.SEA_LANTERN_SLAB,
        // Misc
        ModBlocks.REDSTONE_BLOCK_SLAB, ModBlocks.REDSTONE_LAMP_SLAB, ModBlocks.HONEYCOMB_BLOCK_SLAB,
        ModBlocks.PACKED_MUD_SLAB, ModBlocks.CRYING_OBSIDIAN_SLAB, ModBlocks.NOTE_BLOCK_SLAB,
        // Organic/plant
        ModBlocks.MOSS_BLOCK_SLAB, ModBlocks.PALE_MOSS_BLOCK_SLAB, ModBlocks.RESIN_BLOCK_SLAB,
        // Leaves
        ModBlocks.AZALEA_LEAVES_SLAB, ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB,
        // Mushroom blocks
        ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB, ModBlocks.RED_MUSHROOM_BLOCK_SLAB, ModBlocks.MUSHROOM_STEM_SLAB,
        // Wood/fungal
        ModBlocks.BAMBOO_BLOCK_SLAB, ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,
        ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,
        ModBlocks.WARPED_HYPHAE_SLAB,
        // Copper (block/raw/chiseled/bulb)
        ModBlocks.COPPER_BLOCK_SLAB, ModBlocks.EXPOSED_COPPER_SLAB,
        ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_SLAB,
        ModBlocks.CHISELED_COPPER_SLAB, ModBlocks.EXPOSED_CHISELED_COPPER_SLAB,
        ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB, ModBlocks.WEATHERED_CHISELED_COPPER_SLAB,
        ModBlocks.COPPER_BULB_SLAB, ModBlocks.EXPOSED_COPPER_BULB_SLAB,
        ModBlocks.OXIDIZED_COPPER_BULB_SLAB, ModBlocks.WEATHERED_COPPER_BULB_SLAB,
        // Copper grates
        ModBlocks.COPPER_GRATE_SLAB, ModBlocks.EXPOSED_COPPER_GRATE_SLAB,
        ModBlocks.OXIDIZED_COPPER_GRATE_SLAB, ModBlocks.WEATHERED_COPPER_GRATE_SLAB,
        // Coral blocks
        ModBlocks.BRAIN_CORAL_BLOCK_SLAB, ModBlocks.BUBBLE_CORAL_BLOCK_SLAB,
        ModBlocks.FIRE_CORAL_BLOCK_SLAB, ModBlocks.HORN_CORAL_BLOCK_SLAB, ModBlocks.TUBE_CORAL_BLOCK_SLAB,
        ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB, ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB,
        ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB, ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB,
        ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB,
        // Wool
        ModBlocks.WHITE_WOOL_SLAB, ModBlocks.ORANGE_WOOL_SLAB, ModBlocks.MAGENTA_WOOL_SLAB,
        ModBlocks.LIGHT_BLUE_WOOL_SLAB, ModBlocks.YELLOW_WOOL_SLAB, ModBlocks.LIME_WOOL_SLAB,
        ModBlocks.PINK_WOOL_SLAB, ModBlocks.GRAY_WOOL_SLAB, ModBlocks.LIGHT_GRAY_WOOL_SLAB,
        ModBlocks.CYAN_WOOL_SLAB, ModBlocks.PURPLE_WOOL_SLAB, ModBlocks.BLUE_WOOL_SLAB,
        ModBlocks.BROWN_WOOL_SLAB, ModBlocks.GREEN_WOOL_SLAB, ModBlocks.RED_WOOL_SLAB, ModBlocks.BLACK_WOOL_SLAB,
        // Concrete
        ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_SLAB,
        ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_SLAB,
        ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB,
        ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_SLAB,
        ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_SLAB,
        ModBlocks.BLACK_CONCRETE_SLAB,
        // Concrete powder
        ModBlocks.WHITE_CONCRETE_POWDER_SLAB, ModBlocks.ORANGE_CONCRETE_POWDER_SLAB,
        ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB,
        ModBlocks.YELLOW_CONCRETE_POWDER_SLAB, ModBlocks.LIME_CONCRETE_POWDER_SLAB,
        ModBlocks.PINK_CONCRETE_POWDER_SLAB, ModBlocks.GRAY_CONCRETE_POWDER_SLAB,
        ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, ModBlocks.CYAN_CONCRETE_POWDER_SLAB,
        ModBlocks.PURPLE_CONCRETE_POWDER_SLAB, ModBlocks.BLUE_CONCRETE_POWDER_SLAB,
        ModBlocks.BROWN_CONCRETE_POWDER_SLAB, ModBlocks.GREEN_CONCRETE_POWDER_SLAB,
        ModBlocks.RED_CONCRETE_POWDER_SLAB, ModBlocks.BLACK_CONCRETE_POWDER_SLAB,
        // Glass/stained glass
        ModBlocks.GLASS_SLAB, ModBlocks.TINTED_GLASS_SLAB,
        ModBlocks.WHITE_STAINED_GLASS_SLAB, ModBlocks.ORANGE_STAINED_GLASS_SLAB,
        ModBlocks.MAGENTA_STAINED_GLASS_SLAB, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,
        ModBlocks.YELLOW_STAINED_GLASS_SLAB, ModBlocks.LIME_STAINED_GLASS_SLAB,
        ModBlocks.PINK_STAINED_GLASS_SLAB, ModBlocks.GRAY_STAINED_GLASS_SLAB,
        ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, ModBlocks.CYAN_STAINED_GLASS_SLAB,
        ModBlocks.PURPLE_STAINED_GLASS_SLAB, ModBlocks.BLUE_STAINED_GLASS_SLAB,
        ModBlocks.BROWN_STAINED_GLASS_SLAB, ModBlocks.GREEN_STAINED_GLASS_SLAB,
        ModBlocks.RED_STAINED_GLASS_SLAB, ModBlocks.BLACK_STAINED_GLASS_SLAB,
        // Colored terracotta
        ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_SLAB,
        ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB,
        ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_SLAB,
        ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_SLAB,
        ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_SLAB,
        ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_SLAB,
        ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_SLAB,
        ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_SLAB
    );
  }
}
