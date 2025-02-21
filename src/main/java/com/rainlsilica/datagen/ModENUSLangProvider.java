package com.rainlsilica.datagen;

import com.rainlsilica.item.PokemonPhotos;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLangProvider extends FabricLanguageProvider {
    public ModENUSLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.pokemon_photo", "Pokemon Photo");

        translationBuilder.add(PokemonPhotos.BULBASAUR_NORMAL, "Bulbasaur Normal");
        translationBuilder.add(PokemonPhotos.BULBASAUR_SHINY, "Bulbasaur Shiny");
        translationBuilder.add(PokemonPhotos.IVYSAUR_NORMAL, "Ivysaur Normal");
        translationBuilder.add(PokemonPhotos.IVYSAUR_SHINY, "Ivysaur Shiny");
        translationBuilder.add(PokemonPhotos.VENUSAUR_NORMAL, "Venusaur Normal");
        translationBuilder.add(PokemonPhotos.VENUSAUR_SHINY, "Venusaur Shiny");
        translationBuilder.add(PokemonPhotos.VENUSAUR_NORMAL_MEGA, "Venusaur Normal Mega");
        translationBuilder.add(PokemonPhotos.VENUSAUR_SHINY_MEGA, "Venusaur Shiny Mega");
        translationBuilder.add(PokemonPhotos.VENUSAUR_NORMAL_GIGANTAMAX, "Venusaur Shiny Gigantamax");
        translationBuilder.add(PokemonPhotos.VENUSAUR_SHINY_GIGANTAMAX, "Venusaur Shiny Gigantamax");
    }
}
