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
                    .icon(() -> new ItemStack(PokemonGen1Photos.BULBASAUR))
                    .entries(((displayContext, entries) -> {
                        // gen5 normal
                        entries.add(PokemonGen5Photos.VICTINI);
                        entries.add(PokemonGen5Photos.SNIVY);
                        entries.add(PokemonGen5Photos.SERVINE);
                        entries.add(PokemonGen5Photos.SERPERIOR);
                        entries.add(PokemonGen5Photos.TEPIG);
                        entries.add(PokemonGen5Photos.PIGNITE);
                        entries.add(PokemonGen5Photos.EMBOAR);
                        entries.add(PokemonGen5Photos.OSHAWOTT);
                        entries.add(PokemonGen5Photos.DEWOTT);
                        entries.add(PokemonGen5Photos.SAMUROTT);
                        entries.add(PokemonGen5Photos.PATRAT);
                        entries.add(PokemonGen5Photos.WATCHOG);
                        entries.add(PokemonGen5Photos.LILLIPUP);
                        entries.add(PokemonGen5Photos.HERDIER);
                        entries.add(PokemonGen5Photos.STOUTLAND);
                        entries.add(PokemonGen5Photos.PURRLOIN);
                        entries.add(PokemonGen5Photos.LIEPARD);
                        entries.add(PokemonGen5Photos.PANSAGE);
                        entries.add(PokemonGen5Photos.SIMISAGE);
                        entries.add(PokemonGen5Photos.PANSEAR);
                        entries.add(PokemonGen5Photos.SIMISEAR);
                        entries.add(PokemonGen5Photos.PANPOUR);
                        entries.add(PokemonGen5Photos.SIMIPOUR);
                        entries.add(PokemonGen5Photos.MUNNA);
                        entries.add(PokemonGen5Photos.MUSHARNA);
                        entries.add(PokemonGen5Photos.PIDOVE);
                        entries.add(PokemonGen5Photos.TRANQUILL);
                        entries.add(PokemonGen5Photos.UNFEZANT_MALE);
                        entries.add(PokemonGen5Photos.UNFEZANT_FEMALE);
                        entries.add(PokemonGen5Photos.BLITZLE);
                        entries.add(PokemonGen5Photos.ZEBSTRIKA);
                        entries.add(PokemonGen5Photos.ROGGENROLA);
                        entries.add(PokemonGen5Photos.BOLDORE);
                        entries.add(PokemonGen5Photos.GIGALITH);
                        entries.add(PokemonGen5Photos.WOOBAT);
                        entries.add(PokemonGen5Photos.SWOOBAT);
                        entries.add(PokemonGen5Photos.DRILBUR);
                        entries.add(PokemonGen5Photos.EXCADRILL);
                        entries.add(PokemonGen5Photos.AUDINO);
                        entries.add(PokemonGen5Photos.TIMBURR);
                        entries.add(PokemonGen5Photos.GURDURR);
                        entries.add(PokemonGen5Photos.CONKELDURR);
                        entries.add(PokemonGen5Photos.TYMPOLE);
                        entries.add(PokemonGen5Photos.PALPITOAD);
                        entries.add(PokemonGen5Photos.SEISMITOAD);
                        entries.add(PokemonGen5Photos.THROH);
                        entries.add(PokemonGen5Photos.SAWK);
                        entries.add(PokemonGen5Photos.SEWADDLE);
                        entries.add(PokemonGen5Photos.SWADLOON);
                        entries.add(PokemonGen5Photos.LEAVANNY);
                        entries.add(PokemonGen5Photos.VENIPEDE);
                        entries.add(PokemonGen5Photos.WHIRLIPED);
                        entries.add(PokemonGen5Photos.SCOLIPEDE);
                        entries.add(PokemonGen5Photos.COTTONEE);
                        entries.add(PokemonGen5Photos.WHIMSICOTT);
                        entries.add(PokemonGen5Photos.PETILIL);
                        entries.add(PokemonGen5Photos.LILLIGANT);
                        entries.add(PokemonGen5Photos.BASCULIN_BLUE);
                        entries.add(PokemonGen5Photos.BASCULIN_RED);
                        entries.add(PokemonGen5Photos.BASCULIN_WHITE);
                        entries.add(PokemonGen5Photos.SANDILE);
                        entries.add(PokemonGen5Photos.KROKOROK);
                        entries.add(PokemonGen5Photos.KROOKODILE);
                        entries.add(PokemonGen5Photos.DARUMAKA);
                        entries.add(PokemonGen5Photos.DARMANITAN_NORMAL);
                        entries.add(PokemonGen5Photos.DARMANITAN_ZEN);
                        entries.add(PokemonGen5Photos.MARACTUS);
                        entries.add(PokemonGen5Photos.DWEBBLE);
                        entries.add(PokemonGen5Photos.CRUSTLE);
                        entries.add(PokemonGen5Photos.SCRAGGY);
                        entries.add(PokemonGen5Photos.SCRAFTY);
                        entries.add(PokemonGen5Photos.SIGILYPH);
                        entries.add(PokemonGen5Photos.YAMASK);
                        entries.add(PokemonGen5Photos.COFAGRIGUS);
                        entries.add(PokemonGen5Photos.TIRTOUGA);
                        entries.add(PokemonGen5Photos.CARRACOSTA);
                        entries.add(PokemonGen5Photos.ARCHEN);
                        entries.add(PokemonGen5Photos.ARCHEOPS);
                        entries.add(PokemonGen5Photos.TRUBBISH);
                        entries.add(PokemonGen5Photos.GARBODOR);
                        entries.add(PokemonGen5Photos.ZORUA);
                        entries.add(PokemonGen5Photos.ZOROARK);
                        entries.add(PokemonGen5Photos.MINCCINO);
                        entries.add(PokemonGen5Photos.CINCCINO);
                        entries.add(PokemonGen5Photos.GOTHITA);
                        entries.add(PokemonGen5Photos.GOTHORITA);
                        entries.add(PokemonGen5Photos.GOTHITELLE);
                        entries.add(PokemonGen5Photos.SOLOSIS);
                        entries.add(PokemonGen5Photos.DUOSION);
                        entries.add(PokemonGen5Photos.REUNICLUS);
                        entries.add(PokemonGen5Photos.DUCKLETT);
                        entries.add(PokemonGen5Photos.SWANNA);
                        entries.add(PokemonGen5Photos.VANILLITE);
                        entries.add(PokemonGen5Photos.VANILLISH);
                        entries.add(PokemonGen5Photos.VANILLUXE);
                        entries.add(PokemonGen5Photos.DEERLING_SPRING);
                        entries.add(PokemonGen5Photos.DEERLING_SUMMER);
                        entries.add(PokemonGen5Photos.DEERLING_AUTUMN);
                        entries.add(PokemonGen5Photos.DEERLING_WINTER);
                        entries.add(PokemonGen5Photos.SAWSBUCK_SPRING);
                        entries.add(PokemonGen5Photos.SAWSBUCK_SUMMER);
                        entries.add(PokemonGen5Photos.SAWSBUCK_AUTUMN);
                        entries.add(PokemonGen5Photos.SAWSBUCK_WINTER);
                        entries.add(PokemonGen5Photos.EMOLGA);
                        entries.add(PokemonGen5Photos.KARRABLAST);
                        entries.add(PokemonGen5Photos.ESCAVALIER);
                        entries.add(PokemonGen5Photos.FOONGUS);
                        entries.add(PokemonGen5Photos.AMOONGUSS);
                        entries.add(PokemonGen5Photos.FRILLISH_MALE);
                        entries.add(PokemonGen5Photos.FRILLISH_FEMALE);
                        entries.add(PokemonGen5Photos.JELLICENT_MALE);
                        entries.add(PokemonGen5Photos.JELLICENT_FEMALE);
                        entries.add(PokemonGen5Photos.ALOMOMOLA);
                        entries.add(PokemonGen5Photos.JOLTIK);
                        entries.add(PokemonGen5Photos.GALVANTULA);
                        entries.add(PokemonGen5Photos.FERROSEED);
                        entries.add(PokemonGen5Photos.FERROTHORN);
                        entries.add(PokemonGen5Photos.KLINK);
                        entries.add(PokemonGen5Photos.KLANG);
                        entries.add(PokemonGen5Photos.KLINKLANG);
                        entries.add(PokemonGen5Photos.TYNAMO);
                        entries.add(PokemonGen5Photos.EELEKTRIK);
                        entries.add(PokemonGen5Photos.EELEKTROSS);
                        entries.add(PokemonGen5Photos.ELGYEM);
                        entries.add(PokemonGen5Photos.BEHEEYEM);
                        entries.add(PokemonGen5Photos.LITWICK);
                        entries.add(PokemonGen5Photos.LAMPENT);
                        entries.add(PokemonGen5Photos.CHANDELURE);
                        entries.add(PokemonGen5Photos.AXEW);
                        entries.add(PokemonGen5Photos.FRAXURE);
                        entries.add(PokemonGen5Photos.HAXORUS);
                        entries.add(PokemonGen5Photos.CUBCHOO);
                        entries.add(PokemonGen5Photos.BEARTIC);
                        entries.add(PokemonGen5Photos.CRYOGONAL);
                        entries.add(PokemonGen5Photos.SHELMET);
                        entries.add(PokemonGen5Photos.ACCELGOR);
                        entries.add(PokemonGen5Photos.STUNFISK);
                        entries.add(PokemonGen5Photos.MIENFOO);
                        entries.add(PokemonGen5Photos.MIENSHAO);
                        entries.add(PokemonGen5Photos.DRUDDIGON);
                        entries.add(PokemonGen5Photos.GOLETT);
                        entries.add(PokemonGen5Photos.GOLURK);
                        entries.add(PokemonGen5Photos.PAWNIARD);
                        entries.add(PokemonGen5Photos.BISHARP);
                        entries.add(PokemonGen5Photos.BOUFFALANT);
                        entries.add(PokemonGen5Photos.RUFFLET);
                        entries.add(PokemonGen5Photos.BRAVIARY);
                        entries.add(PokemonGen5Photos.VULLABY);
                        entries.add(PokemonGen5Photos.MANDIBUZZ);
                        entries.add(PokemonGen5Photos.HEATMOR);
                        entries.add(PokemonGen5Photos.DURANT);
                        entries.add(PokemonGen5Photos.DEINO);
                        entries.add(PokemonGen5Photos.ZWEILOUS);
                        entries.add(PokemonGen5Photos.HYDREIGON);
                        entries.add(PokemonGen5Photos.LARVESTA);
                        entries.add(PokemonGen5Photos.VOLCARONA);
                        entries.add(PokemonGen5Photos.COBALION);
                        entries.add(PokemonGen5Photos.TERRAKION);
                        entries.add(PokemonGen5Photos.VIRIZION);
                        entries.add(PokemonGen5Photos.TORNADUS_INCARNATE);
                        entries.add(PokemonGen5Photos.TORNADUS_THERIAN);
                        entries.add(PokemonGen5Photos.THUNDURUS_INCARNATE);
                        entries.add(PokemonGen5Photos.THUNDURUS_THERIAN);
                        entries.add(PokemonGen5Photos.RESHIRAM);
                        entries.add(PokemonGen5Photos.ZEKROM);
                        entries.add(PokemonGen5Photos.LANDORUS_INCARNATE);
                        entries.add(PokemonGen5Photos.LANDORUS_THERIAN);
                        entries.add(PokemonGen5Photos.KYUREM);
                        entries.add(PokemonGen5Photos.KYUREM_BLACK);
                        entries.add(PokemonGen5Photos.KYUREM_WHITE);
                        entries.add(PokemonGen5Photos.KELDEO_ORDINARY);
                        entries.add(PokemonGen5Photos.KELDEO_RESOLUTE);
                        entries.add(PokemonGen5Photos.MELOETTA_ARIA);
                        entries.add(PokemonGen5Photos.MELOETTA_PIROUETTE);
                        entries.add(PokemonGen5Photos.GENESECT_NORMAL);
                        entries.add(PokemonGen5Photos.GENESECT_BURN);
                        entries.add(PokemonGen5Photos.GENESECT_CHILL);
                        entries.add(PokemonGen5Photos.GENESECT_DOUSE);
                        entries.add(PokemonGen5Photos.GENESECT_SHOCK);
                        // gan5 shiny
                        entries.add(PokemonGen5Photos.VICTINI_SHINY);
                        entries.add(PokemonGen5Photos.SNIVY_SHINY);
                        entries.add(PokemonGen5Photos.SERVINE_SHINY);
                        entries.add(PokemonGen5Photos.SERPERIOR_SHINY);
                        entries.add(PokemonGen5Photos.TEPIG_SHINY);
                        entries.add(PokemonGen5Photos.PIGNITE_SHINY);
                        entries.add(PokemonGen5Photos.EMBOAR_SHINY);
                        entries.add(PokemonGen5Photos.OSHAWOTT_SHINY);
                        entries.add(PokemonGen5Photos.DEWOTT_SHINY);
                        entries.add(PokemonGen5Photos.SAMUROTT_SHINY);
                        entries.add(PokemonGen5Photos.PATRAT_SHINY);
                        entries.add(PokemonGen5Photos.WATCHOG_SHINY);
                        entries.add(PokemonGen5Photos.LILLIPUP_SHINY);
                        entries.add(PokemonGen5Photos.HERDIER_SHINY);
                        entries.add(PokemonGen5Photos.STOUTLAND_SHINY);
                        entries.add(PokemonGen5Photos.PURRLOIN_SHINY);
                        entries.add(PokemonGen5Photos.LIEPARD_SHINY);
                        entries.add(PokemonGen5Photos.PANSAGE_SHINY);
                        entries.add(PokemonGen5Photos.SIMISAGE_SHINY);
                        entries.add(PokemonGen5Photos.PANSEAR_SHINY);
                        entries.add(PokemonGen5Photos.SIMISEAR_SHINY);
                        entries.add(PokemonGen5Photos.PANPOUR_SHINY);
                        entries.add(PokemonGen5Photos.SIMIPOUR_SHINY);
                        entries.add(PokemonGen5Photos.MUNNA_SHINY);
                        entries.add(PokemonGen5Photos.MUSHARNA_SHINY);
                        entries.add(PokemonGen5Photos.PIDOVE_SHINY);
                        entries.add(PokemonGen5Photos.TRANQUILL_SHINY);
                        entries.add(PokemonGen5Photos.UNFEZANT_MALE_SHINY);
                        entries.add(PokemonGen5Photos.UNFEZANT_FEMALE_SHINY);
                        entries.add(PokemonGen5Photos.BLITZLE_SHINY);
                        entries.add(PokemonGen5Photos.ZEBSTRIKA_SHINY);
                        entries.add(PokemonGen5Photos.ROGGENROLA_SHINY);
                        entries.add(PokemonGen5Photos.BOLDORE_SHINY);
                        entries.add(PokemonGen5Photos.GIGALITH_SHINY);
                        entries.add(PokemonGen5Photos.WOOBAT_SHINY);
                        entries.add(PokemonGen5Photos.SWOOBAT_SHINY);
                        entries.add(PokemonGen5Photos.DRILBUR_SHINY);
                        entries.add(PokemonGen5Photos.EXCADRILL_SHINY);
                        entries.add(PokemonGen5Photos.AUDINO_SHINY);
                        entries.add(PokemonGen5Photos.TIMBURR_SHINY);
                        entries.add(PokemonGen5Photos.GURDURR_SHINY);
                        entries.add(PokemonGen5Photos.CONKELDURR_SHINY);
                        entries.add(PokemonGen5Photos.TYMPOLE_SHINY);
                        entries.add(PokemonGen5Photos.PALPITOAD_SHINY);
                        entries.add(PokemonGen5Photos.SEISMITOAD_SHINY);
                        entries.add(PokemonGen5Photos.THROH_SHINY);
                        entries.add(PokemonGen5Photos.SAWK_SHINY);
                        entries.add(PokemonGen5Photos.SEWADDLE_SHINY);
                        entries.add(PokemonGen5Photos.SWADLOON_SHINY);
                        entries.add(PokemonGen5Photos.LEAVANNY_SHINY);
                        entries.add(PokemonGen5Photos.VENIPEDE_SHINY);
                        entries.add(PokemonGen5Photos.WHIRLIPEDE_SHINY);
                        entries.add(PokemonGen5Photos.SCOLIPEDE_SHINY);
                        entries.add(PokemonGen5Photos.COTTONEE_SHINY);
                        entries.add(PokemonGen5Photos.WHIMSICOTT_SHINY);
                        entries.add(PokemonGen5Photos.PETILIL_SHINY);
                        entries.add(PokemonGen5Photos.LILLIGANT_SHINY);
                        entries.add(PokemonGen5Photos.BASCULIN_BLUE_SHINY);
                        entries.add(PokemonGen5Photos.BASCULIN_RED_SHINY);
                        entries.add(PokemonGen5Photos.BASCULIN_WHITE_SHINY);
                        entries.add(PokemonGen5Photos.SANDILE_SHINY);
                        entries.add(PokemonGen5Photos.KROKOROK_SHINY);
                        entries.add(PokemonGen5Photos.KROOKODILE_SHINY);
                        entries.add(PokemonGen5Photos.DARUMAKA_SHINY);
                        entries.add(PokemonGen5Photos.DARMANITAN_NORMAL_SHINY);
                        entries.add(PokemonGen5Photos.DARMANITAN_ZEN_SHINY);
                        entries.add(PokemonGen5Photos.MARACTUS_SHINY);
                        entries.add(PokemonGen5Photos.DWEBBLE_SHINY);
                        entries.add(PokemonGen5Photos.CRUSTLE_SHINY);
                        entries.add(PokemonGen5Photos.SCRAGGY_SHINY);
                        entries.add(PokemonGen5Photos.SCRAFTY_SHINY);
                        entries.add(PokemonGen5Photos.SIGILYPH_SHINY);
                        entries.add(PokemonGen5Photos.YAMASK_SHINY);
                        entries.add(PokemonGen5Photos.COFAGRIGUS_SHINY);
                        entries.add(PokemonGen5Photos.TIRTOUGA_SHINY);
                        entries.add(PokemonGen5Photos.CARRACOSTA_SHINY);
                        entries.add(PokemonGen5Photos.ARCHEN_SHINY);
                        entries.add(PokemonGen5Photos.ARCHEOPS_SHINY);
                        entries.add(PokemonGen5Photos.TRUBBISH_SHINY);
                        entries.add(PokemonGen5Photos.GARBODOR_SHINY);
                        entries.add(PokemonGen5Photos.ZORUA_SHINY);
                        entries.add(PokemonGen5Photos.ZOROARK_SHINY);
                        entries.add(PokemonGen5Photos.MINCCINO_SHINY);
                        entries.add(PokemonGen5Photos.CINCCINO_SHINY);
                        entries.add(PokemonGen5Photos.GOTHITA_SHINY);
                        entries.add(PokemonGen5Photos.GOTHORITA_SHINY);
                        entries.add(PokemonGen5Photos.GOTHITELLE_SHINY);
                        entries.add(PokemonGen5Photos.SOLOSIS_SHINY);
                        entries.add(PokemonGen5Photos.DUOSION_SHINY);
                        entries.add(PokemonGen5Photos.REUNICLUS_SHINY);
                        entries.add(PokemonGen5Photos.DUCKLETT_SHINY);
                        entries.add(PokemonGen5Photos.SWANNA_SHINY);
                        entries.add(PokemonGen5Photos.VANILLITE_SHINY);
                        entries.add(PokemonGen5Photos.VANILLISH_SHINY);
                        entries.add(PokemonGen5Photos.VANILLUXE_SHINY);
                        entries.add(PokemonGen5Photos.DEERLING_SPRING_SHINY);
                        entries.add(PokemonGen5Photos.DEERLING_SUMMER_SHINY);
                        entries.add(PokemonGen5Photos.DEERLING_AUTUMN_SHINY);
                        entries.add(PokemonGen5Photos.DEERLING_WINTER_SHINY);
                        entries.add(PokemonGen5Photos.SAWSBUCK_SPRING_SHINY);
                        entries.add(PokemonGen5Photos.SAWSBUCK_SUMMER_SHINY);
                        entries.add(PokemonGen5Photos.SAWSBUCK_AUTUMN_SHINY);
                        entries.add(PokemonGen5Photos.SAWSBUCK_WINTER_SHINY);
                        entries.add(PokemonGen5Photos.EMOLGA_SHINY);
                        entries.add(PokemonGen5Photos.KARRABLAST_SHINY);
                        entries.add(PokemonGen5Photos.ESCAVALIER_SHINY);
                        entries.add(PokemonGen5Photos.FOONGUS_SHINY);
                        entries.add(PokemonGen5Photos.AMOONGUSS_SHINY);
                        entries.add(PokemonGen5Photos.FRILLISH_MALE_SHINY);
                        entries.add(PokemonGen5Photos.FRILLISH_FEMALE_SHINY);
                        entries.add(PokemonGen5Photos.JELLICENT_MALE_SHINY);
                        entries.add(PokemonGen5Photos.JELLICENT_FEMALE_SHINY);
                        entries.add(PokemonGen5Photos.ALOMOMOLA_SHINY);
                        entries.add(PokemonGen5Photos.JOLTIK_SHINY);
                        entries.add(PokemonGen5Photos.GALVANTULA_SHINY);
                        entries.add(PokemonGen5Photos.FERROSEED_SHINY);
                        entries.add(PokemonGen5Photos.FERROTHORN_SHINY);
                        entries.add(PokemonGen5Photos.KLINK_SHINY);
                        entries.add(PokemonGen5Photos.KLANG_SHINY);
                        entries.add(PokemonGen5Photos.KLINKLANG_SHINY);
                        entries.add(PokemonGen5Photos.TYNAMO_SHINY);
                        entries.add(PokemonGen5Photos.EELEKTRIK_SHINY);
                        entries.add(PokemonGen5Photos.EELEKTROSS_SHINY);
                        entries.add(PokemonGen5Photos.ELGYEM_SHINY);
                        entries.add(PokemonGen5Photos.BEHEEYEM_SHINY);
                        entries.add(PokemonGen5Photos.LITWICK_SHINY);
                        entries.add(PokemonGen5Photos.LAMPENT_SHINY);
                        entries.add(PokemonGen5Photos.CHANDELURE_SHINY);
                        entries.add(PokemonGen5Photos.AXEW_SHINY);
                        entries.add(PokemonGen5Photos.FRAXURE_SHINY);
                        entries.add(PokemonGen5Photos.HAXORUS_SHINY);
                        entries.add(PokemonGen5Photos.CUBCHOO_SHINY);
                        entries.add(PokemonGen5Photos.BEARTIC_SHINY);
                        entries.add(PokemonGen5Photos.CRYOGONAL_SHINY);
                        entries.add(PokemonGen5Photos.SHELMET_SHINY);
                        entries.add(PokemonGen5Photos.ACCELGOR_SHINY);
                        entries.add(PokemonGen5Photos.STUNFISK_SHINY);
                        entries.add(PokemonGen5Photos.MIENFOO_SHINY);
                        entries.add(PokemonGen5Photos.MIENSHAO_SHINY);
                        entries.add(PokemonGen5Photos.DRUDDIGON_SHINY);
                        entries.add(PokemonGen5Photos.GOLETT_SHINY);
                        entries.add(PokemonGen5Photos.GOLURK_SHINY);
                        entries.add(PokemonGen5Photos.PAWNIARD_SHINY);
                        entries.add(PokemonGen5Photos.BISHARP_SHINY);
                        entries.add(PokemonGen5Photos.BOUFFALANT_SHINY);
                        entries.add(PokemonGen5Photos.RUFFLET_SHINY);
                        entries.add(PokemonGen5Photos.BRAVIARY_SHINY);
                        entries.add(PokemonGen5Photos.VULLABY_SHINY);
                        entries.add(PokemonGen5Photos.MANDIBUZZ_SHINY);
                        entries.add(PokemonGen5Photos.HEATMOR_SHINY);
                        entries.add(PokemonGen5Photos.DURANT_SHINY);
                        entries.add(PokemonGen5Photos.DEINO_SHINY);
                        entries.add(PokemonGen5Photos.ZWEILOUS_SHINY);
                        entries.add(PokemonGen5Photos.HYDREIGON_SHINY);
                        entries.add(PokemonGen5Photos.LARVESTA_SHINY);
                        entries.add(PokemonGen5Photos.VOLCARONA_SHINY);
                        entries.add(PokemonGen5Photos.COBALION_SHINY);
                        entries.add(PokemonGen5Photos.TERRAKION_SHINY);
                        entries.add(PokemonGen5Photos.VIRIZION_SHINY);
                        entries.add(PokemonGen5Photos.TORNADUS_INCARNATE_SHINY);
                        entries.add(PokemonGen5Photos.TORNADUS_THERIAN_SHINY);
                        entries.add(PokemonGen5Photos.THUNDURUS_INCARNATE_SHINY);
                        entries.add(PokemonGen5Photos.THUNDURUS_THERIAN_SHINY);
                        entries.add(PokemonGen5Photos.RESHIRAM_SHINY);
                        entries.add(PokemonGen5Photos.ZEKROM_SHINY);
                        entries.add(PokemonGen5Photos.LANDORUS_INCARNATE_SHINY);
                        entries.add(PokemonGen5Photos.LANDORUS_THERIAN_SHINY);
                        entries.add(PokemonGen5Photos.KYUREM_SHINY);
                        entries.add(PokemonGen5Photos.KYUREM_BLACK_SHINY);
                        entries.add(PokemonGen5Photos.KYUREM_WHITE_SHINY);
                        entries.add(PokemonGen5Photos.KELDEO_ORDINARY_SHINY);
                        entries.add(PokemonGen5Photos.KELDEO_RESOLUTE_SHINY);
                        entries.add(PokemonGen5Photos.MELOETTA_ARIA_SHINY);
                        entries.add(PokemonGen5Photos.MELOETTA_PIROUETTE_SHINY);
                        entries.add(PokemonGen5Photos.GENESECT_NORMAL_SHINY);
                        entries.add(PokemonGen5Photos.GENESECT_BURN_SHINY);
                        entries.add(PokemonGen5Photos.GENESECT_CHILL_SHINY);
                        entries.add(PokemonGen5Photos.GENESECT_DOUSE_SHINY);
                        entries.add(PokemonGen5Photos.GENESECT_SHOCK_SHINY);
                    }))
                    .build());

    public static void registerItemGroup() {
        PokemonPhoto.LOGGER.info("Registering PokemonPhoto Group");
    }
}
