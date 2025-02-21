package com.rainlsilica;

import com.rainlsilica.datagen.ModENUSLangProvider;
import com.rainlsilica.datagen.ModModelProvider;
import com.rainlsilica.datagen.ModZHCNLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PokemonPhotoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModENUSLangProvider::new);
		pack.addProvider(ModZHCNLangProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
