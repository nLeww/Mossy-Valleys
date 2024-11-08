package me.nleww.mossyvalleys.entity.client;

import me.nleww.mossyvalleys.MossyValleys;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MOSSLING =
            new EntityModelLayer(Identifier.of(MossyValleys.MOD_ID,"mossling"), "main");
}
