package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Copper_Light_ArmorItem;

public class Copper_Light_ArmorRenderer extends GeoArmorRenderer<Copper_Light_ArmorItem> {
    public Copper_Light_ArmorRenderer() {
        super(new Copper_Light_ArmorModel());
    }
}