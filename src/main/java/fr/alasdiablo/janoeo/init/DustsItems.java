package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Dust Item Handler
 */
@SuppressWarnings("unused")
public class DustsItems {

    /**
     * Instance of the Item Properties used by item declared by the class
     */
    private static final Item.Properties PROPERTIES
            = new Item.Properties().group(JanoeoGroup.ORE_ITEMS);

    /**
     * Instance of Diamond Dust Item
     */
    public static Item DIAMOND_DUST
            = new Item(PROPERTIES).setRegistryName(Registries.DIAMOND_DUST);
    /**
     * Instance of Gold Dust Item
     */
    public static Item GOLD_DUST
            = new Item(PROPERTIES).setRegistryName(Registries.GOLD_DUST);
    /**
     * Instance of Iron Dust Item
     */
    public static Item IRON_DUST
            = new Item(PROPERTIES).setRegistryName(Registries.IRON_DUST);

    public static Item COAL_DUST = new Item(PROPERTIES).setRegistryName(Registries.COAL_DUST);
    public static Item LAPIS_DUST = new Item(PROPERTIES).setRegistryName(Registries.LAPIS_DUST);

    /**
     * Registry Event Handler
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        /**
         * Handle Item registries
         *
         * @param event Instance of the event
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            RegistryHelper.registerItem(event.getRegistry(),
                    DIAMOND_DUST, GOLD_DUST, IRON_DUST,
                    COAL_DUST, LAPIS_DUST
            );
        }
    }
}
