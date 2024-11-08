package me.nleww.mossyvalleys;

import me.nleww.mossyvalleys.entity.ModEntities;
import me.nleww.mossyvalleys.entity.client.ModModelLayers;
import me.nleww.mossyvalleys.entity.client.MosslingEntityModel;
import me.nleww.mossyvalleys.entity.client.MosslingEntityRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MossyValleysClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.MOSSLING, MosslingEntityRender::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MOSSLING, MosslingEntityModel::getTexturedModelData);

    }

}
