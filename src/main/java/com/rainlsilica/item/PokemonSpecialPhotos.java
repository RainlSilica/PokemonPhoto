package com.rainlsilica.item;

import com.rainlsilica.PokemonPhoto;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PokemonSpecialPhotos {
    // special normal
    public static final Item HAT_PIKACHU_ORIGINAL = registerItems("hat_pikachu_original", new Item(new Item.Settings()));
    public static final Item HAT_PIKACHU_HOENN = registerItems("hat_pikachu_hoenn", new Item(new Item.Settings()));
    public static final Item HAT_PIKACHU_SINNOH = registerItems("hat_pikachu_sinnoh", new Item(new Item.Settings()));
    public static final Item HAT_PIKACHU_UNOVA = registerItems("hat_pikachu_unova", new Item(new Item.Settings()));
    public static final Item HAT_PIKACHU_KALOS = registerItems("hat_pikachu_kalos", new Item(new Item.Settings()));
    public static final Item HAT_PIKACHU_ALOLAN = registerItems("hat_pikachu_alolan", new Item(new Item.Settings()));
    public static final Item PIKACHU_POPSTAR = registerItems("pikachu_popstar", new Item(new Item.Settings()));
    public static final Item PIKACHU_PHD = registerItems("pikachu_phd", new Item(new Item.Settings()));
    public static final Item PIKACHU_LIBRE = registerItems("pikachu_libre", new Item(new Item.Settings()));
    public static final Item PIKACHU_BELLE = registerItems("pikachu_belle", new Item(new Item.Settings()));
    public static final Item PIKACHU_ROCKSTAR = registerItems("pikachu_rockstar", new Item(new Item.Settings()));
    public static final Item PICHU_SPIKY = registerItems("pichu_spiky", new Item(new Item.Settings()));
    public static final Item DIALGA_ORIGIN = registerItems("dialga_origin", new Item(new Item.Settings()));
    public static final Item GIRATINA_ORIGIN = registerItems("giratina_origin", new Item(new Item.Settings()));
    public static final Item PALKIA_ORIGIN = registerItems("palkia_origin", new Item(new Item.Settings()));
    // special shiny
    public static final Item PICHU_SPIKY_SHINY = registerItems("pichu_spiky_shiny", new Item(new Item.Settings()));
    public static final Item DIALGA_ORIGIN_SHINY = registerItems("dialga_origin_shiny", new Item(new Item.Settings()));
    public static final Item GIRATINA_ORIGIN_SHINY = registerItems("giratina_origin_shiny", new Item(new Item.Settings()));
    public static final Item PALKIA_ORIGIN_SHINY = registerItems("palkia_origin_shiny", new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PokemonPhoto.MOD_ID, id), item);
    }

    public static void registerModItems() {
        PokemonPhoto.LOGGER.info("Registering gen1 pokemon photos");
    }
}
