package io.github.jason13official.new_slab_variants.datagen.server;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class NSVRecipeProvider extends RecipeProvider.Runner {

  public NSVRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
    super(output, registries);
  }

  @Override
  public String getName() {
    return "New Slab Variants Recipes";
  }

  @Override
  protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
    return new RecipeProvider(registries, output) {
      @Override
      protected void buildRecipes() {
        slab(ModBlocks.COAL_BLOCK_SLAB,        Blocks.COAL_BLOCK);
        slab(ModBlocks.DIAMOND_BLOCK_SLAB,     Blocks.DIAMOND_BLOCK);
        slab(ModBlocks.EMERALD_BLOCK_SLAB,     Blocks.EMERALD_BLOCK);
        slab(ModBlocks.GOLD_BLOCK_SLAB,        Blocks.GOLD_BLOCK);
        slab(ModBlocks.IRON_BLOCK_SLAB,        Blocks.IRON_BLOCK);
        slab(ModBlocks.LAPIS_BLOCK_SLAB,       Blocks.LAPIS_BLOCK);
        slab(ModBlocks.NETHERITE_BLOCK_SLAB,   Blocks.NETHERITE_BLOCK);
        slab(ModBlocks.RAW_COPPER_BLOCK_SLAB,  Blocks.RAW_COPPER_BLOCK);
        slab(ModBlocks.RAW_GOLD_BLOCK_SLAB,    Blocks.RAW_GOLD_BLOCK);
        slab(ModBlocks.RAW_IRON_BLOCK_SLAB,    Blocks.RAW_IRON_BLOCK);

        slab(ModBlocks.BASALT_SLAB,            Blocks.BASALT);
        slab(ModBlocks.CALCITE_SLAB,           Blocks.CALCITE);
        slab(ModBlocks.DRIPSTONE_BLOCK_SLAB,   Blocks.DRIPSTONE_BLOCK);
        slab(ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        slab(ModBlocks.GLOWSTONE_SLAB,         Blocks.GLOWSTONE);
        slab(ModBlocks.LODESTONE_SLAB,         Blocks.LODESTONE);
        slab(ModBlocks.MAGMA_BLOCK_SLAB,       Blocks.MAGMA_BLOCK);
        slab(ModBlocks.NETHERRACK_SLAB,        Blocks.NETHERRACK);
        slab(ModBlocks.OBSIDIAN_SLAB,          Blocks.OBSIDIAN);
        slab(ModBlocks.POLISHED_BASALT_SLAB,   Blocks.POLISHED_BASALT);
        slab(ModBlocks.QUARTZ_BRICKS_SLAB,     Blocks.QUARTZ_BRICKS);
        slab(ModBlocks.BONE_BLOCK_SLAB,        Blocks.BONE_BLOCK);
        slab(ModBlocks.PURPUR_PILLAR_SLAB,     Blocks.PURPUR_PILLAR);
        slab(ModBlocks.QUARTZ_PILLAR_SLAB,     Blocks.QUARTZ_PILLAR);
        slab(ModBlocks.TERRACOTTA_SLAB,        Blocks.TERRACOTTA);

        slab(ModBlocks.CLAY_SLAB,              Blocks.CLAY);
        slab(ModBlocks.MUD_SLAB,               Blocks.MUD);
        slab(ModBlocks.ROOTED_DIRT_SLAB,       Blocks.ROOTED_DIRT);
        slab(ModBlocks.SOUL_SOIL_SLAB,         Blocks.SOUL_SOIL);

        slab(ModBlocks.MOSS_BLOCK_SLAB,        Blocks.MOSS_BLOCK);
        slab(ModBlocks.PALE_MOSS_BLOCK_SLAB,   Blocks.PALE_MOSS_BLOCK);
        slab(ModBlocks.RESIN_BLOCK_SLAB,       Blocks.RESIN_BLOCK);

        slab(ModBlocks.BAMBOO_BLOCK_SLAB,            Blocks.BAMBOO_BLOCK);
        slab(ModBlocks.CRIMSON_HYPHAE_SLAB,          Blocks.CRIMSON_HYPHAE);
        slab(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,   Blocks.STRIPPED_BAMBOO_BLOCK);
        slab(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, Blocks.STRIPPED_CRIMSON_HYPHAE);
        slab(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  Blocks.STRIPPED_WARPED_HYPHAE);
        slab(ModBlocks.WARPED_HYPHAE_SLAB,           Blocks.WARPED_HYPHAE);

        slab(ModBlocks.COPPER_GRATE_SLAB,           Blocks.COPPER_GRATE);
        slab(ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   Blocks.EXPOSED_COPPER_GRATE);
        slab(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  Blocks.OXIDIZED_COPPER_GRATE);
        slab(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);

        // Stonecutter recipes (stone/mineral/nether/gem/metal blocks only)
        stonecutter(ModBlocks.COAL_BLOCK_SLAB,        Blocks.COAL_BLOCK);
        stonecutter(ModBlocks.DIAMOND_BLOCK_SLAB,     Blocks.DIAMOND_BLOCK);
        stonecutter(ModBlocks.EMERALD_BLOCK_SLAB,     Blocks.EMERALD_BLOCK);
        stonecutter(ModBlocks.GOLD_BLOCK_SLAB,        Blocks.GOLD_BLOCK);
        stonecutter(ModBlocks.IRON_BLOCK_SLAB,        Blocks.IRON_BLOCK);
        stonecutter(ModBlocks.LAPIS_BLOCK_SLAB,       Blocks.LAPIS_BLOCK);
        stonecutter(ModBlocks.NETHERITE_BLOCK_SLAB,   Blocks.NETHERITE_BLOCK);
        stonecutter(ModBlocks.RAW_COPPER_BLOCK_SLAB,  Blocks.RAW_COPPER_BLOCK);
        stonecutter(ModBlocks.RAW_GOLD_BLOCK_SLAB,    Blocks.RAW_GOLD_BLOCK);
        stonecutter(ModBlocks.RAW_IRON_BLOCK_SLAB,    Blocks.RAW_IRON_BLOCK);
        stonecutter(ModBlocks.BASALT_SLAB,            Blocks.BASALT);
        stonecutter(ModBlocks.CALCITE_SLAB,           Blocks.CALCITE);
        stonecutter(ModBlocks.DRIPSTONE_BLOCK_SLAB,   Blocks.DRIPSTONE_BLOCK);
        stonecutter(ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        stonecutter(ModBlocks.GLOWSTONE_SLAB,         Blocks.GLOWSTONE);
        stonecutter(ModBlocks.LODESTONE_SLAB,         Blocks.LODESTONE);
        stonecutter(ModBlocks.MAGMA_BLOCK_SLAB,       Blocks.MAGMA_BLOCK);
        stonecutter(ModBlocks.NETHERRACK_SLAB,        Blocks.NETHERRACK);
        stonecutter(ModBlocks.OBSIDIAN_SLAB,          Blocks.OBSIDIAN);
        stonecutter(ModBlocks.POLISHED_BASALT_SLAB,   Blocks.POLISHED_BASALT);
        stonecutter(ModBlocks.QUARTZ_BRICKS_SLAB,     Blocks.QUARTZ_BRICKS);
        stonecutter(ModBlocks.BONE_BLOCK_SLAB,        Blocks.BONE_BLOCK);
        stonecutter(ModBlocks.PURPUR_PILLAR_SLAB,     Blocks.PURPUR_PILLAR);
        stonecutter(ModBlocks.QUARTZ_PILLAR_SLAB,     Blocks.QUARTZ_PILLAR);
        stonecutter(ModBlocks.TERRACOTTA_SLAB,        Blocks.TERRACOTTA);
        stonecutter(ModBlocks.COPPER_GRATE_SLAB,           Blocks.COPPER_GRATE);
        stonecutter(ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   Blocks.EXPOSED_COPPER_GRATE);
        stonecutter(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  Blocks.OXIDIZED_COPPER_GRATE);
        stonecutter(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);
      }

      private void slab(Block slab, Block source) {
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, slab, Ingredient.of(source))
            .unlockedBy(getHasName(source), has(source))
            .save(this.output);
      }

      private void stonecutter(Block slab, Block source) {
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, slab, source, 2);
      }
    };
  }
}
