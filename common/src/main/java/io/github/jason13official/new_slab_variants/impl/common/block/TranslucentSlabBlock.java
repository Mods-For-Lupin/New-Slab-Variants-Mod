package io.github.jason13official.new_slab_variants.impl.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TranslucentSlabBlock extends SlabBlock {

  public TranslucentSlabBlock(Properties properties) {
    super(properties);
  }

  protected boolean skipRendering(BlockState state, BlockState neighborState, Direction direction) {
    return neighborState.is(this) ? true : super.skipRendering(state, neighborState, direction);
  }

  protected float getShadeBrightness(BlockState state, BlockGetter level, BlockPos pos) {
    return 1.0F;
  }

  protected boolean propagatesSkylightDown(BlockState state) {
    return true;
  }
}
