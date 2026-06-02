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

  // Mineral/gem blocks
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

  // Stone/underground/nether
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

  // Decorative stone
  public static Item BONE_BLOCK_SLAB;
  public static Item PURPUR_PILLAR_SLAB;
  public static Item QUARTZ_PILLAR_SLAB;
  public static Item TERRACOTTA_SLAB;

  // Earthy/soft
  public static Item CLAY_SLAB;
  public static Item MUD_SLAB;
  public static Item ROOTED_DIRT_SLAB;
  public static Item SOUL_SOIL_SLAB;

  // Organic/plant
  public static Item MOSS_BLOCK_SLAB;
  public static Item PALE_MOSS_BLOCK_SLAB;
  public static Item RESIN_BLOCK_SLAB;

  // Wood/fungal
  public static Item BAMBOO_BLOCK_SLAB;
  public static Item CRIMSON_HYPHAE_SLAB;
  public static Item STRIPPED_BAMBOO_BLOCK_SLAB;
  public static Item STRIPPED_CRIMSON_HYPHAE_SLAB;
  public static Item STRIPPED_WARPED_HYPHAE_SLAB;
  public static Item WARPED_HYPHAE_SLAB;

  // Copper grates
  public static Item COPPER_GRATE_SLAB;
  public static Item EXPOSED_COPPER_GRATE_SLAB;
  public static Item OXIDIZED_COPPER_GRATE_SLAB;
  public static Item WEATHERED_COPPER_GRATE_SLAB;

  public static void register(BiConsumer<Item, Identifier> consumer) {
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

    BONE_BLOCK_SLAB        = blockItem("bone_block_slab",        ModBlocks.BONE_BLOCK_SLAB,        consumer);
    PURPUR_PILLAR_SLAB     = blockItem("purpur_pillar_slab",     ModBlocks.PURPUR_PILLAR_SLAB,     consumer);
    QUARTZ_PILLAR_SLAB     = blockItem("quartz_pillar_slab",     ModBlocks.QUARTZ_PILLAR_SLAB,     consumer);
    TERRACOTTA_SLAB        = blockItem("terracotta_slab",        ModBlocks.TERRACOTTA_SLAB,        consumer);

    CLAY_SLAB              = blockItem("clay_slab",              ModBlocks.CLAY_SLAB,              consumer);
    MUD_SLAB               = blockItem("mud_slab",               ModBlocks.MUD_SLAB,               consumer);
    ROOTED_DIRT_SLAB       = blockItem("rooted_dirt_slab",       ModBlocks.ROOTED_DIRT_SLAB,       consumer);
    SOUL_SOIL_SLAB         = blockItem("soul_soil_slab",         ModBlocks.SOUL_SOIL_SLAB,         consumer);

    MOSS_BLOCK_SLAB        = blockItem("moss_block_slab",        ModBlocks.MOSS_BLOCK_SLAB,        consumer);
    PALE_MOSS_BLOCK_SLAB   = blockItem("pale_moss_block_slab",   ModBlocks.PALE_MOSS_BLOCK_SLAB,   consumer);
    RESIN_BLOCK_SLAB       = blockItem("resin_block_slab",       ModBlocks.RESIN_BLOCK_SLAB,       consumer);

    BAMBOO_BLOCK_SLAB           = blockItem("bamboo_block_slab",           ModBlocks.BAMBOO_BLOCK_SLAB,           consumer);
    CRIMSON_HYPHAE_SLAB         = blockItem("crimson_hyphae_slab",         ModBlocks.CRIMSON_HYPHAE_SLAB,         consumer);
    STRIPPED_BAMBOO_BLOCK_SLAB  = blockItem("stripped_bamboo_block_slab",  ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,  consumer);
    STRIPPED_CRIMSON_HYPHAE_SLAB = blockItem("stripped_crimson_hyphae_slab", ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, consumer);
    STRIPPED_WARPED_HYPHAE_SLAB  = blockItem("stripped_warped_hyphae_slab",  ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  consumer);
    WARPED_HYPHAE_SLAB           = blockItem("warped_hyphae_slab",           ModBlocks.WARPED_HYPHAE_SLAB,           consumer);

    COPPER_GRATE_SLAB          = blockItem("copper_grate_slab",          ModBlocks.COPPER_GRATE_SLAB,          consumer);
    EXPOSED_COPPER_GRATE_SLAB  = blockItem("exposed_copper_grate_slab",  ModBlocks.EXPOSED_COPPER_GRATE_SLAB,  consumer);
    OXIDIZED_COPPER_GRATE_SLAB = blockItem("oxidized_copper_grate_slab", ModBlocks.OXIDIZED_COPPER_GRATE_SLAB, consumer);
    WEATHERED_COPPER_GRATE_SLAB = blockItem("weathered_copper_grate_slab", ModBlocks.WEATHERED_COPPER_GRATE_SLAB, consumer);
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
