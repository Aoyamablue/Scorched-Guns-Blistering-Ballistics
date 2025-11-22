package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Iron_Light_ArmorItem;

public class Iron_Light_ArmorModel extends GeoModel<Iron_Light_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Iron_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/iron_light_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Iron_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/iron_light_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Iron_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/iron_light_armor.animation.json");
    }
}