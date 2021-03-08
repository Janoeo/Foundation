package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.item.GeodeItem;
import fr.alasdiablo.janoeo.foundation.util.JanoeoGroup;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class FoundationItems {

    public static Item GEODE_ITEM = new GeodeItem(new Item.Properties().group(JanoeoGroup.ORE_ITEMS).maxStackSize(16)).setRegistryName(Registries.GEODE);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            RegistryHelper.registerItem(event.getRegistry(),
                    GEODE_ITEM
            );
        }
    }
}
