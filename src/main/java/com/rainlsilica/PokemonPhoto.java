package com.rainlsilica;

import com.rainlsilica.item.*;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonPhoto implements ModInitializer {
	public static final String MOD_ID = "pokemonphoto";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		init();
		LOGGER.info("Hello Fabric world!");
	}

	private void init() {
		PokemonGen2Photos.registerModItems();
		PokemonGen1Photos.registerModItems();
		PokemonGen3Photos.registerModItems();
		PokemonGen4Photos.registerModItems();
		PokemonPhotoGroup.registerItemGroup();
	}
}