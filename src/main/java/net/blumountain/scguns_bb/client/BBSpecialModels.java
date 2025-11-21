
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
    BIG_BETSY_MAIN("big_betsy/main"),
    BIG_BETSY_BOLT("big_betsy/bolt"),
    BIG_BETSY_STOCK_LIGHT("big_betsy/light_stock"),
    BIG_BETSY_STOCK_HEAVY("big_betsy/heavy_stock"),
    BIG_BETSY_STOCK_WOODEN("big_betsy/wooden_stock"),
    BIG_BETSY_STAN_BARREL("big_betsy/stan_barrel"),

    //Big Pipe
    BIG_PIPE_MAIN("big_pipe/main"),

    //Cave Cleaner
    CAVE_CLEANER_MAIN("cave_cleaner/main"),

    //Coral Hunter
    CORAL_HUNTER_MAIN("coral_hunter/main"),
    CORAL_HUNTER_BOLT("coral_hunter/bolt"),
    CORAL_HUNTER_SIGHTS("coral_hunter/sights"),
    CORAL_HUNTER_NO_SIGHTS("coral_hunter/no_sights"),
    CORAL_HUNTER_STOCK_LIGHT("coral_hunter/light_stock"),
    CORAL_HUNTER_STOCK_HEAVY("coral_hunter/heavy_stock"),
    CORAL_HUNTER_STOCK_WOODEN("coral_hunter/wooden_stock"),
    CORAL_HUNTER_SILENCER("coral_hunter/silencer"),
    CORAL_HUNTER_ADVANCED_SILENCER("coral_hunter/advanced_silencer"),
    CORAL_HUNTER_MUZZLE_BRAKE("coral_hunter/muzzle_brake"),
    CORAL_HUNTER_GRIP_LIGHT("coral_hunter/light_grip"),
    CORAL_HUNTER_GRIP_VERTICAL("coral_hunter/tact_grip"),
    CORAL_HUNTER_IRON_BAYONET("coral_hunter/iron_bayonet"),
    CORAL_HUNTER_ANTHRALITE_BAYONET("coral_hunter/anthralite_bayonet"),
    CORAL_HUNTER_DIAMOND_BAYONET("coral_hunter/diamond_bayonet"),
    CORAL_HUNTER_NETHERITE_BAYONET("coral_hunter/netherite_bayonet"),
    CORAL_HUNTER_STAN_BARREL("coral_hunter/stan_barrel"),
    CORAL_HUNTER_EXT_BARREL("coral_hunter/ext_barrel"),

    //Door Knocker
    DOOR_KNOCKER_MAIN("door_knocker/main"),
    DOOR_KNOCKER_STAN_GRIP("door_knocker/stan_grip"),
    DOOR_KNOCKER_STOCK_LIGHT("door_knocker/light_stock"),
    DOOR_KNOCKER_STOCK_HEAVY("door_knocker/heavy_stock"),
    DOOR_KNOCKER_STOCK_WOODEN("door_knocker/wooden_stock"),

    //Ghast Swatter
    GHAST_SWATTER_MAIN("ghast_swatter/main"),


    //Grunt Rifle
    GRUNT_RIFLE_MAIN("grunt_rifle/main"),
    GRUNT_RIFLE_BOLT("grunt_rifle/bolt"),
    GRUNT_RIFLE_STOCK_LIGHT("grunt_rifle/light_stock"),
    GRUNT_RIFLE_STOCK_HEAVY("grunt_rifle/heavy_stock"),
    GRUNT_RIFLE_STOCK_WOODEN("grunt_rifle/wooden_stock"),
    GRUNT_RIFLE_SILENCER("grunt_rifle/silencer"),
    GRUNT_RIFLE_ADVANCED_SILENCER("grunt_rifle/advanced_silencer"),
    GRUNT_RIFLE_MUZZLE_BRAKE("grunt_rifle/muzzle_brake"),
    GRUNT_RIFLE_GRIP_LIGHT("grunt_rifle/light_grip"),
    GRUNT_RIFLE_GRIP_VERTICAL("grunt_rifle/tact_grip"),
    GRUNT_RIFLE_IRON_BAYONET("grunt_rifle/iron_bayonet"),
    GRUNT_RIFLE_ANTHRALITE_BAYONET("grunt_rifle/anthralite_bayonet"),
    GRUNT_RIFLE_DIAMOND_BAYONET("grunt_rifle/diamond_bayonet"),
    GRUNT_RIFLE_NETHERITE_BAYONET("grunt_rifle/netherite_bayonet"),
    GRUNT_RIFLE_STANDARD_MAG("grunt_rifle/stan_mag"),
    GRUNT_RIFLE_EXTENDED_MAG("grunt_rifle/ext_mag"),
    GRUNT_RIFLE_SPEED_MAG("grunt_rifle/speed_mag"),
    GRUNT_RIFLE_STAN_BARREL("grunt_rifle/stan_barrel"),
    GRUNT_RIFLE_EXT_BARREL("grunt_rifle/ext_barrel"),

    //Haymaker
    HAYMAKER_MAIN("haymaker/main"),
    HAYMAKER_BOLT("haymaker/bolt"),
    HAYMAKER_STOCK_LIGHT("haymaker/light_stock"),
    HAYMAKER_STOCK_HEAVY("haymaker/heavy_stock"),
    HAYMAKER_STOCK_WOODEN("haymaker/wooden_stock"),
    HAYMAKER_SILENCER("haymaker/silencer"),
    HAYMAKER_ADVANCED_SILENCER("haymaker/advanced_silencer"),
    HAYMAKER_MUZZLE_BRAKE("haymaker/muzzle_brake"),
    HAYMAKER_GRIP_LIGHT("haymaker/light_grip"),
    HAYMAKER_GRIP_VERTICAL("haymaker/tact_grip"),
    HAYMAKER_IRON_BAYONET("haymaker/iron_bayonet"),
    HAYMAKER_ANTHRALITE_BAYONET("haymaker/anthralite_bayonet"),
    HAYMAKER_DIAMOND_BAYONET("haymaker/diamond_bayonet"),
    HAYMAKER_NETHERITE_BAYONET("haymaker/netherite_bayonet"),
    HAYMAKER_STAN_BARREL("haymaker/stan_barrel"),
    HAYMAKER_EXT_BARREL("haymaker/ext_barrel"),

    //Hog Tenderizer
    HOG_TENDERIZER_MAIN("hog_tenderizer/main"),
    HOG_TENDERIZER_BOLT("hog_tenderizer/bolt"),
    HOG_TENDERIZER_SILENCER("hog_tenderizer/silencer"),
    HOG_TENDERIZER_ADVANCED_SILENCER("hog_tenderizer/advanced_silencer"),
    HOG_TENDERIZER_MUZZLE_BRAKE("hog_tenderizer/muzzle_brake"),
    HOG_TENDERIZER_STANDARD_MAG("hog_tenderizer/stan_mag"),
    HOG_TENDERIZER_EXTENDED_MAG("hog_tenderizer/ext_mag"),
    HOG_TENDERIZER_SPEED_MAG("hog_tenderizer/speed_mag"),
    HOG_TENDERIZER_STAN_BARREL("hog_tenderizer/stan_barrel"),
    HOG_TENDERIZER_EXT_BARREL("hog_tenderizer/ext_barrel"),


    //Jungle Fighter
    JUNGLE_FIGHTER_MAIN("jungle_fighter/main"),
    JUNGLE_FIGHTER_STOCK_LIGHT("jungle_fighter/light_stock"),
    JUNGLE_FIGHTER_STOCK_HEAVY("jungle_fighter/heavy_stock"),
    JUNGLE_FIGHTER_STOCK_WOODEN("jungle_fighter/wooden_stock"),
    JUNGLE_FIGHTER_SILENCER("jungle_fighter/silencer"),
    JUNGLE_FIGHTER_ADVANCED_SILENCER("jungle_fighter/advanced_silencer"),
    JUNGLE_FIGHTER_MUZZLE_BRAKE("jungle_fighter/muzzle_brake"),
    JUNGLE_FIGHTER_GRIP_LIGHT("jungle_fighter/light_grip"),
    JUNGLE_FIGHTER_GRIP_VERTICAL("jungle_fighter/tact_grip"),
    JUNGLE_FIGHTER_IRON_BAYONET("jungle_fighter/iron_bayonet"),
    JUNGLE_FIGHTER_ANTHRALITE_BAYONET("jungle_fighter/anthralite_bayonet"),
    JUNGLE_FIGHTER_DIAMOND_BAYONET("jungle_fighter/diamond_bayonet"),
    JUNGLE_FIGHTER_NETHERITE_BAYONET("jungle_fighter/netherite_bayonet"),
    JUNGLE_FIGHTER_STANDARD_MAG("jungle_fighter/stan_mag"),
    JUNGLE_FIGHTER_EXTENDED_MAG("jungle_fighter/ext_mag"),
    JUNGLE_FIGHTER_SPEED_MAG("jungle_fighter/speed_mag"),
    JUNGLE_FIGHTER_STAN_BARREL("jungle_fighter/stan_barrel"),
    JUNGLE_FIGHTER_EXT_BARREL("jungle_fighter/ext_barrel"),

    //L.A.M.P. SMG
    LAMP_SMG_MAIN("lamp_smg/main"),
    LAMP_SMG_BOLT("lamp_smg/bolt"),
    LAMP_SMG_SIGHTS("lamp_smg/bolt"),
    LAMP_SMG_NO_SIGHTS("lamp_smg/bolt"),
    LAMP_SMG_SILENCER("lamp_smg/silencer"),
    LAMP_SMG_ADVANCED_SILENCER("lamp_smg/advanced_silencer"),
    LAMP_SMG_MUZZLE_BRAKE("lamp_smg/muzzle_brake"),
    LAMP_SMG_STANDARD_MAG("lamp_smg/stan_mag"),
    LAMP_SMG_EXTENDED_MAG("lamp_smg/ext_mag"),
    LAMP_SMG_SPEED_MAG("lamp_smg/speed_mag"),
    LAMP_SMG_STAN_BARREL("lamp_smg/stan_barrel"),
    LAMP_SMG_EXT_BARREL("lamp_smg/ext_barrel"),

    //M11 Pelagic
    M11_PELAGIC_MAIN("m11_pelagic/main"),
    M11_PELAGIC_BOLT("m11_pelagic/bolt"),
    M11_PELAGIC_SIGHTS("m11_pelagic/sights"),
    M11_PELAGIC_NO_SIGHTS("m11_pelagic/no_sights"),
    M11_PELAGIC_STOCK_LIGHT("m11_pelagic/light_stock"),
    M11_PELAGIC_STOCK_HEAVY("m11_pelagic/heavy_stock"),
    M11_PELAGIC_STOCK_WOODEN("m11_pelagic/wooden_stock"),
    M11_PELAGIC_SILENCER("m11_pelagic/silencer"),
    M11_PELAGIC_ADVANCED_SILENCER("m11_pelagic/advanced_silencer"),
    M11_PELAGIC_MUZZLE_BRAKE("m11_pelagic/muzzle_brake"),
    M11_PELAGIC_GRIP_LIGHT("m11_pelagic/light_grip"),
    M11_PELAGIC_GRIP_VERTICAL("m11_pelagic/tact_grip"),
    M11_PELAGIC_IRON_BAYONET("m11_pelagic/iron_bayonet"),
    M11_PELAGIC_ANTHRALITE_BAYONET("m11_pelagic/anthralite_bayonet"),
    M11_PELAGIC_DIAMOND_BAYONET("m11_pelagic/diamond_bayonet"),
    M11_PELAGIC_NETHERITE_BAYONET("m11_pelagic/netherite_bayonet"),
    M11_PELAGIC_STANDARD_MAG("m11_pelagic/stan_mag"),
    M11_PELAGIC_EXTENDED_MAG("m11_pelagic/ext_mag"),
    M11_PELAGIC_SPEED_MAG("m11_pelagic/speed_mag"),
    M11_PELAGIC_STAN_BARREL("m11_pelagic/stan_barrel"),
    M11_PELAGIC_EXT_BARREL("m11_pelagic/ext_barrel"),

    //M3 Rifle
    M3_RIFLE_MAIN("m3_rifle/main"),
    M3_RIFLE_BOLT("m3_rifle/bolt"),
    M3_RIFLE_STOCK_LIGHT("m3_rifle/light_stock"),
    M3_RIFLE_STOCK_HEAVY("m3_rifle/heavy_stock"),
    M3_RIFLE_STOCK_WOODEN("m3_rifle/wooden_stock"),
    M3_RIFLE_SILENCER("m3_rifle/silencer"),
    M3_RIFLE_ADVANCED_SILENCER("m3_rifle/advanced_silencer"),
    M3_RIFLE_MUZZLE_BRAKE("m3_rifle/muzzle_brake"),
    M3_RIFLE_GRIP_LIGHT("m3_rifle/light_grip"),
    M3_RIFLE_GRIP_VERTICAL("m3_rifle/tact_grip"),
    M3_RIFLE_IRON_BAYONET("m3_rifle/iron_bayonet"),
    M3_RIFLE_ANTHRALITE_BAYONET("m3_rifle/anthralite_bayonet"),
    M3_RIFLE_DIAMOND_BAYONET("m3_rifle/diamond_bayonet"),
    M3_RIFLE_NETHERITE_BAYONET("m3_rifle/netherite_bayonet"),
    M3_RIFLE_STANDARD_MAG("m3_rifle/stan_mag"),
    M3_RIFLE_EXTENDED_MAG("m3_rifle/ext_mag"),
    M3_RIFLE_SPEED_MAG("m3_rifle/speed_mag"),
    M3_RIFLE_STAN_BARREL("m3_rifle/stan_barrel"),
    M3_RIFLE_EXT_BARREL("m3_rifle/ext_barrel"),

    //M8 Benth
    M8_BENTH_MAIN("m8_benth/main"),
    M8_BENTH_BOLT("m8_benth/bolt"),
    M8_BENTH_SIGHTS("m8_benth/sights"),
    M8_BENTH_NO_SIGHTS("m8_benth/no_sights"),
    M8_BENTH_STOCK_LIGHT("m8_benth/light_stock"),
    M8_BENTH_STOCK_HEAVY("m8_benth/heavy_stock"),
    M8_BENTH_STOCK_WOODEN("m8_benth/wooden_stock"),
    M8_BENTH_SILENCER("m8_benth/silencer"),
    M8_BENTH_ADVANCED_SILENCER("m8_benth/advanced_silencer"),
    M8_BENTH_MUZZLE_BRAKE("m8_benth/muzzle_brake"),
    M8_BENTH_GRIP_LIGHT("m8_benth/light_grip"),
    M8_BENTH_GRIP_VERTICAL("m8_benth/tact_grip"),
    M8_BENTH_IRON_BAYONET("m8_benth/iron_bayonet"),
    M8_BENTH_ANTHRALITE_BAYONET("m8_benth/anthralite_bayonet"),
    M8_BENTH_DIAMOND_BAYONET("m8_benth/diamond_bayonet"),
    M8_BENTH_NETHERITE_BAYONET("m8_benth/netherite_bayonet"),
    M8_BENTH_STAN_BARREL("m8_benth/stan_barrel"),
    M8_BENTH_EXT_BARREL("m8_benth/ext_barrel"),

    //M922 Barrage
    M922_BARRAGE_MAIN("m922_barrage/main"),
    M922_BARRAGE_SIGHTS("m922_barrage/sights"),
    M922_BARRAGE_NO_SIGHTS("m922_barrage/no_sights"),

    //M928 Stormsurge
    M928_STORMSURGE_MAIN("m928_stormsurge/main"),
    M928_STORMSURGE_BOLT("m928_stormsurge/bolt"),
    M928_STORMSURGE_STOCK_LIGHT("m928_stormsurge/light_stock"),
    M928_STORMSURGE_STOCK_HEAVY("m928_stormsurge/heavy_stock"),
    M928_STORMSURGE_STOCK_WOODEN("m928_stormsurge/wooden_stock"),
    M928_STORMSURGE_SILENCER("m928_stormsurge/silencer"),
    M928_STORMSURGE_ADVANCED_SILENCER("m928_stormsurge/advanced_silencer"),
    M928_STORMSURGE_MUZZLE_BRAKE("m928_stormsurge/muzzle_brake"),
    M928_STORMSURGE_STANDARD_MAG("m928_stormsurge/stan_mag"),
    M928_STORMSURGE_EXTENDED_MAG("m928_stormsurge/ext_mag"),
    M928_STORMSURGE_SPEED_MAG("m928_stormsurge/speed_mag"),
    M928_STORMSURGE_STAN_BARREL("m928_stormsurge/stan_barrel"),
    M928_STORMSURGE_EXT_BARREL("m928_stormsurge/ext_barrel"),

    //Mad Minute
    MAD_MINUTE_MAIN("mad_minute/main"),
    MAD_MINUTE_BOLT("mad_minute/bolt"),
    MAD_MINUTE_STOCK_LIGHT("mad_minute/light_stock"),
    MAD_MINUTE_STOCK_HEAVY("mad_minute/heavy_stock"),
    MAD_MINUTE_STOCK_WOODEN("mad_minute/wooden_stock"),
    MAD_MINUTE_SILENCER("mad_minute/silencer"),
    MAD_MINUTE_ADVANCED_SILENCER("mad_minute/advanced_silencer"),
    MAD_MINUTE_MUZZLE_BRAKE("mad_minute/muzzle_brake"),
    MAD_MINUTE_GRIP_LIGHT("mad_minute/light_grip"),
    MAD_MINUTE_GRIP_VERTICAL("mad_minute/tact_grip"),
    MAD_MINUTE_IRON_BAYONET("mad_minute/iron_bayonet"),
    MAD_MINUTE_ANTHRALITE_BAYONET("mad_minute/anthralite_bayonet"),
    MAD_MINUTE_DIAMOND_BAYONET("mad_minute/diamond_bayonet"),
    MAD_MINUTE_NETHERITE_BAYONET("mad_minute/netherite_bayonet"),
    MAD_MINUTE_STAN_BARREL("mad_minute/stan_barrel"),
    MAD_MINUTE_EXT_BARREL("mad_minute/ext_barrel"),

    //Metal Jacket Rifle
    METAL_JACKET_RIFLE_MAIN("metal_jacket_rifle/main"),
    METAL_JACKET_RIFLE_BOLT("metal_jacket_rifle/bolt"),
    METAL_JACKET_RIFLE_SIGHTS("metal_jacket_rifle/sights"),
    METAL_JACKET_RIFLE_NO_SIGHTS("metal_jacket_rifle/no_sights"),
    METAL_JACKET_RIFLE_STOCK_LIGHT("metal_jacket_rifle/light_stock"),
    METAL_JACKET_RIFLE_STOCK_HEAVY("metal_jacket_rifle/heavy_stock"),
    METAL_JACKET_RIFLE_STOCK_WOODEN("metal_jacket_rifle/wooden_stock"),
    METAL_JACKET_RIFLE_SILENCER("metal_jacket_rifle/silencer"),
    METAL_JACKET_RIFLE_ADVANCED_SILENCER("metal_jacket_rifle/advanced_silencer"),
    METAL_JACKET_RIFLE_MUZZLE_BRAKE("metal_jacket_rifle/muzzle_brake"),
    METAL_JACKET_RIFLE_GRIP_LIGHT("metal_jacket_rifle/light_grip"),
    METAL_JACKET_RIFLE_GRIP_VERTICAL("metal_jacket_rifle/tact_grip"),
    METAL_JACKET_RIFLE_IRON_BAYONET("metal_jacket_rifle/iron_bayonet"),
    METAL_JACKET_RIFLE_ANTHRALITE_BAYONET("metal_jacket_rifle/anthralite_bayonet"),
    METAL_JACKET_RIFLE_DIAMOND_BAYONET("metal_jacket_rifle/diamond_bayonet"),
    METAL_JACKET_RIFLE_NETHERITE_BAYONET("metal_jacket_rifle/netherite_bayonet"),
    METAL_JACKET_RIFLE_STANDARD_MAG("metal_jacket_rifle/stan_mag"),
    METAL_JACKET_RIFLE_EXTENDED_MAG("metal_jacket_rifle/ext_mag"),
    METAL_JACKET_RIFLE_SPEED_MAG("metal_jacket_rifle/speed_mag"),
    METAL_JACKET_RIFLE_STAN_BARREL("metal_jacket_rifle/stan_barrel"),
    METAL_JACKET_RIFLE_EXT_BARREL("metal_jacket_rifle/ext_barrel"),

    //Neptune Spear
    NEPTUNE_SPEAR_MAIN("neptune_spear/main"),
    NEPTUNE_SPEAR_STOCK_LIGHT("neptune_spear/light_stock"),
    NEPTUNE_SPEAR_STOCK_HEAVY("neptune_spear/heavy_stock"),
    NEPTUNE_SPEAR_STOCK_WOODEN("neptune_spear/wooden_stock"),
    NEPTUNE_SPEAR_SILENCER("neptune_spear/silencer"),
    NEPTUNE_SPEAR_ADVANCED_SILENCER("neptune_spear/advanced_silencer"),
    NEPTUNE_SPEAR_MUZZLE_BRAKE("neptune_spear/muzzle_brake"),
    NEPTUNE_SPEAR_GRIP_LIGHT("neptune_spear/light_grip"),
    NEPTUNE_SPEAR_GRIP_VERTICAL("neptune_spear/tact_grip"),
    NEPTUNE_SPEAR_IRON_BAYONET("neptune_spear/iron_bayonet"),
    NEPTUNE_SPEAR_ANTHRALITE_BAYONET("neptune_spear/anthralite_bayonet"),
    NEPTUNE_SPEAR_DIAMOND_BAYONET("neptune_spear/diamond_bayonet"),
    NEPTUNE_SPEAR_NETHERITE_BAYONET("neptune_spear/netherite_bayonet"),
    NEPTUNE_SPEAR_STANDARD_MAG("neptune_spear/stan_mag"),
    NEPTUNE_SPEAR_EXTENDED_MAG("neptune_spear/ext_mag"),
    NEPTUNE_SPEAR_SPEED_MAG("neptune_spear/speed_mag"),
    NEPTUNE_SPEAR_STAN_BARREL("neptune_spear/stan_barrel"),
    NEPTUNE_SPEAR_EXT_BARREL("neptune_spear/ext_barrel"),

    //Nether Fighter
    NETHER_FIGHTER_MAIN("nether_fighter/main"),
    NETHER_FIGHTER_RECEIVER("nether_fighter/receiver"),
    NETHER_FIGHTER_SILENCER("nether_fighter/silencer"),
    NETHER_FIGHTER_ADVANCED_SILENCER("nether_fighter/advanced_silencer"),
    NETHER_FIGHTER_MUZZLE_BRAKE("nether_fighter/muzzle_brake"),
    NETHER_FIGHTER_STANDARD_MAG("nether_fighter/stan_mag"),
    NETHER_FIGHTER_EXTENDED_MAG("nether_fighter/ext_mag"),
    NETHER_FIGHTER_SPEED_MAG("nether_fighter/speed_mag"),
    NETHER_FIGHTER_STAN_BARREL("nether_fighter/stan_barrel"),
    NETHER_FIGHTER_EXT_BARREL("nether_fighter/ext_barrel"),

    //Pest Control Shotgun
    PEST_CONTROL_SHOTGUN_MAIN("pest_control_shotgun/main"),
    PEST_CONTROL_SHOTGUN_BOLT("pest_control_shotgun/bolt"),
    PEST_CONTROL_SHOTGUN_STAN_GRIP("pest_control_shotgun/stan_grip"),
    PEST_CONTROL_SHOTGUN_STOCK_LIGHT("pest_control_shotgun/light_stock"),
    PEST_CONTROL_SHOTGUN_STOCK_HEAVY("pest_control_shotgun/heavy_stock"),
    PEST_CONTROL_SHOTGUN_STOCK_WOODEN("pest_control_shotgun/wooden_stock"),
    PEST_CONTROL_SHOTGUN_SILENCER("pest_control_shotgun/silencer"),
    PEST_CONTROL_SHOTGUN_ADVANCED_SILENCER("pest_control_shotgun/advanced_silencer"),
    PEST_CONTROL_SHOTGUN_MUZZLE_BRAKE("pest_control_shotgun/muzzle_brake"),
    PEST_CONTROL_SHOTGUN_GRIP_LIGHT("pest_control_shotgun/light_grip"),
    PEST_CONTROL_SHOTGUN_GRIP_VERTICAL("pest_control_shotgun/tact_grip"),
    PEST_CONTROL_SHOTGUN_IRON_BAYONET("pest_control_shotgun/iron_bayonet"),
    PEST_CONTROL_SHOTGUN_ANTHRALITE_BAYONET("pest_control_shotgun/anthralite_bayonet"),
    PEST_CONTROL_SHOTGUN_DIAMOND_BAYONET("pest_control_shotgun/diamond_bayonet"),
    PEST_CONTROL_SHOTGUN_NETHERITE_BAYONET("pest_control_shotgun/netherite_bayonet"),
    PEST_CONTROL_SHOTGUN_STAN_BARREL("pest_control_shotgun/stan_barrel"),
    PEST_CONTROL_SHOTGUN_EXT_BARREL("pest_control_shotgun/ext_barrel"),

    //Pirate Thumper
    PIRATE_THUMPER_MAIN("pirate_thumper/main"),
    PIRATE_THUMPER_STOCK_LIGHT("pirate_thumper/light_stock"),
    PIRATE_THUMPER_STOCK_HEAVY("pirate_thumper/heavy_stock"),
    PIRATE_THUMPER_STOCK_WOODEN("pirate_thumper/wooden_stock"),
    PIRATE_THUMPER_GRIP_LIGHT("pirate_thumper/light_grip"),
    PIRATE_THUMPER_GRIP_VERTICAL("pirate_thumper/tact_grip"),
    PIRATE_THUMPER_IRON_BAYONET("pirate_thumper/iron_bayonet"),
    PIRATE_THUMPER_ANTHRALITE_BAYONET("pirate_thumper/anthralite_bayonet"),
    PIRATE_THUMPER_DIAMOND_BAYONET("pirate_thumper/diamond_bayonet"),
    PIRATE_THUMPER_NETHERITE_BAYONET("pirate_thumper/netherite_bayonet"),

    //Republic Standard Issue
    REPUBLIC_STANDARD_MAIN("republic_standard/main"),
    REPUBLIC_STANDARD_STOCK_LIGHT("republic_standard/light_stock"),
    REPUBLIC_STANDARD_STOCK_HEAVY("republic_standard/heavy_stock"),
    REPUBLIC_STANDARD_STOCK_WOODEN("republic_standard/wooden_stock"),
    REPUBLIC_STANDARD_SILENCER("republic_standard/silencer"),
    REPUBLIC_STANDARD_ADVANCED_SILENCER("republic_standard/advanced_silencer"),
    REPUBLIC_STANDARD_MUZZLE_BRAKE("republic_standard/muzzle_brake"),
    REPUBLIC_STANDARD_GRIP_LIGHT("republic_standard/light_grip"),
    REPUBLIC_STANDARD_GRIP_VERTICAL("republic_standard/tact_grip"),
    REPUBLIC_STANDARD_IRON_BAYONET("republic_standard/iron_bayonet"),
    REPUBLIC_STANDARD_ANTHRALITE_BAYONET("republic_standard/anthralite_bayonet"),
    REPUBLIC_STANDARD_DIAMOND_BAYONET("republic_standard/diamond_bayonet"),
    REPUBLIC_STANDARD_NETHERITE_BAYONET("republic_standard/netherite_bayonet"),
    REPUBLIC_STANDARD_STANDARD_MAG("republic_standard/stan_mag"),
    REPUBLIC_STANDARD_EXTENDED_MAG("republic_standard/ext_mag"),
    REPUBLIC_STANDARD_SPEED_MAG("republic_standard/speed_mag"),
    REPUBLIC_STANDARD_STAN_BARREL("republic_standard/stan_barrel"),
    REPUBLIC_STANDARD_EXT_BARREL("republic_standard/ext_barrel"),


    //Sand Buster
    SAND_BUSTER_MAIN("sand_buster/main"),
    SAND_BUSTER_BOLT("sand_buster/bolt"),
    SAND_BUSTER_STOCK_LIGHT("sand_buster/light_stock"),
    SAND_BUSTER_STOCK_HEAVY("sand_buster/heavy_stock"),
    SAND_BUSTER_STOCK_WOODEN("sand_buster/wooden_stock"),
    SAND_BUSTER_SILENCER("sand_buster/silencer"),
    SAND_BUSTER_ADVANCED_SILENCER("sand_buster/advanced_silencer"),
    SAND_BUSTER_MUZZLE_BRAKE("sand_buster/muzzle_brake"),
    SAND_BUSTER_GRIP_LIGHT("sand_buster/light_grip"),
    SAND_BUSTER_GRIP_VERTICAL("sand_buster/tact_grip"),
    SAND_BUSTER_IRON_BAYONET("sand_buster/iron_bayonet"),
    SAND_BUSTER_ANTHRALITE_BAYONET("sand_buster/anthralite_bayonet"),
    SAND_BUSTER_DIAMOND_BAYONET("sand_buster/diamond_bayonet"),
    SAND_BUSTER_NETHERITE_BAYONET("sand_buster/netherite_bayonet"),
    SAND_BUSTER_STAN_BARREL("sand_buster/stan_barrel"),
    SAND_BUSTER_EXT_BARREL("sand_buster/ext_barrel"),

    //Sand Defender
    SAND_DEFENDER_MAIN("sand_defender/main"),
    SAND_DEFENDER_RECEIVER("sand_defender/bolt"),
    SAND_DEFENDER_SILENCER("sand_defender/silencer"),
    SAND_DEFENDER_ADVANCED_SILENCER("sand_defender/advanced_silencer"),
    SAND_DEFENDER_MUZZLE_BRAKE("sand_defender/muzzle_brake"),
    SAND_DEFENDER_STANDARD_MAG("sand_defender/stan_mag"),
    SAND_DEFENDER_EXTENDED_MAG("sand_defender/ext_mag"),
    SAND_DEFENDER_SPEED_MAG("sand_defender/speed_mag"),
    SAND_DEFENDER_STAN_BARREL("sand_defender/stan_barrel"),
    SAND_DEFENDER_EXT_BARREL("sand_defender/ext_barrel"),

    //Self Loading Rifle
    SELF_LOADING_RIFLE_MAIN("self_loading_rifle/main"),
    SELF_LOADING_RIFLE_BOLT("self_loading_rifle/sights"),
    SELF_LOADING_RIFLE_SIGHTS("self_loading_rifle/no_sights"),
    SELF_LOADING_RIFLE_NO_SIGHTS("self_loading_rifle/sights"),
    SELF_LOADING_RIFLE_STOCK_LIGHT("self_loading_rifle/light_stock"),
    SELF_LOADING_RIFLE_STOCK_HEAVY("self_loading_rifle/heavy_stock"),
    SELF_LOADING_RIFLE_STOCK_WOODEN("self_loading_rifle/wooden_stock"),
    SELF_LOADING_RIFLE_SILENCER("self_loading_rifle/silencer"),
    SELF_LOADING_RIFLE_ADVANCED_SILENCER("self_loading_rifle/advanced_silencer"),
    SELF_LOADING_RIFLE_MUZZLE_BRAKE("self_loading_rifle/muzzle_brake"),
    SELF_LOADING_RIFLE_GRIP_LIGHT("self_loading_rifle/light_grip"),
    SELF_LOADING_RIFLE_GRIP_VERTICAL("self_loading_rifle/tact_grip"),
    SELF_LOADING_RIFLE_IRON_BAYONET("self_loading_rifle/iron_bayonet"),
    SELF_LOADING_RIFLE_ANTHRALITE_BAYONET("self_loading_rifle/anthralite_bayonet"),
    SELF_LOADING_RIFLE_DIAMOND_BAYONET("self_loading_rifle/diamond_bayonet"),
    SELF_LOADING_RIFLE_NETHERITE_BAYONET("self_loading_rifle/netherite_bayonet"),
    SELF_LOADING_RIFLE_STANDARD_MAG("self_loading_rifle/stan_mag"),
    SELF_LOADING_RIFLE_EXTENDED_MAG("self_loading_rifle/ext_mag"),
    SELF_LOADING_RIFLE_SPEED_MAG("self_loading_rifle/speed_mag"),
    SELF_LOADING_RIFLE_STAN_BARREL("self_loading_rifle/stan_barrel"),
    SELF_LOADING_RIFLE_EXT_BARREL("self_loading_rifle/ext_barrel"),

    //Tide Walker
    TIDE_WALKER_MAIN("tide_walker/main"),
    TIDE_WALKER_BOLT("tide_walker/bolt"),
    TIDE_WALKER_SIGHTS("tide_walker/sights"),
    TIDE_WALKER_NO_SIGHTS("tide_walker/no_sights"),
    TIDE_WALKER_STOCK_LIGHT("tide_walker/light_stock"),
    TIDE_WALKER_STOCK_HEAVY("tide_walker/heavy_stock"),
    TIDE_WALKER_STOCK_WOODEN("tide_walker/wooden_stock"),
    TIDE_WALKER_SILENCER("tide_walker/silencer"),
    TIDE_WALKER_ADVANCED_SILENCER("tide_walker/advanced_silencer"),
    TIDE_WALKER_MUZZLE_BRAKE("tide_walker/muzzle_brake"),
    TIDE_WALKER_GRIP_LIGHT("tide_walker/light_grip"),
    TIDE_WALKER_GRIP_VERTICAL("tide_walker/tact_grip"),
    TIDE_WALKER_IRON_BAYONET("tide_walker/iron_bayonet"),
    TIDE_WALKER_ANTHRALITE_BAYONET("tide_walker/anthralite_bayonet"),
    TIDE_WALKER_DIAMOND_BAYONET("tide_walker/diamond_bayonet"),
    TIDE_WALKER_NETHERITE_BAYONET("tide_walker/netherite_bayonet"),
    TIDE_WALKER_STANDARD_MAG("tide_walker/stan_mag"),
    TIDE_WALKER_EXTENDED_MAG("tide_walker/ext_mag"),
    TIDE_WALKER_SPEED_MAG("tide_walker/speed_mag"),
    TIDE_WALKER_STAN_BARREL("tide_walker/stan_barrel"),
    TIDE_WALKER_EXT_BARREL("tide_walker/ext_barrel"),

    //Top Break
    TOP_BREAK_MAIN("top_break/main"),
    TOP_BREAK_DRUM("top_break/drum"),
    TOP_BREAK_HAMMER("top_break/hammer"),
    TOP_BREAK_SILENCER("top_break/silencer"),
    TOP_BREAK_ADVANCED_SILENCER("top_break/advanced_silencer"),
    TOP_BREAK_MUZZLE_BRAKE("top_break/muzzle_brake"),
    TOP_BREAK_STANDARD_MAG("top_break/stan_mag"),
    TOP_BREAK_EXTENDED_MAG("top_break/ext_mag"),
    TOP_BREAK_STAN_BARREL("top_break/stan_barrel"),
    TOP_BREAK_EXT_BARREL("top_break/ext_barrel"),

    //Top Loader
    TOP_LOADER_MAIN("top_loader/main"),
    TOP_LOADER_BOLT("top_loader/bolt"),
    TOP_LOADER_STOCK_LIGHT("top_loader/light_stock"),
    TOP_LOADER_STOCK_HEAVY("top_loader/heavy_stock"),
    TOP_LOADER_STOCK_WOODEN("top_loader/wooden_stock"),
    TOP_LOADER_SILENCER("top_loader/silencer"),
    TOP_LOADER_ADVANCED_SILENCER("top_loader/advanced_silencer"),
    TOP_LOADER_MUZZLE_BRAKE("top_loader/muzzle_brake"),
    TOP_LOADER_GRIP_LIGHT("top_loader/light_grip"),
    TOP_LOADER_GRIP_VERTICAL("top_loader/tact_grip"),
    TOP_LOADER_IRON_BAYONET("top_loader/iron_bayonet"),
    TOP_LOADER_ANTHRALITE_BAYONET("top_loader/anthralite_bayonet"),
    TOP_LOADER_DIAMOND_BAYONET("top_loader/diamond_bayonet"),
    TOP_LOADER_NETHERITE_BAYONET("top_loader/netherite_bayonet"),
    TOP_LOADER_STANDARD_MAG("top_loader/stan_mag"),
    TOP_LOADER_EXTENDED_MAG("top_loader/ext_mag"),
    TOP_LOADER_SPEED_MAG("top_loader/speed_mag"),
    TOP_LOADER_STAN_BARREL("top_loader/stan_barrel"),
    TOP_LOADER_EXT_BARREL("top_loader/ext_barrel"),

    //Trench Broom
    TRENCHBROOM_MAIN("trenchbroom/main"),
    TRENCHBROOM_BOLT("trenchbroom/bolt"),
    TRENCHBROOM_STAN_GRIP("trenchbroom/stan_grip"),
    TRENCHBROOM_STOCK_LIGHT("trenchbroom/light_stock"),
    TRENCHBROOM_STOCK_HEAVY("trenchbroom/heavy_stock"),
    TRENCHBROOM_STOCK_WOODEN("trenchbroom/wooden_stock"),
    TRENCHBROOM_SILENCER("trenchbroom/silencer"),
    TRENCHBROOM_ADVANCED_SILENCER("trenchbroom/advanced_silencer"),
    TRENCHBROOM_MUZZLE_BRAKE("trenchbroom/muzzle_brake"),
    TRENCHBROOM_GRIP_LIGHT("trenchbroom/light_grip"),
    TRENCHBROOM_GRIP_VERTICAL("trenchbroom/tact_grip"),
    TRENCHBROOM_IRON_BAYONET("trenchbroom/iron_bayonet"),
    TRENCHBROOM_ANTHRALITE_BAYONET("trenchbroom/anthralite_bayonet"),
    TRENCHBROOM_DIAMOND_BAYONET("trenchbroom/diamond_bayonet"),
    TRENCHBROOM_NETHERITE_BAYONET("trenchbroom/netherite_bayonet"),
    TRENCHBROOM_STAN_BARREL("trenchbroom/stan_barrel"),
    TRENCHBROOM_EXT_BARREL("trenchbroom/ext_barrel"),

    //Trilemma
    TRILEMMA_MAIN("trilemma/main"),
    TRILEMMA_BOLT("trilemma/bolt"),
    TRILEMMA_SIGHTS("trilemma/sights"),
    TRILEMMA_NO_SIGHTS("trilemma/no_sights"),
    TRILEMMA_STOCK_LIGHT("trilemma/light_stock"),
    TRILEMMA_STOCK_HEAVY("trilemma/heavy_stock"),
    TRILEMMA_STOCK_WOODEN("trilemma/wooden_stock"),
    TRILEMMA_SILENCER("trilemma/silencer"),
    TRILEMMA_ADVANCED_SILENCER("ambassador/advanced_silencer"),
    TRILEMMA_MUZZLE_BRAKE("trilemma/muzzle_brake"),
    TRILEMMA_GRIP_LIGHT("trilemma/light_grip"),
    TRILEMMA_GRIP_VERTICAL("trilemma/tact_grip"),
    TRILEMMA_IRON_BAYONET("trilemma/iron_bayonet"),
    TRILEMMA_ANTHRALITE_BAYONET("trilemma/anthralite_bayonet"),
    TRILEMMA_DIAMOND_BAYONET("trilemma/diamond_bayonet"),
    TRILEMMA_NETHERITE_BAYONET("trilemma/netherite_bayonet"),
    TRILEMMA_STANDARD_MAG("trilemma/stan_mag"),
    TRILEMMA_EXTENDED_MAG("trilemma/ext_mag"),
    TRILEMMA_SPEED_MAG("trilemma/speed_mag"),
    TRILEMMA_STAN_BARREL("trilemma/stan_barrel"),
    TRILEMMA_EXT_BARREL("trilemma/ext_barrel"),

    //Variable Control Shotgun
    VARIABLE_CONTROL_SHOTGUN_MAIN("variable_control_shotgun/main"),
    VARIABLE_CONTROL_SHOTGUN_BOLT("variable_control_shotgun/bolt"),
    VARIABLE_CONTROL_SHOTGUN_SIGHTS("variable_control_shotgun/sights"),
    VARIABLE_CONTROL_SHOTGUN_NO_SIGHTS("variable_control_shotgun/no_sights"),
    VARIABLE_CONTROL_SHOTGUN_STOCK_LIGHT("variable_control_shotgun/light_stock"),
    VARIABLE_CONTROL_SHOTGUN_STOCK_HEAVY("variable_control_shotgun/heavy_stock"),
    VARIABLE_CONTROL_SHOTGUN_STOCK_WOODEN("variable_control_shotgun/wooden_stock"),
    VARIABLE_CONTROL_SHOTGUN_SILENCER("variable_control_shotgun/silencer"),
    VARIABLE_CONTROL_SHOTGUN_ADVANCED_SILENCER("variable_control_shotgun/advanced_silencer"),
    VARIABLE_CONTROL_SHOTGUN_MUZZLE_BRAKE("variable_control_shotgun/muzzle_brake"),
    VARIABLE_CONTROL_SHOTGUN_GRIP_LIGHT("variable_control_shotgun/light_grip"),
    VARIABLE_CONTROL_SHOTGUN_GRIP_VERTICAL("variable_control_shotgun/tact_grip"),
    VARIABLE_CONTROL_SHOTGUN_IRON_BAYONET("variable_control_shotgun/iron_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_ANTHRALITE_BAYONET("variable_control_shotgun/anthralite_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_DIAMOND_BAYONET("variable_control_shotgun/diamond_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_NETHERITE_BAYONET("variable_control_shotgun/netherite_bayonet"),
    VARIABLE_CONTROL_SHOTGUN_STAN_BARREL("variable_control_shotgun/stan_barrel"),
    VARIABLE_CONTROL_SHOTGUN_EXT_BARREL("variable_control_shotgun/ext_barrel"),

    //Warthog
    WARTHOG_MAIN("warthog/main"),
    WARTHOG_BOLT("warthog/bolt"),
    WARTHOG_SIGHTS("warthog/sights"),
    WARTHOG_NO_SIGHTS("warthog/no_sights"),
    WARTHOG_STOCK_LIGHT("warthog/light_stock"),
    WARTHOG_STOCK_HEAVY("warthog/heavy_stock"),
    WARTHOG_STOCK_WOODEN("warthog/wooden_stock"),
    WARTHOG_SILENCER("warthog/silencer"),
    WARTHOG_ADVANCED_SILENCER("warthog/advanced_silencer"),
    WARTHOG_MUZZLE_BRAKE("warthog/muzzle_brake"),
    WARTHOG_STANDARD_MAG("warthog/stan_mag"),
    WARTHOG_EXTENDED_MAG("warthog/ext_mag"),
    WARTHOG_SPEED_MAG("warthog/speed_mag"),
    WARTHOG_STAN_BARREL("warthog/stan_barrel"),
    WARTHOG_EXT_BARREL("warthog/ext_barrel"),

    //Whalefall
    WHALEFALL_MAIN("whalefall/main"),
    WHALEFALL_SIGHTS("whalefall/sights"),
    WHALEFALL_NO_SIGHTS("whalefall/no_sights"),


    //Woodpecker
    WOODPECKER_MAIN("woodpecker/main"),
    WOODPECKER_BOLT("woodpecker/bolt"),
    WOODPECKER_STOCK_LIGHT("woodpecker/light_stock"),
    WOODPECKER_STOCK_HEAVY("woodpecker/heavy_stock"),
    WOODPECKER_STOCK_WOODEN("woodpecker/wooden_stock"),
    WOODPECKER_SILENCER("woodpecker/silencer"),
    WOODPECKER_ADVANCED_SILENCER("woodpecker/advanced_silencer"),
    WOODPECKER_MUZZLE_BRAKE("woodpecker/muzzle_brake"),
    WOODPECKER_GRIP_LIGHT("woodpecker/light_grip"),
    WOODPECKER_GRIP_VERTICAL("woodpecker/tact_grip"),
    WOODPECKER_IRON_BAYONET("woodpecker/iron_bayonet"),
    WOODPECKER_ANTHRALITE_BAYONET("woodpecker/anthralite_bayonet"),
    WOODPECKER_DIAMOND_BAYONET("woodpecker/diamond_bayonet"),
    WOODPECKER_NETHERITE_BAYONET("woodpecker/netherite_bayonet"),
    WOODPECKER_STANDARD_MAG("woodpecker/stan_mag"),
    WOODPECKER_EXTENDED_MAG("woodpecker/ext_mag"),
    WOODPECKER_SPEED_MAG("woodpecker/speed_mag"),
    WOODPECKER_STAN_BARREL("woodpecker/stan_barrel"),
    WOODPECKER_EXT_BARREL("woodpecker/ext_barrel");

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
