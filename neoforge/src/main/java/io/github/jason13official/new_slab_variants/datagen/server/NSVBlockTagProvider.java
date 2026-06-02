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
    // All slabs
    tag(BlockTags.SLABS)
        .add(ModBlocks.COAL_BLOCK_SLAB).add(ModBlocks.DIAMOND_BLOCK_SLAB).add(ModBlocks.EMERALD_BLOCK_SLAB)
        .add(ModBlocks.GOLD_BLOCK_SLAB).add(ModBlocks.IRON_BLOCK_SLAB).add(ModBlocks.LAPIS_BLOCK_SLAB)
        .add(ModBlocks.NETHERITE_BLOCK_SLAB).add(ModBlocks.RAW_COPPER_BLOCK_SLAB)
        .add(ModBlocks.RAW_GOLD_BLOCK_SLAB).add(ModBlocks.RAW_IRON_BLOCK_SLAB)
        .add(ModBlocks.BASALT_SLAB).add(ModBlocks.CALCITE_SLAB).add(ModBlocks.DRIPSTONE_BLOCK_SLAB)
        .add(ModBlocks.GILDED_BLACKSTONE_SLAB).add(ModBlocks.GLOWSTONE_SLAB)
        .add(ModBlocks.LODESTONE_SLAB).add(ModBlocks.MAGMA_BLOCK_SLAB).add(ModBlocks.NETHERRACK_SLAB)
        .add(ModBlocks.OBSIDIAN_SLAB).add(ModBlocks.POLISHED_BASALT_SLAB).add(ModBlocks.QUARTZ_BRICKS_SLAB)
        .add(ModBlocks.BONE_BLOCK_SLAB).add(ModBlocks.PURPUR_PILLAR_SLAB).add(ModBlocks.QUARTZ_PILLAR_SLAB)
        .add(ModBlocks.TERRACOTTA_SLAB).add(ModBlocks.CLAY_SLAB).add(ModBlocks.MUD_SLAB)
        .add(ModBlocks.ROOTED_DIRT_SLAB).add(ModBlocks.SOUL_SOIL_SLAB).add(ModBlocks.MOSS_BLOCK_SLAB)
        .add(ModBlocks.PALE_MOSS_BLOCK_SLAB).add(ModBlocks.RESIN_BLOCK_SLAB)
        .add(ModBlocks.BAMBOO_BLOCK_SLAB).add(ModBlocks.CRIMSON_HYPHAE_SLAB)
        .add(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB).add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB)
        .add(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB).add(ModBlocks.WARPED_HYPHAE_SLAB)
        .add(ModBlocks.COPPER_GRATE_SLAB).add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
        .add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB).add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB);

    // Pickaxe mineable (no tool level)
    tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .add(ModBlocks.COAL_BLOCK_SLAB).add(ModBlocks.NETHERRACK_SLAB)
        .add(ModBlocks.BASALT_SLAB).add(ModBlocks.POLISHED_BASALT_SLAB)
        .add(ModBlocks.CALCITE_SLAB).add(ModBlocks.DRIPSTONE_BLOCK_SLAB)
        .add(ModBlocks.GLOWSTONE_SLAB).add(ModBlocks.MAGMA_BLOCK_SLAB)
        .add(ModBlocks.GILDED_BLACKSTONE_SLAB).add(ModBlocks.BONE_BLOCK_SLAB)
        .add(ModBlocks.LODESTONE_SLAB).add(ModBlocks.QUARTZ_BRICKS_SLAB)
        .add(ModBlocks.QUARTZ_PILLAR_SLAB).add(ModBlocks.PURPUR_PILLAR_SLAB)
        .add(ModBlocks.TERRACOTTA_SLAB)
        // needs_stone_tool tier
        .add(ModBlocks.IRON_BLOCK_SLAB).add(ModBlocks.RAW_IRON_BLOCK_SLAB)
        .add(ModBlocks.LAPIS_BLOCK_SLAB).add(ModBlocks.RAW_COPPER_BLOCK_SLAB)
        .add(ModBlocks.COPPER_GRATE_SLAB).add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
        .add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB).add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB)
        // needs_iron_tool tier
        .add(ModBlocks.DIAMOND_BLOCK_SLAB).add(ModBlocks.EMERALD_BLOCK_SLAB)
        .add(ModBlocks.GOLD_BLOCK_SLAB).add(ModBlocks.RAW_GOLD_BLOCK_SLAB)
        // needs_diamond_tool tier
        .add(ModBlocks.OBSIDIAN_SLAB).add(ModBlocks.NETHERITE_BLOCK_SLAB);

    // Tool level requirements
    tag(BlockTags.NEEDS_STONE_TOOL)
        .add(ModBlocks.IRON_BLOCK_SLAB).add(ModBlocks.RAW_IRON_BLOCK_SLAB)
        .add(ModBlocks.LAPIS_BLOCK_SLAB).add(ModBlocks.RAW_COPPER_BLOCK_SLAB)
        .add(ModBlocks.COPPER_GRATE_SLAB).add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB)
        .add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB).add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB);

    tag(BlockTags.NEEDS_IRON_TOOL)
        .add(ModBlocks.DIAMOND_BLOCK_SLAB).add(ModBlocks.EMERALD_BLOCK_SLAB)
        .add(ModBlocks.GOLD_BLOCK_SLAB).add(ModBlocks.RAW_GOLD_BLOCK_SLAB);

    tag(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(ModBlocks.OBSIDIAN_SLAB).add(ModBlocks.NETHERITE_BLOCK_SLAB);

    // Axe mineable (wood/fungal blocks)
    tag(BlockTags.MINEABLE_WITH_AXE)
        .add(ModBlocks.BAMBOO_BLOCK_SLAB).add(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB)
        .add(ModBlocks.CRIMSON_HYPHAE_SLAB).add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB)
        .add(ModBlocks.WARPED_HYPHAE_SLAB).add(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB);

    // Shovel mineable (soft/earthy blocks)
    tag(BlockTags.MINEABLE_WITH_SHOVEL)
        .add(ModBlocks.CLAY_SLAB).add(ModBlocks.MUD_SLAB)
        .add(ModBlocks.ROOTED_DIRT_SLAB).add(ModBlocks.SOUL_SOIL_SLAB);

    // Hoe mineable (plant/organic blocks)
    tag(BlockTags.MINEABLE_WITH_HOE)
        .add(ModBlocks.MOSS_BLOCK_SLAB).add(ModBlocks.PALE_MOSS_BLOCK_SLAB);
  }
}
