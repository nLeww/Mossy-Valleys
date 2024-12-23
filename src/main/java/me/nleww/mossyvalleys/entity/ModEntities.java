package me.nleww.mossyvalleys.entity;


import me.nleww.mossyvalleys.MossyValleys;
import me.nleww.mossyvalleys.entity.custom.MossCoonEntity;
import me.nleww.mossyvalleys.entity.custom.MosslingEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntities {

    public static final EntityType<MosslingEntity> MOSSLING =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    Identifier.of(MossyValleys.MOD_ID, "mossling"),
                    EntityType.Builder.create(MosslingEntity::new, SpawnGroup.CREATURE)
                            .dimensions(0.5f, 0.5f).build());

    public static final EntityType<MossCoonEntity> MOSSCOON =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    Identifier.of(MossyValleys.MOD_ID, "mosscoon"),
                    EntityType.Builder.create(MossCoonEntity::new, SpawnGroup.CREATURE)
                            .dimensions(0.5f, 0.5f).build());



    public static void registerModEntities() {
        MossyValleys.LOGGER.info("Waking up the Mosslings!");
        FabricDefaultAttributeRegistry.register(MOSSLING, MosslingEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MOSSCOON, MossCoonEntity.setAttributes());
    }


}
