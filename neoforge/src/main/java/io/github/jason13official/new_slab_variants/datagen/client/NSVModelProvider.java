package io.github.jason13official.new_slab_variants.datagen.client;

import io.github.jason13official.new_slab_variants.impl.common.registry.ModBlocks;
import io.github.jason13official.new_slab_variants.impl.common.registry.ModItems;
import java.util.stream.Stream;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.renderer.block.dispatch.Variant;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;

public class NSVModelProvider extends ModelProvider {

  private static final Material MAGMA_TEX = new Material(
      Identifier.fromNamespaceAndPath("minecraft", "block/magma")
  );

  public NSVModelProvider(PackOutput output) {
    super(output, "new_slab_variants");
  }

  @Override
  protected Stream<? extends Holder<Block>> getKnownBlocks() {
    return Stream.of(
        ModBlocks.COAL_BLOCK_SLAB, ModBlocks.DIAMOND_BLOCK_SLAB, ModBlocks.EMERALD_BLOCK_SLAB,
        ModBlocks.GOLD_BLOCK_SLAB, ModBlocks.IRON_BLOCK_SLAB, ModBlocks.LAPIS_BLOCK_SLAB,
        ModBlocks.NETHERITE_BLOCK_SLAB, ModBlocks.RAW_COPPER_BLOCK_SLAB,
        ModBlocks.RAW_GOLD_BLOCK_SLAB, ModBlocks.RAW_IRON_BLOCK_SLAB,
        ModBlocks.BASALT_SLAB, ModBlocks.CALCITE_SLAB, ModBlocks.DRIPSTONE_BLOCK_SLAB,
        ModBlocks.GILDED_BLACKSTONE_SLAB, ModBlocks.GLOWSTONE_SLAB, ModBlocks.LODESTONE_SLAB,
        ModBlocks.MAGMA_BLOCK_SLAB, ModBlocks.NETHERRACK_SLAB, ModBlocks.OBSIDIAN_SLAB,
        ModBlocks.POLISHED_BASALT_SLAB, ModBlocks.QUARTZ_BRICKS_SLAB,
        ModBlocks.BONE_BLOCK_SLAB, ModBlocks.PURPUR_PILLAR_SLAB, ModBlocks.QUARTZ_PILLAR_SLAB,
        ModBlocks.TERRACOTTA_SLAB, ModBlocks.CLAY_SLAB, ModBlocks.MUD_SLAB,
        ModBlocks.ROOTED_DIRT_SLAB, ModBlocks.SOUL_SOIL_SLAB,
        ModBlocks.MOSS_BLOCK_SLAB, ModBlocks.PALE_MOSS_BLOCK_SLAB, ModBlocks.RESIN_BLOCK_SLAB,
        ModBlocks.BAMBOO_BLOCK_SLAB, ModBlocks.CRIMSON_HYPHAE_SLAB,
        ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB, ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB,
        ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB, ModBlocks.WARPED_HYPHAE_SLAB,
        ModBlocks.COPPER_GRATE_SLAB, ModBlocks.EXPOSED_COPPER_GRATE_SLAB,
        ModBlocks.OXIDIZED_COPPER_GRATE_SLAB, ModBlocks.WEATHERED_COPPER_GRATE_SLAB
    ).map(Block::builtInRegistryHolder);
  }

  @Override
  protected Stream<? extends Holder<Item>> getKnownItems() {
    return Stream.of(
        ModItems.COAL_BLOCK_SLAB, ModItems.DIAMOND_BLOCK_SLAB, ModItems.EMERALD_BLOCK_SLAB,
        ModItems.GOLD_BLOCK_SLAB, ModItems.IRON_BLOCK_SLAB, ModItems.LAPIS_BLOCK_SLAB,
        ModItems.NETHERITE_BLOCK_SLAB, ModItems.RAW_COPPER_BLOCK_SLAB,
        ModItems.RAW_GOLD_BLOCK_SLAB, ModItems.RAW_IRON_BLOCK_SLAB,
        ModItems.BASALT_SLAB, ModItems.CALCITE_SLAB, ModItems.DRIPSTONE_BLOCK_SLAB,
        ModItems.GILDED_BLACKSTONE_SLAB, ModItems.GLOWSTONE_SLAB, ModItems.LODESTONE_SLAB,
        ModItems.MAGMA_BLOCK_SLAB, ModItems.NETHERRACK_SLAB, ModItems.OBSIDIAN_SLAB,
        ModItems.POLISHED_BASALT_SLAB, ModItems.QUARTZ_BRICKS_SLAB,
        ModItems.BONE_BLOCK_SLAB, ModItems.PURPUR_PILLAR_SLAB, ModItems.QUARTZ_PILLAR_SLAB,
        ModItems.TERRACOTTA_SLAB, ModItems.CLAY_SLAB, ModItems.MUD_SLAB,
        ModItems.ROOTED_DIRT_SLAB, ModItems.SOUL_SOIL_SLAB,
        ModItems.MOSS_BLOCK_SLAB, ModItems.PALE_MOSS_BLOCK_SLAB, ModItems.RESIN_BLOCK_SLAB,
        ModItems.BAMBOO_BLOCK_SLAB, ModItems.CRIMSON_HYPHAE_SLAB,
        ModItems.STRIPPED_BAMBOO_BLOCK_SLAB, ModItems.STRIPPED_CRIMSON_HYPHAE_SLAB,
        ModItems.STRIPPED_WARPED_HYPHAE_SLAB, ModItems.WARPED_HYPHAE_SLAB,
        ModItems.COPPER_GRATE_SLAB, ModItems.EXPOSED_COPPER_GRATE_SLAB,
        ModItems.OXIDIZED_COPPER_GRATE_SLAB, ModItems.WEATHERED_COPPER_GRATE_SLAB
    ).map(Item::builtInRegistryHolder);
  }

