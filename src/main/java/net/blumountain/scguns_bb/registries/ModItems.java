package net.blumountain.scguns_bb.registries;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ribs.scguns.init.ModSounds;
import top.ribs.scguns.item.BlueprintItem;
import top.ribs.scguns.item.TooltipItem;
import top.ribs.scguns.item.animated.AnimatedGunItem;

import static net.blumountain.scguns_bb.SCGunsBB.MOD_ID;
import static net.blumountain.scguns_bb.CompatManager.CREATE_ENABLED;

public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);


    public static final RegistryObject<AnimatedGunItem> STRUMM88 = REGISTER.register("strumm88",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(800),
                    "strumm88", // Model path
                    ModSounds.MAG_OUT.get(),        // Reload sound mag out
                    ModSounds.MAG_IN.get(),         // Reload sound mag in
                    ModSounds.RELOAD_END.get(),           // Reload sound end
                    ModSounds.COPPER_GUN_JAM.get(),      // Ejector sound pull
                    ModSounds.COPPER_GUN_JAM.get()    // Ejector sound release
            )
    );


    //blueprint
    public static final RegistryObject<Item> GRAVEKEEPER_BLUEPRINT = REGISTER.register("gravekeeper_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));

    //arounds

    //public static final RegistryObject<Item> THE_HUNGER = REGISTER.register("hunger", () -> new AmmoItem(new Item.Properties()));

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
