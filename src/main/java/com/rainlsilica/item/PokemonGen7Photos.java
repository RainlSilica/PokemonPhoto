package com.rainlsilica.item;

import com.rainlsilica.PokemonPhoto;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PokemonGen7Photos {
    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PokemonPhoto.MOD_ID, id), item);
    }

    public static void registerModItems() {
        PokemonPhoto.LOGGER.info("Registering gen7 pokemon photos");
    }
}
