package net.blumountain.scguns_bb.client.render.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;
import net.blumountain.scguns_bb.item.animated.Ocean_Medium_ArmorItem;

public class Ocean_Medium_ArmorRenderer extends GeoArmorRenderer<Ocean_Medium_ArmorItem> {
    public Ocean_Medium_ArmorRenderer() {
        super(new Ocean_Medium_ArmorModel());
    }
}