package net.travis.furnitura;

import net.fabricmc.api.ModInitializer;
import net.travis.furnitura.block.ModBlocks;
import net.travis.furnitura.item.ModItemGroup;
import net.travis.furnitura.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Furnitura implements ModInitializer {
	public static final String MOD_ID = "furnitura";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}