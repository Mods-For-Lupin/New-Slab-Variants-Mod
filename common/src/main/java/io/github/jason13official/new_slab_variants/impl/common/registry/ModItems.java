package io.github.jason13official.new_slab_variants.impl.common.registry;

import io.github.jason13official.new_slab_variants.NewSlabVariants;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

public class ModItems {

  /// REMOVE THIS EXAMPLE_BLOCK FIELD AND USAGES WHEN EDITING
  public static Item EXAMPLE_BLOCK;

  public static void register(BiConsumer<Item, Identifier> consumer) {

    EXAMPLE_BLOCK = construct("example_block", p -> new BlockItem(ModBlocks.EXAMPLE_BLOCK, p), new Properties(), consumer);
  }

  private static Item construct(String name, Function<Properties, Item> constructor, Properties properties, BiConsumer<Item, Identifier> consumer) {

    Identifier id = NewSlabVariants.id(name);
    Item block = constructor.apply(properties.setId(ResourceKey.create(Registries.ITEM, id)));
    consumer.accept(block, id);
    return block;
  }
}
