package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Nether_Medium_ArmorItem;

public class Nether_Medium_ArmorModel extends GeoModel<Nether_Medium_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Nether_Medium_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/nether_medium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Nether_Medium_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/nether_medium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Nether_Medium_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/nether_medium_armor.animation.json");
    }
}