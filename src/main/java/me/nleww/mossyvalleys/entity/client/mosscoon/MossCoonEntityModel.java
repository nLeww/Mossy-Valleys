package me.nleww.mossyvalleys.entity.client.mosscoon;

import me.nleww.mossyvalleys.entity.animation.ModAnimations;
import me.nleww.mossyvalleys.entity.custom.MossCoonEntity;


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

import static com.ibm.icu.impl.ValidIdentifiers.Datatype.x;

@SuppressWarnings("FieldCanBeLocal")
public class MossCoonEntityModel<T extends MossCoonEntity> extends SinglePartEntityModel<T> {
    private final ModelPart Body;
    private final ModelPart Legs;
    private final ModelPart LegBackLeft;
    private final ModelPart LegBackRight;
    private final ModelPart LegFrontLeft;
    private final ModelPart LegFrontRight;
    private final ModelPart Head;
    private final ModelPart Skull;
    private final ModelPart Tuff;
    private final ModelPart LeftEar;
    private final ModelPart RightEar;
    private final ModelPart Torso;
    private final ModelPart MainTorso;
    private final ModelPart UpperBody;
    private final ModelPart LowerBody;
    private final ModelPart Tail;

    public MossCoonEntityModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Legs = this.Body.getChild("Legs");
        this.LegBackLeft = this.Legs.getChild("LegBackLeft");
        this.LegBackRight = this.Legs.getChild("LegBackRight");
        this.LegFrontLeft = this.Legs.getChild("LegFrontLeft");
        this.LegFrontRight = this.Legs.getChild("LegFrontRight");
        this.Head = this.Body.getChild("Head");
        this.Skull = this.Head.getChild("Skull");
        this.Tuff = this.Skull.getChild("Tuff");
        this.LeftEar = this.Head.getChild("LeftEar");
        this.RightEar = this.Head.getChild("RightEar");
        this.Torso = this.Body.getChild("Torso");
        this.MainTorso = this.Torso.getChild("MainTorso");
        this.UpperBody = this.MainTorso.getChild("UpperBody");
        this.LowerBody = this.MainTorso.getChild("LowerBody");
        this.Tail = this.Torso.getChild("Tail");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 17.0F, 0.0F));
        ModelPartData Legs = Body.addChild("Legs", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 7.0F, -3.0F));
        ModelPartData LegBackLeft = Legs.addChild("LegBackLeft", ModelPartBuilder.create().uv(40, 0).cuboid(-2.0F, 0.0F, -1.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 9.0F));
        ModelPartData Shroom_r1 = LegBackLeft.addChild("Shroom_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 4.0F, -1.0F, 0.1309F, 0.0F, 0.1745F));
        ModelPartData LegBackRight = Legs.addChild("LegBackRight", ModelPartBuilder.create().uv(40, 7).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.0F, -4.0F, 9.0F));
        ModelPartData Flower_r1 = LegBackRight.addChild("Flower_r1", ModelPartBuilder.create().uv(-3, 17).cuboid(-1.0F, -1.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, 1.0F, 0.7042F, 1.1789F, -0.6784F));
        ModelPartData LegFrontLeft = Legs.addChild("LegFrontLeft", ModelPartBuilder.create().uv(32, 39).cuboid(-2.0F, 0.0F, -1.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -4.0F, 0.0F));
        ModelPartData LegFrontRight = Legs.addChild("LegFrontRight", ModelPartBuilder.create().uv(32, 32).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -4.0F, 0.0F));
        ModelPartData Head = Body.addChild("Head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, -5.0F));
        ModelPartData Skull = Head.addChild("Skull", ModelPartBuilder.create().uv(32, 16).cuboid(-5.0F, -6.0F, -4.0F, 10.0F, 6.0F, 5.0F, new Dilation(0.0F))
                .uv(32, 27).cuboid(-2.0F, -2.0F, -7.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(-2, 20).cuboid(-4.0F, -1.0F, -6.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, -1.0F));
        ModelPartData Flower2_r1 = Skull.addChild("Flower2_r1", ModelPartBuilder.create().uv(-2, 18).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, -3.0F, 1.0926F, -0.5986F, -0.549F));
        ModelPartData Flower_r2 = Skull.addChild("Flower_r2", ModelPartBuilder.create().uv(-3, 17).cuboid(-1.0F, -1.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -6.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
        ModelPartData Tuff = Skull.addChild("Tuff", ModelPartBuilder.create().uv(40, 14).cuboid(5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(40, 15).cuboid(-6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(12, 43).cuboid(5.0F, -4.0F, -4.0F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(16, 43).cuboid(-7.0F, -4.0F, -4.0F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData LeftEar = Head.addChild("LeftEar", ModelPartBuilder.create().uv(0, 43).cuboid(-5.0F, -8.0F, 4.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, -6.0F));
        ModelPartData RightEar = Head.addChild("RightEar", ModelPartBuilder.create().uv(5, 43).cuboid(2.0F, -8.0F, 4.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, -6.0F));
        ModelPartData Torso = Body.addChild("Torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData MainTorso = Torso.addChild("MainTorso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.0F, 0.0F));
        ModelPartData UpperBody = MainTorso.addChild("UpperBody", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -6.0F, -5.0F, 12.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData Stone_r1 = UpperBody.addChild("Stone_r1", ModelPartBuilder.create().uv(4, 20).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -6.0F, -1.0F, 0.0F, 0.0F, 1.1345F));
        ModelPartData Stone_r2 = UpperBody.addChild("Stone_r2", ModelPartBuilder.create().uv(0, 22).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -5.0F, 1.0F, 0.0F, 0.0F, 1.1345F));
        ModelPartData LowerBody = MainTorso.addChild("LowerBody", ModelPartBuilder.create().uv(0, 30).cuboid(-5.0F, -4.0F, 3.0F, 10.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));
        ModelPartData Tail = Torso.addChild("Tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 8.0F));
        ModelPartData Tail_r1 = Tail.addChild("Tail_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-3.0F, -2.0F, -4.0F, 6.0F, 4.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
        ModelPartData Flower_r3 = Tail.addChild("Flower_r3", ModelPartBuilder.create().uv(-3, 17).cuboid(-1.0F, -1.0F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 2.0F, 4.0F, -0.9628F, 0.4754F, -0.8637F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        Body.render(matrices, vertices, light, overlay, color);
    }

    private void SetHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30F, 30F);
        headPitch = MathHelper.clamp(headPitch, -25F, 45F);

        this.Head.yaw = headYaw * 0.017453292F;
        this.Head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public ModelPart getPart() {
        return Body;
    }

    @Override
    public void setAngles(MossCoonEntity entity, float limbAngle, float limbDistance, float animationProgress, float netheadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.SetHeadAngles(netheadYaw, headPitch);

        this.animateMovement(ModAnimations.MossCoonWalk, limbAngle, limbDistance, 2f, 2.5f);

    }
}