package net.blumountain.scguns_bb.events.client;

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
    STRUMM88_NO_SIGHTS("strumm88/no_sights"),
    STRUMM88_BOLT("strumm88/bolt"),
    STRUMM88_STOCK_LIGHT("strumm88/light_stock"),
    STRUMM88_STOCK_HEAVY("strumm88/stock_weighted"),
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
