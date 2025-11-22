package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Nether_Medium_ArmorItem;

public class Nether_Medium_ArmorRenderer extends GeoArmorRenderer<Nether_Medium_ArmorItem> {
    public Nether_Medium_ArmorRenderer() {
        super(new Nether_Medium_ArmorModel());
    }
}