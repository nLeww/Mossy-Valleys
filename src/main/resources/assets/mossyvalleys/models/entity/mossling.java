// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class mossling extends EntityModel<Entity> {
	private final ModelPart Mossling;
	private final ModelPart head;
	private final ModelPart legFrontLeft;
	private final ModelPart legFrontRight;
	private final ModelPart legBackLeft;
	private final ModelPart legBackRight;
	public mossling(ModelPart root) {
		this.Mossling = root.getChild("Mossling");
		this.head = this.Mossling.getChild("head");
		this.legFrontLeft = this.Mossling.getChild("legFrontLeft");
		this.legFrontRight = this.Mossling.getChild("legFrontRight");
		this.legBackLeft = this.Mossling.getChild("legBackLeft");
		this.legBackRight = this.Mossling.getChild("legBackRight");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Mossling = modelPartData.addChild("Mossling", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

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
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Mossling.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}