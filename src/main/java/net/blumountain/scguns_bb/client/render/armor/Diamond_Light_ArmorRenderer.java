package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Diamond_Light_ArmorItem;

public class Diamond_Light_ArmorRenderer extends GeoArmorRenderer<Diamond_Light_ArmorItem> {
    public Diamond_Light_ArmorRenderer() {
        super(new Diamond_Light_ArmorModel());
    }
}