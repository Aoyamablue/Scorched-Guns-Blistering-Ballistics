package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Diamond_Heavy_ArmorItem;

public class Diamond_Heavy_ArmorRenderer extends GeoArmorRenderer<Diamond_Heavy_ArmorItem> {
    public Diamond_Heavy_ArmorRenderer() {
        super(new Diamond_Heavy_ArmorModel());
    }
}