package net.soul.meldedadditions.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soul.meldedadditions.MeldedAdditions;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MeldedAdditions.MOD_ID);

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
    public static final RegistryObject<SoundEvent> JOJO_SUNRISE = registerSoundEvents("jojo_sunrise");
    public static final RegistryObject<SoundEvent> JOJO_STENCIL = registerSoundEvents("jojo_stencil");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUND_EVENTS.register(name,()->SoundEvent.createVariableRangeEvent(new ResourceLocation(MeldedAdditions.MOD_ID, name)));
    }
}
