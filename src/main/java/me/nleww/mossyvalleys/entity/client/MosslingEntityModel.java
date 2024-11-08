package me.nleww.mossyvalleys.entity.client;


import me.nleww.mossyvalleys.entity.custom.MosslingEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;



public class MosslingEntityModel<T extends MosslingEntity> extends SinglePartEntityModel<T> {
    private final ModelPart Mossling;

    public MosslingEntityModel(ModelPart root) {
        this.Mossling = root.getChild("Mossling");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Mossling = modelPartData.addChild("Mossling", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData head = Mossling.addChild("head", ModelPartBuilder.create().uv(1, 34).cuboid(1.7667F, -0.5655F, 1.5464F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(1, 29).cuboid(-4.2333F, -0.5655F, 1.5464F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.1145F, -6.5316F, 1.4986F, 0.0577F, -0.0162F, -0.0714F));
        ModelPartData hair_r1 = head.addChild("hair_r1", ModelPartBuilder.create().uv(15, 20).cuboid(-3.0F, -2.0F, -2.0F, 8.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.2333F, -2.5655F, -1.7536F, 0.0333F, 0.314F, 0.2932F));
        ModelPartData hair_r2 = head.addChild("hair_r2", ModelPartBuilder.create().uv(10, 17).cuboid(-5.0F, -2.0F, -4.0F, 10.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.2333F, -2.5655F, -1.7536F, -0.0873F, 0.0F, -0.0873F));
        ModelPartData body_r1 = head.addChild("body_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -7.0F, -5.0F, 12.0F, 7.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-0.2333F, 3.4345F, -1.7536F, 0.0074F, -0.0055F, 0.0021F));
        ModelPartData legFrontLeft = Mossling.addChild("legFrontLeft", ModelPartBuilder.create().uv(0, 19).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -3.001F, 3.0436F));
        ModelPartData legFrontRight = Mossling.addChild("legFrontRight", ModelPartBuilder.create().uv(9, 19).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -3.0F, 3.0F));
        ModelPartData legBackLeft = Mossling.addChild("legBackLeft", ModelPartBuilder.create().uv(9, 19).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -3.0F, -3.0F));
        ModelPartData legBackRight = Mossling.addChild("legBackRight", ModelPartBuilder.create().uv(9, 19).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -3.0F, -3.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        Mossling.render(matrices, vertices, light, overlay);

    }

    @Override
    public ModelPart getPart() {
        return null;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}