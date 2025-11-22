package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Diamond_Light_ArmorItem;

public class Diamond_Light_ArmorModel extends GeoModel<Diamond_Light_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Diamond_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/diamond_light_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Diamond_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/diamond_light_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Diamond_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/diamond_light_armor.animation.json");
    }
}