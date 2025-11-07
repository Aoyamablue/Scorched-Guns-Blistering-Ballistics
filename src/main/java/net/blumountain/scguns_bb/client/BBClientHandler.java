package net.blumountain.scguns_bb.client;

import net.blumountain.scguns_bb.client.render.gun.model.*;
import net.blumountain.scguns_bb.registries.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.ribs.scguns.client.render.gun.ModelOverrides;


import static net.blumountain.scguns_bb.SCGunsBB.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class BBClientHandler {
    public static void registerClientHandlers(IEventBus bus) {
        bus.addListener(BBClientHandler::onClientSetup);
    }

    private static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(BBClientHandler::setup);
    }

    public static void setup() {
        registerModelOverrides();
    }


    private static void registerModelOverrides() {
        ModelOverrides.register(ModItems.STRUMM88.get(), new Strumm88Model());
        ModelOverrides.register(ModItems.PIPEGUN.get(), new PipegunModel());

       // ModelOverrides.register(ModItems.AMBASSADOR.get(), new AmbassadorModel());
        //ModelOverrides.register(ModItems.BIG_BETSY.get(), new Big_betsyModel());
        //ModelOverrides.register(ModItems.BIG_PIPE.get(), new Big_pipeModel());
        //ModelOverrides.register(ModItems.CAVE_CLEANER.get(), new Cave_cleanerModel());
        //ModelOverrides.register(ModItems.CORAL_HUNTER.get(), new Coral_hunterModel());
        //ModelOverrides.register(ModItems.DOOR_KNOCKER.get(), new Door_knockerModel());
        //ModelOverrides.register(ModItems.GHAST_SWATTER.get(), new Ghast_swatterModel());
        //ModelOverrides.register(ModItems.GRUNT_RIFLE.get(), new Grunt_rifleModel());
        //ModelOverrides.register(ModItems.HAYMAKER.get(), new HaymakerModel());
       // ModelOverrides.register(ModItems.HOG_TENDERIZER.get(), new Hog_tenderizerModel());
       // ModelOverrides.register(ModItems.JUNGLE_FIGHTER.get(), new Jungle_fighterModel());
        //ModelOverrides.register(ModItems.LAMP_SMG.get(), new Lamp_smgModel());
        //ModelOverrides.register(ModItems.M11_PELAGIC.get(), new M11_pelagicModel());
       // ModelOverrides.register(ModItems.M3_RIFLE.get(), new M3_rifleModel());
       // ModelOverrides.register(ModItems.M8_BENTH.get(), new M8_benthModel());
        //ModelOverrides.register(ModItems.M922_BARRAGE.get(), new M922_barrageModel());
        //ModelOverrides.register(ModItems.M928_STORMSURGE.get(), new M928_stormsurgeModel());
        //ModelOverrides.register(ModItems.MAD_MINUTE.get(), new Mad_minuteModel());
        //ModelOverrides.register(ModItems.METAL_JACKET_RIFLE.get(), new Metal_jacket_rifleModel());
        //ModelOverrides.register(ModItems.NEPTUNE_SPEAR.get(), new Neptune_spearModel());
        //ModelOverrides.register(ModItems.NETHER_FIGHTER.get(), new Nether_fighterModel());
        //ModelOverrides.register(ModItems.PEST_CONTROL_SHOTGUN.get(), new Pest_control_shotgunModel());
       //ModelOverrides.register(ModItems.PIRATE_THUMPER.get(), new Pirate_thumperModel());
        //ModelOverrides.register(ModItems.REPUBLIC_STANDARD.get(), new Republic_standardModel());
        //ModelOverrides.register(ModItems.SAND_BUSTER.get(), new Sand_busterModel());
        //ModelOverrides.register(ModItems.SAND_DEFENDER.get(), new Sand_defenderModel());
        //ModelOverrides.register(ModItems.SELF_LOADING_RIFLE.get(), new Self_loading_rifleModel());
        //ModelOverrides.register(ModItems.TIDE_WALKER.get(), new Tide_walkerModel());
        //ModelOverrides.register(ModItems.TOP_BREAK.get(), new Top_breakModel());
        //ModelOverrides.register(ModItems.TOP_LOADER.get(), new Top_loaderModel());
        //ModelOverrides.register(ModItems.TRENCHBROOM.get(), new TrenchbroomModel());
       // ModelOverrides.register(ModItems.TRILEMMA.get(), new TrilemmaModel());
        //ModelOverrides.register(ModItems.VARIABLE_CONTROL_SHOTGUN.get(), new Variable_control_shotgunModel());
        //ModelOverrides.register(ModItems.WARTHOG.get(), new WarthogModel());
       // ModelOverrides.register(ModItems.WHALEFALL.get(), new WhalefallModel());
        //ModelOverrides.register(ModItems.WOODPECKER.get(), new WoodpeckerModel());


    }}

