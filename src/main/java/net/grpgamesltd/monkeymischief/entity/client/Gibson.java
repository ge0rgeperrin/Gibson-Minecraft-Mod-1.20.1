package net.grpgamesltd.monkeymischief.entity.client;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.grpgamesltd.monkeymischief.entity.animation.ModAnimations;
import net.grpgamesltd.monkeymischief.entity.custom.GibsonEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Gibson<T extends GibsonEntity> extends SinglePartEntityModel<T> {

	private final ModelPart Gibson;
	private final ModelPart head;
	public Gibson(ModelPart root) {
		this.Gibson = root.getChild("Gibson");
		this.head = root.getChild("Gibson").getChild("body").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Gibson = modelPartData.addChild("Gibson", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

		ModelPartData body = Gibson.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(14, 0).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 4.0F, 1.0F));

		ModelPartData RightArm = body.addChild("RightArm", ModelPartBuilder.create().uv(10, 15).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.25F)), ModelTransform.pivot(-2.0F, -1.0F, 1.0F));

		ModelPartData RLowerArm = RightArm.addChild("RLowerArm", ModelPartBuilder.create().uv(14, 10).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, 0.0F));

		ModelPartData LeftArm = body.addChild("LeftArm", ModelPartBuilder.create().uv(6, 15).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.25F)), ModelTransform.pivot(2.0F, -1.0F, 1.0F));

		ModelPartData LLowerArm = LeftArm.addChild("LLowerArm", ModelPartBuilder.create().uv(14, 5).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 8).cuboid(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(14, 17).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.25F)), ModelTransform.of(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(14, 17).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.25F)), ModelTransform.of(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData MouthTop = head.addChild("MouthTop", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, -2.0F));

		ModelPartData cube_r3 = MouthTop.addChild("cube_r3", ModelPartBuilder.create().uv(18, 5).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData MouthBottom = head.addChild("MouthBottom", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -1.0F));

		ModelPartData cube_r4 = MouthBottom.addChild("cube_r4", ModelPartBuilder.create().uv(18, 10).cuboid(-1.0F, -1.1736F, -0.9848F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(GibsonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.walk, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnim, ModAnimations.idle, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
		headPitch = MathHelper.clamp(headYaw, -25.0f, 45.0f);
		this.head.yaw = headYaw * 0.017453292f;
		this.head.pitch = headPitch * 0.017453292f;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Gibson.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Gibson;
	}

}