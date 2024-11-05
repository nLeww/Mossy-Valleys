package me.nleww.mossyvalleys.block;

import me.nleww.mossyvalleys.MossyValleys;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MOSS_STONE_BRICKS = registerBlock("moss_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(2.0F, 6.0F)
            ));
    public static final Block MOSS_STONE_PILLAR = registerBlock("moss_stone_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(2.0F, 6.0F)
            ));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MossyValleys.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MossyValleys.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MossyValleys.LOGGER.info("Shaping Moss Blocks");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.MOSS_STONE_BRICKS);
            entries.add(ModBlocks.MOSS_STONE_PILLAR);
        });

    }
}
