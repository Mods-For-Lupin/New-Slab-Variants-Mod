package io.github.jason13official.new_slab_variants;

import io.github.jason13official.new_slab_variants.platform.Services;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class NewSlabVariants {

  public static void init() {

    if (!Services.PLATFORM.isDevelopmentEnvironment()) {
      return;
    }

    AtomicInteger ai = new AtomicInteger();
    BuiltInRegistries.BLOCK.forEach(block -> {
      var key = BuiltInRegistries.BLOCK.getKey(block);
      if (key.getNamespace().equalsIgnoreCase(Constants.MOD_ID)) {
        ai.incrementAndGet();
      }
    });
    System.out.println(Constants.MOD_NAME + " registered " + ai.get() + " slabs.");
  }

  public static Identifier id(final String path) {
    return Identifier.fromNamespaceAndPath(Constants.MOD_ID, path);
  }
}