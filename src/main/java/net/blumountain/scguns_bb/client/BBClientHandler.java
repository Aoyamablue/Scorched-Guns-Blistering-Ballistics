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


    }}

