package me.nleww.mossyvalleys.entity.client.mosscoon;

import me.nleww.mossyvalleys.entity.client.ModModelLayers;
import me.nleww.mossyvalleys.entity.custom.MossCoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MossCoonEntityRender extends MobEntityRenderer<MossCoonEntity, MossCoonEntityModel<MossCoonEntity>>  {

        public static final Identifier TEXTURE = Identifier.of("mossyvalleys", "textures/entity/mosscoon.png");

        public MossCoonEntityRender(EntityRendererFactory.Context context) {
            super(context, new MossCoonEntityModel<>(context.getPart(ModModelLayers.MOSSCOON)), 0.6f);
        }

        @Override
        public Identifier getTexture(MossCoonEntity entity) {return TEXTURE;}

}
