package fr.alasdiablo.janoeo.ore.nether;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.BasicNetherOre;
import fr.alasdiablo.janoeo.blocks.NetherOre;
import fr.alasdiablo.janoeo.blocks.nether.NetherRedstoneOre;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class NetherOresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.COAL_NETHER_ORE)
    public static Block COAL_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DIAMOND_NETHER_ORE)
    public static Block DIAMOND_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.EMERALD_NETHER_ORE)
    public static Block EMERALD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.GOLD_NETHER_ORE)
    public static Block GOLD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.IRON_NETHER_ORE)
    public static Block IRON_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LAPIS_NETHER_ORE)
    public static Block LAPIS_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.REDSTONE_NETHER_ORE)
    public static Block REDSTONE_NETHER_ORE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new NetherOre(Registries.COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.GOLD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(NetherOresBlocks.COAL_NETHER_ORE, properties).setRegistryName(Registries.COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.DIAMOND_NETHER_ORE, properties).setRegistryName(Registries.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.EMERALD_NETHER_ORE, properties).setRegistryName(Registries.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.GOLD_NETHER_ORE, properties).setRegistryName(Registries.GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.IRON_NETHER_ORE, properties).setRegistryName(Registries.IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.LAPIS_NETHER_ORE, properties).setRegistryName(Registries.LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.REDSTONE_NETHER_ORE, properties).setRegistryName(Registries.REDSTONE_NETHER_ORE));
        }
    }
}
