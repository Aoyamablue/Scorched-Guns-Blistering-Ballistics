package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Nether_Light_ArmorItem;

public class Nether_Light_ArmorModel extends GeoModel<Nether_Light_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Nether_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/nether_light_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Nether_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/nether_light_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Nether_Light_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/nether_light_armor.animation.json");
    }
}