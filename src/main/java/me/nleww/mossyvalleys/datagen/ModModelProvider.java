package me.nleww.mossyvalleys.datagen;

import me.nleww.mossyvalleys.block.ModBlocks;
import me.nleww.mossyvalleys.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerRotatable(ModBlocks.MOSS_STONE);
        blockStateModelGenerator.registerRotatable(ModBlocks.MOSS_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_MOSS_STONE);
        //Moss stone pillar is done manually cuz idk how to make a pillar here :(
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MOSS_CLUMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOSS_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOSS_GEM_RELIC, Models.HANDHELD);

    }
}