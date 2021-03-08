package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class FoundationParticles {

    public static BasicParticleType GEODE = new BasicParticleType(true);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<ParticleType<?>> event) {
            GEODE.setRegistryName(Registries.GEODE);
            event.getRegistry().register(GEODE);
        }
    }
}
