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