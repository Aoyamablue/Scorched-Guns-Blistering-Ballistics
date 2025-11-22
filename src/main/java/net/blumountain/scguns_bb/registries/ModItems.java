package net.blumountain.scguns_bb.registries;

import net.blumountain.scguns_bb.item.animated.Copper_Light_ArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ribs.scguns.init.ModSounds;
import top.ribs.scguns.item.TooltipItem;
import top.ribs.scguns.item.animated.AnimatedDiamondSteelGunItem;
import top.ribs.scguns.item.animated.AnimatedGunItem;
import net.blumountain.scguns_bb.item.animated.*;
//import net.blumountain.scguns_bb.item.*;
import net.blumountain.scguns_bb.init.ModArmorMaterials;


import static net.blumountain.scguns_bb.SCGunsBB.MOD_ID;
import static net.blumountain.scguns_bb.CompatManager.CREATE_ENABLED;

public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

//copper guns
    public static final RegistryObject<AnimatedGunItem> STRUMM88 = REGISTER.register("strumm88",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(500),
                    "strumm88", // Model path
                    ModSounds.MAG_OUT.get(),        // Reload sound mag out
                    ModSounds.MAG_IN.get(),         // Reload sound mag in
                    ModSounds.RELOAD_END.get(),           // Reload sound end
                    ModSounds.COPPER_GUN_JAM.get(),      // Ejector sound pull
                    ModSounds.COPPER_GUN_JAM.get()    // Ejector sound release
            )
    );

    public static final RegistryObject<AnimatedGunItem> PIPEGUN = REGISTER.register("pipegun",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(600),
                    "pipegun", // Model path
                    ModSounds.MAG_OUT.get(),        // Reload sound mag out
                    ModSounds.MAG_IN.get(),         // Reload sound mag in
                    ModSounds.RELOAD_END.get(),           // Reload sound end
                    ModSounds.COPPER_GUN_JAM.get(),      // Ejector sound pull
                    ModSounds.COPPER_GUN_JAM.get()    // Ejector sound release
            )
    );

    public static final RegistryObject<AnimatedGunItem> TRENCHBROOM = REGISTER.register("trenchbroom",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "trenchbroom",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> BIG_PIPE = REGISTER.register("big_pipe",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(500),
                    "big_pipe",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> TRILEMMA = REGISTER.register("trilemma",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(400),
                    "trilemma",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );
//iron guns
    public static final RegistryObject<AnimatedGunItem> REPUBLIC_STANDARD = REGISTER.register("republic_standard",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "republic_standard",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> SELF_LOADING_RIFLE = REGISTER.register("self_loading_rifle",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "self_loading_rifle",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> M928_STORMSURGE = REGISTER.register("m928_stormsurge",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "m928_stormsurge",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> BIG_BETSY = REGISTER.register("big_betsy",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(600),
                    "big_betsy",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> PEST_CONTROL_SHOTGUN = REGISTER.register("pest_control_shotgun",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "pest_control_shotgun",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> CAVE_CLEANER = REGISTER.register("cave_cleaner",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(600),
                    "cave_cleaner",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> WOODPECKER = REGISTER.register("woodpecker",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "woodpecker",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );
//diamond guns
    public static final RegistryObject<AnimatedGunItem> SAND_DEFENDER = REGISTER.register("sand_defender",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "sand_defender",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> AMBASSADOR = REGISTER.register("ambassador",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "ambassador",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> M3_RIFLE = REGISTER.register("m3_rifle",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "m3_rifle",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> GRUNT_RIFLE = REGISTER.register("grunt_rifle",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "grunt_rifle",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> VARIABLE_CONTROL_SHOTGUN = REGISTER.register("variable_control_shotgun",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "variable_control_shotgun",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> WARTHOG = REGISTER.register("warthog",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "warthog",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> M922_BARRAGE = REGISTER.register("m922_barrage",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1200),
                    "m922_barrage",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    //nether guns

    public static final RegistryObject<AnimatedGunItem> JUNGLE_FIGHTER = REGISTER.register("jungle_fighter",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "jungle_fighter",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> MAD_MINUTE = REGISTER.register("mad_minute",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "mad_minute",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> HAYMAKER = REGISTER.register("haymaker",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "haymaker",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> HOG_TENDERIZER = REGISTER.register("hog_tenderizer",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "hog_tenderizer",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> NETHER_FIGHTER = REGISTER.register("nether_fighter",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(950),
                    "nether_fighter",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> DOOR_KNOCKER = REGISTER.register("door_knocker",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "door_knocker",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> TOP_BREAK = REGISTER.register("top_break",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(850),
                    "top_break",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> TOP_LOADER = REGISTER.register("top_loader",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "top_loader",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> GHAST_SWATTER = REGISTER.register("ghast_swatter",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "ghast_swatter",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> METAL_JACKET_RIFLE = REGISTER.register("metal_jacket_rifle",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "metal_jacket_rifle",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> LAMP_SMG = REGISTER.register("lamp_smg",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1050),
                    "lamp_smg",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );
//ocean guns
    public static final RegistryObject<AnimatedGunItem> NEPTUNE_SPEAR = REGISTER.register("neptune_spear",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "neptune_spear",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> PIRATE_THUMPER = REGISTER.register("pirate_thumper",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "pirate_thumper",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> TIDE_WALKER = REGISTER.register("tide_walker",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "tide_walker",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> WHALEFALL = REGISTER.register("whalefall",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "whalefall",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> SAND_BUSTER = REGISTER.register("sand_buster",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "sand_buster",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> CORAL_HUNTER = REGISTER.register("coral_hunter",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "coral_hunter",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> M8_BENTH = REGISTER.register("m8_benth",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "m8_benth",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );

    public static final RegistryObject<AnimatedGunItem> M11_PELAGIC = REGISTER.register("m11_pelagic",
            () -> new AnimatedDiamondSteelGunItem(
                    new Item.Properties().stacksTo(1).durability(1400),
                    "m11_pelagic",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            )
    );


    //ARMOR
    public static final RegistryObject<Item> COPPER_LIGHT_ARMOR_HELMET = REGISTER.register("copper_light_armor_helmet", () -> new Copper_Light_ArmorItem(ModArmorMaterials.COPPER_LIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LIGHT_ARMOR_CHESTPLATE = REGISTER.register("copper_light_armor_chestplate", () -> new Copper_Light_ArmorItem(ModArmorMaterials.COPPER_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LIGHT_ARMOR_LEGGINGS = REGISTER.register("copper_light_armor_leggings", () -> new Copper_Light_ArmorItem(ModArmorMaterials.COPPER_LIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LIGHT_ARMOR_BOOTS = REGISTER.register("copper_light_armor_boots", () -> new Copper_Light_ArmorItem(ModArmorMaterials.COPPER_LIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HEAVY_ARMOR_HELMET = REGISTER.register("copper_heavy_armor_helmet", () -> new Copper_Heavy_ArmorItem(ModArmorMaterials.COPPER_HEAVY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HEAVY_ARMOR_CHESTPLATE = REGISTER.register("copper_heavy_armor_chestplate", () -> new Copper_Heavy_ArmorItem(ModArmorMaterials.COPPER_HEAVY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HEAVY_ARMOR_LEGGINGS = REGISTER.register("copper_heavy_armor_leggings", () -> new Copper_Heavy_ArmorItem(ModArmorMaterials.COPPER_HEAVY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HEAVY_ARMOR_BOOTS = REGISTER.register("copper_heavy_armor_boots", () -> new Copper_Heavy_ArmorItem(ModArmorMaterials.COPPER_HEAVY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_LIGHT_ARMOR_HELMET = REGISTER.register("iron_light_armor_helmet", () -> new Iron_Light_ArmorItem(ModArmorMaterials.IRON_LIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LIGHT_ARMOR_CHESTPLATE = REGISTER.register("iron_light_armor_chestplate", () -> new Iron_Light_ArmorItem(ModArmorMaterials.IRON_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LIGHT_ARMOR_LEGGINGS = REGISTER.register("iron_light_armor_leggings", () -> new Iron_Light_ArmorItem(ModArmorMaterials.IRON_LIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LIGHT_ARMOR_BOOTS = REGISTER.register("iron_light_armor_boots", () -> new Iron_Light_ArmorItem(ModArmorMaterials.IRON_LIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HEAVY_ARMOR_HELMET = REGISTER.register("iron_heavy_armor_helmet", () -> new Iron_Heavy_ArmorItem(ModArmorMaterials.IRON_HEAVY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HEAVY_ARMOR_CHESTPLATE = REGISTER.register("iron_heavy_armor_chestplate", () -> new Iron_Heavy_ArmorItem(ModArmorMaterials.IRON_HEAVY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HEAVY_ARMOR_LEGGINGS = REGISTER.register("iron_heavy_armor_leggings", () -> new Iron_Heavy_ArmorItem(ModArmorMaterials.IRON_HEAVY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HEAVY_ARMOR_BOOTS = REGISTER.register("iron_heavy_armor_boots", () -> new Iron_Heavy_ArmorItem(ModArmorMaterials.IRON_HEAVY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_LIGHT_ARMOR_HELMET = REGISTER.register("diamond_light_armor_helmet", () -> new Diamond_Light_ArmorItem(ModArmorMaterials.DIAMOND_LIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LIGHT_ARMOR_CHESTPLATE = REGISTER.register("diamond_light_armor_chestplate", () -> new Diamond_Light_ArmorItem(ModArmorMaterials.DIAMOND_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LIGHT_ARMOR_LEGGINGS = REGISTER.register("diamond_light_armor_leggings", () -> new Diamond_Light_ArmorItem(ModArmorMaterials.DIAMOND_LIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LIGHT_ARMOR_BOOTS = REGISTER.register("diamond_light_armor_boots", () -> new Diamond_Light_ArmorItem(ModArmorMaterials.DIAMOND_LIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HEAVY_ARMOR_HELMET = REGISTER.register("diamond_heavy_armor_helmet", () -> new Diamond_Heavy_ArmorItem(ModArmorMaterials.DIAMOND_HEAVY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HEAVY_ARMOR_CHESTPLATE = REGISTER.register("diamond_heavy_armor_chestplate", () -> new Diamond_Heavy_ArmorItem(ModArmorMaterials.DIAMOND_HEAVY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HEAVY_ARMOR_LEGGINGS = REGISTER.register("diamond_heavy_armor_leggings", () -> new Diamond_Heavy_ArmorItem(ModArmorMaterials.DIAMOND_HEAVY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HEAVY_ARMOR_BOOTS = REGISTER.register("diamond_heavy_armor_boots", () -> new Diamond_Heavy_ArmorItem(ModArmorMaterials.DIAMOND_HEAVY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> NETHER_LIGHT_ARMOR_HELMET = REGISTER.register("nether_light_armor_helmet", () -> new Nether_Light_ArmorItem(ModArmorMaterials.NETHER_LIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_LIGHT_ARMOR_CHESTPLATE = REGISTER.register("nether_light_armor_chestplate", () -> new Nether_Light_ArmorItem(ModArmorMaterials.NETHER_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_LIGHT_ARMOR_LEGGINGS = REGISTER.register("nether_light_armor_leggings", () -> new Nether_Light_ArmorItem(ModArmorMaterials.NETHER_LIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_LIGHT_ARMOR_BOOTS = REGISTER.register("nether_light_armor_boots", () -> new Nether_Light_ArmorItem(ModArmorMaterials.NETHER_LIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_MEDIUM_ARMOR_HELMET = REGISTER.register("nether_medium_armor_helmet", () -> new  Nether_Medium_ArmorItem(ModArmorMaterials.NETHER_MEDIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_MEDIUM_ARMOR_CHESTPLATE = REGISTER.register("nether_medium_armor_chestplate", () -> new  Nether_Medium_ArmorItem(ModArmorMaterials.NETHER_MEDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_MEDIUM_ARMOR_BOOTS = REGISTER.register("nether_medium_armor_boots", () -> new Nether_Medium_ArmorItem(ModArmorMaterials.NETHER_MEDIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> OCEAN_LIGHT_ARMOR_HELMET = REGISTER.register("ocean_light_armor_helmet", () -> new Ocean_Light_ArmorItem(ModArmorMaterials.OCEAN_LIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_LIGHT_ARMOR_CHESTPLATE = REGISTER.register("ocean_light_armor_chestplate", () -> new Ocean_Light_ArmorItem(ModArmorMaterials.OCEAN_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_LIGHT_ARMOR_LEGGINGS = REGISTER.register("ocean_light_armor_leggings", () -> new Ocean_Light_ArmorItem(ModArmorMaterials.OCEAN_LIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_LIGHT_ARMOR_BOOTS = REGISTER.register("ocean_light_armor_boots", () -> new Ocean_Light_ArmorItem(ModArmorMaterials.OCEAN_LIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_MEDIUM_ARMOR_HELMET = REGISTER.register("ocean_medium_armor_helmet", () -> new Ocean_Medium_ArmorItem(ModArmorMaterials.OCEAN_MEDIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_MEDIUM_ARMOR_CHESTPLATE = REGISTER.register("ocean_medium_armor_chestplate", () -> new Ocean_Medium_ArmorItem(ModArmorMaterials.OCEAN_MEDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_MEDIUM_ARMOR_LEGGINGS = REGISTER.register("ocean_medium_armor_leggings", () -> new Ocean_Medium_ArmorItem(ModArmorMaterials.OCEAN_MEDIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_MEDIUM_ARMOR_BOOTS = REGISTER.register("ocean_medium_armor_boots", () -> new Ocean_Medium_ArmorItem(ModArmorMaterials.OCEAN_MEDIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //blueprint
    //public static final RegistryObject<Item> ADVANCED_COPPER_BLUPRINT = REGISTER.register("gravekeeper_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));
    //public static final RegistryObject<Item> ADVANCED_IRON_BLUPRINT = REGISTER.register("gravekeeper_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));
    //public static final RegistryObject<Item> ADVANCED_DIAMOND_BLUPRINT = REGISTER.register("gravekeeper_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));
    //public static final RegistryObject<Item> ADVANCED_NETHER_BLUPRINT = REGISTER.register("gravekeeper_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));
    //public static final RegistryObject<Item> ADVANCED_OCEAN_BLUPRINT = REGISTER.register("gravekeeper_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));



    //other items
    public static final RegistryObject<Item> LESSER_STRAWMAN = REGISTER.register("lesser_strawman",
            () -> new TooltipItem(new Item.Properties(),
                    "item.scguns_bb.lesser_strawman.tooltip",
                    "item.scguns.found_in_raids"));

    private static RegistryObject<Item> sequencedIngredient(String name) {
        if (CREATE_ENABLED) {
            return REGISTER.register(name, () -> ModCompatItems.getSequencedItem(name));
        }
        return REGISTER.register(name, () -> new Item(new Item.Properties()));
    }
}
