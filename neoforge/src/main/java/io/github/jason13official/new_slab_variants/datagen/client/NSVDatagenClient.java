package io.github.jason13official.new_slab_variants.datagen.client;

import io.github.jason13official.new_slab_variants.datagen.server.NSVDatagenServer;
import net.neoforged.neoforge.data.event.GatherDataEvent.Client;

public class NSVDatagenClient {

  public static void init(Client event) {
    event.createProvider(NSVModelProvider::new);
    NSVDatagenServer.init(event);
  }
}
