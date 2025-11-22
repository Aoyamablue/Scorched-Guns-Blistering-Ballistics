package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Ocean_Light_ArmorItem;

public class Ocean_Light_ArmorModel extends GeoModel<Ocean_Light_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Ocean_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/ocean_light_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Ocean_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/ocean_light_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Ocean_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/ocean_light_armor.animation.json");
    }
}