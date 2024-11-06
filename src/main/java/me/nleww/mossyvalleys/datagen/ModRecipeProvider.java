package me.nleww.mossyvalleys.datagen;

import me.nleww.mossyvalleys.block.ModBlocks;
import me.nleww.mossyvalleys.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_STONE_BRICKS, ModBlocks.MOSS_STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MOSS_GEM_RELIC, 1)
                .pattern(" # ")
                .pattern("#C#")
                .pattern(" S ")
                .input('#', ModBlocks.MOSS_STONE)
                .input('C', ModItems.MOSS_CLUMP)
                .input('S', ModItems.MOSS_GEM)
                .criterion(hasItem(ModItems.MOSS_CLUMP),conditionsFromItem(ModItems.MOSS_CLUMP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_STONE_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', ModBlocks.MOSS_STONE_BRICKS)
                .criterion(hasItem(ModBlocks.MOSS_STONE_BRICKS),conditionsFromItem(ModBlocks.MOSS_STONE_BRICKS))
                .offerTo(exporter);

    }
}

