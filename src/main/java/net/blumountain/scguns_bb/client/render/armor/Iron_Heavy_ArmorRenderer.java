package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Iron_Heavy_ArmorItem;

public class Iron_Heavy_ArmorRenderer extends GeoArmorRenderer<Iron_Heavy_ArmorItem> {
    public Iron_Heavy_ArmorRenderer() {
        super(new Iron_Heavy_ArmorModel());
    }
}