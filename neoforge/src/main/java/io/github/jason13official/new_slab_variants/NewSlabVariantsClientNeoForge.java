package io.github.jason13official.new_slab_variants;

import io.github.jason13official.new_slab_variants.datagen.client.NSVDatagenClient;
import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.renderer.BiomeColors;
// import net.minecraft.world.level.BlockAndTintGetter; // wrong import
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

public class NewSlabVariantsClientNeoForge {

  public NewSlabVariantsClientNeoForge(final IEventBus modEventBus) {

    modEventBus.addListener((Consumer<FMLClientSetupEvent>) event -> NewSlabVariantsClient.init());

    modEventBus.addListener(NSVDatagenClient::init);
    modEventBus.addListener(NewSlabVariantsClientNeoForge::registerBlockColorHandlers);
  }

  private static void registerBlockColorHandlers(RegisterColorHandlersEvent.BlockTintSources colors) {
    colors.register(
        List.of(new BlockTintSource() {
          @Override
          public int color(BlockState state) {
            return GrassColor.get(0.5, 1.0);
          }

          @Override
          public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
            return BiomeColors.getAverageGrassColor(level, pos);
          }
        }),
        ModBlocks.GRASS_BLOCK_SLAB
    );

    colors.register(List.of(BlockTintSources.constant(-10380959)), ModBlocks.SPRUCE_LEAVES_SLAB);
    colors.register(List.of(BlockTintSources.constant(-8345771)), ModBlocks.BIRCH_LEAVES_SLAB);
    colors.register(
        List.of(BlockTintSources.foliage()),
        ModBlocks.OAK_LEAVES_SLAB,
        ModBlocks.JUNGLE_LEAVES_SLAB,
        ModBlocks.ACACIA_LEAVES_SLAB,
        ModBlocks.DARK_OAK_LEAVES_SLAB,
        ModBlocks.MANGROVE_LEAVES_SLAB
    );
  }

  private static void registerItemColorHandlers(RegisterColorHandlersEvent.ItemTintSources event) {

    // event.register();

//    event.register(
//        List.of(new BlockTintSource() {
//          @Override
//          public int color(BlockState state) {
//            return GrassColor.get(0.5, 1.0);
//          }
//
//          @Override
//          public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
//            return BiomeColors.getAverageGrassColor(level, pos);
//          }
//        }),
//        ModBlocks.GRASS_BLOCK_SLAB
//    );
  }
}
