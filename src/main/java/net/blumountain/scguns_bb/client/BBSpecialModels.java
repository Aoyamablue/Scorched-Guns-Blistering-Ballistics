
package net.blumountain.scguns_bb.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.blumountain.scguns_bb.SCGunsBB.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public enum BBSpecialModels {
    //Strumm88
    STRUMM88_MAIN("strumm88/main"),
    STRUMM88_SIGHTS("strumm88/sights"),
    STRUMM88_BOLT("strumm88/bolt"),
    STRUMM88_STOCK_LIGHT("strumm88/light_stock"),
    STRUMM88_STOCK_HEAVY("strumm88/heavy_stock"),
    STRUMM88_STOCK_WOODEN("strumm88/wooden_stock"),
    STRUMM88_SILENCER("strumm88/silencer"),
    STRUMM88_ADVANCED_SILENCER("strumm88/advanced_silencer"),
    STRUMM88_MUZZLE_BRAKE("strumm88/muzzle_brake"),
    STRUMM88_GRIP_LIGHT("strumm88/light_grip"),
    STRUMM88_GRIP_VERTICAL("strumm88/tact_grip"),
    STRUMM88_IRON_BAYONET("strumm88/iron_bayonet"),
    STRUMM88_ANTHRALITE_BAYONET("strumm88/anthralite_bayonet"),
    STRUMM88_DIAMOND_BAYONET("strumm88/diamond_bayonet"),
    STRUMM88_NETHERITE_BAYONET("strumm88/netherite_bayonet"),
    STRUMM88_STANDARD_MAG("strumm88/stan_mag"),
    STRUMM88_EXTENDED_MAG("strumm88/ext_mag"),
    STRUMM88_SPEED_MAG("strumm88/speed_mag"),
    STRUMM88_STAN_BARREL("strumm88/stan_barrel"),
    STRUMM88_EXT_BARREL("strumm88/ext_barrel"),

    //Pipegun
    PIPEGUN_MAIN("pipegun/main"),
    PIPEGUN_SIGHTS("pipegun/sights"),
    PIPEGUN_NO_SIGHTS("pipegun/no_sights"),
    PIPEGUN_BOLT("pipegun/bolt"),
    PIPEGUN_STOCK_LIGHT("pipegun/light_stock"),
    PIPEGUN_STOCK_HEAVY("pipegun/heavy_stock"),
    PIPEGUN_STOCK_WOODEN("pipegun/wooden_stock"),
    PIPEGUN_SILENCER("pipegun/silencer"),
    PIPEGUN_ADVANCED_SILENCER("pipegun/advanced_silencer"),
    PIPEGUN_MUZZLE_BRAKE("pipegun/muzzle_brake"),
    PIPEGUN_GRIP_LIGHT("pipegun/light_grip"),
    PIPEGUN_GRIP_VERTICAL("pipegun/tact_grip"),
    PIPEGUN_IRON_BAYONET("pipegun/iron_bayonet"),
    PIPEGUN_ANTHRALITE_BAYONET("pipegun/anthralite_bayonet"),
    PIPEGUN_DIAMOND_BAYONET("pipegun/diamond_bayonet"),
    PIPEGUN_NETHERITE_BAYONET("pipegun/netherite_bayonet"),
    PIPEGUN_STANDARD_MAG("pipegun/stan_mag"),
    PIPEGUN_EXTENDED_MAG("pipegun/ext_mag"),
    PIPEGUN_SPEED_MAG("pipegun/speed_mag"),
    PIPEGUN_STAN_BARREL("pipegun/stan_barrel"),
    PIPEGUN_EXT_BARREL("pipegun/ext_barrel"),


    //Ambassador
    AMBASSADOR_MAIN("ambassador/main"),
    AMBASSADOR_BOLT("ambassador/bolt"),
    AMBASSADOR_STOCK_LIGHT("ambassador/light_stock"),
    AMBASSADOR_STOCK_HEAVY("ambassador/heavy_stock"),
    AMBASSADOR_STOCK_WOODEN("ambassador/wooden_stock"),
    AMBASSADOR_SILENCER("ambassador/silencer"),
    AMBASSADOR_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    AMBASSADOR_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    AMBASSADOR_GRIP_LIGHT("ambassador/light_grip"),
    AMBASSADOR_GRIP_VERTICAL("ambassador/tact_grip"),
    AMBASSADOR_IRON_BAYONET("ambassador/iron_bayonet"),
    AMBASSADOR_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    AMBASSADOR_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    AMBASSADOR_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    AMBASSADOR_STANDARD_MAG("ambassador/stan_mag"),
    AMBASSADOR_EXTENDED_MAG("ambassador/ext_mag"),
    AMBASSADOR_SPEED_MAG("ambassador/speed_mag"),
    AMBASSADOR_STAN_BARREL("ambassador/stan_barrel"),
    AMBASSADOR_EXT_BARREL("ambassador/ext_barrel"),

    //Big Betsy
    BIG_BETSY_MAIN("ambassador/main"),
    BIG_BETSY_BOLT("ambassador/bolt"),
    BIG_BETSY_STOCK_LIGHT("ambassador/light_stock"),
    BIG_BETSY_STOCK_HEAVY("ambassador/heavy_stock"),
    BIG_BETSY_STOCK_WOODEN("ambassador/wooden_stock"),
    BIG_BETSY_STAN_BARREL("ambassador/stan_barrel"),

    //Big Pipe
    BIG_PIPE_MAIN("ambassador/main"),

    //Cave Cleaner
    CAVE_CLEANER_MAIN("ambassador/main"),

    //Coral Hunter
    CORAL_HUNTER_MAIN("ambassador/main"),
    CORAL_HUNTER_BOLT("ambassador/bolt"),
    CORAL_HUNTER_STOCK_LIGHT("ambassador/light_stock"),
    CORAL_HUNTER_STOCK_HEAVY("ambassador/heavy_stock"),
    CORAL_HUNTER_STOCK_WOODEN("ambassador/wooden_stock"),
    CORAL_HUNTER_SILENCER("ambassador/silencer"),
    CORAL_HUNTER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    CORAL_HUNTER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    CORAL_HUNTER_GRIP_LIGHT("ambassador/light_grip"),
    CORAL_HUNTER_GRIP_VERTICAL("ambassador/tact_grip"),
    CORAL_HUNTER_IRON_BAYONET("ambassador/iron_bayonet"),
    CORAL_HUNTER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    CORAL_HUNTER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    CORAL_HUNTER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    CORAL_HUNTER_STAN_BARREL("ambassador/stan_barrel"),
    CORAL_HUNTER_EXT_BARREL("ambassador/ext_barrel"),

    //Door Knocker
    DOOR_KNOCKER_MAIN("ambassador/main"),
    DOOR_KNOCKER_STOCK_LIGHT("ambassador/light_stock"),
    DOOR_KNOCKER_STOCK_HEAVY("ambassador/heavy_stock"),
    DOOR_KNOCKER_STOCK_WOODEN("ambassador/wooden_stock"),

    //Ghast Swatter
    GHAST_SWATTER_MAIN("ambassador/main"),


    //Grunt Rifle
    GRUNT_RIFLE_MAIN("ambassador/main"),
    GRUNT_RIFLE_BOLT("ambassador/bolt"),
    GRUNT_RIFLE_STOCK_LIGHT("ambassador/light_stock"),
    GRUNT_RIFLE_STOCK_HEAVY("ambassador/heavy_stock"),
    GRUNT_RIFLE_STOCK_WOODEN("ambassador/wooden_stock"),
    GRUNT_RIFLE_SILENCER("ambassador/silencer"),
    GRUNT_RIFLE_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    GRUNT_RIFLE_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    GRUNT_RIFLE_GRIP_LIGHT("ambassador/light_grip"),
    GRUNT_RIFLE_GRIP_VERTICAL("ambassador/tact_grip"),
    GRUNT_RIFLE_IRON_BAYONET("ambassador/iron_bayonet"),
    GRUNT_RIFLE_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    GRUNT_RIFLE_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    GRUNT_RIFLE_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    GRUNT_RIFLE_STANDARD_MAG("ambassador/stan_mag"),
    GRUNT_RIFLE_EXTENDED_MAG("ambassador/ext_mag"),
    GRUNT_RIFLE_SPEED_MAG("ambassador/speed_mag"),
    GRUNT_RIFLE_STAN_BARREL("ambassador/stan_barrel"),
    GRUNT_RIFLE_EXT_BARREL("ambassador/ext_barrel"),

    //Haymaker
    HAYMAKER_MAIN("ambassador/main"),
    HAYMAKER_BOLT("ambassador/bolt"),
    HAYMAKER_STOCK_LIGHT("ambassador/light_stock"),
    HAYMAKER_STOCK_HEAVY("ambassador/heavy_stock"),
    HAYMAKER_STOCK_WOODEN("ambassador/wooden_stock"),
    HAYMAKER_SILENCER("ambassador/silencer"),
    HAYMAKER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    HAYMAKER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    HAYMAKER_GRIP_LIGHT("ambassador/light_grip"),
    HAYMAKER_GRIP_VERTICAL("ambassador/tact_grip"),
    HAYMAKER_IRON_BAYONET("ambassador/iron_bayonet"),
    HAYMAKER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    HAYMAKER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    HAYMAKER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    HAYMAKER_STAN_BARREL("ambassador/stan_barrel"),
    HAYMAKER_EXT_BARREL("ambassador/ext_barrel"),

    //Hog Tenderizer
    HOG_TENDERIZER_MAIN("ambassador/main"),
    HOG_TENDERIZER_BOLT("ambassador/bolt"),
    HOG_TENDERIZER_SILENCER("ambassador/silencer"),
    HOG_TENDERIZER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    HOG_TENDERIZER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    HOG_TENDERIZER_STANDARD_MAG("ambassador/stan_mag"),
    HOG_TENDERIZER_EXTENDED_MAG("ambassador/ext_mag"),
    HOG_TENDERIZER_SPEED_MAG("ambassador/speed_mag"),
    HOG_TENDERIZER_STAN_BARREL("ambassador/stan_barrel"),
    HOG_TENDERIZER_EXT_BARREL("ambassador/ext_barrel"),


    //Jungle Fighter
    JUNGLE_FIGHTER_MAIN("ambassador/main"),
    JUNGLE_FIGHTER_BOLT("ambassador/bolt"),
    JUNGLE_FIGHTER_STOCK_LIGHT("ambassador/light_stock"),
    JUNGLE_FIGHTER_STOCK_HEAVY("ambassador/heavy_stock"),
    JUNGLE_FIGHTER_STOCK_WOODEN("ambassador/wooden_stock"),
    JUNGLE_FIGHTER_SILENCER("ambassador/silencer"),
    JUNGLE_FIGHTER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    JUNGLE_FIGHTER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    JUNGLE_FIGHTER_GRIP_LIGHT("ambassador/light_grip"),
    JUNGLE_FIGHTER_GRIP_VERTICAL("ambassador/tact_grip"),
    JUNGLE_FIGHTER_IRON_BAYONET("ambassador/iron_bayonet"),
    JUNGLE_FIGHTER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    JUNGLE_FIGHTER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    JUNGLE_FIGHTER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    JUNGLE_FIGHTER_STANDARD_MAG("ambassador/stan_mag"),
    JUNGLE_FIGHTER_EXTENDED_MAG("ambassador/ext_mag"),
    JUNGLE_FIGHTER_SPEED_MAG("ambassador/speed_mag"),
    JUNGLE_FIGHTER_STAN_BARREL("ambassador/stan_barrel"),
    JUNGLE_FIGHTER_EXT_BARREL("ambassador/ext_barrel"),

    //L.A.M.P. SMG
    LAMP_SMG_MAIN("ambassador/main"),
    LAMP_SMG_BOLT("ambassador/bolt"),
    LAMP_SMG_SILENCER("ambassador/silencer"),
    LAMP_SMG_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    LAMP_SMG_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    LAMP_SMG_STANDARD_MAG("ambassador/stan_mag"),
    LAMP_SMG_EXTENDED_MAG("ambassador/ext_mag"),
    LAMP_SMG_SPEED_MAG("ambassador/speed_mag"),
    LAMP_SMG_STAN_BARREL("ambassador/stan_barrel"),
    LAMP_SMG_EXT_BARREL("ambassador/ext_barrel"),

    //M11 Pelagic
    M11_PELAGIC_MAIN("ambassador/main"),
    M11_PELAGIC_BOLT("ambassador/bolt"),
    M11_PELAGIC_STOCK_LIGHT("ambassador/light_stock"),
    M11_PELAGIC_STOCK_HEAVY("ambassador/heavy_stock"),
    M11_PELAGIC_STOCK_WOODEN("ambassador/wooden_stock"),
    M11_PELAGIC_SILENCER("ambassador/silencer"),
    M11_PELAGIC_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    M11_PELAGIC_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    M11_PELAGIC_GRIP_LIGHT("ambassador/light_grip"),
    M11_PELAGIC_GRIP_VERTICAL("ambassador/tact_grip"),
    M11_PELAGIC_IRON_BAYONET("ambassador/iron_bayonet"),
    M11_PELAGIC_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    M11_PELAGIC_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    M11_PELAGIC_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    M11_PELAGIC_STANDARD_MAG("ambassador/stan_mag"),
    M11_PELAGIC_EXTENDED_MAG("ambassador/ext_mag"),
    M11_PELAGIC_SPEED_MAG("ambassador/speed_mag"),
    M11_PELAGIC_STAN_BARREL("ambassador/stan_barrel"),
    M11_PELAGIC_EXT_BARREL("ambassador/ext_barrel"),

    //M3 Rifle
    M3_RIFLE_MAIN("ambassador/main"),
    M3_RIFLE_BOLT("ambassador/bolt"),
    M3_RIFLE_STOCK_LIGHT("ambassador/light_stock"),
    M3_RIFLE_STOCK_HEAVY("ambassador/heavy_stock"),
    M3_RIFLE_STOCK_WOODEN("ambassador/wooden_stock"),
    M3_RIFLE_SILENCER("ambassador/silencer"),
    M3_RIFLE_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    M3_RIFLE_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    M3_RIFLE_GRIP_LIGHT("ambassador/light_grip"),
    M3_RIFLE_GRIP_VERTICAL("ambassador/tact_grip"),
    M3_RIFLE_IRON_BAYONET("ambassador/iron_bayonet"),
    M3_RIFLE_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    M3_RIFLE_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    M3_RIFLE_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    M3_RIFLE_STANDARD_MAG("ambassador/stan_mag"),
    M3_RIFLE_EXTENDED_MAG("ambassador/ext_mag"),
    M3_RIFLE_SPEED_MAG("ambassador/speed_mag"),
    M3_RIFLE_STAN_BARREL("ambassador/stan_barrel"),
    M3_RIFLE_EXT_BARREL("ambassador/ext_barrel"),

    //M8 Benth
    M8_BENTH_MAIN("ambassador/main"),
    M8_BENTH_BOLT("ambassador/bolt"),
    M8_BENTH_STOCK_LIGHT("ambassador/light_stock"),
    M8_BENTH_STOCK_HEAVY("ambassador/heavy_stock"),
    M8_BENTH_STOCK_WOODEN("ambassador/wooden_stock"),
    M8_BENTH_SILENCER("ambassador/silencer"),
    M8_BENTH_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    M8_BENTH_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    M8_BENTH_GRIP_LIGHT("ambassador/light_grip"),
    M8_BENTH_GRIP_VERTICAL("ambassador/tact_grip"),
    M8_BENTH_IRON_BAYONET("ambassador/iron_bayonet"),
    M8_BENTH_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    M8_BENTH_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    M8_BENTH_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    M8_BENTH_STAN_BARREL("ambassador/stan_barrel"),
    M8_BENTH_EXT_BARREL("ambassador/ext_barrel"),

    //M922 Barrage
    M922_BARRAGE_MAIN("ambassador/main"),
    M922_BARRAGE_SIGHTS("pipegun/sights"),
    M922_BARRAGE_NO_SIGHTS("pipegun/no_sights"),

    //M928 Stormsurge
    M928_STORMSURGE_MAIN("ambassador/main"),
    M928_STORMSURGE_BOLT("ambassador/bolt"),
    M928_STORMSURGE_STOCK_LIGHT("ambassador/light_stock"),
    M928_STORMSURGE_STOCK_HEAVY("ambassador/heavy_stock"),
    M928_STORMSURGE_STOCK_WOODEN("ambassador/wooden_stock"),
    M928_STORMSURGE_SILENCER("ambassador/silencer"),
    M928_STORMSURGE_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    M928_STORMSURGE_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    M928_STORMSURGE_STANDARD_MAG("ambassador/stan_mag"),
    M928_STORMSURGE_EXTENDED_MAG("ambassador/ext_mag"),
    M928_STORMSURGE_SPEED_MAG("ambassador/speed_mag"),
    M928_STORMSURGE_STAN_BARREL("ambassador/stan_barrel"),
    M928_STORMSURGE_EXT_BARREL("ambassador/ext_barrel"),

    //Mad Minute
    MAD_MINUTE_MAIN("ambassador/main"),
    MAD_MINUTE_BOLT("ambassador/bolt"),
    MAD_MINUTE_STOCK_LIGHT("ambassador/light_stock"),
    MAD_MINUTE_STOCK_HEAVY("ambassador/heavy_stock"),
    MAD_MINUTE_STOCK_WOODEN("ambassador/wooden_stock"),
    MAD_MINUTE_SILENCER("ambassador/silencer"),
    MAD_MINUTE_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    MAD_MINUTE_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    MAD_MINUTE_GRIP_LIGHT("ambassador/light_grip"),
    MAD_MINUTE_GRIP_VERTICAL("ambassador/tact_grip"),
    MAD_MINUTE_IRON_BAYONET("ambassador/iron_bayonet"),
    MAD_MINUTE_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    MAD_MINUTE_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    MAD_MINUTE_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    MAD_MINUTE_STAN_BARREL("ambassador/stan_barrel"),
    MAD_MINUTE_EXT_BARREL("ambassador/ext_barrel"),

    //Metal Jacket Rifle
    METAL_JACKET_RIFLE_MAIN("ambassador/main"),
    METAL_JACKET_RIFLE_BOLT("ambassador/bolt"),
    METAL_JACKET_RIFLE_STOCK_LIGHT("ambassador/light_stock"),
    METAL_JACKET_RIFLE_STOCK_HEAVY("ambassador/heavy_stock"),
    METAL_JACKET_RIFLE_STOCK_WOODEN("ambassador/wooden_stock"),
    METAL_JACKET_RIFLE_SILENCER("ambassador/silencer"),
    METAL_JACKET_RIFLE_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    METAL_JACKET_RIFLE_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    METAL_JACKET_RIFLE_GRIP_LIGHT("ambassador/light_grip"),
    METAL_JACKET_RIFLE_GRIP_VERTICAL("ambassador/tact_grip"),
    METAL_JACKET_RIFLE_IRON_BAYONET("ambassador/iron_bayonet"),
    METAL_JACKET_RIFLE_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    METAL_JACKET_RIFLE_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    METAL_JACKET_RIFLE_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    METAL_JACKET_RIFLE_STANDARD_MAG("ambassador/stan_mag"),
    METAL_JACKET_RIFLE_EXTENDED_MAG("ambassador/ext_mag"),
    METAL_JACKET_RIFLE_SPEED_MAG("ambassador/speed_mag"),
    METAL_JACKET_RIFLE_STAN_BARREL("ambassador/stan_barrel"),
    METAL_JACKET_RIFLE_EXT_BARREL("ambassador/ext_barrel"),

    //Neptune Spear
    NEPTUNE_SPEAR_MAIN("ambassador/main"),
    NEPTUNE_SPEAR_BOLT("ambassador/bolt"),
    NEPTUNE_SPEAR_STOCK_LIGHT("ambassador/light_stock"),
    NEPTUNE_SPEAR_STOCK_HEAVY("ambassador/heavy_stock"),
    NEPTUNE_SPEAR_STOCK_WOODEN("ambassador/wooden_stock"),
    NEPTUNE_SPEAR_SILENCER("ambassador/silencer"),
    NEPTUNE_SPEAR_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    NEPTUNE_SPEAR_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    NEPTUNE_SPEAR_GRIP_LIGHT("ambassador/light_grip"),
    NEPTUNE_SPEAR_GRIP_VERTICAL("ambassador/tact_grip"),
    NEPTUNE_SPEAR_IRON_BAYONET("ambassador/iron_bayonet"),
    NEPTUNE_SPEAR_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    NEPTUNE_SPEAR_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    NEPTUNE_SPEAR_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    NEPTUNE_SPEAR_STANDARD_MAG("ambassador/stan_mag"),
    NEPTUNE_SPEAR_EXTENDED_MAG("ambassador/ext_mag"),
    NEPTUNE_SPEAR_SPEED_MAG("ambassador/speed_mag"),
    NEPTUNE_SPEAR_STAN_BARREL("ambassador/stan_barrel"),
    NEPTUNE_SPEAR_EXT_BARREL("ambassador/ext_barrel"),

    //Nether Fighter
    NETHER_FIGHTER_MAIN("ambassador/main"),
    NETHER_FIGHTER_RECEIVER("ambassador/bolt"),
    NETHER_FIGHTER_SILENCER("ambassador/silencer"),
    NETHER_FIGHTER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    NETHER_FIGHTER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    NETHER_FIGHTER_STANDARD_MAG("ambassador/stan_mag"),
    NETHER_FIGHTER_EXTENDED_MAG("ambassador/ext_mag"),
    NETHER_FIGHTER_SPEED_MAG("ambassador/speed_mag"),
    NETHER_FIGHTER_STAN_BARREL("ambassador/stan_barrel"),
    NETHER_FIGHTER_EXT_BARREL("ambassador/ext_barrel"),

    //Pest Control Shotgun
    PEST_CONTROL_SHOTGUN_MAIN("ambassador/main"),
    PEST_CONTROL_SHOTGUN_BOLT("ambassador/bolt"),
    PEST_CONTROL_SHOTGUN_STOCK_LIGHT("ambassador/light_stock"),
    PEST_CONTROL_SHOTGUN_STOCK_HEAVY("ambassador/heavy_stock"),
    PEST_CONTROL_SHOTGUN_STOCK_WOODEN("ambassador/wooden_stock"),
    PEST_CONTROL_SHOTGUN_SILENCER("ambassador/silencer"),
    PEST_CONTROL_SHOTGUN_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    PEST_CONTROL_SHOTGUN_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    PEST_CONTROL_SHOTGUN_GRIP_LIGHT("ambassador/light_grip"),
    PEST_CONTROL_SHOTGUN_GRIP_VERTICAL("ambassador/tact_grip"),
    PEST_CONTROL_SHOTGUN_IRON_BAYONET("ambassador/iron_bayonet"),
    PEST_CONTROL_SHOTGUN_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    PEST_CONTROL_SHOTGUN_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    PEST_CONTROL_SHOTGUN_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    PEST_CONTROL_SHOTGUN_STAN_BARREL("ambassador/stan_barrel"),
    PEST_CONTROL_SHOTGUN_EXT_BARREL("ambassador/ext_barrel"),

    //Pirate Thumper
    PIRATE_THUMPER_MAIN("ambassador/main"),
    PIRATE_THUMPER_BOLT("ambassador/bolt"),
    PIRATE_THUMPER_STOCK_LIGHT("ambassador/light_stock"),
    PIRATE_THUMPER_STOCK_HEAVY("ambassador/heavy_stock"),
    PIRATE_THUMPER_STOCK_WOODEN("ambassador/wooden_stock"),
    PIRATE_THUMPER_GRIP_LIGHT("ambassador/light_grip"),
    PIRATE_THUMPER_GRIP_VERTICAL("ambassador/tact_grip"),
    PIRATE_THUMPER_IRON_BAYONET("ambassador/iron_bayonet"),
    PIRATE_THUMPER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    PIRATE_THUMPER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    PIRATE_THUMPER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),

    //Republic Standard Issue
    REPUBLIC_STANDARD_MAIN("ambassador/main"),
    REPUBLIC_STANDARD_BOLT("ambassador/bolt"),
    REPUBLIC_STANDARD_STOCK_LIGHT("ambassador/light_stock"),
    REPUBLIC_STANDARD_STOCK_HEAVY("ambassador/heavy_stock"),
    REPUBLIC_STANDARD_STOCK_WOODEN("ambassador/wooden_stock"),
    REPUBLIC_STANDARD_SILENCER("ambassador/silencer"),
    REPUBLIC_STANDARD_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    REPUBLIC_STANDARD_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    REPUBLIC_STANDARD_GRIP_LIGHT("ambassador/light_grip"),
    REPUBLIC_STANDARD_GRIP_VERTICAL("ambassador/tact_grip"),
    REPUBLIC_STANDARD_IRON_BAYONET("ambassador/iron_bayonet"),
    REPUBLIC_STANDARD_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    REPUBLIC_STANDARD_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    REPUBLIC_STANDARD_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    REPUBLIC_STANDARD_STANDARD_MAG("ambassador/stan_mag"),
    REPUBLIC_STANDARD_EXTENDED_MAG("ambassador/ext_mag"),
    REPUBLIC_STANDARD_SPEED_MAG("ambassador/speed_mag"),
    REPUBLIC_STANDARD_STAN_BARREL("ambassador/stan_barrel"),
    REPUBLIC_STANDARD_EXT_BARREL("ambassador/ext_barrel"),


    //Sand Buster
    SAND_BUSTER_MAIN("ambassador/main"),
    SAND_BUSTER_BOLT("ambassador/bolt"),
    SAND_BUSTER_STOCK_LIGHT("ambassador/light_stock"),
    SAND_BUSTER_STOCK_HEAVY("ambassador/heavy_stock"),
    SAND_BUSTER_STOCK_WOODEN("ambassador/wooden_stock"),
    SAND_BUSTER_SILENCER("ambassador/silencer"),
    SAND_BUSTER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    SAND_BUSTER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    SAND_BUSTER_GRIP_LIGHT("ambassador/light_grip"),
    SAND_BUSTER_GRIP_VERTICAL("ambassador/tact_grip"),
    SAND_BUSTER_IRON_BAYONET("ambassador/iron_bayonet"),
    SAND_BUSTER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    SAND_BUSTER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    SAND_BUSTER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    SAND_BUSTER_STAN_BARREL("ambassador/stan_barrel"),
    SAND_BUSTER_EXT_BARREL("ambassador/ext_barrel"),

    //Sand Defender
    SAND_DEFENDER_MAIN("ambassador/main"),
    SAND_DEFENDER_RECEIVER("ambassador/bolt"),
    SAND_DEFENDER_SILENCER("ambassador/silencer"),
    SAND_DEFENDER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    SAND_DEFENDER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    SAND_DEFENDER_STANDARD_MAG("ambassador/stan_mag"),
    SAND_DEFENDER_EXTENDED_MAG("ambassador/ext_mag"),
    SAND_DEFENDER_SPEED_MAG("ambassador/speed_mag"),
    SAND_DEFENDER_STAN_BARREL("ambassador/stan_barrel"),
    SAND_DEFENDER_EXT_BARREL("ambassador/ext_barrel"),

    //Self Loading Rifle
    SELF_LOADING_RIFLE_MAIN("ambassador/main"),
    SELF_LOADING_RIFLE_BOLT("ambassador/bolt"),
    SELF_LOADING_RIFLE_STOCK_LIGHT("ambassador/light_stock"),
    SELF_LOADING_RIFLE_STOCK_HEAVY("ambassador/heavy_stock"),
    SELF_LOADING_RIFLE_STOCK_WOODEN("ambassador/wooden_stock"),
    SELF_LOADING_RIFLE_SILENCER("ambassador/silencer"),
    SELF_LOADING_RIFLE_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    SELF_LOADING_RIFLE_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    SELF_LOADING_RIFLE_GRIP_LIGHT("ambassador/light_grip"),
    SELF_LOADING_RIFLE_GRIP_VERTICAL("ambassador/tact_grip"),
    SELF_LOADING_RIFLE_IRON_BAYONET("ambassador/iron_bayonet"),
    SELF_LOADING_RIFLE_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    SELF_LOADING_RIFLE_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    SELF_LOADING_RIFLE_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    SELF_LOADING_RIFLE_STANDARD_MAG("ambassador/stan_mag"),
    SELF_LOADING_RIFLE_EXTENDED_MAG("ambassador/ext_mag"),
    SELF_LOADING_RIFLE_SPEED_MAG("ambassador/speed_mag"),
    SELF_LOADING_RIFLE_STAN_BARREL("ambassador/stan_barrel"),
    SELF_LOADING_RIFLE_EXT_BARREL("ambassador/ext_barrel"),

    //Tide Walker
    TIDE_WALKER_MAIN("ambassador/main"),
    TIDE_WALKER_BOLT("ambassador/bolt"),
    TIDE_WALKER_STOCK_LIGHT("ambassador/light_stock"),
    TIDE_WALKER_STOCK_HEAVY("ambassador/heavy_stock"),
    TIDE_WALKER_STOCK_WOODEN("ambassador/wooden_stock"),
    TIDE_WALKER_SILENCER("ambassador/silencer"),
    TIDE_WALKER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    TIDE_WALKER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    TIDE_WALKER_GRIP_LIGHT("ambassador/light_grip"),
    TIDE_WALKER_GRIP_VERTICAL("ambassador/tact_grip"),
    TIDE_WALKER_IRON_BAYONET("ambassador/iron_bayonet"),
    TIDE_WALKER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    TIDE_WALKER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    TIDE_WALKER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    TIDE_WALKER_STANDARD_MAG("ambassador/stan_mag"),
    TIDE_WALKER_EXTENDED_MAG("ambassador/ext_mag"),
    TIDE_WALKER_SPEED_MAG("ambassador/speed_mag"),
    TIDE_WALKER_STAN_BARREL("ambassador/stan_barrel"),
    TIDE_WALKER_EXT_BARREL("ambassador/ext_barrel"),

    //Top Break
    TOP_BREAK_MAIN("ambassador/main"),
    TOP_BREAK_DRUM("ambassador/bolt"),
    TOP_BREAK_HAMMER("ambassador/bolt"),
    TOP_BREAK_SILENCER("ambassador/silencer"),
    TOP_BREAK_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    TOP_BREAK_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    TOP_BREAK_STANDARD_MAG("ambassador/stan_mag"),
    TOP_BREAK_EXTENDED_MAG("ambassador/ext_mag"),
    TOP_BREAK_STAN_BARREL("ambassador/stan_barrel"),
    TOP_BREAK_EXT_BARREL("ambassador/ext_barrel"),

    //Top Loader
    TOP_LOADER_MAIN("ambassador/main"),
    TOP_LOADER_BOLT("ambassador/bolt"),
    TOP_LOADER_STOCK_LIGHT("ambassador/light_stock"),
    TOP_LOADER_STOCK_HEAVY("ambassador/heavy_stock"),
    TOP_LOADER_STOCK_WOODEN("ambassador/wooden_stock"),
    TOP_LOADER_SILENCER("ambassador/silencer"),
    TOP_LOADER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    TOP_LOADER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    TOP_LOADER_GRIP_LIGHT("ambassador/light_grip"),
    TOP_LOADER_GRIP_VERTICAL("ambassador/tact_grip"),
    TOP_LOADER_IRON_BAYONET("ambassador/iron_bayonet"),
    TOP_LOADER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    TOP_LOADER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    TOP_LOADER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    TOP_LOADER_STANDARD_MAG("ambassador/stan_mag"),
    TOP_LOADER_EXTENDED_MAG("ambassador/ext_mag"),
    TOP_LOADER_SPEED_MAG("ambassador/speed_mag"),
    TOP_LOADER_STAN_BARREL("ambassador/stan_barrel"),
    TOP_LOADER_EXT_BARREL("ambassador/ext_barrel"),

    //Trench Broom
    TRENCHBROOM_MAIN("ambassador/main"),
    TRENCHBROOM_BOLT("ambassador/bolt"),
    TRENCHBROOM_STOCK_LIGHT("ambassador/light_stock"),
    TRENCHBROOM_STOCK_HEAVY("ambassador/heavy_stock"),
    TRENCHBROOM_STOCK_WOODEN("ambassador/wooden_stock"),
    TRENCHBROOM_SILENCER("ambassador/silencer"),
    TRENCHBROOM_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    TRENCHBROOM_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    TRENCHBROOM_GRIP_LIGHT("ambassador/light_grip"),
    TRENCHBROOM_GRIP_VERTICAL("ambassador/tact_grip"),
    TRENCHBROOM_IRON_BAYONET("ambassador/iron_bayonet"),
    TRENCHBROOM_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    TRENCHBROOM_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    TRENCHBROOM_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    TRENCHBROOM_STAN_BARREL("ambassador/stan_barrel"),
    TRENCHBROOM_EXT_BARREL("ambassador/ext_barrel"),

    //Trilemma
    TRILEMMA_MAIN("ambassador/main"),
    TRILEMMA_BOLT("ambassador/bolt"),
    TRILEMMA_STOCK_LIGHT("ambassador/light_stock"),
    TRILEMMA_STOCK_HEAVY("ambassador/heavy_stock"),
    TRILEMMA_STOCK_WOODEN("ambassador/wooden_stock"),
    TRILEMMA_SILENCER("ambassador/silencer"),
    TRILEMMA_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    TRILEMMA_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    TRILEMMA_GRIP_LIGHT("ambassador/light_grip"),
    TRILEMMA_GRIP_VERTICAL("ambassador/tact_grip"),
    TRILEMMA_IRON_BAYONET("ambassador/iron_bayonet"),
    TRILEMMA_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    TRILEMMA_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    TRILEMMA_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    TRILEMMA_STANDARD_MAG("ambassador/stan_mag"),
    TRILEMMA_EXTENDED_MAG("ambassador/ext_mag"),
    TRILEMMA_SPEED_MAG("ambassador/speed_mag"),
    TRILEMMA_STAN_BARREL("ambassador/stan_barrel"),
    TRILEMMA_EXT_BARREL("ambassador/ext_barrel"),

    //Variable Control Shotgun
    VARIABLE_CONTROL_SHOTGUN_MAIN("ambassador/main"),
    VARIABLE_CONTROL_SHOTGUN_BOLT("ambassador/bolt"),
    VARIABLE_CONTROL_SHOTGUN_STOCK_LIGHT("ambassador/light_stock"),
    VARIABLE_CONTROL_SHOTGUN_STOCK_HEAVY("ambassador/heavy_stock"),
    VARIABLE_CONTROL_SHOTGUN_STOCK_WOODEN("ambassador/wooden_stock"),
    VARIABLE_CONTROL_SHOTGUN_SILENCER("ambassador/silencer"),
    VARIABLE_CONTROL_SHOTGUN_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    VARIABLE_CONTROL_SHOTGUN_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    VARIABLE_CONTROL_SHOTGUN_GRIP_LIGHT("ambassador/light_grip"),
    VARIABLE_CONTROL_SHOTGUN_GRIP_VERTICAL("ambassador/tact_grip"),
    VARIABLE_CONTROL_SHOTGUN_IRON_BAYONET("ambassador/iron_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_STAN_BARREL("ambassador/stan_barrel"),
    VARIABLE_CONTROL_SHOTGUN_EXT_BARREL("ambassador/ext_barrel"),

    //Warthog
    WARTHOG_MAIN("ambassador/main"),
    WARTHOG_BOLT("ambassador/bolt"),
    WARTHOG_STOCK_LIGHT("ambassador/light_stock"),
    WARTHOG_STOCK_HEAVY("ambassador/heavy_stock"),
    WARTHOG_STOCK_WOODEN("ambassador/wooden_stock"),
    WARTHOG_SILENCER("ambassador/silencer"),
    WARTHOG_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    WARTHOG_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    WARTHOG_STANDARD_MAG("ambassador/stan_mag"),
    WARTHOG_EXTENDED_MAG("ambassador/ext_mag"),
    WARTHOG_SPEED_MAG("ambassador/speed_mag"),
    WARTHOG_STAN_BARREL("ambassador/stan_barrel"),
    WARTHOG_EXT_BARREL("ambassador/ext_barrel"),

    //Whalefall
    WHALEFALL_MAIN("ambassador/main"),


    //Woodpecker
    WOODPECKER_MAIN("ambassador/main"),
    WOODPECKER_BOLT("ambassador/bolt"),
    WOODPECKER_STOCK_LIGHT("ambassador/light_stock"),
    WOODPECKER_STOCK_HEAVY("ambassador/heavy_stock"),
    WOODPECKER_STOCK_WOODEN("ambassador/wooden_stock"),
    WOODPECKER_SILENCER("ambassador/silencer"),
    WOODPECKER_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    WOODPECKER_MUZZLE_BRAKE("ambassador/muzzle_brake"),
    WOODPECKER_GRIP_LIGHT("ambassador/light_grip"),
    WOODPECKER_GRIP_VERTICAL("ambassador/tact_grip"),
    WOODPECKER_IRON_BAYONET("ambassador/iron_bayonet"),
    WOODPECKER_ANTHRALITE_BAYONET("ambassador/anthralite_bayonet"),
    WOODPECKER_DIAMOND_BAYONET("ambassador/diamond_bayonet"),
    WOODPECKER_NETHERITE_BAYONET("ambassador/netherite_bayonet"),
    WOODPECKER_STANDARD_MAG("ambassador/stan_mag"),
    WOODPECKER_EXTENDED_MAG("ambassador/ext_mag"),
    WOODPECKER_SPEED_MAG("ambassador/speed_mag"),
    WOODPECKER_STAN_BARREL("ambassador/stan_barrel"),
    WOODPECKER_EXT_BARREL("ambassador/ext_barrel"),

;

    /**
     * The location of an item model in the [MOD_ID]/models/special/[NAME] folder
     */
    private final ResourceLocation modelLocation;

    /**
     * Cached model
     */
    private BakedModel cachedModel;

    /**
     * Sets the model's location
     *
     * @param modelName name of the model file
     */
    BBSpecialModels(String modelName) {
        this.modelLocation = new ResourceLocation(MOD_ID, "special/" + modelName);
    }

    /**
     * Registers the special models into the Forge Model Bakery. This is only called once on the
     * load of the game.
     */
    @SubscribeEvent
    public static void registerAdditional(ModelEvent.RegisterAdditional event) {
        for (BBSpecialModels model : values()) {
            event.register(model.modelLocation);
        }
    }

    /**
     * Clears the cached BakedModel since it's been rebuilt. This is needed since the models may
     * have changed when a resource pack was applied, or if resources are reloaded.
     */
    @SubscribeEvent
    public static void onBake(ModelEvent.BakingCompleted event) {
        for (BBSpecialModels model : values()) {
            model.cachedModel = null;
        }
    }

    /**
     * Gets the model
     *
     * @return isolated model
     */
    public BakedModel getModel() {
        if (this.cachedModel == null) {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLocation);
        }
        return this.cachedModel;
    }
}
