package com.rainlsilica;

import com.rainlsilica.item.PokemonPhotoGroup;
import com.rainlsilica.item.PokemonGen1Photos;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonPhoto implements ModInitializer {
	public static final String MOD_ID = "pokemonphoto";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		PokemonGen1Photos.registerModItems();
		PokemonPhotoGroup.registerItemGroup();
		LOGGER.info("Hello Fabric world!");
	}
}