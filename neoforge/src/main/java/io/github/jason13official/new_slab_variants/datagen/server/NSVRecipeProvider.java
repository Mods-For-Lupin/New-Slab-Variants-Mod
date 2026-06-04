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
        // ── Crafting recipes (all 207 slabs) ──────────────────────────────────

        // Mineral/gem blocks
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

        // Ores
        slab(ModBlocks.COAL_ORE_SLAB,              Blocks.COAL_ORE);
        slab(ModBlocks.COPPER_ORE_SLAB,            Blocks.COPPER_ORE);
        slab(ModBlocks.DIAMOND_ORE_SLAB,           Blocks.DIAMOND_ORE);
        slab(ModBlocks.EMERALD_ORE_SLAB,           Blocks.EMERALD_ORE);
        slab(ModBlocks.GOLD_ORE_SLAB,              Blocks.GOLD_ORE);
        slab(ModBlocks.IRON_ORE_SLAB,              Blocks.IRON_ORE);
        slab(ModBlocks.LAPIS_ORE_SLAB,             Blocks.LAPIS_ORE);
        slab(ModBlocks.NETHER_GOLD_ORE_SLAB,       Blocks.NETHER_GOLD_ORE);
        slab(ModBlocks.NETHER_QUARTZ_ORE_SLAB,     Blocks.NETHER_QUARTZ_ORE);
        slab(ModBlocks.REDSTONE_ORE_SLAB,          Blocks.REDSTONE_ORE);
        slab(ModBlocks.DEEPSLATE_COAL_ORE_SLAB,    Blocks.DEEPSLATE_COAL_ORE);
        slab(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB,  Blocks.DEEPSLATE_COPPER_ORE);
        slab(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, Blocks.DEEPSLATE_DIAMOND_ORE);
        slab(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB, Blocks.DEEPSLATE_EMERALD_ORE);
        slab(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB,    Blocks.DEEPSLATE_GOLD_ORE);
        slab(ModBlocks.DEEPSLATE_IRON_ORE_SLAB,    Blocks.DEEPSLATE_IRON_ORE);
        slab(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB,   Blocks.DEEPSLATE_LAPIS_ORE);
        slab(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, Blocks.DEEPSLATE_REDSTONE_ORE);

        // Stone/underground/nether
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

        // Stone — chiseled/cracked
        slab(ModBlocks.END_STONE_SLAB,                       Blocks.END_STONE);
        slab(ModBlocks.SMOOTH_BASALT_SLAB,                   Blocks.SMOOTH_BASALT);
        slab(ModBlocks.CHISELED_STONE_BRICKS_SLAB,           Blocks.CHISELED_STONE_BRICKS);
        slab(ModBlocks.CRACKED_STONE_BRICKS_SLAB,            Blocks.CRACKED_STONE_BRICKS);
        slab(ModBlocks.CHISELED_DEEPSLATE_SLAB,              Blocks.CHISELED_DEEPSLATE);
        slab(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB,        Blocks.CRACKED_DEEPSLATE_BRICKS);
        slab(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB,         Blocks.CRACKED_DEEPSLATE_TILES);
        slab(ModBlocks.CHISELED_NETHER_BRICKS_SLAB,          Blocks.CHISELED_NETHER_BRICKS);
        slab(ModBlocks.CRACKED_NETHER_BRICKS_SLAB,           Blocks.CRACKED_NETHER_BRICKS);
        slab(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,    Blocks.CHISELED_POLISHED_BLACKSTONE);
        slab(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        slab(ModBlocks.CHISELED_RESIN_BRICKS_SLAB,           Blocks.CHISELED_RESIN_BRICKS);

        // Decorative stone
        slab(ModBlocks.BONE_BLOCK_SLAB,        Blocks.BONE_BLOCK);
        slab(ModBlocks.PURPUR_PILLAR_SLAB,     Blocks.PURPUR_PILLAR);
        slab(ModBlocks.QUARTZ_PILLAR_SLAB,     Blocks.QUARTZ_PILLAR);
        slab(ModBlocks.TERRACOTTA_SLAB,        Blocks.TERRACOTTA);

        // Terrain
        slab(ModBlocks.DIRT_SLAB,         Blocks.DIRT);
        slab(ModBlocks.COARSE_DIRT_SLAB,  Blocks.COARSE_DIRT);
        slab(ModBlocks.GRASS_BLOCK_SLAB,  Blocks.GRASS_BLOCK);
        slab(ModBlocks.GRAVEL_SLAB,       Blocks.GRAVEL);
        slab(ModBlocks.SAND_SLAB,        Blocks.SAND);
        slab(ModBlocks.RED_SAND_SLAB,    Blocks.RED_SAND);

        // Earthy/soft
        slab(ModBlocks.CLAY_SLAB,        Blocks.CLAY);
        slab(ModBlocks.MUD_SLAB,         Blocks.MUD);
        slab(ModBlocks.ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT);
        slab(ModBlocks.SOUL_SOIL_SLAB,   Blocks.SOUL_SOIL);

        // Natural/functional
        slab(ModBlocks.BEDROCK_SLAB,          Blocks.BEDROCK);
        slab(ModBlocks.SCULK_SLAB,            Blocks.SCULK);
        slab(ModBlocks.AMETHYST_BLOCK_SLAB,   Blocks.AMETHYST_BLOCK);
        slab(ModBlocks.BUDDING_AMETHYST_SLAB, Blocks.BUDDING_AMETHYST);
        slab(ModBlocks.ICE_SLAB,              Blocks.ICE);
        slab(ModBlocks.PACKED_ICE_SLAB,       Blocks.PACKED_ICE);
        slab(ModBlocks.BLUE_ICE_SLAB,         Blocks.BLUE_ICE);
        slab(ModBlocks.SNOW_BLOCK_SLAB,       Blocks.SNOW_BLOCK);
        slab(ModBlocks.SPONGE_SLAB,           Blocks.SPONGE);
        slab(ModBlocks.WET_SPONGE_SLAB,       Blocks.WET_SPONGE);

        // Nether/light
        slab(ModBlocks.SOUL_SAND_SLAB,         Blocks.SOUL_SAND);
        slab(ModBlocks.NETHER_WART_BLOCK_SLAB, Blocks.NETHER_WART_BLOCK);
        slab(ModBlocks.WARPED_WART_BLOCK_SLAB, Blocks.WARPED_WART_BLOCK);
        slab(ModBlocks.SHROOMLIGHT_SLAB,       Blocks.SHROOMLIGHT);
        slab(ModBlocks.SEA_LANTERN_SLAB,       Blocks.SEA_LANTERN);

        // Misc
        slab(ModBlocks.REDSTONE_BLOCK_SLAB,  Blocks.REDSTONE_BLOCK);
        slab(ModBlocks.REDSTONE_LAMP_SLAB,   Blocks.REDSTONE_LAMP);
        slab(ModBlocks.HONEYCOMB_BLOCK_SLAB, Blocks.HONEYCOMB_BLOCK);
        slab(ModBlocks.PACKED_MUD_SLAB,      Blocks.PACKED_MUD);
        slab(ModBlocks.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN);
        slab(ModBlocks.NOTE_BLOCK_SLAB,      Blocks.NOTE_BLOCK);

        // Organic/plant
        slab(ModBlocks.MOSS_BLOCK_SLAB,      Blocks.MOSS_BLOCK);
        slab(ModBlocks.PALE_MOSS_BLOCK_SLAB, Blocks.PALE_MOSS_BLOCK);
        slab(ModBlocks.RESIN_BLOCK_SLAB,     Blocks.RESIN_BLOCK);

        // Leaves
        slab(ModBlocks.AZALEA_LEAVES_SLAB,           Blocks.AZALEA_LEAVES);
        slab(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB, Blocks.FLOWERING_AZALEA_LEAVES);

        // Mushroom blocks
        slab(ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB, Blocks.BROWN_MUSHROOM_BLOCK);
        slab(ModBlocks.RED_MUSHROOM_BLOCK_SLAB,   Blocks.RED_MUSHROOM_BLOCK);
        slab(ModBlocks.MUSHROOM_STEM_SLAB,        Blocks.MUSHROOM_STEM);

        // Wood/fungal
        slab(ModBlocks.BAMBOO_BLOCK_SLAB,            Blocks.BAMBOO_BLOCK);
        slab(ModBlocks.CRIMSON_HYPHAE_SLAB,          Blocks.CRIMSON_HYPHAE);
        slab(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB,   Blocks.STRIPPED_BAMBOO_BLOCK);
        slab(ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, Blocks.STRIPPED_CRIMSON_HYPHAE);
        slab(ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  Blocks.STRIPPED_WARPED_HYPHAE);
        slab(ModBlocks.WARPED_HYPHAE_SLAB,           Blocks.WARPED_HYPHAE);

        // Copper (block/raw/chiseled/bulb)
        slab(ModBlocks.COPPER_BLOCK_SLAB,              Blocks.COPPER_BLOCK);
        slab(ModBlocks.EXPOSED_COPPER_SLAB,            Blocks.EXPOSED_COPPER);
        slab(ModBlocks.OXIDIZED_COPPER_SLAB,           Blocks.OXIDIZED_COPPER);
        slab(ModBlocks.WEATHERED_COPPER_SLAB,          Blocks.WEATHERED_COPPER);
        slab(ModBlocks.CHISELED_COPPER_SLAB,           Blocks.CHISELED_COPPER);
        slab(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB,   Blocks.EXPOSED_CHISELED_COPPER);
        slab(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB,  Blocks.OXIDIZED_CHISELED_COPPER);
        slab(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER);
        slab(ModBlocks.COPPER_BULB_SLAB,               Blocks.COPPER_BULB);
        slab(ModBlocks.EXPOSED_COPPER_BULB_SLAB,       Blocks.EXPOSED_COPPER_BULB);
        slab(ModBlocks.OXIDIZED_COPPER_BULB_SLAB,      Blocks.OXIDIZED_COPPER_BULB);
        slab(ModBlocks.WEATHERED_COPPER_BULB_SLAB,     Blocks.WEATHERED_COPPER_BULB);

        // Copper grates
        slab(ModBlocks.COPPER_GRATE_SLAB,           Blocks.COPPER_GRATE);
        slab(ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   Blocks.EXPOSED_COPPER_GRATE);
        slab(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  Blocks.OXIDIZED_COPPER_GRATE);
        slab(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);

        // Coral blocks
        slab(ModBlocks.BRAIN_CORAL_BLOCK_SLAB,       Blocks.BRAIN_CORAL_BLOCK);
        slab(ModBlocks.BUBBLE_CORAL_BLOCK_SLAB,      Blocks.BUBBLE_CORAL_BLOCK);
        slab(ModBlocks.FIRE_CORAL_BLOCK_SLAB,        Blocks.FIRE_CORAL_BLOCK);
        slab(ModBlocks.HORN_CORAL_BLOCK_SLAB,        Blocks.HORN_CORAL_BLOCK);
        slab(ModBlocks.TUBE_CORAL_BLOCK_SLAB,        Blocks.TUBE_CORAL_BLOCK);
        slab(ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB,  Blocks.DEAD_BRAIN_CORAL_BLOCK);
        slab(ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB, Blocks.DEAD_BUBBLE_CORAL_BLOCK);
        slab(ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB,   Blocks.DEAD_FIRE_CORAL_BLOCK);
        slab(ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB,   Blocks.DEAD_HORN_CORAL_BLOCK);
        slab(ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB,   Blocks.DEAD_TUBE_CORAL_BLOCK);

        // Wool
        slab(ModBlocks.WHITE_WOOL_SLAB,      Blocks.WHITE_WOOL);
        slab(ModBlocks.ORANGE_WOOL_SLAB,     Blocks.ORANGE_WOOL);
        slab(ModBlocks.MAGENTA_WOOL_SLAB,    Blocks.MAGENTA_WOOL);
        slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
        slab(ModBlocks.YELLOW_WOOL_SLAB,     Blocks.YELLOW_WOOL);
        slab(ModBlocks.LIME_WOOL_SLAB,       Blocks.LIME_WOOL);
        slab(ModBlocks.PINK_WOOL_SLAB,       Blocks.PINK_WOOL);
        slab(ModBlocks.GRAY_WOOL_SLAB,       Blocks.GRAY_WOOL);
        slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
        slab(ModBlocks.CYAN_WOOL_SLAB,       Blocks.CYAN_WOOL);
        slab(ModBlocks.PURPLE_WOOL_SLAB,     Blocks.PURPLE_WOOL);
        slab(ModBlocks.BLUE_WOOL_SLAB,       Blocks.BLUE_WOOL);
        slab(ModBlocks.BROWN_WOOL_SLAB,      Blocks.BROWN_WOOL);
        slab(ModBlocks.GREEN_WOOL_SLAB,      Blocks.GREEN_WOOL);
        slab(ModBlocks.RED_WOOL_SLAB,        Blocks.RED_WOOL);
        slab(ModBlocks.BLACK_WOOL_SLAB,      Blocks.BLACK_WOOL);

        // Concrete
        slab(ModBlocks.WHITE_CONCRETE_SLAB,      Blocks.WHITE_CONCRETE);
        slab(ModBlocks.ORANGE_CONCRETE_SLAB,     Blocks.ORANGE_CONCRETE);
        slab(ModBlocks.MAGENTA_CONCRETE_SLAB,    Blocks.MAGENTA_CONCRETE);
        slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        slab(ModBlocks.YELLOW_CONCRETE_SLAB,     Blocks.YELLOW_CONCRETE);
        slab(ModBlocks.LIME_CONCRETE_SLAB,       Blocks.LIME_CONCRETE);
        slab(ModBlocks.PINK_CONCRETE_SLAB,       Blocks.PINK_CONCRETE);
        slab(ModBlocks.GRAY_CONCRETE_SLAB,       Blocks.GRAY_CONCRETE);
        slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        slab(ModBlocks.CYAN_CONCRETE_SLAB,       Blocks.CYAN_CONCRETE);
        slab(ModBlocks.PURPLE_CONCRETE_SLAB,     Blocks.PURPLE_CONCRETE);
        slab(ModBlocks.BLUE_CONCRETE_SLAB,       Blocks.BLUE_CONCRETE);
        slab(ModBlocks.BROWN_CONCRETE_SLAB,      Blocks.BROWN_CONCRETE);
        slab(ModBlocks.GREEN_CONCRETE_SLAB,      Blocks.GREEN_CONCRETE);
        slab(ModBlocks.RED_CONCRETE_SLAB,        Blocks.RED_CONCRETE);
        slab(ModBlocks.BLACK_CONCRETE_SLAB,      Blocks.BLACK_CONCRETE);

        // Concrete powder
        slab(ModBlocks.WHITE_CONCRETE_POWDER_SLAB,      Blocks.WHITE_CONCRETE_POWDER);
        slab(ModBlocks.ORANGE_CONCRETE_POWDER_SLAB,     Blocks.ORANGE_CONCRETE_POWDER);
        slab(ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB,    Blocks.MAGENTA_CONCRETE_POWDER);
        slab(ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        slab(ModBlocks.YELLOW_CONCRETE_POWDER_SLAB,     Blocks.YELLOW_CONCRETE_POWDER);
        slab(ModBlocks.LIME_CONCRETE_POWDER_SLAB,       Blocks.LIME_CONCRETE_POWDER);
        slab(ModBlocks.PINK_CONCRETE_POWDER_SLAB,       Blocks.PINK_CONCRETE_POWDER);
        slab(ModBlocks.GRAY_CONCRETE_POWDER_SLAB,       Blocks.GRAY_CONCRETE_POWDER);
        slab(ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        slab(ModBlocks.CYAN_CONCRETE_POWDER_SLAB,       Blocks.CYAN_CONCRETE_POWDER);
        slab(ModBlocks.PURPLE_CONCRETE_POWDER_SLAB,     Blocks.PURPLE_CONCRETE_POWDER);
        slab(ModBlocks.BLUE_CONCRETE_POWDER_SLAB,       Blocks.BLUE_CONCRETE_POWDER);
        slab(ModBlocks.BROWN_CONCRETE_POWDER_SLAB,      Blocks.BROWN_CONCRETE_POWDER);
        slab(ModBlocks.GREEN_CONCRETE_POWDER_SLAB,      Blocks.GREEN_CONCRETE_POWDER);
        slab(ModBlocks.RED_CONCRETE_POWDER_SLAB,        Blocks.RED_CONCRETE_POWDER);
        slab(ModBlocks.BLACK_CONCRETE_POWDER_SLAB,      Blocks.BLACK_CONCRETE_POWDER);

        // Glass/stained glass
        slab(ModBlocks.GLASS_SLAB,                    Blocks.GLASS);
        slab(ModBlocks.TINTED_GLASS_SLAB,             Blocks.TINTED_GLASS);
        slab(ModBlocks.WHITE_STAINED_GLASS_SLAB,      Blocks.WHITE_STAINED_GLASS);
        slab(ModBlocks.ORANGE_STAINED_GLASS_SLAB,     Blocks.ORANGE_STAINED_GLASS);
        slab(ModBlocks.MAGENTA_STAINED_GLASS_SLAB,    Blocks.MAGENTA_STAINED_GLASS);
        slab(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
        slab(ModBlocks.YELLOW_STAINED_GLASS_SLAB,     Blocks.YELLOW_STAINED_GLASS);
        slab(ModBlocks.LIME_STAINED_GLASS_SLAB,       Blocks.LIME_STAINED_GLASS);
        slab(ModBlocks.PINK_STAINED_GLASS_SLAB,       Blocks.PINK_STAINED_GLASS);
        slab(ModBlocks.GRAY_STAINED_GLASS_SLAB,       Blocks.GRAY_STAINED_GLASS);
        slab(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
        slab(ModBlocks.CYAN_STAINED_GLASS_SLAB,       Blocks.CYAN_STAINED_GLASS);
        slab(ModBlocks.PURPLE_STAINED_GLASS_SLAB,     Blocks.PURPLE_STAINED_GLASS);
        slab(ModBlocks.BLUE_STAINED_GLASS_SLAB,       Blocks.BLUE_STAINED_GLASS);
        slab(ModBlocks.BROWN_STAINED_GLASS_SLAB,      Blocks.BROWN_STAINED_GLASS);
        slab(ModBlocks.GREEN_STAINED_GLASS_SLAB,      Blocks.GREEN_STAINED_GLASS);
        slab(ModBlocks.RED_STAINED_GLASS_SLAB,        Blocks.RED_STAINED_GLASS);
        slab(ModBlocks.BLACK_STAINED_GLASS_SLAB,      Blocks.BLACK_STAINED_GLASS);

        // Colored terracotta
        slab(ModBlocks.WHITE_TERRACOTTA_SLAB,      Blocks.WHITE_TERRACOTTA);
        slab(ModBlocks.ORANGE_TERRACOTTA_SLAB,     Blocks.ORANGE_TERRACOTTA);
        slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB,    Blocks.MAGENTA_TERRACOTTA);
        slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
        slab(ModBlocks.YELLOW_TERRACOTTA_SLAB,     Blocks.YELLOW_TERRACOTTA);
        slab(ModBlocks.LIME_TERRACOTTA_SLAB,       Blocks.LIME_TERRACOTTA);
        slab(ModBlocks.PINK_TERRACOTTA_SLAB,       Blocks.PINK_TERRACOTTA);
        slab(ModBlocks.GRAY_TERRACOTTA_SLAB,       Blocks.GRAY_TERRACOTTA);
        slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
        slab(ModBlocks.CYAN_TERRACOTTA_SLAB,       Blocks.CYAN_TERRACOTTA);
        slab(ModBlocks.PURPLE_TERRACOTTA_SLAB,     Blocks.PURPLE_TERRACOTTA);
        slab(ModBlocks.BLUE_TERRACOTTA_SLAB,       Blocks.BLUE_TERRACOTTA);
        slab(ModBlocks.BROWN_TERRACOTTA_SLAB,      Blocks.BROWN_TERRACOTTA);
        slab(ModBlocks.GREEN_TERRACOTTA_SLAB,      Blocks.GREEN_TERRACOTTA);
        slab(ModBlocks.RED_TERRACOTTA_SLAB,        Blocks.RED_TERRACOTTA);
        slab(ModBlocks.BLACK_TERRACOTTA_SLAB,      Blocks.BLACK_TERRACOTTA);

        // Glazed terracotta
        slab(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB,      Blocks.BLACK_GLAZED_TERRACOTTA);
        slab(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB,       Blocks.BLUE_GLAZED_TERRACOTTA);
        slab(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB,      Blocks.BROWN_GLAZED_TERRACOTTA);
        slab(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB,       Blocks.CYAN_GLAZED_TERRACOTTA);
        slab(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB,       Blocks.GRAY_GLAZED_TERRACOTTA);
        slab(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB,      Blocks.GREEN_GLAZED_TERRACOTTA);
        slab(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        slab(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        slab(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB,       Blocks.LIME_GLAZED_TERRACOTTA);
        slab(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB,    Blocks.MAGENTA_GLAZED_TERRACOTTA);
        slab(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB,     Blocks.ORANGE_GLAZED_TERRACOTTA);
        slab(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB,       Blocks.PINK_GLAZED_TERRACOTTA);
        slab(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB,     Blocks.PURPLE_GLAZED_TERRACOTTA);
        slab(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB,        Blocks.RED_GLAZED_TERRACOTTA);
        slab(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB,      Blocks.WHITE_GLAZED_TERRACOTTA);
        slab(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB,     Blocks.YELLOW_GLAZED_TERRACOTTA);

        // Infested blocks
        slab(ModBlocks.INFESTED_STONE_SLAB,                Blocks.INFESTED_STONE);
        slab(ModBlocks.INFESTED_COBBLESTONE_SLAB,          Blocks.INFESTED_COBBLESTONE);
        slab(ModBlocks.INFESTED_STONE_BRICKS_SLAB,         Blocks.INFESTED_STONE_BRICKS);
        slab(ModBlocks.INFESTED_CRACKED_STONE_BRICKS_SLAB, Blocks.INFESTED_CRACKED_STONE_BRICKS);
        slab(ModBlocks.INFESTED_CHISELED_STONE_BRICKS_SLAB, Blocks.INFESTED_CHISELED_STONE_BRICKS);
        slab(ModBlocks.INFESTED_MOSSY_STONE_BRICKS_SLAB,   Blocks.INFESTED_MOSSY_STONE_BRICKS);
        slab(ModBlocks.INFESTED_DEEPSLATE_SLAB,            Blocks.INFESTED_DEEPSLATE);

        // Waxed copper
        slab(ModBlocks.WAXED_COPPER_BLOCK_SLAB,   Blocks.WAXED_COPPER_BLOCK);
        slab(ModBlocks.WAXED_EXPOSED_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        slab(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB,  Blocks.WAXED_OXIDIZED_COPPER);
        slab(ModBlocks.WAXED_WEATHERED_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);

        // Froglights
        slab(ModBlocks.OCHRE_FROGLIGHT_SLAB,       Blocks.OCHRE_FROGLIGHT);
        slab(ModBlocks.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT);
        slab(ModBlocks.VERDANT_FROGLIGHT_SLAB,     Blocks.VERDANT_FROGLIGHT);

        // Nylium
        slab(ModBlocks.CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM);
        slab(ModBlocks.WARPED_NYLIUM_SLAB,  Blocks.WARPED_NYLIUM);

        // Wood logs/wood/leaves
        slab(ModBlocks.OAK_LOG_SLAB,             Blocks.OAK_LOG);
        slab(ModBlocks.OAK_WOOD_SLAB,            Blocks.OAK_WOOD);
        slab(ModBlocks.STRIPPED_OAK_LOG_SLAB,    Blocks.STRIPPED_OAK_LOG);
        slab(ModBlocks.STRIPPED_OAK_WOOD_SLAB,   Blocks.STRIPPED_OAK_WOOD);
        slab(ModBlocks.OAK_LEAVES_SLAB,          Blocks.OAK_LEAVES);
        slab(ModBlocks.BIRCH_LOG_SLAB,           Blocks.BIRCH_LOG);
        slab(ModBlocks.BIRCH_WOOD_SLAB,          Blocks.BIRCH_WOOD);
        slab(ModBlocks.STRIPPED_BIRCH_LOG_SLAB,  Blocks.STRIPPED_BIRCH_LOG);
        slab(ModBlocks.STRIPPED_BIRCH_WOOD_SLAB, Blocks.STRIPPED_BIRCH_WOOD);
        slab(ModBlocks.BIRCH_LEAVES_SLAB,        Blocks.BIRCH_LEAVES);
        slab(ModBlocks.SPRUCE_LOG_SLAB,           Blocks.SPRUCE_LOG);
        slab(ModBlocks.SPRUCE_WOOD_SLAB,          Blocks.SPRUCE_WOOD);
        slab(ModBlocks.STRIPPED_SPRUCE_LOG_SLAB,  Blocks.STRIPPED_SPRUCE_LOG);
        slab(ModBlocks.STRIPPED_SPRUCE_WOOD_SLAB, Blocks.STRIPPED_SPRUCE_WOOD);
        slab(ModBlocks.SPRUCE_LEAVES_SLAB,        Blocks.SPRUCE_LEAVES);
        slab(ModBlocks.JUNGLE_LOG_SLAB,           Blocks.JUNGLE_LOG);
        slab(ModBlocks.JUNGLE_WOOD_SLAB,          Blocks.JUNGLE_WOOD);
        slab(ModBlocks.STRIPPED_JUNGLE_LOG_SLAB,  Blocks.STRIPPED_JUNGLE_LOG);
        slab(ModBlocks.STRIPPED_JUNGLE_WOOD_SLAB, Blocks.STRIPPED_JUNGLE_WOOD);
        slab(ModBlocks.JUNGLE_LEAVES_SLAB,        Blocks.JUNGLE_LEAVES);
        slab(ModBlocks.ACACIA_LOG_SLAB,           Blocks.ACACIA_LOG);
        slab(ModBlocks.ACACIA_WOOD_SLAB,          Blocks.ACACIA_WOOD);
        slab(ModBlocks.STRIPPED_ACACIA_LOG_SLAB,  Blocks.STRIPPED_ACACIA_LOG);
        slab(ModBlocks.STRIPPED_ACACIA_WOOD_SLAB, Blocks.STRIPPED_ACACIA_WOOD);
        slab(ModBlocks.ACACIA_LEAVES_SLAB,        Blocks.ACACIA_LEAVES);
        slab(ModBlocks.DARK_OAK_LOG_SLAB,           Blocks.DARK_OAK_LOG);
        slab(ModBlocks.DARK_OAK_WOOD_SLAB,          Blocks.DARK_OAK_WOOD);
        slab(ModBlocks.STRIPPED_DARK_OAK_LOG_SLAB,  Blocks.STRIPPED_DARK_OAK_LOG);
        slab(ModBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, Blocks.STRIPPED_DARK_OAK_WOOD);
        slab(ModBlocks.DARK_OAK_LEAVES_SLAB,        Blocks.DARK_OAK_LEAVES);
        slab(ModBlocks.CHERRY_LOG_SLAB,           Blocks.CHERRY_LOG);
        slab(ModBlocks.CHERRY_WOOD_SLAB,          Blocks.CHERRY_WOOD);
        slab(ModBlocks.STRIPPED_CHERRY_LOG_SLAB,  Blocks.STRIPPED_CHERRY_LOG);
        slab(ModBlocks.STRIPPED_CHERRY_WOOD_SLAB, Blocks.STRIPPED_CHERRY_WOOD);
        slab(ModBlocks.CHERRY_LEAVES_SLAB,        Blocks.CHERRY_LEAVES);
        slab(ModBlocks.MANGROVE_LOG_SLAB,           Blocks.MANGROVE_LOG);
        slab(ModBlocks.MANGROVE_WOOD_SLAB,          Blocks.MANGROVE_WOOD);
        slab(ModBlocks.STRIPPED_MANGROVE_LOG_SLAB,  Blocks.STRIPPED_MANGROVE_LOG);
        slab(ModBlocks.STRIPPED_MANGROVE_WOOD_SLAB, Blocks.STRIPPED_MANGROVE_WOOD);
        slab(ModBlocks.MANGROVE_LEAVES_SLAB,        Blocks.MANGROVE_LEAVES);

        // Misc
        slab(ModBlocks.ANCIENT_DEBRIS_SLAB,       Blocks.ANCIENT_DEBRIS);
        slab(ModBlocks.BOOKSHELF_SLAB,            Blocks.BOOKSHELF);
        slab(ModBlocks.CHISELED_QUARTZ_BLOCK_SLAB, Blocks.CHISELED_QUARTZ_BLOCK);
        slab(ModBlocks.CHISELED_RED_SANDSTONE_SLAB, Blocks.CHISELED_RED_SANDSTONE);
        slab(ModBlocks.CHISELED_SANDSTONE_SLAB,   Blocks.CHISELED_SANDSTONE);
        slab(ModBlocks.DEEPSLATE_SLAB,            Blocks.DEEPSLATE);
        slab(ModBlocks.DRIED_KELP_BLOCK_SLAB,     Blocks.DRIED_KELP_BLOCK);
        slab(ModBlocks.HAY_BLOCK_SLAB,            Blocks.HAY_BLOCK);
        slab(ModBlocks.HONEY_BLOCK_SLAB,          Blocks.HONEY_BLOCK);
        slab(ModBlocks.LADDER_SLAB,               Blocks.LADDER);
        slab(ModBlocks.MELON_SLAB,                Blocks.MELON);
        slab(ModBlocks.PUMPKIN_SLAB,              Blocks.PUMPKIN);
        slab(ModBlocks.SCAFFOLDING_SLAB,          Blocks.SCAFFOLDING);
        slab(ModBlocks.SCULK_CATALYST_SLAB,       Blocks.SCULK_CATALYST);
        slab(ModBlocks.SLIME_BLOCK_SLAB,          Blocks.SLIME_BLOCK);
        slab(ModBlocks.TNT_SLAB,                  Blocks.TNT);
        slab(ModBlocks.TUFF_SLAB,                 Blocks.TUFF);

        // ── Stonecutter recipes (stone/mineral/ore/gem/metal/building blocks) ─

        // Mineral/gem blocks
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

        // Ores
        stonecutter(ModBlocks.COAL_ORE_SLAB,              Blocks.COAL_ORE);
        stonecutter(ModBlocks.COPPER_ORE_SLAB,            Blocks.COPPER_ORE);
        stonecutter(ModBlocks.DIAMOND_ORE_SLAB,           Blocks.DIAMOND_ORE);
        stonecutter(ModBlocks.EMERALD_ORE_SLAB,           Blocks.EMERALD_ORE);
        stonecutter(ModBlocks.GOLD_ORE_SLAB,              Blocks.GOLD_ORE);
        stonecutter(ModBlocks.IRON_ORE_SLAB,              Blocks.IRON_ORE);
        stonecutter(ModBlocks.LAPIS_ORE_SLAB,             Blocks.LAPIS_ORE);
        stonecutter(ModBlocks.NETHER_GOLD_ORE_SLAB,       Blocks.NETHER_GOLD_ORE);
        stonecutter(ModBlocks.NETHER_QUARTZ_ORE_SLAB,     Blocks.NETHER_QUARTZ_ORE);
        stonecutter(ModBlocks.REDSTONE_ORE_SLAB,          Blocks.REDSTONE_ORE);
        stonecutter(ModBlocks.DEEPSLATE_COAL_ORE_SLAB,    Blocks.DEEPSLATE_COAL_ORE);
        stonecutter(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB,  Blocks.DEEPSLATE_COPPER_ORE);
        stonecutter(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, Blocks.DEEPSLATE_DIAMOND_ORE);
        stonecutter(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB, Blocks.DEEPSLATE_EMERALD_ORE);
        stonecutter(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB,    Blocks.DEEPSLATE_GOLD_ORE);
        stonecutter(ModBlocks.DEEPSLATE_IRON_ORE_SLAB,    Blocks.DEEPSLATE_IRON_ORE);
        stonecutter(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB,   Blocks.DEEPSLATE_LAPIS_ORE);
        stonecutter(ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, Blocks.DEEPSLATE_REDSTONE_ORE);

        // Stone/underground/nether
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

        // Stone — chiseled/cracked
        stonecutter(ModBlocks.END_STONE_SLAB,                       Blocks.END_STONE);
        stonecutter(ModBlocks.SMOOTH_BASALT_SLAB,                   Blocks.SMOOTH_BASALT);
        stonecutter(ModBlocks.CHISELED_STONE_BRICKS_SLAB,           Blocks.CHISELED_STONE_BRICKS);
        stonecutter(ModBlocks.CRACKED_STONE_BRICKS_SLAB,            Blocks.CRACKED_STONE_BRICKS);
        stonecutter(ModBlocks.CHISELED_DEEPSLATE_SLAB,              Blocks.CHISELED_DEEPSLATE);
        stonecutter(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB,        Blocks.CRACKED_DEEPSLATE_BRICKS);
        stonecutter(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB,         Blocks.CRACKED_DEEPSLATE_TILES);
        stonecutter(ModBlocks.CHISELED_NETHER_BRICKS_SLAB,          Blocks.CHISELED_NETHER_BRICKS);
        stonecutter(ModBlocks.CRACKED_NETHER_BRICKS_SLAB,           Blocks.CRACKED_NETHER_BRICKS);
        stonecutter(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,    Blocks.CHISELED_POLISHED_BLACKSTONE);
        stonecutter(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        stonecutter(ModBlocks.CHISELED_RESIN_BRICKS_SLAB,           Blocks.CHISELED_RESIN_BRICKS);

        // Decorative stone
        stonecutter(ModBlocks.BONE_BLOCK_SLAB,        Blocks.BONE_BLOCK);
        stonecutter(ModBlocks.PURPUR_PILLAR_SLAB,     Blocks.PURPUR_PILLAR);
        stonecutter(ModBlocks.QUARTZ_PILLAR_SLAB,     Blocks.QUARTZ_PILLAR);
        stonecutter(ModBlocks.TERRACOTTA_SLAB,        Blocks.TERRACOTTA);

        // Natural/mineral
        stonecutter(ModBlocks.SCULK_SLAB,            Blocks.SCULK);
        stonecutter(ModBlocks.AMETHYST_BLOCK_SLAB,   Blocks.AMETHYST_BLOCK);
        stonecutter(ModBlocks.BUDDING_AMETHYST_SLAB, Blocks.BUDDING_AMETHYST);
        stonecutter(ModBlocks.PACKED_ICE_SLAB,       Blocks.PACKED_ICE);
        stonecutter(ModBlocks.BLUE_ICE_SLAB,         Blocks.BLUE_ICE);
        stonecutter(ModBlocks.SEA_LANTERN_SLAB,      Blocks.SEA_LANTERN);

        // Misc mineral/functional
        stonecutter(ModBlocks.REDSTONE_BLOCK_SLAB,  Blocks.REDSTONE_BLOCK);
        stonecutter(ModBlocks.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN);
        stonecutter(ModBlocks.PACKED_MUD_SLAB,      Blocks.PACKED_MUD);

        // Copper (block/raw/chiseled/bulb)
        stonecutter(ModBlocks.COPPER_BLOCK_SLAB,              Blocks.COPPER_BLOCK);
        stonecutter(ModBlocks.EXPOSED_COPPER_SLAB,            Blocks.EXPOSED_COPPER);
        stonecutter(ModBlocks.OXIDIZED_COPPER_SLAB,           Blocks.OXIDIZED_COPPER);
        stonecutter(ModBlocks.WEATHERED_COPPER_SLAB,          Blocks.WEATHERED_COPPER);
        stonecutter(ModBlocks.CHISELED_COPPER_SLAB,           Blocks.CHISELED_COPPER);
        stonecutter(ModBlocks.EXPOSED_CHISELED_COPPER_SLAB,   Blocks.EXPOSED_CHISELED_COPPER);
        stonecutter(ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB,  Blocks.OXIDIZED_CHISELED_COPPER);
        stonecutter(ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER);
        stonecutter(ModBlocks.COPPER_BULB_SLAB,               Blocks.COPPER_BULB);
        stonecutter(ModBlocks.EXPOSED_COPPER_BULB_SLAB,       Blocks.EXPOSED_COPPER_BULB);
        stonecutter(ModBlocks.OXIDIZED_COPPER_BULB_SLAB,      Blocks.OXIDIZED_COPPER_BULB);
        stonecutter(ModBlocks.WEATHERED_COPPER_BULB_SLAB,     Blocks.WEATHERED_COPPER_BULB);

        // Copper grates
        stonecutter(ModBlocks.COPPER_GRATE_SLAB,           Blocks.COPPER_GRATE);
        stonecutter(ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   Blocks.EXPOSED_COPPER_GRATE);
        stonecutter(ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  Blocks.OXIDIZED_COPPER_GRATE);
        stonecutter(ModBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);

        // Concrete
        stonecutter(ModBlocks.WHITE_CONCRETE_SLAB,      Blocks.WHITE_CONCRETE);
        stonecutter(ModBlocks.ORANGE_CONCRETE_SLAB,     Blocks.ORANGE_CONCRETE);
        stonecutter(ModBlocks.MAGENTA_CONCRETE_SLAB,    Blocks.MAGENTA_CONCRETE);
        stonecutter(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutter(ModBlocks.YELLOW_CONCRETE_SLAB,     Blocks.YELLOW_CONCRETE);
        stonecutter(ModBlocks.LIME_CONCRETE_SLAB,       Blocks.LIME_CONCRETE);
        stonecutter(ModBlocks.PINK_CONCRETE_SLAB,       Blocks.PINK_CONCRETE);
        stonecutter(ModBlocks.GRAY_CONCRETE_SLAB,       Blocks.GRAY_CONCRETE);
        stonecutter(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutter(ModBlocks.CYAN_CONCRETE_SLAB,       Blocks.CYAN_CONCRETE);
        stonecutter(ModBlocks.PURPLE_CONCRETE_SLAB,     Blocks.PURPLE_CONCRETE);
        stonecutter(ModBlocks.BLUE_CONCRETE_SLAB,       Blocks.BLUE_CONCRETE);
        stonecutter(ModBlocks.BROWN_CONCRETE_SLAB,      Blocks.BROWN_CONCRETE);
        stonecutter(ModBlocks.GREEN_CONCRETE_SLAB,      Blocks.GREEN_CONCRETE);
        stonecutter(ModBlocks.RED_CONCRETE_SLAB,        Blocks.RED_CONCRETE);
        stonecutter(ModBlocks.BLACK_CONCRETE_SLAB,      Blocks.BLACK_CONCRETE);

        // Colored terracotta
        stonecutter(ModBlocks.WHITE_TERRACOTTA_SLAB,      Blocks.WHITE_TERRACOTTA);
        stonecutter(ModBlocks.ORANGE_TERRACOTTA_SLAB,     Blocks.ORANGE_TERRACOTTA);
        stonecutter(ModBlocks.MAGENTA_TERRACOTTA_SLAB,    Blocks.MAGENTA_TERRACOTTA);
        stonecutter(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
        stonecutter(ModBlocks.YELLOW_TERRACOTTA_SLAB,     Blocks.YELLOW_TERRACOTTA);
        stonecutter(ModBlocks.LIME_TERRACOTTA_SLAB,       Blocks.LIME_TERRACOTTA);
        stonecutter(ModBlocks.PINK_TERRACOTTA_SLAB,       Blocks.PINK_TERRACOTTA);
        stonecutter(ModBlocks.GRAY_TERRACOTTA_SLAB,       Blocks.GRAY_TERRACOTTA);
        stonecutter(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
        stonecutter(ModBlocks.CYAN_TERRACOTTA_SLAB,       Blocks.CYAN_TERRACOTTA);
        stonecutter(ModBlocks.PURPLE_TERRACOTTA_SLAB,     Blocks.PURPLE_TERRACOTTA);
        stonecutter(ModBlocks.BLUE_TERRACOTTA_SLAB,       Blocks.BLUE_TERRACOTTA);
        stonecutter(ModBlocks.BROWN_TERRACOTTA_SLAB,      Blocks.BROWN_TERRACOTTA);
        stonecutter(ModBlocks.GREEN_TERRACOTTA_SLAB,      Blocks.GREEN_TERRACOTTA);
        stonecutter(ModBlocks.RED_TERRACOTTA_SLAB,        Blocks.RED_TERRACOTTA);
        stonecutter(ModBlocks.BLACK_TERRACOTTA_SLAB,      Blocks.BLACK_TERRACOTTA);

        // Glazed terracotta
        stonecutter(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB,      Blocks.BLACK_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB,       Blocks.BLUE_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB,      Blocks.BROWN_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB,       Blocks.CYAN_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB,       Blocks.GRAY_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB,      Blocks.GREEN_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB,       Blocks.LIME_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB,    Blocks.MAGENTA_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB,     Blocks.ORANGE_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB,       Blocks.PINK_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB,     Blocks.PURPLE_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB,        Blocks.RED_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB,      Blocks.WHITE_GLAZED_TERRACOTTA);
        stonecutter(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB,     Blocks.YELLOW_GLAZED_TERRACOTTA);

        // Waxed copper
        stonecutter(ModBlocks.WAXED_COPPER_BLOCK_SLAB,   Blocks.WAXED_COPPER_BLOCK);
        stonecutter(ModBlocks.WAXED_EXPOSED_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        stonecutter(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB,  Blocks.WAXED_OXIDIZED_COPPER);
        stonecutter(ModBlocks.WAXED_WEATHERED_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);

        // Misc (stone/mineral building blocks)
        stonecutter(ModBlocks.ANCIENT_DEBRIS_SLAB,        Blocks.ANCIENT_DEBRIS);
        stonecutter(ModBlocks.CHISELED_QUARTZ_BLOCK_SLAB, Blocks.CHISELED_QUARTZ_BLOCK);
        stonecutter(ModBlocks.CHISELED_RED_SANDSTONE_SLAB, Blocks.CHISELED_RED_SANDSTONE);
        stonecutter(ModBlocks.CHISELED_SANDSTONE_SLAB,    Blocks.CHISELED_SANDSTONE);
        stonecutter(ModBlocks.DEEPSLATE_SLAB,             Blocks.DEEPSLATE);
        stonecutter(ModBlocks.SCULK_CATALYST_SLAB,        Blocks.SCULK_CATALYST);
        stonecutter(ModBlocks.TUFF_SLAB,                  Blocks.TUFF);
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
