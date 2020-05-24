package fr.alasdiablo.janoeo.ores;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.GravelOre;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class GravelsOresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.DIAMOND_GRAVEL_ORE)
    public static Block DIAMOND_GRAVEL_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.IRON_GRAVEL_ORE)
    public static Block IRON_GRAVEL_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.GOLD_GRAVEL_ORE)
    public static Block GOLD_GRAVEL_ORE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new GravelOre(Registries.DIAMOND_GRAVEL_ORE));
            event.getRegistry().register(new GravelOre(Registries.IRON_GRAVEL_ORE));
            event.getRegistry().register(new GravelOre(Registries.GOLD_GRAVEL_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(GravelsOresBlocks.DIAMOND_GRAVEL_ORE, properties).setRegistryName(Registries.DIAMOND_GRAVEL_ORE));
            event.getRegistry().register(new BlockItem(GravelsOresBlocks.IRON_GRAVEL_ORE, properties).setRegistryName(Registries.IRON_GRAVEL_ORE));
            event.getRegistry().register(new BlockItem(GravelsOresBlocks.GOLD_GRAVEL_ORE, properties).setRegistryName(Registries.GOLD_GRAVEL_ORE));

        }
    }
}
