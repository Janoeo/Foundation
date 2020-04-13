package fr.alasdiablo.janoeo.ingots;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class IngotsItems {

    @ObjectHolder(Registries.MODID + ":" + Registries.COPPER_INGOT)
    public static Item COPPER_INGOT;
    @ObjectHolder(Registries.MODID + ":" + Registries.TIN_INGOT)
    public static Item TIN_INGOT;
    @ObjectHolder(Registries.MODID + ":" + Registries.ALUMINIUM_INGOT)
    public static Item ALUMINIUM_INGOT;
    @ObjectHolder(Registries.MODID + ":" + Registries.LEAD_INGOT)
    public static Item LEAD_INGOT;
    @ObjectHolder(Registries.MODID + ":" + Registries.SILVER_INGOT)
    public static Item SILVER_INGOT;
    @ObjectHolder(Registries.MODID + ":" + Registries.URANIUM_INGOT)
    public static Item URANIUM_INGOT;
    @ObjectHolder(Registries.MODID + ":" + Registries.ZINC_INGOT)
    public static Item ZINC_INGOT;


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.COPPER_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.TIN_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.ALUMINIUM_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.LEAD_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.SILVER_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.URANIUM_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.ZINC_INGOT));
        }
    }
}
