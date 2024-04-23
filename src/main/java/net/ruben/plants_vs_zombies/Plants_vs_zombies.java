package net.ruben.plants_vs_zombies;

import net.fabricmc.api.ModInitializer;

import net.ruben.plants_vs_zombies.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plants_vs_zombies implements ModInitializer {
	public static final String MOD_ID = "plants_vs_zombies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}