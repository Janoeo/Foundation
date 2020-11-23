package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.diabolo.util.RegistryHelper;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Gem Item Handler
 */
@SuppressWarnings("unused")
public class GemsItems {

    /**
     * Instance of the Item Properties used by item declared by the class
     */
    private static final Item.Properties PROPERTIES
            = new Item.Properties().group(JanoeoGroup.ORE_ITEMS);

    /**
     * Instance of Ruby Gem Item
     */
    public static Item RUBY
            = new Item(PROPERTIES).setRegistryName(Registries.RUBY);
    /**
     * Instance of Sapphire Gem Item
     */
    public static Item SAPPHIRE
            = new Item(PROPERTIES).setRegistryName(Registries.SAPPHIRE);
    /**
     * Instance of Amethyst Gem Item
     */
    public static Item AMETHYST
            = new Item(PROPERTIES).setRegistryName(Registries.AMETHYST);

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
                    RUBY, SAPPHIRE, AMETHYST
            );
        }
    }
}
