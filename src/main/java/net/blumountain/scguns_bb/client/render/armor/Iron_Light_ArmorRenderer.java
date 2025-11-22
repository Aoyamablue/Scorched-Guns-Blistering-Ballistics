package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Iron_Light_ArmorItem;

public class Iron_Light_ArmorRenderer extends GeoArmorRenderer<Iron_Light_ArmorItem> {
    public Iron_Light_ArmorRenderer() {
        super(new Iron_Light_ArmorModel());
    }
}