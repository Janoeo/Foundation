package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class DustsItems {

    private static final Item.Properties PROPERTIES
            = new Item.Properties().group(JanoeoGroup.ORE_ITEMS);

    public static Item DIAMOND_DUST
            = new Item(PROPERTIES).setRegistryName(Registries.DIAMOND_DUST);
    public static Item GOLD_DUST
            = new Item(PROPERTIES).setRegistryName(Registries.GOLD_DUST);
    public static Item IRON_DUST
            = new Item(PROPERTIES).setRegistryName(Registries.IRON_DUST);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Utils.registerItem(event.getRegistry(),
                    DIAMOND_DUST, GOLD_DUST, IRON_DUST
            );
        }
    }
}
