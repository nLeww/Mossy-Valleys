package me.nleww.mossyvalleys.entity.client.mossling;

import me.nleww.mossyvalleys.entity.client.ModModelLayers;
import me.nleww.mossyvalleys.entity.custom.MosslingEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MosslingEntityRender extends MobEntityRenderer<MosslingEntity, MosslingEntityModel<MosslingEntity>>  {
    public static final Identifier TEXTURE = Identifier.of("mossyvalleys", "textures/entity/mossling.png");

    public MosslingEntityRender(EntityRendererFactory.Context context) {
        super(context, new MosslingEntityModel<>(context.getPart(ModModelLayers.MOSSLING)), 0.5f);
    }

    @Override
    public Identifier getTexture(MosslingEntity entity) {
        return TEXTURE;
    }
}
