package io.github.jason13official.new_slab_variants.platform;

import io.github.jason13official.new_slab_variants.platform.services.IRegistryHelper;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Builder;

public class FabricRegistryHelper implements IRegistryHelper {

  @Override
  public Builder tabBuilder() {
    return FabricCreativeModeTab.builder();
  }
}
