package me.nleww.mossyvalleys.block;

import me.nleww.mossyvalleys.MossyValleys;
import me.nleww.mossyvalleys.block.custom.ChiseledMossBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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
    public static final Block MOSS_STONE = registerBlock("moss_stone",
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
    public static final Block CHISELED_MOSS_STONE = registerBlock("chiseled_moss_stone",
            new ChiseledMossBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
                    .strength(2.0F, 6.0F)
            ));

    public static final Block MOSS_STONE_BRICK_STAIRS = registerBlock("moss_stone_brick_stairs",
            new StairsBlock(ModBlocks.MOSS_STONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.MOSS_STONE_BRICKS)));

    public static final Block MOSS_STONE_BRICK_SLAB = registerBlock("moss_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSS_STONE_BRICKS)));

    public static final Block MOSS_STONE_BRICK_WALL = registerBlock("moss_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSS_STONE_BRICKS)));



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
            entries.add(ModBlocks.MOSS_STONE);
        });

    }
}
