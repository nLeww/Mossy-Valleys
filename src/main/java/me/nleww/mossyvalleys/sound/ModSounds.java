package me.nleww.mossyvalleys.sound;

import me.nleww.mossyvalleys.MossyValleys;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent MOSSCOON_CHATTER = registerSoundEvent("mosscoon_chatter");
    public static final SoundEvent MOSSCOON_HURT = registerSoundEvent("mosscoon_hurt");
    public static final SoundEvent MOSSCOON_DEATH = registerSoundEvent("mosscoon_death");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MossyValleys.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {
        MossyValleys.LOGGER.info("Registering sounds...");
    }
}
