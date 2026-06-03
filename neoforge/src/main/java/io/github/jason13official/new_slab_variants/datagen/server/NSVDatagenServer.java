package io.github.jason13official.new_slab_variants.datagen.server;

import java.util.List;
import java.util.Set;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.data.event.GatherDataEvent.Client;

public class NSVDatagenServer {

  public static void init(Client event) {
    event.createProvider(NSVRecipeProvider::new);

    event.createProvider((output, registries) -> new LootTableProvider(
        output,
        Set.of(),
        List.of(new LootTableProvider.SubProviderEntry(NSVBlockLootProvider::new, LootContextParamSets.BLOCK)),
        registries
    ));

    event.createProvider((output, registries) -> new NSVBlockTagProvider(output, registries));
  }
}
