package fr.alasdiablo.janoeo.dust;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.holder.RegistryHolder;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

public class DustsItems {

    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DIAMOND_DUST)
    public static Item DIAMOND_DUST;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.GOLD_DUST)
    public static Item GOLD_DUST;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.IRON_DUST)
    public static Item IRON_DUST;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            event.getRegistry().register(new Item(properties).setRegistryName(RegistryHolder.DIAMOND_DUST));
            event.getRegistry().register(new Item(properties).setRegistryName(RegistryHolder.GOLD_DUST));
            event.getRegistry().register(new Item(properties).setRegistryName(RegistryHolder.IRON_DUST));
        }
    }
}