  @Override
  protected void registerModels(BlockModelGenerators bg, ItemModelGenerators ig) {
    // Mineral/gem blocks (uniform cube texture)
    cubeSlab(bg, ModBlocks.COAL_BLOCK_SLAB,       Blocks.COAL_BLOCK);
    cubeSlab(bg, ModBlocks.DIAMOND_BLOCK_SLAB,    Blocks.DIAMOND_BLOCK);
    cubeSlab(bg, ModBlocks.EMERALD_BLOCK_SLAB,    Blocks.EMERALD_BLOCK);
    cubeSlab(bg, ModBlocks.GOLD_BLOCK_SLAB,       Blocks.GOLD_BLOCK);
    cubeSlab(bg, ModBlocks.IRON_BLOCK_SLAB,       Blocks.IRON_BLOCK);
    cubeSlab(bg, ModBlocks.LAPIS_BLOCK_SLAB,      Blocks.LAPIS_BLOCK);
    cubeSlab(bg, ModBlocks.NETHERITE_BLOCK_SLAB,  Blocks.NETHERITE_BLOCK);
    cubeSlab(bg, ModBlocks.RAW_COPPER_BLOCK_SLAB, Blocks.RAW_COPPER_BLOCK);
    cubeSlab(bg, ModBlocks.RAW_GOLD_BLOCK_SLAB,   Blocks.RAW_GOLD_BLOCK);
    cubeSlab(bg, ModBlocks.RAW_IRON_BLOCK_SLAB,   Blocks.RAW_IRON_BLOCK);

    // Stone/underground/nether (uniform)
    cubeSlab(bg, ModBlocks.CALCITE_SLAB,           Blocks.CALCITE);
    cubeSlab(bg, ModBlocks.DRIPSTONE_BLOCK_SLAB,   Blocks.DRIPSTONE_BLOCK);
    cubeSlab(bg, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
    cubeSlab(bg, ModBlocks.GLOWSTONE_SLAB,         Blocks.GLOWSTONE);
    cubeSlab(bg, ModBlocks.NETHERRACK_SLAB,        Blocks.NETHERRACK);
    cubeSlab(bg, ModBlocks.OBSIDIAN_SLAB,          Blocks.OBSIDIAN);
    cubeSlab(bg, ModBlocks.QUARTZ_BRICKS_SLAB,     Blocks.QUARTZ_BRICKS);
    cubeSlab(bg, ModBlocks.TERRACOTTA_SLAB,        Blocks.TERRACOTTA);
    // magma texture file is "magma", not "magma_block"
    cubeSlab(bg, ModBlocks.MAGMA_BLOCK_SLAB,       MAGMA_TEX, ModelLocationUtils.getModelLocation(Blocks.MAGMA_BLOCK));

    // Earthy/soft (uniform)
    cubeSlab(bg, ModBlocks.CLAY_SLAB,        Blocks.CLAY);
    cubeSlab(bg, ModBlocks.MUD_SLAB,         Blocks.MUD);
    cubeSlab(bg, ModBlocks.ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT);
    cubeSlab(bg, ModBlocks.SOUL_SOIL_SLAB,   Blocks.SOUL_SOIL);

    // Organic/plant (uniform)
    cubeSlab(bg, ModBlocks.MOSS_BLOCK_SLAB,      Blocks.MOSS_BLOCK);
    cubeSlab(bg, ModBlocks.PALE_MOSS_BLOCK_SLAB, Blocks.PALE_MOSS_BLOCK);
    cubeSlab(bg, ModBlocks.RESIN_BLOCK_SLAB,     Blocks.RESIN_BLOCK);

    // Column blocks with "_side" / "_top" textures
    columnSlab(bg, ModBlocks.BASALT_SLAB,          tex(Blocks.BASALT,          "_side"), tex(Blocks.BASALT,          "_top"), Blocks.BASALT);
    columnSlab(bg, ModBlocks.POLISHED_BASALT_SLAB, tex(Blocks.POLISHED_BASALT, "_side"), tex(Blocks.POLISHED_BASALT, "_top"), Blocks.POLISHED_BASALT);
    columnSlab(bg, ModBlocks.BONE_BLOCK_SLAB,      tex(Blocks.BONE_BLOCK,      "_side"), tex(Blocks.BONE_BLOCK,      "_top"), Blocks.BONE_BLOCK);
    columnSlab(bg, ModBlocks.LODESTONE_SLAB,       tex(Blocks.LODESTONE,       "_side"), tex(Blocks.LODESTONE,       "_top"), Blocks.LODESTONE);

    // Column blocks: base name = side texture, "_top" = top texture
    columnSlab(bg, ModBlocks.BAMBOO_BLOCK_SLAB,          tex(Blocks.BAMBOO_BLOCK),          tex(Blocks.BAMBOO_BLOCK,          "_top"), Blocks.BAMBOO_BLOCK);
    columnSlab(bg, ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB, tex(Blocks.STRIPPED_BAMBOO_BLOCK), tex(Blocks.STRIPPED_BAMBOO_BLOCK, "_top"), Blocks.STRIPPED_BAMBOO_BLOCK);
    columnSlab(bg, ModBlocks.QUARTZ_PILLAR_SLAB,         tex(Blocks.QUARTZ_PILLAR),         tex(Blocks.QUARTZ_PILLAR,         "_top"), Blocks.QUARTZ_PILLAR);
    columnSlab(bg, ModBlocks.PURPUR_PILLAR_SLAB,         tex(Blocks.PURPUR_PILLAR),         tex(Blocks.PURPUR_PILLAR,         "_top"), Blocks.PURPUR_PILLAR);

    // Hyphae: all faces use the corresponding stem texture
    cubeSlab(bg, ModBlocks.CRIMSON_HYPHAE_SLAB,          tex(Blocks.CRIMSON_STEM),          ModelLocationUtils.getModelLocation(Blocks.CRIMSON_HYPHAE));
    cubeSlab(bg, ModBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, tex(Blocks.STRIPPED_CRIMSON_STEM), ModelLocationUtils.getModelLocation(Blocks.STRIPPED_CRIMSON_HYPHAE));
    cubeSlab(bg, ModBlocks.WARPED_HYPHAE_SLAB,           tex(Blocks.WARPED_STEM),           ModelLocationUtils.getModelLocation(Blocks.WARPED_HYPHAE));
    cubeSlab(bg, ModBlocks.STRIPPED_WARPED_HYPHAE_SLAB,  tex(Blocks.STRIPPED_WARPED_STEM),  ModelLocationUtils.getModelLocation(Blocks.STRIPPED_WARPED_HYPHAE));

    // Copper grates (uniform texture per oxidation stage)
    cubeSlab(bg, ModBlocks.COPPER_GRATE_SLAB,          Blocks.COPPER_GRATE);
    cubeSlab(bg, ModBlocks.EXPOSED_COPPER_GRATE_SLAB,  Blocks.EXPOSED_COPPER_GRATE);
    cubeSlab(bg, ModBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);
    cubeSlab(bg, ModBlocks.OXIDIZED_COPPER_GRATE_SLAB, Blocks.OXIDIZED_COPPER_GRATE);
  }

  private static Material tex(Block block) {
    return TextureMapping.getBlockTexture(block);
  }

  private static Material tex(Block block, String suffix) {
    return TextureMapping.getBlockTexture(block, suffix);
  }

  private static MultiVariant mv(Identifier id) {
    return new MultiVariant(WeightedList.of(new Variant(id)));
  }

  private static void slabState(BlockModelGenerators bg, Block slab, TextureMapping mapping, Identifier fullModel) {
    Identifier bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, bg.modelOutput);
    Identifier top    = ModelTemplates.SLAB_TOP.create(slab, mapping, bg.modelOutput);
    bg.blockStateOutput.accept(
        MultiVariantGenerator.dispatch(slab)
            .with(PropertyDispatch.initial(BlockStateProperties.SLAB_TYPE)
                .select(SlabType.BOTTOM, mv(bottom))
                .select(SlabType.TOP,    mv(top))
                .select(SlabType.DOUBLE, mv(fullModel)))
    );
    bg.registerSimpleItemModel(slab, bottom);
  }

  private static void cubeSlab(BlockModelGenerators bg, Block slab, Block full) {
    Material t = tex(full);
    cubeSlab(bg, slab, t, ModelLocationUtils.getModelLocation(full));
  }

  private static void cubeSlab(BlockModelGenerators bg, Block slab, Material tex, Identifier fullModel) {
    slabState(bg, slab,
        new TextureMapping().put(TextureSlot.BOTTOM, tex).put(TextureSlot.TOP, tex).put(TextureSlot.SIDE, tex),
        fullModel);
  }

  private static void columnSlab(BlockModelGenerators bg, Block slab, Material side, Material top, Block full) {
    slabState(bg, slab,
        new TextureMapping().put(TextureSlot.SIDE, side).put(TextureSlot.BOTTOM, top).put(TextureSlot.TOP, top),
        ModelLocationUtils.getModelLocation(full));
  }
}
