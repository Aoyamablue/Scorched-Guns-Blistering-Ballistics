package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Diamond_Heavy_ArmorItem;

public class Diamond_Heavy_ArmorModel extends GeoModel<Diamond_Heavy_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Diamond_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/diamond_heavy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Diamond_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/diamond_heavy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Diamond_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/diamond_heavy_armor.animation.json");
    }
}