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

          output.accept(ModItems.BONE_BLOCK_SLAB);
          output.accept(ModItems.PURPUR_PILLAR_SLAB);
          output.accept(ModItems.QUARTZ_PILLAR_SLAB);
          output.accept(ModItems.TERRACOTTA_SLAB);

          output.accept(ModItems.CLAY_SLAB);
          output.accept(ModItems.MUD_SLAB);
          output.accept(ModItems.ROOTED_DIRT_SLAB);
          output.accept(ModItems.SOUL_SOIL_SLAB);

          output.accept(ModItems.MOSS_BLOCK_SLAB);
          output.accept(ModItems.PALE_MOSS_BLOCK_SLAB);
          output.accept(ModItems.RESIN_BLOCK_SLAB);

          output.accept(ModItems.BAMBOO_BLOCK_SLAB);
          output.accept(ModItems.CRIMSON_HYPHAE_SLAB);
          output.accept(ModItems.STRIPPED_BAMBOO_BLOCK_SLAB);
          output.accept(ModItems.STRIPPED_CRIMSON_HYPHAE_SLAB);
          output.accept(ModItems.STRIPPED_WARPED_HYPHAE_SLAB);
          output.accept(ModItems.WARPED_HYPHAE_SLAB);

          output.accept(ModItems.COPPER_GRATE_SLAB);
          output.accept(ModItems.EXPOSED_COPPER_GRATE_SLAB);
          output.accept(ModItems.OXIDIZED_COPPER_GRATE_SLAB);
          output.accept(ModItems.WEATHERED_COPPER_GRATE_SLAB);
        }).build();
    consumer.accept(NEW_SLAB_VARIANTS, NewSlabVariants.id(Constants.MOD_ID));
  }
}
