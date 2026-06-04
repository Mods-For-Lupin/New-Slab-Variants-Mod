package io.github.jason13official.new_slab_variants.datagen.client;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import io.github.jason13official.new_slab_variants.impl.common.registry.ModItems;
import java.util.stream.Stream;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.block.dispatch.Variant;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;

public class NSVModelProvider extends ModelProvider {

  private static final Material MAGMA_TEX = new Material(
      Identifier.fromNamespaceAndPath("minecraft", "block/magma")
  );
  private static final Material SNOW_TEX = new Material(
      Identifier.fromNamespaceAndPath("minecraft", "block/snow")
  );

  public NSVModelProvider(PackOutput output) {
    super(output, "new_slab_variants");
  }

  @Override
  protected Stream<? extends Holder<Block>> getKnownBlocks() {
    return Stream.of(
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
        ModBlocks.DIRT_SLAB, ModBlocks.COARSE_DIRT_SLAB, ModBlocks.GRAVEL_SLAB,
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
        ModBlocks.BAMBOO_BLOCK_SLAB, ModBlocks.CRIMSON_HYPHAE_SLAB,
        ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB, ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB,
        ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB, ModBlocks.WARPED_HYPHAE_SLAB,
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
    ).map(Block::builtInRegistryHolder);
  }

  @Override
  protected Stream<? extends Holder<Item>> getKnownItems() {
    return Stream.of(
        // Mineral/gem blocks
        ModItems.COAL_BLOCK_SLAB, ModItems.DIAMOND_BLOCK_SLAB, ModItems.EMERALD_BLOCK_SLAB,
        ModItems.GOLD_BLOCK_SLAB, ModItems.IRON_BLOCK_SLAB, ModItems.LAPIS_BLOCK_SLAB,
        ModItems.NETHERITE_BLOCK_SLAB, ModItems.RAW_COPPER_BLOCK_SLAB,
        ModItems.RAW_GOLD_BLOCK_SLAB, ModItems.RAW_IRON_BLOCK_SLAB,
        // Ores
        ModItems.COAL_ORE_SLAB, ModItems.COPPER_ORE_SLAB, ModItems.DIAMOND_ORE_SLAB,
        ModItems.EMERALD_ORE_SLAB, ModItems.GOLD_ORE_SLAB, ModItems.IRON_ORE_SLAB,
        ModItems.LAPIS_ORE_SLAB, ModItems.NETHER_GOLD_ORE_SLAB, ModItems.NETHER_QUARTZ_ORE_SLAB,
        ModItems.REDSTONE_ORE_SLAB,
        ModItems.DEEPSLATE_COAL_ORE_SLAB, ModItems.DEEPSLATE_COPPER_ORE_SLAB,
        ModItems.DEEPSLATE_DIAMOND_ORE_SLAB, ModItems.DEEPSLATE_EMERALD_ORE_SLAB,
        ModItems.DEEPSLATE_GOLD_ORE_SLAB, ModItems.DEEPSLATE_IRON_ORE_SLAB,
        ModItems.DEEPSLATE_LAPIS_ORE_SLAB, ModItems.DEEPSLATE_REDSTONE_ORE_SLAB,
        // Stone/underground/nether
        ModItems.BASALT_SLAB, ModItems.CALCITE_SLAB, ModItems.DRIPSTONE_BLOCK_SLAB,
        ModItems.GILDED_BLACKSTONE_SLAB, ModItems.GLOWSTONE_SLAB, ModItems.LODESTONE_SLAB,
        ModItems.MAGMA_BLOCK_SLAB, ModItems.NETHERRACK_SLAB, ModItems.OBSIDIAN_SLAB,
        ModItems.POLISHED_BASALT_SLAB, ModItems.QUARTZ_BRICKS_SLAB,
        // Stone — chiseled/cracked
        ModItems.END_STONE_SLAB, ModItems.SMOOTH_BASALT_SLAB,
        ModItems.CHISELED_STONE_BRICKS_SLAB, ModItems.CRACKED_STONE_BRICKS_SLAB,
        ModItems.CHISELED_DEEPSLATE_SLAB, ModItems.CRACKED_DEEPSLATE_BRICKS_SLAB,
        ModItems.CRACKED_DEEPSLATE_TILES_SLAB, ModItems.CHISELED_NETHER_BRICKS_SLAB,
        ModItems.CRACKED_NETHER_BRICKS_SLAB, ModItems.CHISELED_POLISHED_BLACKSTONE_SLAB,
        ModItems.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, ModItems.CHISELED_RESIN_BRICKS_SLAB,
        // Decorative stone
        ModItems.BONE_BLOCK_SLAB, ModItems.PURPUR_PILLAR_SLAB, ModItems.QUARTZ_PILLAR_SLAB,
        ModItems.TERRACOTTA_SLAB,
        // Terrain
        ModItems.DIRT_SLAB, ModItems.COARSE_DIRT_SLAB, ModItems.GRAVEL_SLAB,
        ModItems.SAND_SLAB, ModItems.RED_SAND_SLAB,
        // Earthy/soft
        ModItems.CLAY_SLAB, ModItems.MUD_SLAB, ModItems.ROOTED_DIRT_SLAB, ModItems.SOUL_SOIL_SLAB,
        // Natural/functional
        ModItems.BEDROCK_SLAB, ModItems.SCULK_SLAB, ModItems.AMETHYST_BLOCK_SLAB,
        ModItems.BUDDING_AMETHYST_SLAB, ModItems.ICE_SLAB, ModItems.PACKED_ICE_SLAB,
        ModItems.BLUE_ICE_SLAB, ModItems.SNOW_BLOCK_SLAB, ModItems.SPONGE_SLAB, ModItems.WET_SPONGE_SLAB,
        // Nether/light
        ModItems.SOUL_SAND_SLAB, ModItems.NETHER_WART_BLOCK_SLAB, ModItems.WARPED_WART_BLOCK_SLAB,
        ModItems.SHROOMLIGHT_SLAB, ModItems.SEA_LANTERN_SLAB,
        // Misc
        ModItems.REDSTONE_BLOCK_SLAB, ModItems.REDSTONE_LAMP_SLAB, ModItems.HONEYCOMB_BLOCK_SLAB,
        ModItems.PACKED_MUD_SLAB, ModItems.CRYING_OBSIDIAN_SLAB, ModItems.NOTE_BLOCK_SLAB,
        // Organic/plant
        ModItems.MOSS_BLOCK_SLAB, ModItems.PALE_MOSS_BLOCK_SLAB, ModItems.RESIN_BLOCK_SLAB,
        // Leaves
        ModItems.AZALEA_LEAVES_SLAB, ModItems.FLOWERING_AZALEA_LEAVES_SLAB,
        // Mushroom blocks
        ModItems.BROWN_MUSHROOM_BLOCK_SLAB, ModItems.RED_MUSHROOM_BLOCK_SLAB, ModItems.MUSHROOM_STEM_SLAB,
        // Wood/fungal
        ModItems.BAMBOO_BLOCK_SLAB, ModItems.CRIMSON_HYPHAE_SLAB,
        ModItems.STRIPPED_BAMBOO_BLOCK_SLAB, ModItems.STRIPPED_CRIMSON_HYPHAE_SLAB,
        ModItems.STRIPPED_WARPED_HYPHAE_SLAB, ModItems.WARPED_HYPHAE_SLAB,
        // Copper (block/raw/chiseled/bulb)
        ModItems.COPPER_BLOCK_SLAB, ModItems.EXPOSED_COPPER_SLAB,
        ModItems.OXIDIZED_COPPER_SLAB, ModItems.WEATHERED_COPPER_SLAB,
        ModItems.CHISELED_COPPER_SLAB, ModItems.EXPOSED_CHISELED_COPPER_SLAB,
        ModItems.OXIDIZED_CHISELED_COPPER_SLAB, ModItems.WEATHERED_CHISELED_COPPER_SLAB,
        ModItems.COPPER_BULB_SLAB, ModItems.EXPOSED_COPPER_BULB_SLAB,
        ModItems.OXIDIZED_COPPER_BULB_SLAB, ModItems.WEATHERED_COPPER_BULB_SLAB,
        // Copper grates
        ModItems.COPPER_GRATE_SLAB, ModItems.EXPOSED_COPPER_GRATE_SLAB,
        ModItems.OXIDIZED_COPPER_GRATE_SLAB, ModItems.WEATHERED_COPPER_GRATE_SLAB,
        // Coral blocks
        ModItems.BRAIN_CORAL_BLOCK_SLAB, ModItems.BUBBLE_CORAL_BLOCK_SLAB,
        ModItems.FIRE_CORAL_BLOCK_SLAB, ModItems.HORN_CORAL_BLOCK_SLAB, ModItems.TUBE_CORAL_BLOCK_SLAB,
        ModItems.DEAD_BRAIN_CORAL_BLOCK_SLAB, ModItems.DEAD_BUBBLE_CORAL_BLOCK_SLAB,
        ModItems.DEAD_FIRE_CORAL_BLOCK_SLAB, ModItems.DEAD_HORN_CORAL_BLOCK_SLAB,
        ModItems.DEAD_TUBE_CORAL_BLOCK_SLAB,
        // Wool
        ModItems.WHITE_WOOL_SLAB, ModItems.ORANGE_WOOL_SLAB, ModItems.MAGENTA_WOOL_SLAB,
        ModItems.LIGHT_BLUE_WOOL_SLAB, ModItems.YELLOW_WOOL_SLAB, ModItems.LIME_WOOL_SLAB,
        ModItems.PINK_WOOL_SLAB, ModItems.GRAY_WOOL_SLAB, ModItems.LIGHT_GRAY_WOOL_SLAB,
        ModItems.CYAN_WOOL_SLAB, ModItems.PURPLE_WOOL_SLAB, ModItems.BLUE_WOOL_SLAB,
        ModItems.BROWN_WOOL_SLAB, ModItems.GREEN_WOOL_SLAB, ModItems.RED_WOOL_SLAB, ModItems.BLACK_WOOL_SLAB,
        // Concrete
        ModItems.WHITE_CONCRETE_SLAB, ModItems.ORANGE_CONCRETE_SLAB, ModItems.MAGENTA_CONCRETE_SLAB,
        ModItems.LIGHT_BLUE_CONCRETE_SLAB, ModItems.YELLOW_CONCRETE_SLAB, ModItems.LIME_CONCRETE_SLAB,
        ModItems.PINK_CONCRETE_SLAB, ModItems.GRAY_CONCRETE_SLAB, ModItems.LIGHT_GRAY_CONCRETE_SLAB,
        ModItems.CYAN_CONCRETE_SLAB, ModItems.PURPLE_CONCRETE_SLAB, ModItems.BLUE_CONCRETE_SLAB,
        ModItems.BROWN_CONCRETE_SLAB, ModItems.GREEN_CONCRETE_SLAB, ModItems.RED_CONCRETE_SLAB,
        ModItems.BLACK_CONCRETE_SLAB,
        // Concrete powder
        ModItems.WHITE_CONCRETE_POWDER_SLAB, ModItems.ORANGE_CONCRETE_POWDER_SLAB,
        ModItems.MAGENTA_CONCRETE_POWDER_SLAB, ModItems.LIGHT_BLUE_CONCRETE_POWDER_SLAB,
        ModItems.YELLOW_CONCRETE_POWDER_SLAB, ModItems.LIME_CONCRETE_POWDER_SLAB,
        ModItems.PINK_CONCRETE_POWDER_SLAB, ModItems.GRAY_CONCRETE_POWDER_SLAB,
        ModItems.LIGHT_GRAY_CONCRETE_POWDER_SLAB, ModItems.CYAN_CONCRETE_POWDER_SLAB,
        ModItems.PURPLE_CONCRETE_POWDER_SLAB, ModItems.BLUE_CONCRETE_POWDER_SLAB,
        ModItems.BROWN_CONCRETE_POWDER_SLAB, ModItems.GREEN_CONCRETE_POWDER_SLAB,
        ModItems.RED_CONCRETE_POWDER_SLAB, ModItems.BLACK_CONCRETE_POWDER_SLAB,
        // Glass/stained glass
        ModItems.GLASS_SLAB, ModItems.TINTED_GLASS_SLAB,
        ModItems.WHITE_STAINED_GLASS_SLAB, ModItems.ORANGE_STAINED_GLASS_SLAB,
        ModItems.MAGENTA_STAINED_GLASS_SLAB, ModItems.LIGHT_BLUE_STAINED_GLASS_SLAB,
        ModItems.YELLOW_STAINED_GLASS_SLAB, ModItems.LIME_STAINED_GLASS_SLAB,
        ModItems.PINK_STAINED_GLASS_SLAB, ModItems.GRAY_STAINED_GLASS_SLAB,
        ModItems.LIGHT_GRAY_STAINED_GLASS_SLAB, ModItems.CYAN_STAINED_GLASS_SLAB,
        ModItems.PURPLE_STAINED_GLASS_SLAB, ModItems.BLUE_STAINED_GLASS_SLAB,
        ModItems.BROWN_STAINED_GLASS_SLAB, ModItems.GREEN_STAINED_GLASS_SLAB,
        ModItems.RED_STAINED_GLASS_SLAB, ModItems.BLACK_STAINED_GLASS_SLAB,
        // Colored terracotta
        ModItems.WHITE_TERRACOTTA_SLAB, ModItems.ORANGE_TERRACOTTA_SLAB,
        ModItems.MAGENTA_TERRACOTTA_SLAB, ModItems.LIGHT_BLUE_TERRACOTTA_SLAB,
        ModItems.YELLOW_TERRACOTTA_SLAB, ModItems.LIME_TERRACOTTA_SLAB,
        ModItems.PINK_TERRACOTTA_SLAB, ModItems.GRAY_TERRACOTTA_SLAB,
        ModItems.LIGHT_GRAY_TERRACOTTA_SLAB, ModItems.CYAN_TERRACOTTA_SLAB,
        ModItems.PURPLE_TERRACOTTA_SLAB, ModItems.BLUE_TERRACOTTA_SLAB,
        ModItems.BROWN_TERRACOTTA_SLAB, ModItems.GREEN_TERRACOTTA_SLAB,
        ModItems.RED_TERRACOTTA_SLAB, ModItems.BLACK_TERRACOTTA_SLAB
    ).map(Item::builtInRegistryHolder);
  }

