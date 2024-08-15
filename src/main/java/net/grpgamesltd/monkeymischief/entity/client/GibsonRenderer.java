package net.grpgamesltd.monkeymischief.entity.client;

import net.grpgamesltd.monkeymischief.MonkeyMischief;
import net.grpgamesltd.monkeymischief.entity.custom.GibsonEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GibsonRenderer extends MobEntityRenderer<GibsonEntity, Gibson<GibsonEntity>> {
    private static final Identifier TEXTURE = new Identifier(MonkeyMischief.MOD_ID, "textures/entity/gibson.png");

    public GibsonRenderer(EntityRendererFactory.Context context) {
        super(context, new Gibson<>(context.getPart(ModModelLayers.GIBSON)), 0.25f);
    }

    @Override
    public Identifier getTexture(GibsonEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GibsonEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(1f,1f, 1f);
        } else {
            matrixStack.scale(1.5f,1.5f, 1.5f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
