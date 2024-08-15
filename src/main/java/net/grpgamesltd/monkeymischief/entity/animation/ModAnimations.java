package net.grpgamesltd.monkeymischief.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {
        public static final Animation idle = Animation.Builder.create(5.625F).looping()
                .addBoneAnimation("Gibson", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.1643F, 0.7996F, 4.8046F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RLowerArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LLowerArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("MouthTop", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.0417F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.25F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(3.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(5.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("MouthBottom", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.0417F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.25F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(3.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(5.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .build();

        public static final Animation walk = Animation.Builder.create(1.0F).looping()
                .addBoneAnimation("Gibson", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -1.32F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.15F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.3333F, AnimationHelper.createRotationalVector(10.0F, -17.5F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(7.5F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.1643F, 0.7996F, 4.8046F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-35.5824F, -1.7766F, 23.7703F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.4583F, AnimationHelper.createRotationalVector(9.6094F, -4.6361F, 10.6076F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75F, AnimationHelper.createRotationalVector(54.267F, -1.2613F, 19.9772F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.0F, AnimationHelper.createRotationalVector(1.1643F, 0.7996F, 4.8046F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2083F, AnimationHelper.createRotationalVector(69.6967F, -0.9051F, -9.7292F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.4583F, AnimationHelper.createRotationalVector(7.2478F, -0.2761F, -14.6897F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.75F, AnimationHelper.createRotationalVector(-40.5419F, 2.2838F, -35.0185F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RLowerArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LLowerArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .build();

        public static final Animation death = Animation.Builder.create(0.2917F)
                .addBoneAnimation("Gibson", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createRotationalVector(75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Gibson", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -9.0F, -2.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-7.5694F, 37.0127F, -7.5363F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, -1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.1643F, 0.7996F, 4.8046F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createRotationalVector(7.9753F, -19.8217F, 47.2801F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RightArm", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(-3.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-160.0F, -28.2693F, 33.1543F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(2.0F, 1.0F, -2.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("RLowerArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("LLowerArm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR)
                ))
                .build();
}

