package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Copper_Heavy_ArmorItem;

public class Copper_Heavy_ArmorRenderer extends GeoArmorRenderer<Copper_Heavy_ArmorItem> {
    public Copper_Heavy_ArmorRenderer() {
        super(new Copper_Heavy_ArmorModel());
    }
}