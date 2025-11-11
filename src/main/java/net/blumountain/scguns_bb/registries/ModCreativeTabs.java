package net.blumountain.scguns_bb.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import top.ribs.scguns.init.ModCreativeModeTabs;

import static net.blumountain.scguns_bb.SCGunsBB.MOD_ID;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);


    public static final RegistryObject<CreativeModeTab> SCGUNS_BB_TAB = CREATIVE_MODE_TABS.register("scguns_bb_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STRUMM88.get())).title(Component.translatable("creativetab.scguns_bb_tab")).displayItems((pParameters, pOutput) -> {

        addItemWithFullAmmo(pOutput, ModItems.STRUMM88.get());
        addItemWithFullAmmo(pOutput, ModItems.PIPEGUN.get());
        addItemWithFullAmmo(pOutput, ModItems.BIG_PIPE.get());
        addItemWithFullAmmo(pOutput, ModItems.TRENCHBROOM.get());
        addItemWithFullAmmo(pOutput, ModItems.TRILEMMA.get());
        addItemWithFullAmmo(pOutput, ModItems.REPUBLIC_STANDARD.get());
        addItemWithFullAmmo(pOutput, ModItems.M928_STORMSURGE.get());
        addItemWithFullAmmo(pOutput, ModItems.WOODPECKER.get());
        addItemWithFullAmmo(pOutput, ModItems.PEST_CONTROL_SHOTGUN.get());
        addItemWithFullAmmo(pOutput, ModItems.SELF_LOADING_RIFLE.get());
        addItemWithFullAmmo(pOutput, ModItems.BIG_BETSY.get());
        addItemWithFullAmmo(pOutput, ModItems.CAVE_CLEANER.get());
        addItemWithFullAmmo(pOutput, ModItems.SAND_DEFENDER.get());
        addItemWithFullAmmo(pOutput, ModItems.AMBASSADOR.get());
        addItemWithFullAmmo(pOutput, ModItems.VARIABLE_CONTROL_SHOTGUN.get());
        addItemWithFullAmmo(pOutput, ModItems.M3_RIFLE.get());
        addItemWithFullAmmo(pOutput, ModItems.GRUNT_RIFLE.get());
        addItemWithFullAmmo(pOutput, ModItems.WARTHOG.get());
        addItemWithFullAmmo(pOutput, ModItems.M922_BARRAGE.get());
        addItemWithFullAmmo(pOutput, ModItems.NETHER_FIGHTER.get());
        addItemWithFullAmmo(pOutput, ModItems.TOP_BREAK.get());
        addItemWithFullAmmo(pOutput, ModItems.HAYMAKER.get());
        addItemWithFullAmmo(pOutput, ModItems.JUNGLE_FIGHTER.get());
        addItemWithFullAmmo(pOutput, ModItems.DOOR_KNOCKER.get());
        addItemWithFullAmmo(pOutput, ModItems.GHAST_SWATTER.get());
        addItemWithFullAmmo(pOutput, ModItems.MAD_MINUTE.get());
        addItemWithFullAmmo(pOutput, ModItems.METAL_JACKET_RIFLE.get());
        addItemWithFullAmmo(pOutput, ModItems.TOP_LOADER.get());
        addItemWithFullAmmo(pOutput, ModItems.HOG_TENDERIZER.get());
        addItemWithFullAmmo(pOutput, ModItems.LAMP_SMG.get());
        addItemWithFullAmmo(pOutput, ModItems.NEPTUNE_SPEAR.get());
        addItemWithFullAmmo(pOutput, ModItems.M8_BENTH.get());
        addItemWithFullAmmo(pOutput, ModItems.M11_PELAGIC.get());
        addItemWithFullAmmo(pOutput, ModItems.CORAL_HUNTER.get());
        addItemWithFullAmmo(pOutput, ModItems.SAND_BUSTER.get());
        addItemWithFullAmmo(pOutput, ModItems.PIRATE_THUMPER.get());
        addItemWithFullAmmo(pOutput, ModItems.TIDE_WALKER.get());
        addItemWithFullAmmo(pOutput, ModItems.WHALEFALL.get());



    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    private static void addItem(CreativeModeTab.Output output, Item item) {
        output.accept(item);
    }

    private static void addItemWithFullAmmo(CreativeModeTab.Output output, Item item) {
        ModCreativeModeTabs.CreativeTabHelper.addItemWithFullAmmo(output, item);
    }
}