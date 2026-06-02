package io.github.jason13official.new_slab_variants.datagen.server;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
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

    this.add(ModBlocks.BONE_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.PURPUR_PILLAR_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.QUARTZ_PILLAR_SLAB,     this::createSlabItemTable);
    this.add(ModBlocks.TERRACOTTA_SLAB,        this::createSlabItemTable);

    this.add(ModBlocks.CLAY_SLAB,              this::createSlabItemTable);
    this.add(ModBlocks.MUD_SLAB,               this::createSlabItemTable);
    this.add(ModBlocks.ROOTED_DIRT_SLAB,       this::createSlabItemTable);
    this.add(ModBlocks.SOUL_SOIL_SLAB,         this::createSlabItemTable);

    this.add(ModBlocks.MOSS_BLOCK_SLAB,        this::createSlabItemTable);
    this.add(ModBlocks.PALE_MOSS_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.RESIN_BLOCK_SLAB,       this::createSlabItemTable);

    this.add(ModBlocks.BAMBOO_BLOCK_SLAB,            this::createSlabItemTable);
    this.add(ModBlocks.CRIMSON_HYPHAE_SLAB,          this::createSlabItemTable);
    this.add(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, this::createSlabItemTable);
    this.add(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.WARPED_HYPHAE_SLAB,           this::createSlabItemTable);

    this.add(ModBlocks.COPPER_GRATE_SLAB,           this::createSlabItemTable);
    this.add(ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   this::createSlabItemTable);
    this.add(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  this::createSlabItemTable);
    this.add(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, this::createSlabItemTable);
  }

  @Override
  protected Iterable<Block> getKnownBlocks() {
    return java.util.List.of(
        ModBlocks.COAL_BLOCK_SLAB, ModBlocks.DIAMOND_BLOCK_SLAB, ModBlocks.EMERALD_BLOCK_SLAB,
        ModBlocks.GOLD_BLOCK_SLAB, ModBlocks.IRON_BLOCK_SLAB, ModBlocks.LAPIS_BLOCK_SLAB,
        ModBlocks.NETHERITE_BLOCK_SLAB, ModBlocks.RAW_COPPER_BLOCK_SLAB,
        ModBlocks.RAW_GOLD_BLOCK_SLAB, ModBlocks.RAW_IRON_BLOCK_SLAB,
        ModBlocks.BASALT_SLAB, ModBlocks.CALCITE_SLAB, ModBlocks.DRIPSTONE_BLOCK_SLAB,
        ModBlocks.GILDED_BLACKSTONE_SLAB, ModBlocks.GLOWSTONE_SLAB, ModBlocks.LODESTONE_SLAB,
        ModBlocks.MAGMA_BLOCK_SLAB, ModBlocks.NETHERRACK_SLAB, ModBlocks.OBSIDIAN_SLAB,
        ModBlocks.POLISHED_BASALT_SLAB, ModBlocks.QUARTZ_BRICKS_SLAB,
        ModBlocks.BONE_BLOCK_SLAB, ModBlocks.PURPUR_PILLAR_SLAB, ModBlocks.QUARTZ_PILLAR_SLAB,
        ModBlocks.TERRACOTTA_SLAB,
        ModBlocks.CLAY_SLAB, ModBlocks.MUD_SLAB, ModBlocks.ROOTED_DIRT_SLAB, ModBlocks.SOUL_SOIL_SLAB,
        ModBlocks.MOSS_BLOCK_SLAB, ModBlocks.PALE_MOSS_BLOCK_SLAB, ModBlocks.RESIN_BLOCK_SLAB,
        ModBlocks.BAMBOO_BLOCK_SLAB, ModBlocks.CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,
        ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,
        ModBlocks.WARPED_HYPHAE_SLAB,
        ModBlocks.COPPER_GRATE_SLAB, ModBlocks.EXPOSED_COPPER_GRATE_SLAB,
        ModBlocks.OXIDIZED_COPPER_GRATE_SLAB, ModBlocks.WEATHERED_COPPER_GRATE_SLAB
    );
  }
}
