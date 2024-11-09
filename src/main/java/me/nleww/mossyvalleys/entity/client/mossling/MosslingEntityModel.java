package me.nleww.mossyvalleys.entity.client.mossling;

import me.nleww.mossyvalleys.entity.animation.ModAnimations;
import me.nleww.mossyvalleys.entity.custom.MosslingEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;


public class MosslingEntityModel<T extends MosslingEntity> extends SinglePartEntityModel<T> {
    private final ModelPart Mossling;
    private final ModelPart Body;
    private final ModelPart plant;
    private final ModelPart LegFrontRight;
    private final ModelPart LegBackLeft;
    private final ModelPart LegBackRight;
    private final ModelPart LegFrontLeft;
    public MosslingEntityModel(ModelPart root) {
        this.Mossling = root.getChild("Mossling");
        this.Body = this.Mossling.getChild("Body");
        this.plant = this.Body.getChild("plant");
        this.LegFrontRight = this.Mossling.getChild("LegFrontRight");
        this.LegBackLeft = this.Mossling.getChild("LegBackLeft");
        this.LegBackRight = this.Mossling.getChild("LegBackRight");
        this.LegFrontLeft = this.Mossling.getChild("LegFrontLeft");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Mossling = modelPartData.addChild("Mossling", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData Body = Mossling.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -6.4F, -6.0F, 8.0F, 4.0F, 12.0F, new Dilation(0.0F))
                .uv(0, 16).cuboid(-3.3F, -7.2F, -4.2F, 7.0F, 2.0F, 10.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(-1.6F, -7.6F, -1.2F, 5.0F, 2.0F, 6.0F, new Dilation(0.0F))
                .uv(34, 37).cuboid(-2.6F, -4.4F, -6.1F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(18, 36).cuboid(1.6F, -4.4F, -6.1F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -1.0F));

        ModelPartData plant = Body.addChild("plant", ModelPartBuilder.create().uv(18, 38).cuboid(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -7.0F, 2.0F));

        ModelPartData stem_r1 = plant.addChild("stem_r1", ModelPartBuilder.create().uv(20, 38).cuboid(-1.5F, -2.0F, -0.5F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData cube_r1 = plant.addChild("cube_r1", ModelPartBuilder.create().uv(22, 28).cuboid(-4.5F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -1.0F, 0.0F, 0.4353F, 0.0085F, 0.3978F));

        ModelPartData LegFrontRight = Mossling.addChild("LegFrontRight", ModelPartBuilder.create().uv(28, 32).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, -4.0F));

        ModelPartData LegBackLeft = Mossling.addChild("LegBackLeft", ModelPartBuilder.create().uv(34, 16).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 36).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -4.0F, 3.0F));

        ModelPartData LegBackRight = Mossling.addChild("LegBackRight", ModelPartBuilder.create().uv(34, 22).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 36).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, 3.0F));

        ModelPartData LegFrontLeft = Mossling.addChild("LegFrontLeft", ModelPartBuilder.create().uv(22, 32).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(34, 32).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -4.0F, -4.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        Mossling.render(matrices, vertexConsumer, light, overlay);
    }

    @Override
    public ModelPart getPart() {
        return Mossling;
    }


    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.animateMovement(ModAnimations.MosslingWalk, limbAngle, limbDistance, 2f, 2.5f);
    }
}