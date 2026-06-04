package io.github.jason13official.new_slab_variants.impl.common.registry;

import io.github.jason13official.new_slab_variants.Constants;
import io.github.jason13official.new_slab_variants.NewSlabVariants;
import io.github.jason13official.new_slab_variants.platform.Services;
import java.util.function.BiConsumer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

  public static CreativeModeTab NEW_SLAB_VARIANTS;

  public static void register(BiConsumer<CreativeModeTab, Identifier> consumer) {
    NEW_SLAB_VARIANTS = Services.registry().tabBuilder()
        .icon(() -> new ItemStack(ModItems.IRON_BLOCK_SLAB))
        .title(Component.translatable("itemGroup.newSlabVariants"))
        .displayItems((params, output) -> {
          // Mineral/gem blocks
          output.accept(ModItems.COAL_BLOCK_SLAB);
          output.accept(ModItems.DIAMOND_BLOCK_SLAB);
          output.accept(ModItems.EMERALD_BLOCK_SLAB);
          output.accept(ModItems.GOLD_BLOCK_SLAB);
          output.accept(ModItems.IRON_BLOCK_SLAB);
          output.accept(ModItems.LAPIS_BLOCK_SLAB);
          output.accept(ModItems.NETHERITE_BLOCK_SLAB);
          output.accept(ModItems.RAW_COPPER_BLOCK_SLAB);
          output.accept(ModItems.RAW_GOLD_BLOCK_SLAB);
          output.accept(ModItems.RAW_IRON_BLOCK_SLAB);

          // Ores
          output.accept(ModItems.COAL_ORE_SLAB);
          output.accept(ModItems.COPPER_ORE_SLAB);
          output.accept(ModItems.DIAMOND_ORE_SLAB);
          output.accept(ModItems.EMERALD_ORE_SLAB);
          output.accept(ModItems.GOLD_ORE_SLAB);
          output.accept(ModItems.IRON_ORE_SLAB);
          output.accept(ModItems.LAPIS_ORE_SLAB);
          output.accept(ModItems.NETHER_GOLD_ORE_SLAB);
          output.accept(ModItems.NETHER_QUARTZ_ORE_SLAB);
          output.accept(ModItems.REDSTONE_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_COAL_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_COPPER_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_DIAMOND_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_EMERALD_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_GOLD_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_IRON_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_LAPIS_ORE_SLAB);
          output.accept(ModItems.DEEPSLATE_REDSTONE_ORE_SLAB);

          // Stone/underground/nether
          output.accept(ModItems.BASALT_SLAB);
          output.accept(ModItems.CALCITE_SLAB);
          output.accept(ModItems.DRIPSTONE_BLOCK_SLAB);
          output.accept(ModItems.GILDED_BLACKSTONE_SLAB);
          output.accept(ModItems.GLOWSTONE_SLAB);
          output.accept(ModItems.LODESTONE_SLAB);
          output.accept(ModItems.MAGMA_BLOCK_SLAB);
          output.accept(ModItems.NETHERRACK_SLAB);
          output.accept(ModItems.OBSIDIAN_SLAB);
          output.accept(ModItems.POLISHED_BASALT_SLAB);
          output.accept(ModItems.QUARTZ_BRICKS_SLAB);

          // Stone — chiseled / cracked / special
          output.accept(ModItems.END_STONE_SLAB);
          output.accept(ModItems.SMOOTH_BASALT_SLAB);
          output.accept(ModItems.CHISELED_STONE_BRICKS_SLAB);
          output.accept(ModItems.CRACKED_STONE_BRICKS_SLAB);
          output.accept(ModItems.CHISELED_DEEPSLATE_SLAB);
          output.accept(ModItems.CRACKED_DEEPSLATE_BRICKS_SLAB);
          output.accept(ModItems.CRACKED_DEEPSLATE_TILES_SLAB);
          output.accept(ModItems.CHISELED_NETHER_BRICKS_SLAB);
          output.accept(ModItems.CRACKED_NETHER_BRICKS_SLAB);
          output.accept(ModItems.CHISELED_POLISHED_BLACKSTONE_SLAB);
          output.accept(ModItems.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB);
          output.accept(ModItems.CHISELED_RESIN_BRICKS_SLAB);

          // Decorative stone
          output.accept(ModItems.BONE_BLOCK_SLAB);
          output.accept(ModItems.PURPUR_PILLAR_SLAB);
          output.accept(ModItems.QUARTZ_PILLAR_SLAB);
          output.accept(ModItems.TERRACOTTA_SLAB);

          // Terrain
          output.accept(ModItems.DIRT_SLAB);
          output.accept(ModItems.COARSE_DIRT_SLAB);
          output.accept(ModItems.GRASS_BLOCK_SLAB);
          output.accept(ModItems.GRAVEL_SLAB);
          output.accept(ModItems.SAND_SLAB);
          output.accept(ModItems.RED_SAND_SLAB);

          // Earthy/soft
          output.accept(ModItems.CLAY_SLAB);
          output.accept(ModItems.MUD_SLAB);
          output.accept(ModItems.ROOTED_DIRT_SLAB);
          output.accept(ModItems.SOUL_SOIL_SLAB);

          // Natural/functional
          output.accept(ModItems.BEDROCK_SLAB);
          output.accept(ModItems.SCULK_SLAB);
          output.accept(ModItems.AMETHYST_BLOCK_SLAB);
          output.accept(ModItems.BUDDING_AMETHYST_SLAB);
          output.accept(ModItems.ICE_SLAB);
          output.accept(ModItems.PACKED_ICE_SLAB);
          output.accept(ModItems.BLUE_ICE_SLAB);
          output.accept(ModItems.SNOW_BLOCK_SLAB);
          output.accept(ModItems.SPONGE_SLAB);
          output.accept(ModItems.WET_SPONGE_SLAB);

          // Nether/light
          output.accept(ModItems.SOUL_SAND_SLAB);
          output.accept(ModItems.NETHER_WART_BLOCK_SLAB);
          output.accept(ModItems.WARPED_WART_BLOCK_SLAB);
          output.accept(ModItems.SHROOMLIGHT_SLAB);
          output.accept(ModItems.SEA_LANTERN_SLAB);

          // Misc
          output.accept(ModItems.REDSTONE_BLOCK_SLAB);
          output.accept(ModItems.REDSTONE_LAMP_SLAB);
          output.accept(ModItems.HONEYCOMB_BLOCK_SLAB);
          output.accept(ModItems.PACKED_MUD_SLAB);
          output.accept(ModItems.CRYING_OBSIDIAN_SLAB);
          output.accept(ModItems.NOTE_BLOCK_SLAB);

          // Organic/plant
          output.accept(ModItems.MOSS_BLOCK_SLAB);
          output.accept(ModItems.PALE_MOSS_BLOCK_SLAB);
          output.accept(ModItems.RESIN_BLOCK_SLAB);

          // Leaves
          output.accept(ModItems.AZALEA_LEAVES_SLAB);
          output.accept(ModItems.FLOWERING_AZALEA_LEAVES_SLAB);

          // Mushroom blocks
          output.accept(ModItems.BROWN_MUSHROOM_BLOCK_SLAB);
          output.accept(ModItems.RED_MUSHROOM_BLOCK_SLAB);
          output.accept(ModItems.MUSHROOM_STEM_SLAB);

          // Wood/fungal
          output.accept(ModItems.BAMBOO_BLOCK_SLAB);
          output.accept(ModItems.CRIMSON_HYPHAE_SLAB);
          output.accept(ModItems.STRIPPED_BAMBOO_BLOCK_SLAB);
          output.accept(ModItems.STRIPPED_CRIMSON_HYPHAE_SLAB);
          output.accept(ModItems.STRIPPED_WARPED_HYPHAE_SLAB);
          output.accept(ModItems.WARPED_HYPHAE_SLAB);

          // Copper (block/raw)
          output.accept(ModItems.COPPER_BLOCK_SLAB);
          output.accept(ModItems.EXPOSED_COPPER_SLAB);
          output.accept(ModItems.OXIDIZED_COPPER_SLAB);
          output.accept(ModItems.WEATHERED_COPPER_SLAB);
          output.accept(ModItems.CHISELED_COPPER_SLAB);
          output.accept(ModItems.EXPOSED_CHISELED_COPPER_SLAB);
          output.accept(ModItems.OXIDIZED_CHISELED_COPPER_SLAB);
          output.accept(ModItems.WEATHERED_CHISELED_COPPER_SLAB);
          output.accept(ModItems.COPPER_BULB_SLAB);
          output.accept(ModItems.EXPOSED_COPPER_BULB_SLAB);
          output.accept(ModItems.OXIDIZED_COPPER_BULB_SLAB);
          output.accept(ModItems.WEATHERED_COPPER_BULB_SLAB);

          // Copper grates
          output.accept(ModItems.COPPER_GRATE_SLAB);
          output.accept(ModItems.EXPOSED_COPPER_GRATE_SLAB);
          output.accept(ModItems.OXIDIZED_COPPER_GRATE_SLAB);
          output.accept(ModItems.WEATHERED_COPPER_GRATE_SLAB);

          // Coral blocks
          output.accept(ModItems.BRAIN_CORAL_BLOCK_SLAB);
          output.accept(ModItems.BUBBLE_CORAL_BLOCK_SLAB);
          output.accept(ModItems.FIRE_CORAL_BLOCK_SLAB);
          output.accept(ModItems.HORN_CORAL_BLOCK_SLAB);
          output.accept(ModItems.TUBE_CORAL_BLOCK_SLAB);
          output.accept(ModItems.DEAD_BRAIN_CORAL_BLOCK_SLAB);
          output.accept(ModItems.DEAD_BUBBLE_CORAL_BLOCK_SLAB);
          output.accept(ModItems.DEAD_FIRE_CORAL_BLOCK_SLAB);
          output.accept(ModItems.DEAD_HORN_CORAL_BLOCK_SLAB);
          output.accept(ModItems.DEAD_TUBE_CORAL_BLOCK_SLAB);

          // Wool
          output.accept(ModItems.WHITE_WOOL_SLAB);
          output.accept(ModItems.ORANGE_WOOL_SLAB);
          output.accept(ModItems.MAGENTA_WOOL_SLAB);
          output.accept(ModItems.LIGHT_BLUE_WOOL_SLAB);
          output.accept(ModItems.YELLOW_WOOL_SLAB);
          output.accept(ModItems.LIME_WOOL_SLAB);
          output.accept(ModItems.PINK_WOOL_SLAB);
          output.accept(ModItems.GRAY_WOOL_SLAB);
          output.accept(ModItems.LIGHT_GRAY_WOOL_SLAB);
          output.accept(ModItems.CYAN_WOOL_SLAB);
          output.accept(ModItems.PURPLE_WOOL_SLAB);
          output.accept(ModItems.BLUE_WOOL_SLAB);
          output.accept(ModItems.BROWN_WOOL_SLAB);
          output.accept(ModItems.GREEN_WOOL_SLAB);
          output.accept(ModItems.RED_WOOL_SLAB);
          output.accept(ModItems.BLACK_WOOL_SLAB);

          // Concrete
          output.accept(ModItems.WHITE_CONCRETE_SLAB);
          output.accept(ModItems.ORANGE_CONCRETE_SLAB);
          output.accept(ModItems.MAGENTA_CONCRETE_SLAB);
          output.accept(ModItems.LIGHT_BLUE_CONCRETE_SLAB);
          output.accept(ModItems.YELLOW_CONCRETE_SLAB);
          output.accept(ModItems.LIME_CONCRETE_SLAB);
          output.accept(ModItems.PINK_CONCRETE_SLAB);
          output.accept(ModItems.GRAY_CONCRETE_SLAB);
          output.accept(ModItems.LIGHT_GRAY_CONCRETE_SLAB);
          output.accept(ModItems.CYAN_CONCRETE_SLAB);
          output.accept(ModItems.PURPLE_CONCRETE_SLAB);
          output.accept(ModItems.BLUE_CONCRETE_SLAB);
          output.accept(ModItems.BROWN_CONCRETE_SLAB);
          output.accept(ModItems.GREEN_CONCRETE_SLAB);
          output.accept(ModItems.RED_CONCRETE_SLAB);
          output.accept(ModItems.BLACK_CONCRETE_SLAB);

          // Concrete powder
          output.accept(ModItems.WHITE_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.ORANGE_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.MAGENTA_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.LIGHT_BLUE_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.YELLOW_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.LIME_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.PINK_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.GRAY_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.LIGHT_GRAY_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.CYAN_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.PURPLE_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.BLUE_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.BROWN_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.GREEN_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.RED_CONCRETE_POWDER_SLAB);
          output.accept(ModItems.BLACK_CONCRETE_POWDER_SLAB);

          // Glass / stained glass
          output.accept(ModItems.GLASS_SLAB);
          output.accept(ModItems.TINTED_GLASS_SLAB);
          output.accept(ModItems.WHITE_STAINED_GLASS_SLAB);
          output.accept(ModItems.ORANGE_STAINED_GLASS_SLAB);
          output.accept(ModItems.MAGENTA_STAINED_GLASS_SLAB);
          output.accept(ModItems.LIGHT_BLUE_STAINED_GLASS_SLAB);
          output.accept(ModItems.YELLOW_STAINED_GLASS_SLAB);
          output.accept(ModItems.LIME_STAINED_GLASS_SLAB);
          output.accept(ModItems.PINK_STAINED_GLASS_SLAB);
          output.accept(ModItems.GRAY_STAINED_GLASS_SLAB);
          output.accept(ModItems.LIGHT_GRAY_STAINED_GLASS_SLAB);
          output.accept(ModItems.CYAN_STAINED_GLASS_SLAB);
          output.accept(ModItems.PURPLE_STAINED_GLASS_SLAB);
          output.accept(ModItems.BLUE_STAINED_GLASS_SLAB);
          output.accept(ModItems.BROWN_STAINED_GLASS_SLAB);
          output.accept(ModItems.GREEN_STAINED_GLASS_SLAB);
          output.accept(ModItems.RED_STAINED_GLASS_SLAB);
          output.accept(ModItems.BLACK_STAINED_GLASS_SLAB);

          // Colored terracotta
          output.accept(ModItems.WHITE_TERRACOTTA_SLAB);
          output.accept(ModItems.ORANGE_TERRACOTTA_SLAB);
          output.accept(ModItems.MAGENTA_TERRACOTTA_SLAB);
          output.accept(ModItems.LIGHT_BLUE_TERRACOTTA_SLAB);
          output.accept(ModItems.YELLOW_TERRACOTTA_SLAB);
          output.accept(ModItems.LIME_TERRACOTTA_SLAB);
          output.accept(ModItems.PINK_TERRACOTTA_SLAB);
          output.accept(ModItems.GRAY_TERRACOTTA_SLAB);
          output.accept(ModItems.LIGHT_GRAY_TERRACOTTA_SLAB);
          output.accept(ModItems.CYAN_TERRACOTTA_SLAB);
          output.accept(ModItems.PURPLE_TERRACOTTA_SLAB);
          output.accept(ModItems.BLUE_TERRACOTTA_SLAB);
          output.accept(ModItems.BROWN_TERRACOTTA_SLAB);
          output.accept(ModItems.GREEN_TERRACOTTA_SLAB);
          output.accept(ModItems.RED_TERRACOTTA_SLAB);
          output.accept(ModItems.BLACK_TERRACOTTA_SLAB);

          // Glazed terracotta
          output.accept(ModItems.BLACK_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.BLUE_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.BROWN_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.CYAN_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.GRAY_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.GREEN_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.LIME_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.MAGENTA_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.ORANGE_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.PINK_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.PURPLE_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.RED_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.WHITE_GLAZED_TERRACOTTA_SLAB);
          output.accept(ModItems.YELLOW_GLAZED_TERRACOTTA_SLAB);

          // Infested blocks
          output.accept(ModItems.INFESTED_STONE_SLAB);
          output.accept(ModItems.INFESTED_COBBLESTONE_SLAB);
          output.accept(ModItems.INFESTED_STONE_BRICKS_SLAB);
          output.accept(ModItems.INFESTED_CRACKED_STONE_BRICKS_SLAB);
          output.accept(ModItems.INFESTED_CHISELED_STONE_BRICKS_SLAB);
          output.accept(ModItems.INFESTED_MOSSY_STONE_BRICKS_SLAB);
          output.accept(ModItems.INFESTED_DEEPSLATE_SLAB);

          // Waxed copper
          output.accept(ModItems.WAXED_COPPER_BLOCK_SLAB);
          output.accept(ModItems.WAXED_EXPOSED_COPPER_SLAB);
          output.accept(ModItems.WAXED_OXIDIZED_COPPER_SLAB);
          output.accept(ModItems.WAXED_WEATHERED_COPPER_SLAB);

          // Froglights
          output.accept(ModItems.OCHRE_FROGLIGHT_SLAB);
          output.accept(ModItems.PEARLESCENT_FROGLIGHT_SLAB);
          output.accept(ModItems.VERDANT_FROGLIGHT_SLAB);

          // Nylium
          output.accept(ModItems.CRIMSON_NYLIUM_SLAB);
          output.accept(ModItems.WARPED_NYLIUM_SLAB);

          // Wood logs/wood/leaves
          output.accept(ModItems.OAK_LOG_SLAB);
          output.accept(ModItems.OAK_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_OAK_LOG_SLAB);
          output.accept(ModItems.STRIPPED_OAK_WOOD_SLAB);
          output.accept(ModItems.OAK_LEAVES_SLAB);
          output.accept(ModItems.BIRCH_LOG_SLAB);
          output.accept(ModItems.BIRCH_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_BIRCH_LOG_SLAB);
          output.accept(ModItems.STRIPPED_BIRCH_WOOD_SLAB);
          output.accept(ModItems.BIRCH_LEAVES_SLAB);
          output.accept(ModItems.SPRUCE_LOG_SLAB);
          output.accept(ModItems.SPRUCE_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_SPRUCE_LOG_SLAB);
          output.accept(ModItems.STRIPPED_SPRUCE_WOOD_SLAB);
          output.accept(ModItems.SPRUCE_LEAVES_SLAB);
          output.accept(ModItems.JUNGLE_LOG_SLAB);
          output.accept(ModItems.JUNGLE_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_JUNGLE_LOG_SLAB);
          output.accept(ModItems.STRIPPED_JUNGLE_WOOD_SLAB);
          output.accept(ModItems.JUNGLE_LEAVES_SLAB);
          output.accept(ModItems.ACACIA_LOG_SLAB);
          output.accept(ModItems.ACACIA_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_ACACIA_LOG_SLAB);
          output.accept(ModItems.STRIPPED_ACACIA_WOOD_SLAB);
          output.accept(ModItems.ACACIA_LEAVES_SLAB);
          output.accept(ModItems.DARK_OAK_LOG_SLAB);
          output.accept(ModItems.DARK_OAK_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_DARK_OAK_LOG_SLAB);
          output.accept(ModItems.STRIPPED_DARK_OAK_WOOD_SLAB);
          output.accept(ModItems.DARK_OAK_LEAVES_SLAB);
          output.accept(ModItems.CHERRY_LOG_SLAB);
          output.accept(ModItems.CHERRY_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_CHERRY_LOG_SLAB);
          output.accept(ModItems.STRIPPED_CHERRY_WOOD_SLAB);
          output.accept(ModItems.CHERRY_LEAVES_SLAB);
          output.accept(ModItems.MANGROVE_LOG_SLAB);
          output.accept(ModItems.MANGROVE_WOOD_SLAB);
          output.accept(ModItems.STRIPPED_MANGROVE_LOG_SLAB);
          output.accept(ModItems.STRIPPED_MANGROVE_WOOD_SLAB);
          output.accept(ModItems.MANGROVE_LEAVES_SLAB);

          // Misc
          output.accept(ModItems.ANCIENT_DEBRIS_SLAB);
          output.accept(ModItems.BOOKSHELF_SLAB);
          output.accept(ModItems.CHISELED_QUARTZ_BLOCK_SLAB);
          output.accept(ModItems.CHISELED_RED_SANDSTONE_SLAB);
          output.accept(ModItems.CHISELED_SANDSTONE_SLAB);
          output.accept(ModItems.DEEPSLATE_SLAB);
          output.accept(ModItems.DRIED_KELP_BLOCK_SLAB);
          output.accept(ModItems.HAY_BLOCK_SLAB);
          output.accept(ModItems.HONEY_BLOCK_SLAB);
          output.accept(ModItems.LADDER_SLAB);
          output.accept(ModItems.MELON_SLAB);
          output.accept(ModItems.PUMPKIN_SLAB);
          output.accept(ModItems.SCAFFOLDING_SLAB);
          output.accept(ModItems.SCULK_CATALYST_SLAB);
          output.accept(ModItems.SLIME_BLOCK_SLAB);
          output.accept(ModItems.TNT_SLAB);
          output.accept(ModItems.TUFF_SLAB);
        }).build();
    consumer.accept(NEW_SLAB_VARIANTS, NewSlabVariants.id(Constants.MOD_ID));
  }
}
