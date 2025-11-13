package net.blumountain.scguns_bb.client.render.gun.model;

import com.mojang.blaze3d.vertex.PoseStack;
import net.blumountain.scguns_bb.client.BBSpecialModels;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import top.ribs.scguns.client.render.gun.IOverrideModel;
import top.ribs.scguns.client.util.RenderUtil;
import top.ribs.scguns.common.Gun;
import top.ribs.scguns.init.ModItems;
import top.ribs.scguns.item.attachment.IAttachment;

/**
 * Since we want to have an animation for the charging handle, we will be overriding the standard model rendering.
 * This also allows us to replace the model for the different stocks.
 */
public class Big_betsyModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext transformType, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrixStack, MultiBufferSource buffer, int light, int overlay) {

        RenderUtil.renderModel(BBSpecialModels.BIG_BETSY_MAIN.getModel(), stack, matrixStack, buffer, light, overlay);

        renderStockAttachments(stack, matrixStack, buffer, light, overlay);
        if (entity.equals(Minecraft.getInstance().player)) {
            matrixStack.pushPose();
            matrixStack.translate(0, -5.8 * 0.0625, 0);
            ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
            float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
            cooldown = (float) ease(cooldown);
            matrixStack.translate(0, 0, cooldown / 6);
            matrixStack.translate(0, 5.8 * 0.0625, 0);
            RenderUtil.renderModel(BBSpecialModels.BIG_BETSY_BOLT.getModel(), stack, matrixStack, buffer, light, overlay);
            matrixStack.popPose();
        }
    }

    private void renderStockAttachments(ItemStack stack, PoseStack matrixStack, MultiBufferSource buffer, int light, int overlay) {
        if (Gun.hasAttachmentEquipped(stack, IAttachment.Type.STOCK)) {
            if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WOODEN_STOCK.get())
                RenderUtil.renderModel(BBSpecialModels.BIG_BETSY_STOCK_WOODEN.getModel(), stack, matrixStack, buffer, light, overlay);
            else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.LIGHT_STOCK.get())
                RenderUtil.renderModel(BBSpecialModels.BIG_BETSY_STOCK_LIGHT.getModel(), stack, matrixStack, buffer, light, overlay);
            else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WEIGHTED_STOCK.get())
                RenderUtil.renderModel(BBSpecialModels.BIG_BETSY_STOCK_HEAVY.getModel(), stack, matrixStack, buffer, light, overlay);
        }
    }

    private double ease(double x) {
        return 1 - Math.pow(1 - (2 * x), 4);
    }
}
