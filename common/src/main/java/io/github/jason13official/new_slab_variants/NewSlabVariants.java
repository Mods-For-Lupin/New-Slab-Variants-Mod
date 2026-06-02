package io.github.jason13official.new_slab_variants;

import net.minecraft.resources.Identifier;

public class NewSlabVariants {

  public static void init() {
  }

  public static Identifier identifier(final String path) {
    return Identifier.fromNamespaceAndPath(Constants.MOD_ID, path);
  }
}