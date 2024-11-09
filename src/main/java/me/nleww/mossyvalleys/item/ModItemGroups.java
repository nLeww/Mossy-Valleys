package me.nleww.mossyvalleys.item;

import me.nleww.mossyvalleys.MossyValleys;
import me.nleww.mossyvalleys.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOSSY_VALLEYS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MossyValleys.MOD_ID, "mossy_valleys"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.MOSS_GEM))
                    .displayName(Text.translatable("itemGroup.mossyvalleys.mossy_valleys"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MOSS_GEM);
                        entries.add(ModItems.MOSS_GEM_RELIC);
                        entries.add(ModItems.MOSS_CLUMP);
                        entries.add(ModItems.MOSSLING_SPAWN_EGG);
                        entries.add(ModItems.MOSSCOON_SPAWN_EGG);
                        entries.add(ModBlocks.MOSS_STONE);
                        entries.add(ModBlocks.MOSS_STONE_BRICKS);
                        entries.add(ModBlocks.MOSS_STONE_PILLAR);
                        entries.add(ModBlocks.CHISELED_MOSS_STONE);
                        entries.add(ModBlocks.MOSS_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSS_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSS_STONE_BRICK_WALL);

                    })
                    .build());


    public static void registerModItemGroups() {
        MossyValleys.LOGGER.info("Grouping all my moss!");
    }
}