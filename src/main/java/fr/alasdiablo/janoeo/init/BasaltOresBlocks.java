package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasaltOre;
import fr.alasdiablo.janoeo.block.BasaltRedstoneOre;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class BasaltOresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.COAL_BASALT_ORE)
    public static Block COAL_BASALT_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DIAMOND_BASALT_ORE)
    public static Block DIAMOND_BASALT_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.EMERALD_BASALT_ORE)
    public static Block EMERALD_BASALT_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.GOLD_BASALT_ORE)
    public static Block GOLD_BASALT_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.IRON_BASALT_ORE)
    public static Block IRON_BASALT_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LAPIS_BASALT_ORE)
    public static Block LAPIS_BASALT_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.REDSTONE_BASALT_ORE)
    public static Block REDSTONE_BASALT_ORE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BasaltOre(Registries.COAL_BASALT_ORE));
            event.getRegistry().register(new BasaltOre(Registries.DIAMOND_BASALT_ORE));
            event.getRegistry().register(new BasaltOre(Registries.EMERALD_BASALT_ORE));
            event.getRegistry().register(new BasaltOre(Registries.GOLD_BASALT_ORE));
            event.getRegistry().register(new BasaltOre(Registries.IRON_BASALT_ORE));
            event.getRegistry().register(new BasaltOre(Registries.LAPIS_BASALT_ORE));
            event.getRegistry().register(new BasaltRedstoneOre(Registries.REDSTONE_BASALT_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.COAL_BASALT_ORE, properties).setRegistryName(Registries.COAL_BASALT_ORE));
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.DIAMOND_BASALT_ORE, properties).setRegistryName(Registries.DIAMOND_BASALT_ORE));
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.EMERALD_BASALT_ORE, properties).setRegistryName(Registries.EMERALD_BASALT_ORE));
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.GOLD_BASALT_ORE, properties).setRegistryName(Registries.GOLD_BASALT_ORE));
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.IRON_BASALT_ORE, properties).setRegistryName(Registries.IRON_BASALT_ORE));
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.LAPIS_BASALT_ORE, properties).setRegistryName(Registries.LAPIS_BASALT_ORE));
            event.getRegistry().register(new BlockItem(BasaltOresBlocks.REDSTONE_BASALT_ORE, properties).setRegistryName(Registries.REDSTONE_BASALT_ORE));
        }
    }
}
