package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Copper_Heavy_ArmorItem;

public class Copper_Heavy_ArmorModel extends GeoModel<Copper_Heavy_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Copper_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/copper_heavy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Copper_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/copper_heavy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Copper_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/copper_heavy_armor.animation.json");
    }
}