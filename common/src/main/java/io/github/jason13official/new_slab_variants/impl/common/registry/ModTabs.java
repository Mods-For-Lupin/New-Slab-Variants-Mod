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
        .icon(() -> new ItemStack(ModItems.EXAMPLE_BLOCK))
        .title(Component.translatable("itemGroup.newSlabVariants"))
        .displayItems((itemDisplayParameters, output) -> {
          output.accept(ModItems.EXAMPLE_BLOCK);
        }).build();
    consumer.accept(NEW_SLAB_VARIANTS, NewSlabVariants.id(Constants.MOD_ID));
  }
}
