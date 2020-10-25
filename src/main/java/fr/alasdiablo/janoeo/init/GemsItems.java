package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class GemsItems {

    private static final Item.Properties PROPERTIES
            = new Item.Properties().group(JanoeoGroup.ORE_ITEMS);

    public static Item RUBY
            = new Item(PROPERTIES).setRegistryName(Registries.RUBY);
    public static Item SAPPHIRE
            = new Item(PROPERTIES).setRegistryName(Registries.SAPPHIRE);
    public static Item AMETHYST
            = new Item(PROPERTIES).setRegistryName(Registries.AMETHYST);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Utils.registerItem(event.getRegistry(),
                    RUBY, SAPPHIRE, AMETHYST
            );
        }
    }
}
