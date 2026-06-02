package io.github.jason13official.new_slab_variants.platform;

import io.github.jason13official.new_slab_variants.platform.services.IRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Builder;

public class NeoForgeRegistryHelper implements IRegistryHelper {

  @Override
  public Builder tabBuilder() {
    return CreativeModeTab.builder();
  }
}
