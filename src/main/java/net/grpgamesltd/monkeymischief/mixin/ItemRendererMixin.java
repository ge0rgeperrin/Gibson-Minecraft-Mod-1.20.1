package net.grpgamesltd.monkeymischief.mixin;

import net.grpgamesltd.monkeymischief.MonkeyMischief;
import net.grpgamesltd.monkeymischief.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

    @Mixin(ItemRenderer.class)
    public abstract class ItemRendererMixin {
        @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
        public BakedModel useGibsonSlayerModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumerProvider, int light, int overlay){
            if (stack.isOf(ModItems.GIBSON_SLAYER) && renderMode != ModelTransformationMode.GUI) {
                return((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(MonkeyMischief.MOD_ID, "gibson_slayer", "inventory"));
            }
            return value;
        }
    }
