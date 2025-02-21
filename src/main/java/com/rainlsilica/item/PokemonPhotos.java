package com.rainlsilica.item;

import com.rainlsilica.PokemonPhoto;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PokemonPhotos {
    public static final Item BULBASAUR_NORMAL = registerItems("bulbasaur_normal", new Item(new Item.Settings()));
    public static final Item BULBASAUR_SHINY = registerItems("bulbasaur_shiny", new Item(new Item.Settings()));
    public static final Item IVYSAUR_NORMAL = registerItems("ivysaur_normal", new Item(new Item.Settings()));
    public static final Item IVYSAUR_SHINY = registerItems("ivysaur_shiny", new Item(new Item.Settings()));
    public static final Item VENUSAUR_NORMAL = registerItems("venusaur_normal", new Item(new Item.Settings()));
    public static final Item VENUSAUR_SHINY = registerItems("venusaur_shiny", new Item(new Item.Settings()));
    public static final Item VENUSAUR_NORMAL_MEGA = registerItems("venusaur_normal_mega", new Item(new Item.Settings()));
    public static final Item VENUSAUR_SHINY_MEGA = registerItems("venusaur_shiny_mega", new Item(new Item.Settings()));
    public static final Item VENUSAUR_NORMAL_GIGANTAMAX = registerItems("venusaur_normal_gigantamax", new Item(new Item.Settings()));
    public static final Item VENUSAUR_SHINY_GIGANTAMAX = registerItems("venusaur_shiny_gigantamax", new Item(new Item.Settings()));


    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PokemonPhoto.MOD_ID, id), item);
    }

    public static void registerModItems() {
        PokemonPhoto.LOGGER.info("Registering pokemon photos");
    }
}
