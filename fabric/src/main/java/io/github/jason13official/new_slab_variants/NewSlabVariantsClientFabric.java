package io.github.jason13official.new_slab_variants;

import net.fabricmc.api.ClientModInitializer;

public class NewSlabVariantsClientFabric implements ClientModInitializer {

  @Override
  public void onInitializeClient() {

    NewSlabVariantsClient.init();
  }
}
