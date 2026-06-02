package io.github.jason13official.new_slab_variants.impl.common.registry;

import io.github.jason13official.new_slab_variants.NewSlabVariants;
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

  // Mineral/gem blocks
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

  // Stone/underground/nether
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

  // Decorative stone
  public static Block BONE_BLOCK_SLAB;
  public static Block PURPUR_PILLAR_SLAB;
  public static Block QUARTZ_PILLAR_SLAB;
  public static Block TERRACOTTA_SLAB;

  // Earthy/soft
  public static Block CLAY_SLAB;
  public static Block MUD_SLAB;
  public static Block ROOTED_DIRT_SLAB;
  public static Block SOUL_SOIL_SLAB;

  // Organic/plant
  public static Block MOSS_BLOCK_SLAB;
  public static Block PALE_MOSS_BLOCK_SLAB;
  public static Block RESIN_BLOCK_SLAB;

  // Wood/fungal
  public static Block BAMBOO_BLOCK_SLAB;
  public static Block CRIMSON_HYPHAE_SLAB;
  public static Block STRIPPED_BAMBOO_BLOCK_SLAB;
  public static Block STRIPPED_CRIMSON_HYPHAE_SLAB;
  public static Block STRIPPED_WARPED_HYPHAE_SLAB;
  public static Block WARPED_HYPHAE_SLAB;

  // Copper grates
  public static Block COPPER_GRATE_SLAB;
  public static Block EXPOSED_COPPER_GRATE_SLAB;
  public static Block OXIDIZED_COPPER_GRATE_SLAB;
  public static Block WEATHERED_COPPER_GRATE_SLAB;

  public static void register(BiConsumer<Block, Identifier> consumer) {
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

    BONE_BLOCK_SLAB        = slab("bone_block_slab",        Blocks.BONE_BLOCK,        consumer);
    PURPUR_PILLAR_SLAB     = slab("purpur_pillar_slab",     Blocks.PURPUR_PILLAR,     consumer);
    QUARTZ_PILLAR_SLAB     = slab("quartz_pillar_slab",     Blocks.QUARTZ_PILLAR,     consumer);
    TERRACOTTA_SLAB        = slab("terracotta_slab",        Blocks.TERRACOTTA,        consumer);

    CLAY_SLAB              = slab("clay_slab",              Blocks.CLAY,              consumer);
    MUD_SLAB               = slab("mud_slab",               Blocks.MUD,               consumer);
    ROOTED_DIRT_SLAB       = slab("rooted_dirt_slab",       Blocks.ROOTED_DIRT,       consumer);
    SOUL_SOIL_SLAB         = slab("soul_soil_slab",         Blocks.SOUL_SOIL,         consumer);

    MOSS_BLOCK_SLAB        = slab("moss_block_slab",        Blocks.MOSS_BLOCK,        consumer);
    PALE_MOSS_BLOCK_SLAB   = slab("pale_moss_block_slab",   Blocks.PALE_MOSS_BLOCK,   consumer);
    RESIN_BLOCK_SLAB       = slab("resin_block_slab",       Blocks.RESIN_BLOCK,       consumer);

    // logProperties() uses axis-dependent mapColor — must use explicit Properties
    BAMBOO_BLOCK_SLAB           = slab("bamboo_block_slab",           bambooProps(MapColor.COLOR_YELLOW),    consumer);
    CRIMSON_HYPHAE_SLAB         = slab("crimson_hyphae_slab",         Blocks.CRIMSON_HYPHAE,         consumer);
    STRIPPED_BAMBOO_BLOCK_SLAB  = slab("stripped_bamboo_block_slab",  bambooProps(MapColor.COLOR_YELLOW), consumer);
    STRIPPED_CRIMSON_HYPHAE_SLAB = slab("stripped_crimson_hyphae_slab", Blocks.STRIPPED_CRIMSON_HYPHAE, consumer);
    STRIPPED_WARPED_HYPHAE_SLAB  = slab("stripped_warped_hyphae_slab",  Blocks.STRIPPED_WARPED_HYPHAE,  consumer);
    WARPED_HYPHAE_SLAB           = slab("warped_hyphae_slab",           Blocks.WARPED_HYPHAE,           consumer);

    COPPER_GRATE_SLAB          = slab("copper_grate_slab",          Blocks.COPPER_GRATE,          consumer);
    EXPOSED_COPPER_GRATE_SLAB  = slab("exposed_copper_grate_slab",  Blocks.EXPOSED_COPPER_GRATE,  consumer);
    OXIDIZED_COPPER_GRATE_SLAB = slab("oxidized_copper_grate_slab", Blocks.OXIDIZED_COPPER_GRATE, consumer);
    WEATHERED_COPPER_GRATE_SLAB = slab("weathered_copper_grate_slab", Blocks.WEATHERED_COPPER_GRATE, consumer);
  }

  private static Block slab(String name, Properties props, BiConsumer<Block, Identifier> consumer) {
    return construct(name, SlabBlock::new, props, consumer);
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
    // ofLegacyCopy avoids copying state-dependent predicates (isSuffocating, isRedstoneConductor)
    // that on RotatedPillarBlock reference AXIS — a property our SlabBlock doesn't have,
    // causing a crash when NeoForge pre-computes the BlockState cache during registration.
    return construct(name, SlabBlock::new, BlockBehaviour.Properties.ofLegacyCopy(source), consumer);
  }

  private static Block construct(String name, Function<Properties, Block> constructor, Properties properties, BiConsumer<Block, Identifier> consumer) {
    Identifier id = NewSlabVariants.id(name);
    Block block = constructor.apply(properties.setId(ResourceKey.create(Registries.BLOCK, id)));
    consumer.accept(block, id);
    return block;
  }
}
