package fr.alasdiablo.janoeo.ores.nether;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasicNetherOre;
import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.nether.NetherRedstoneOre;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class NetherDenseOresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_QUARTZ_NETHER_ORE)
    public static Block DENSE_QUARTZ_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_COAL_NETHER_ORE)
    public static Block DENSE_COAL_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_DIAMOND_NETHER_ORE)
    public static Block DENSE_DIAMOND_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_EMERALD_NETHER_ORE)
    public static Block DENSE_EMERALD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_GOLD_NETHER_ORE)
    public static Block DENSE_GOLD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_IRON_NETHER_ORE)
    public static Block DENSE_IRON_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_LAPIS_NETHER_ORE)
    public static Block DENSE_LAPIS_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_REDSTONE_NETHER_ORE)
    public static Block DENSE_REDSTONE_NETHER_ORE;
    
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new NetherOre(Registries.DENSE_QUARTZ_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_EMERALD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.DENSE_GOLD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.DENSE_IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(Registries.DENSE_REDSTONE_NETHER_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE, properties).setRegistryName(Registries.DENSE_QUARTZ_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE, properties).setRegistryName(Registries.DENSE_COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE, properties).setRegistryName(Registries.DENSE_DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE, properties).setRegistryName(Registries.DENSE_EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE, properties).setRegistryName(Registries.DENSE_GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE, properties).setRegistryName(Registries.DENSE_IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE, properties).setRegistryName(Registries.DENSE_LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE, properties).setRegistryName(Registries.DENSE_REDSTONE_NETHER_ORE));
        }
    }

}
