package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Nether_Light_ArmorItem;

public class Nether_Light_ArmorRenderer extends GeoArmorRenderer<Nether_Light_ArmorItem> {
    public Nether_Light_ArmorRenderer() {
        super(new Nether_Light_ArmorModel());
    }
}