package io.github.jason13official.new_slab_variants;

import java.util.function.Consumer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class NewSlabVariantsClientNeoForge {

  public NewSlabVariantsClientNeoForge(final IEventBus modEventBus) {

    modEventBus.addListener((Consumer<FMLClientSetupEvent>) event -> NewSlabVariantsClient.init());
  }
}
