package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Ocean_Light_ArmorItem;

public class Ocean_Light_ArmorRenderer extends GeoArmorRenderer<Ocean_Light_ArmorItem> {
    public Ocean_Light_ArmorRenderer() {
        super(new Ocean_Light_ArmorModel());
    }
}