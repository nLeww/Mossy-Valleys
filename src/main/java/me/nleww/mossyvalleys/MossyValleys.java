package me.nleww.mossyvalleys;

import me.nleww.mossyvalleys.block.ModBlocks;
import me.nleww.mossyvalleys.item.ModItemGroups;
import me.nleww.mossyvalleys.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MossyValleys implements ModInitializer {
	public static final String MOD_ID = "mossyvalleys";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();
	}
}