package net.blumountain.scguns_bb.datagen.providers;

import net.blumountain.scguns_bb.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static net.blumountain.scguns_bb.SCGunsBB.MOD_ID;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GRAVEKEEPER_BLUEPRINT);
        //simpleItem(ModItems.THE_HUNGER);


        simpleItem(ModItems.LESSER_STRAWMAN);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(MOD_ID, "item/" + item.getId().getPath()));
    }
}
