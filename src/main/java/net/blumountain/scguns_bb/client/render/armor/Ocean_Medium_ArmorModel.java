package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Ocean_Medium_ArmorItem;

public class Ocean_Medium_ArmorModel extends GeoModel<Ocean_Medium_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Ocean_Medium_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/ocean_medium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Ocean_Medium_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/ocean_medium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Ocean_Medium_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/ocean_medium_armor.animation.json");
    }
}