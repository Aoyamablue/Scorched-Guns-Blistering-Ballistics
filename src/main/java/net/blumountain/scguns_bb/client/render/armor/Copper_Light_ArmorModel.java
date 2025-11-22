package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Copper_Light_ArmorItem;

public class Copper_Light_ArmorModel extends GeoModel<Copper_Light_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Copper_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/copper_light_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Copper_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/copper_light_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Copper_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/copper_light_armor.animation.json");
    }
}