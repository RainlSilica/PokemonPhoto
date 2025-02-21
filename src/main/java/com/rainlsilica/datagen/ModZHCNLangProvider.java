package com.rainlsilica.datagen;

import com.rainlsilica.item.PokemonPhotos;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLangProvider extends FabricLanguageProvider {
    public ModZHCNLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.pokemon_photo", "宝可梦照片");

        translationBuilder.add(PokemonPhotos.BULBASAUR_NORMAL, "普通妙蛙种子");
        translationBuilder.add(PokemonPhotos.BULBASAUR_SHINY, "闪光妙蛙种子");
        translationBuilder.add(PokemonPhotos.IVYSAUR_NORMAL, "普通妙蛙草");
        translationBuilder.add(PokemonPhotos.IVYSAUR_SHINY, "闪光妙蛙草");
        translationBuilder.add(PokemonPhotos.VENUSAUR_NORMAL, "普通妙蛙花");
        translationBuilder.add(PokemonPhotos.VENUSAUR_SHINY, "闪光妙蛙花");
        translationBuilder.add(PokemonPhotos.VENUSAUR_NORMAL_MEGA, "普通mega妙蛙花");
        translationBuilder.add(PokemonPhotos.VENUSAUR_SHINY_MEGA, "闪光mega妙蛙花");
        translationBuilder.add(PokemonPhotos.VENUSAUR_NORMAL_GIGANTAMAX, "普通超极巨化妙蛙花");
        translationBuilder.add(PokemonPhotos.VENUSAUR_SHINY_GIGANTAMAX, "闪光超极巨化妙蛙花");
    }
}
