package net.blumountain.scguns_bb.client.render.armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import net.blumountain.scguns_bb.Reference;
import net.blumountain.scguns_bb.item.animated.Iron_Heavy_ArmorItem;

public class Iron_Heavy_ArmorModel extends GeoModel<Iron_Heavy_ArmorItem> {
    @Override
    public ResourceLocation getModelResource(Iron_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "geo/iron_heavy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Iron_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "textures/armor/iron_heavy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Iron_Heavy_ArmorItem animatable) {
        return new ResourceLocation(Reference.MOD_ID, "animations/iron_heavy_armor.animation.json");
    }
}