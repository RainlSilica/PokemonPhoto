package com.rainlsilica.item;

import com.rainlsilica.PokemonPhoto;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PokemonPhotoGroup {
    public static final ItemGroup SAO_RPG_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(PokemonPhoto.MOD_ID, "pokemon_photo"),
            ItemGroup.create(null, -1)
                    .displayName(Text.translatable("itemGroup.pokemon_photo"))
                    .icon(() -> new ItemStack(PokemonPhotos.BULBASAUR_NORMAL))
                    .entries(((displayContext, entries) -> {
                        entries.add(PokemonPhotos.BULBASAUR_NORMAL);
                        entries.add(PokemonPhotos.BULBASAUR_SHINY);
                        entries.add(PokemonPhotos.IVYSAUR_NORMAL);
                        entries.add(PokemonPhotos.IVYSAUR_SHINY);
                        entries.add(PokemonPhotos.VENUSAUR_NORMAL);
                        entries.add(PokemonPhotos.VENUSAUR_SHINY);
                        entries.add(PokemonPhotos.VENUSAUR_NORMAL_MEGA);
                        entries.add(PokemonPhotos.VENUSAUR_SHINY_MEGA);
                        entries.add(PokemonPhotos.VENUSAUR_NORMAL_GIGANTAMAX);
                        entries.add(PokemonPhotos.VENUSAUR_SHINY_GIGANTAMAX);
                    }))
                    .build());

    public static final void registerItemGroup() {
        PokemonPhoto.LOGGER.info("Registering PokemonPhoto Group");
    }
}
