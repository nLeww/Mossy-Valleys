package me.nleww.mossyvalleys.datagen;

import me.nleww.mossyvalleys.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                    .add(ModBlocks.MOSS_STONE)
                    .add(ModBlocks.MOSS_STONE_BRICKS)
                    .add(ModBlocks.MOSS_STONE_PILLAR)
                    .add(ModBlocks.CHISELED_MOSS_STONE)
                    .add(ModBlocks.MOSS_STONE_BRICK_STAIRS)
                    .add(ModBlocks.MOSS_STONE_BRICK_SLAB)
                    .add(ModBlocks.MOSS_STONE_BRICK_WALL);


        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.MOSS_STONE_BRICK_WALL);
    }

}
