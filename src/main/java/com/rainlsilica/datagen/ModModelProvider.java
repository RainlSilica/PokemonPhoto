package com.rainlsilica.datagen;

import com.rainlsilica.item.PokemonPhotos;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PokemonPhotos.BULBASAUR_NORMAL, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.BULBASAUR_SHINY, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.IVYSAUR_NORMAL, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.IVYSAUR_SHINY, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.VENUSAUR_NORMAL, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.VENUSAUR_SHINY, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.VENUSAUR_NORMAL_MEGA, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.VENUSAUR_SHINY_MEGA, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.VENUSAUR_NORMAL_GIGANTAMAX, Models.GENERATED);
        itemModelGenerator.register(PokemonPhotos.VENUSAUR_SHINY_GIGANTAMAX, Models.GENERATED);
    }
}
