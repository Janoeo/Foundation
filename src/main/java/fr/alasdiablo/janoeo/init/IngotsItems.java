package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Ingot Item Handler
 */
@SuppressWarnings("unused")
public class IngotsItems {

    /**
     * Instance of the Item Properties used by item declared by the class
     */
    private static final Item.Properties PROPERTIES = new Item.Properties().group(JanoeoGroup.ORE_ITEMS);

    public static Item COPPER_INGOT = new Item(PROPERTIES).setRegistryName(Registries.COPPER_INGOT);
    public static Item TIN_INGOT = new Item(PROPERTIES).setRegistryName(Registries.TIN_INGOT);
    public static Item ALUMINIUM_INGOT = new Item(PROPERTIES).setRegistryName(Registries.ALUMINIUM_INGOT);
    public static Item LEAD_INGOT = new Item(PROPERTIES).setRegistryName(Registries.LEAD_INGOT);
    public static Item SILVER_INGOT = new Item(PROPERTIES).setRegistryName(Registries.SILVER_INGOT);
    public static Item URANIUM_INGOT = new Item(PROPERTIES).setRegistryName(Registries.URANIUM_INGOT);
    public static Item ZINC_INGOT = new Item(PROPERTIES).setRegistryName(Registries.ZINC_INGOT);
    public static Item OSMIUM_INGOT = new Item(PROPERTIES).setRegistryName(Registries.OSMIUM_INGOT);

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
                    COPPER_INGOT, TIN_INGOT, ALUMINIUM_INGOT,
                    LEAD_INGOT, SILVER_INGOT, URANIUM_INGOT,
                    ZINC_INGOT, OSMIUM_INGOT
            );
        }
    }
}
