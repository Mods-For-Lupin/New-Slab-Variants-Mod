package io.github.jason13official.new_slab_variants;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import java.util.List;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ARGB;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class NewSlabVariantsClientFabric implements ClientModInitializer {

  @Override
  public void onInitializeClient() {

    NewSlabVariantsClient.init();

    BlockColorRegistry.register(List.of(new BlockTintSource() {
          @Override
          public int color(BlockState state) {
            return GrassColor.get(0.5, 1.0);
          }

          @Override
          public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
            return BiomeColors.getAverageGrassColor(level, pos);
          }
        }),
        ModBlocks.GRASS_BLOCK_SLAB);
  }
}
