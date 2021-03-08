package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.janoeo.foundation.entity.GeodeEntity;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class FoundationEntities {

    public static EntityType<GeodeEntity> GEODE_ENTITY =
            EntityType.Builder.<GeodeEntity>create(GeodeEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F).trackingRange(4).func_233608_b_(10).build(Registries.MODID + ":" + Registries.GEODE);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<EntityType<?>> event) {
            GEODE_ENTITY.setRegistryName(Registries.GEODE);
            event.getRegistry().register(GEODE_ENTITY);
        }
    }
}
