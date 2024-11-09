package me.nleww.mossyvalleys.item;

import me.nleww.mossyvalleys.MossyValleys;
import me.nleww.mossyvalleys.entity.ModEntities;
import me.nleww.mossyvalleys.item.custom.MossClumpItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item MOSS_GEM = registerItem("moss_gem", new Item(new Item.Settings()));
    public static final Item MOSS_GEM_RELIC = registerItem("moss_gem_relic", new Item(new Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
    ));
    public static final Item MOSS_CLUMP = registerItem("moss_clump", new MossClumpItem(new Item.Settings()
            .maxDamage(64)
    ));

    public static final Item MOSSLING_SPAWN_EGG = registerItem("mossling_spawn_egg",
            new SpawnEggItem(ModEntities.MOSSLING, 0x7F7F7F, 0x00FF00, new Item.Settings()));
    public static final Item MOSSCOON_SPAWN_EGG = registerItem("mosscoon_spawn_egg",
            new SpawnEggItem(ModEntities.MOSSCOON, 0x4F7F5F, 0x40FF30, new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MossyValleys.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MossyValleys.LOGGER.info("Implementing moss");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(MOSS_GEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(MOSS_GEM_RELIC));
    }
}