  @Override
  protected void registerModels(BlockModelGenerators bg, ItemModelGenerators ig) {
    // Mineral/gem blocks
    cubeSlab(bg, ModBlocks.COAL_BLOCK_SLAB,       Blocks.COAL_BLOCK);
    cubeSlab(bg, ModBlocks.DIAMOND_BLOCK_SLAB,    Blocks.DIAMOND_BLOCK);
    cubeSlab(bg, ModBlocks.EMERALD_BLOCK_SLAB,    Blocks.EMERALD_BLOCK);
    cubeSlab(bg, ModBlocks.GOLD_BLOCK_SLAB,       Blocks.GOLD_BLOCK);
    cubeSlab(bg, ModBlocks.IRON_BLOCK_SLAB,       Blocks.IRON_BLOCK);
    cubeSlab(bg, ModBlocks.LAPIS_BLOCK_SLAB,      Blocks.LAPIS_BLOCK);
    cubeSlab(bg, ModBlocks.NETHERITE_BLOCK_SLAB,  Blocks.NETHERITE_BLOCK);
    cubeSlab(bg, ModBlocks.RAW_COPPER_BLOCK_SLAB, Blocks.RAW_COPPER_BLOCK);
    cubeSlab(bg, ModBlocks.RAW_GOLD_BLOCK_SLAB,   Blocks.RAW_GOLD_BLOCK);
    cubeSlab(bg, ModBlocks.RAW_IRON_BLOCK_SLAB,   Blocks.RAW_IRON_BLOCK);

    // Ores
    cubeSlab(bg, ModBlocks.COAL_ORE_SLAB,              Blocks.COAL_ORE);
    cubeSlab(bg, ModBlocks.COPPER_ORE_SLAB,            Blocks.COPPER_ORE);
    cubeSlab(bg, ModBlocks.DIAMOND_ORE_SLAB,           Blocks.DIAMOND_ORE);
    cubeSlab(bg, ModBlocks.EMERALD_ORE_SLAB,           Blocks.EMERALD_ORE);
    cubeSlab(bg, ModBlocks.GOLD_ORE_SLAB,              Blocks.GOLD_ORE);
    cubeSlab(bg, ModBlocks.IRON_ORE_SLAB,              Blocks.IRON_ORE);
    cubeSlab(bg, ModBlocks.LAPIS_ORE_SLAB,             Blocks.LAPIS_ORE);
    cubeSlab(bg, ModBlocks.NETHER_GOLD_ORE_SLAB,       Blocks.NETHER_GOLD_ORE);
    cubeSlab(bg, ModBlocks.NETHER_QUARTZ_ORE_SLAB,     Blocks.NETHER_QUARTZ_ORE);
    cubeSlab(bg, ModBlocks.REDSTONE_ORE_SLAB,          Blocks.REDSTONE_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_COAL_ORE_SLAB,    Blocks.DEEPSLATE_COAL_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_COPPER_ORE_SLAB,  Blocks.DEEPSLATE_COPPER_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, Blocks.DEEPSLATE_DIAMOND_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB, Blocks.DEEPSLATE_EMERALD_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_GOLD_ORE_SLAB,    Blocks.DEEPSLATE_GOLD_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_IRON_ORE_SLAB,    Blocks.DEEPSLATE_IRON_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB,   Blocks.DEEPSLATE_LAPIS_ORE);
    cubeSlab(bg, ModBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, Blocks.DEEPSLATE_REDSTONE_ORE);

    // Stone/underground/nether
    cubeSlab(bg, ModBlocks.CALCITE_SLAB,           Blocks.CALCITE);
    cubeSlab(bg, ModBlocks.DRIPSTONE_BLOCK_SLAB,   Blocks.DRIPSTONE_BLOCK);
    cubeSlab(bg, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
    cubeSlab(bg, ModBlocks.GLOWSTONE_SLAB,         Blocks.GLOWSTONE);
    cubeSlab(bg, ModBlocks.NETHERRACK_SLAB,        Blocks.NETHERRACK);
    cubeSlab(bg, ModBlocks.OBSIDIAN_SLAB,          Blocks.OBSIDIAN);
    cubeSlab(bg, ModBlocks.QUARTZ_BRICKS_SLAB,     Blocks.QUARTZ_BRICKS);
    cubeSlab(bg, ModBlocks.TERRACOTTA_SLAB,        Blocks.TERRACOTTA);
    cubeSlab(bg, ModBlocks.MAGMA_BLOCK_SLAB, MAGMA_TEX, ModelLocationUtils.getModelLocation(Blocks.MAGMA_BLOCK));

    // Stone — chiseled/cracked
    cubeSlab(bg, ModBlocks.END_STONE_SLAB,                       Blocks.END_STONE);
    cubeSlab(bg, ModBlocks.SMOOTH_BASALT_SLAB,                   Blocks.SMOOTH_BASALT);
    cubeSlab(bg, ModBlocks.CHISELED_STONE_BRICKS_SLAB,           Blocks.CHISELED_STONE_BRICKS);
    cubeSlab(bg, ModBlocks.CRACKED_STONE_BRICKS_SLAB,            Blocks.CRACKED_STONE_BRICKS);
    cubeSlab(bg, ModBlocks.CHISELED_DEEPSLATE_SLAB,              Blocks.CHISELED_DEEPSLATE);
    cubeSlab(bg, ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB,        Blocks.CRACKED_DEEPSLATE_BRICKS);
    cubeSlab(bg, ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB,         Blocks.CRACKED_DEEPSLATE_TILES);
    cubeSlab(bg, ModBlocks.CHISELED_NETHER_BRICKS_SLAB,          Blocks.CHISELED_NETHER_BRICKS);
    cubeSlab(bg, ModBlocks.CRACKED_NETHER_BRICKS_SLAB,           Blocks.CRACKED_NETHER_BRICKS);
    cubeSlab(bg, ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,    Blocks.CHISELED_POLISHED_BLACKSTONE);
    cubeSlab(bg, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    cubeSlab(bg, ModBlocks.CHISELED_RESIN_BRICKS_SLAB,           Blocks.CHISELED_RESIN_BRICKS);

    // Terrain
    cubeSlab(bg, ModBlocks.DIRT_SLAB,        Blocks.DIRT);
    cubeSlab(bg, ModBlocks.COARSE_DIRT_SLAB, Blocks.COARSE_DIRT);
    cubeSlab(bg, ModBlocks.GRAVEL_SLAB,      Blocks.GRAVEL);
    cubeSlab(bg, ModBlocks.SAND_SLAB,        Blocks.SAND);
    cubeSlab(bg, ModBlocks.RED_SAND_SLAB,    Blocks.RED_SAND);

    // Earthy/soft
    cubeSlab(bg, ModBlocks.CLAY_SLAB,        Blocks.CLAY);
    cubeSlab(bg, ModBlocks.MUD_SLAB,         Blocks.MUD);
    cubeSlab(bg, ModBlocks.ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT);
    cubeSlab(bg, ModBlocks.SOUL_SOIL_SLAB,   Blocks.SOUL_SOIL);

    // Natural/functional
    cubeSlab(bg, ModBlocks.BEDROCK_SLAB,          Blocks.BEDROCK);
    cubeSlab(bg, ModBlocks.SCULK_SLAB,            Blocks.SCULK);
    cubeSlab(bg, ModBlocks.AMETHYST_BLOCK_SLAB,   Blocks.AMETHYST_BLOCK);
    cubeSlab(bg, ModBlocks.BUDDING_AMETHYST_SLAB, Blocks.BUDDING_AMETHYST);
    cubeSlab(bg, ModBlocks.ICE_SLAB,              Blocks.ICE);
    cubeSlab(bg, ModBlocks.PACKED_ICE_SLAB,       Blocks.PACKED_ICE);
    cubeSlab(bg, ModBlocks.BLUE_ICE_SLAB,         Blocks.BLUE_ICE);
    cubeSlab(bg, ModBlocks.SNOW_BLOCK_SLAB, SNOW_TEX, ModelLocationUtils.getModelLocation(Blocks.SNOW_BLOCK));
    cubeSlab(bg, ModBlocks.SPONGE_SLAB,           Blocks.SPONGE);
    cubeSlab(bg, ModBlocks.WET_SPONGE_SLAB,       Blocks.WET_SPONGE);

    // Nether/light
    cubeSlab(bg, ModBlocks.SOUL_SAND_SLAB,         Blocks.SOUL_SAND);
    cubeSlab(bg, ModBlocks.NETHER_WART_BLOCK_SLAB, Blocks.NETHER_WART_BLOCK);
    cubeSlab(bg, ModBlocks.WARPED_WART_BLOCK_SLAB, Blocks.WARPED_WART_BLOCK);
    cubeSlab(bg, ModBlocks.SHROOMLIGHT_SLAB,       Blocks.SHROOMLIGHT);
    cubeSlab(bg, ModBlocks.SEA_LANTERN_SLAB,       Blocks.SEA_LANTERN);

    // Misc
    cubeSlab(bg, ModBlocks.REDSTONE_BLOCK_SLAB,  Blocks.REDSTONE_BLOCK);
    cubeSlab(bg, ModBlocks.REDSTONE_LAMP_SLAB,   Blocks.REDSTONE_LAMP);
    cubeSlab(bg, ModBlocks.HONEYCOMB_BLOCK_SLAB, Blocks.HONEYCOMB_BLOCK);
    cubeSlab(bg, ModBlocks.PACKED_MUD_SLAB,      Blocks.PACKED_MUD);
    cubeSlab(bg, ModBlocks.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN);
    cubeSlab(bg, ModBlocks.NOTE_BLOCK_SLAB,      Blocks.NOTE_BLOCK);

    // Organic/plant
    cubeSlab(bg, ModBlocks.MOSS_BLOCK_SLAB,      Blocks.MOSS_BLOCK);
    cubeSlab(bg, ModBlocks.PALE_MOSS_BLOCK_SLAB, Blocks.PALE_MOSS_BLOCK);
    cubeSlab(bg, ModBlocks.RESIN_BLOCK_SLAB,     Blocks.RESIN_BLOCK);

    // Leaves
    cubeSlab(bg, ModBlocks.AZALEA_LEAVES_SLAB,           Blocks.AZALEA_LEAVES);
    cubeSlab(bg, ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB, Blocks.FLOWERING_AZALEA_LEAVES);

    // Mushroom blocks
    cubeSlab(bg, ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB, Blocks.BROWN_MUSHROOM_BLOCK);
    cubeSlab(bg, ModBlocks.RED_MUSHROOM_BLOCK_SLAB,   Blocks.RED_MUSHROOM_BLOCK);
    cubeSlab(bg, ModBlocks.MUSHROOM_STEM_SLAB,        Blocks.MUSHROOM_STEM);

    // Column blocks with _side/_top textures
    columnSlab(bg, ModBlocks.BASALT_SLAB,          tex(Blocks.BASALT,          "_side"), tex(Blocks.BASALT,          "_top"), Blocks.BASALT);
    columnSlab(bg, ModBlocks.POLISHED_BASALT_SLAB, tex(Blocks.POLISHED_BASALT, "_side"), tex(Blocks.POLISHED_BASALT, "_top"), Blocks.POLISHED_BASALT);
    columnSlab(bg, ModBlocks.BONE_BLOCK_SLAB,      tex(Blocks.BONE_BLOCK,      "_side"), tex(Blocks.BONE_BLOCK,      "_top"), Blocks.BONE_BLOCK);
    columnSlab(bg, ModBlocks.LODESTONE_SLAB,       tex(Blocks.LODESTONE,       "_side"), tex(Blocks.LODESTONE,       "_top"), Blocks.LODESTONE);

    // Column blocks: base name = side texture, "_top" = top texture
    columnSlab(bg, ModBlocks.BAMBOO_BLOCK_SLAB,          tex(Blocks.BAMBOO_BLOCK),          tex(Blocks.BAMBOO_BLOCK,          "_top"), Blocks.BAMBOO_BLOCK);
    columnSlab(bg, ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB, tex(Blocks.STRIPPED_BAMBOO_BLOCK), tex(Blocks.STRIPPED_BAMBOO_BLOCK, "_top"), Blocks.STRIPPED_BAMBOO_BLOCK);
    columnSlab(bg, ModBlocks.QUARTZ_PILLAR_SLAB,         tex(Blocks.QUARTZ_PILLAR),         tex(Blocks.QUARTZ_PILLAR,         "_top"), Blocks.QUARTZ_PILLAR);
    columnSlab(bg, ModBlocks.PURPUR_PILLAR_SLAB,         tex(Blocks.PURPUR_PILLAR),         tex(Blocks.PURPUR_PILLAR,         "_top"), Blocks.PURPUR_PILLAR);

    // Hyphae: all faces use the corresponding stem texture
    cubeSlab(bg, ModBlocks.CRIMSON_HYPHAE_SLAB,          tex(Blocks.CRIMSON_STEM),          ModelLocationUtils.getModelLocation(Blocks.CRIMSON_HYPHAE));
    cubeSlab(bg, ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, tex(Blocks.STRIPPED_CRIMSON_STEM), ModelLocationUtils.getModelLocation(Blocks.STRIPPED_CRIMSON_HYPHAE));
    cubeSlab(bg, ModBlocks.WARPED_HYPHAE_SLAB,           tex(Blocks.WARPED_STEM),           ModelLocationUtils.getModelLocation(Blocks.WARPED_HYPHAE));
    cubeSlab(bg, ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  tex(Blocks.STRIPPED_WARPED_STEM),  ModelLocationUtils.getModelLocation(Blocks.STRIPPED_WARPED_HYPHAE));

    // Copper (block/raw/chiseled/bulb)
    cubeSlab(bg, ModBlocks.COPPER_BLOCK_SLAB,              Blocks.COPPER_BLOCK);
    cubeSlab(bg, ModBlocks.EXPOSED_COPPER_SLAB,            Blocks.EXPOSED_COPPER);
    cubeSlab(bg, ModBlocks.OXIDIZED_COPPER_SLAB,           Blocks.OXIDIZED_COPPER);
    cubeSlab(bg, ModBlocks.WEATHERED_COPPER_SLAB,          Blocks.WEATHERED_COPPER);
    cubeSlab(bg, ModBlocks.CHISELED_COPPER_SLAB,           Blocks.CHISELED_COPPER);
    cubeSlab(bg, ModBlocks.EXPOSED_CHISELED_COPPER_SLAB,   Blocks.EXPOSED_CHISELED_COPPER);
    cubeSlab(bg, ModBlocks.OXIDIZED_CHISELED_COPPER_SLAB,  Blocks.OXIDIZED_CHISELED_COPPER);
    cubeSlab(bg, ModBlocks.WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER);
    cubeSlab(bg, ModBlocks.COPPER_BULB_SLAB,               Blocks.COPPER_BULB);
    cubeSlab(bg, ModBlocks.EXPOSED_COPPER_BULB_SLAB,       Blocks.EXPOSED_COPPER_BULB);
    cubeSlab(bg, ModBlocks.OXIDIZED_COPPER_BULB_SLAB,      Blocks.OXIDIZED_COPPER_BULB);
    cubeSlab(bg, ModBlocks.WEATHERED_COPPER_BULB_SLAB,     Blocks.WEATHERED_COPPER_BULB);

    // Copper grates
    cubeSlab(bg, ModBlocks.COPPER_GRATE_SLAB,           Blocks.COPPER_GRATE);
    cubeSlab(bg, ModBlocks.EXPOSED_COPPER_GRATE_SLAB,   Blocks.EXPOSED_COPPER_GRATE);
    cubeSlab(bg, ModBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);
    cubeSlab(bg, ModBlocks.OXIDIZED_COPPER_GRATE_SLAB,  Blocks.OXIDIZED_COPPER_GRATE);

    // Coral blocks
    cubeSlab(bg, ModBlocks.BRAIN_CORAL_BLOCK_SLAB,       Blocks.BRAIN_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.BUBBLE_CORAL_BLOCK_SLAB,      Blocks.BUBBLE_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.FIRE_CORAL_BLOCK_SLAB,        Blocks.FIRE_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.HORN_CORAL_BLOCK_SLAB,        Blocks.HORN_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.TUBE_CORAL_BLOCK_SLAB,        Blocks.TUBE_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.DEAD_BRAIN_CORAL_BLOCK_SLAB,  Blocks.DEAD_BRAIN_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.DEAD_BUBBLE_CORAL_BLOCK_SLAB, Blocks.DEAD_BUBBLE_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.DEAD_FIRE_CORAL_BLOCK_SLAB,   Blocks.DEAD_FIRE_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.DEAD_HORN_CORAL_BLOCK_SLAB,   Blocks.DEAD_HORN_CORAL_BLOCK);
    cubeSlab(bg, ModBlocks.DEAD_TUBE_CORAL_BLOCK_SLAB,   Blocks.DEAD_TUBE_CORAL_BLOCK);

    // Wool
    cubeSlab(bg, ModBlocks.WHITE_WOOL_SLAB,      Blocks.WHITE_WOOL);
    cubeSlab(bg, ModBlocks.ORANGE_WOOL_SLAB,     Blocks.ORANGE_WOOL);
    cubeSlab(bg, ModBlocks.MAGENTA_WOOL_SLAB,    Blocks.MAGENTA_WOOL);
    cubeSlab(bg, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
    cubeSlab(bg, ModBlocks.YELLOW_WOOL_SLAB,     Blocks.YELLOW_WOOL);
    cubeSlab(bg, ModBlocks.LIME_WOOL_SLAB,       Blocks.LIME_WOOL);
    cubeSlab(bg, ModBlocks.PINK_WOOL_SLAB,       Blocks.PINK_WOOL);
    cubeSlab(bg, ModBlocks.GRAY_WOOL_SLAB,       Blocks.GRAY_WOOL);
    cubeSlab(bg, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
    cubeSlab(bg, ModBlocks.CYAN_WOOL_SLAB,       Blocks.CYAN_WOOL);
    cubeSlab(bg, ModBlocks.PURPLE_WOOL_SLAB,     Blocks.PURPLE_WOOL);
    cubeSlab(bg, ModBlocks.BLUE_WOOL_SLAB,       Blocks.BLUE_WOOL);
    cubeSlab(bg, ModBlocks.BROWN_WOOL_SLAB,      Blocks.BROWN_WOOL);
    cubeSlab(bg, ModBlocks.GREEN_WOOL_SLAB,      Blocks.GREEN_WOOL);
    cubeSlab(bg, ModBlocks.RED_WOOL_SLAB,        Blocks.RED_WOOL);
    cubeSlab(bg, ModBlocks.BLACK_WOOL_SLAB,      Blocks.BLACK_WOOL);

    // Concrete
    cubeSlab(bg, ModBlocks.WHITE_CONCRETE_SLAB,      Blocks.WHITE_CONCRETE);
    cubeSlab(bg, ModBlocks.ORANGE_CONCRETE_SLAB,     Blocks.ORANGE_CONCRETE);
    cubeSlab(bg, ModBlocks.MAGENTA_CONCRETE_SLAB,    Blocks.MAGENTA_CONCRETE);
    cubeSlab(bg, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
    cubeSlab(bg, ModBlocks.YELLOW_CONCRETE_SLAB,     Blocks.YELLOW_CONCRETE);
    cubeSlab(bg, ModBlocks.LIME_CONCRETE_SLAB,       Blocks.LIME_CONCRETE);
    cubeSlab(bg, ModBlocks.PINK_CONCRETE_SLAB,       Blocks.PINK_CONCRETE);
    cubeSlab(bg, ModBlocks.GRAY_CONCRETE_SLAB,       Blocks.GRAY_CONCRETE);
    cubeSlab(bg, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
    cubeSlab(bg, ModBlocks.CYAN_CONCRETE_SLAB,       Blocks.CYAN_CONCRETE);
    cubeSlab(bg, ModBlocks.PURPLE_CONCRETE_SLAB,     Blocks.PURPLE_CONCRETE);
    cubeSlab(bg, ModBlocks.BLUE_CONCRETE_SLAB,       Blocks.BLUE_CONCRETE);
    cubeSlab(bg, ModBlocks.BROWN_CONCRETE_SLAB,      Blocks.BROWN_CONCRETE);
    cubeSlab(bg, ModBlocks.GREEN_CONCRETE_SLAB,      Blocks.GREEN_CONCRETE);
    cubeSlab(bg, ModBlocks.RED_CONCRETE_SLAB,        Blocks.RED_CONCRETE);
    cubeSlab(bg, ModBlocks.BLACK_CONCRETE_SLAB,      Blocks.BLACK_CONCRETE);

    // Concrete powder
    cubeSlab(bg, ModBlocks.WHITE_CONCRETE_POWDER_SLAB,      Blocks.WHITE_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.ORANGE_CONCRETE_POWDER_SLAB,     Blocks.ORANGE_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.MAGENTA_CONCRETE_POWDER_SLAB,    Blocks.MAGENTA_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.YELLOW_CONCRETE_POWDER_SLAB,     Blocks.YELLOW_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.LIME_CONCRETE_POWDER_SLAB,       Blocks.LIME_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.PINK_CONCRETE_POWDER_SLAB,       Blocks.PINK_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.GRAY_CONCRETE_POWDER_SLAB,       Blocks.GRAY_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.CYAN_CONCRETE_POWDER_SLAB,       Blocks.CYAN_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.PURPLE_CONCRETE_POWDER_SLAB,     Blocks.PURPLE_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.BLUE_CONCRETE_POWDER_SLAB,       Blocks.BLUE_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.BROWN_CONCRETE_POWDER_SLAB,      Blocks.BROWN_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.GREEN_CONCRETE_POWDER_SLAB,      Blocks.GREEN_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.RED_CONCRETE_POWDER_SLAB,        Blocks.RED_CONCRETE_POWDER);
    cubeSlab(bg, ModBlocks.BLACK_CONCRETE_POWDER_SLAB,      Blocks.BLACK_CONCRETE_POWDER);

    // Glass/stained glass
    glassSlab(bg, ModBlocks.GLASS_SLAB,                    Blocks.GLASS);
    glassSlab(bg, ModBlocks.TINTED_GLASS_SLAB,             Blocks.TINTED_GLASS);
    glassSlab(bg, ModBlocks.WHITE_STAINED_GLASS_SLAB,      Blocks.WHITE_STAINED_GLASS);
    glassSlab(bg, ModBlocks.ORANGE_STAINED_GLASS_SLAB,     Blocks.ORANGE_STAINED_GLASS);
    glassSlab(bg, ModBlocks.MAGENTA_STAINED_GLASS_SLAB,    Blocks.MAGENTA_STAINED_GLASS);
    glassSlab(bg, ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
    glassSlab(bg, ModBlocks.YELLOW_STAINED_GLASS_SLAB,     Blocks.YELLOW_STAINED_GLASS);
    glassSlab(bg, ModBlocks.LIME_STAINED_GLASS_SLAB,       Blocks.LIME_STAINED_GLASS);
    glassSlab(bg, ModBlocks.PINK_STAINED_GLASS_SLAB,       Blocks.PINK_STAINED_GLASS);
    glassSlab(bg, ModBlocks.GRAY_STAINED_GLASS_SLAB,       Blocks.GRAY_STAINED_GLASS);
    glassSlab(bg, ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
    glassSlab(bg, ModBlocks.CYAN_STAINED_GLASS_SLAB,       Blocks.CYAN_STAINED_GLASS);
    glassSlab(bg, ModBlocks.PURPLE_STAINED_GLASS_SLAB,     Blocks.PURPLE_STAINED_GLASS);
    glassSlab(bg, ModBlocks.BLUE_STAINED_GLASS_SLAB,       Blocks.BLUE_STAINED_GLASS);
    glassSlab(bg, ModBlocks.BROWN_STAINED_GLASS_SLAB,      Blocks.BROWN_STAINED_GLASS);
    glassSlab(bg, ModBlocks.GREEN_STAINED_GLASS_SLAB,      Blocks.GREEN_STAINED_GLASS);
    glassSlab(bg, ModBlocks.RED_STAINED_GLASS_SLAB,        Blocks.RED_STAINED_GLASS);
    glassSlab(bg, ModBlocks.BLACK_STAINED_GLASS_SLAB,      Blocks.BLACK_STAINED_GLASS);

    // Colored terracotta
    cubeSlab(bg, ModBlocks.WHITE_TERRACOTTA_SLAB,      Blocks.WHITE_TERRACOTTA);
    cubeSlab(bg, ModBlocks.ORANGE_TERRACOTTA_SLAB,     Blocks.ORANGE_TERRACOTTA);
    cubeSlab(bg, ModBlocks.MAGENTA_TERRACOTTA_SLAB,    Blocks.MAGENTA_TERRACOTTA);
    cubeSlab(bg, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
    cubeSlab(bg, ModBlocks.YELLOW_TERRACOTTA_SLAB,     Blocks.YELLOW_TERRACOTTA);
    cubeSlab(bg, ModBlocks.LIME_TERRACOTTA_SLAB,       Blocks.LIME_TERRACOTTA);
    cubeSlab(bg, ModBlocks.PINK_TERRACOTTA_SLAB,       Blocks.PINK_TERRACOTTA);
    cubeSlab(bg, ModBlocks.GRAY_TERRACOTTA_SLAB,       Blocks.GRAY_TERRACOTTA);
    cubeSlab(bg, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
    cubeSlab(bg, ModBlocks.CYAN_TERRACOTTA_SLAB,       Blocks.CYAN_TERRACOTTA);
    cubeSlab(bg, ModBlocks.PURPLE_TERRACOTTA_SLAB,     Blocks.PURPLE_TERRACOTTA);
    cubeSlab(bg, ModBlocks.BLUE_TERRACOTTA_SLAB,       Blocks.BLUE_TERRACOTTA);
    cubeSlab(bg, ModBlocks.BROWN_TERRACOTTA_SLAB,      Blocks.BROWN_TERRACOTTA);
    cubeSlab(bg, ModBlocks.GREEN_TERRACOTTA_SLAB,      Blocks.GREEN_TERRACOTTA);
    cubeSlab(bg, ModBlocks.RED_TERRACOTTA_SLAB,        Blocks.RED_TERRACOTTA);
    cubeSlab(bg, ModBlocks.BLACK_TERRACOTTA_SLAB,      Blocks.BLACK_TERRACOTTA);
  }

  private static Material tex(Block block) {
    return TextureMapping.getBlockTexture(block);
  }

  private static Material tex(Block block, String suffix) {
    return TextureMapping.getBlockTexture(block, suffix);
  }

  private static MultiVariant mv(Identifier id) {
    return new MultiVariant(WeightedList.of(new Variant(id)));
  }

  private static void slabState(BlockModelGenerators bg, Block slab, TextureMapping mapping, Identifier fullModel) {
    Identifier bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, bg.modelOutput);
    Identifier top    = ModelTemplates.SLAB_TOP.create(slab, mapping, bg.modelOutput);
    bg.blockStateOutput.accept(
        MultiVariantGenerator.dispatch(slab)
            .with(PropertyDispatch.initial(BlockStateProperties.SLAB_TYPE)
                .select(SlabType.BOTTOM, mv(bottom))
                .select(SlabType.TOP,    mv(top))
                .select(SlabType.DOUBLE, mv(fullModel)))
    );
    bg.registerSimpleItemModel(slab, bottom);
  }

  private static void cubeSlab(BlockModelGenerators bg, Block slab, Block full) {
    Material t = tex(full);
    cubeSlab(bg, slab, t, ModelLocationUtils.getModelLocation(full));
  }

  private static void cubeSlab(BlockModelGenerators bg, Block slab, Material tex, Identifier fullModel) {
    slabState(bg, slab,
        new TextureMapping().put(TextureSlot.BOTTOM, tex).put(TextureSlot.TOP, tex).put(TextureSlot.SIDE, tex),
        fullModel);
  }

  private static void glassSlab(BlockModelGenerators bg, Block slab, Block full) {
    Material t = tex(full);
    slabState(bg, slab,
        new TextureMapping()
            .put(TextureSlot.BOTTOM, t)
            .put(TextureSlot.TOP, t)
            .put(TextureSlot.SIDE, t)
            .forceAllTranslucent(),
        ModelLocationUtils.getModelLocation(full));
  }

  private static void columnSlab(BlockModelGenerators bg, Block slab, Material side, Material top, Block full) {
    slabState(bg, slab,
        new TextureMapping().put(TextureSlot.SIDE, side).put(TextureSlot.BOTTOM, top).put(TextureSlot.TOP, top),
        ModelLocationUtils.getModelLocation(full));
  }
}
