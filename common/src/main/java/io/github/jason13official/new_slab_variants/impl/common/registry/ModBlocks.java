package io.github.jason13official.new_slab_variants.impl.common.registry;

import io.github.jason13official.new_slab_variants.NewSlabVariants;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ModBlocks {

  /// REMOVE THIS EXAMPLE_BLOCK FIELD AND USAGES WHEN EDITING
  public static Block EXAMPLE_BLOCK;

  public static void register(BiConsumer<Block, Identifier> consumer) {

    EXAMPLE_BLOCK = construct("example_block", Block::new, BlockBehaviour.Properties.of(), consumer);
  }

  private static Block construct(String name, Function<Properties, Block> constructor, Properties properties, BiConsumer<Block, Identifier> consumer) {

    Identifier id = NewSlabVariants.id(name);
    Block block = constructor.apply(properties.setId(ResourceKey.create(Registries.BLOCK, id)));
    consumer.accept(block, id);
    return block;
  }
}
