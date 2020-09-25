package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.NetherRedstoneOre;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class NetherDenseOresBlocks {

    private static List<Block> BLOCKS;
    private static boolean init = false;

    public static Block DENSE_QUARTZ_NETHER_ORE;
    public static Block DENSE_COAL_NETHER_ORE;
    public static Block DENSE_DIAMOND_NETHER_ORE;
    public static Block DENSE_EMERALD_NETHER_ORE;
    public static Block DENSE_GOLD_NETHER_ORE;
    public static Block DENSE_IRON_NETHER_ORE;
    public static Block DENSE_LAPIS_NETHER_ORE;
    public static Block DENSE_REDSTONE_NETHER_ORE;

    public static void init() {
        if (init) {
            throw new RuntimeException("OverworldDenseOresBlocks can't be init 2 time");
        } else {
            init = true;
        }

        BLOCKS = new ArrayList<>();

        BLOCKS.add(DENSE_QUARTZ_NETHER_ORE = new NetherOre(Registries.DENSE_QUARTZ_NETHER_ORE));
        BLOCKS.add(DENSE_COAL_NETHER_ORE = new NetherOre(Registries.DENSE_COAL_NETHER_ORE));
        BLOCKS.add(DENSE_DIAMOND_NETHER_ORE = new NetherOre(Registries.DENSE_DIAMOND_NETHER_ORE));
        BLOCKS.add(DENSE_EMERALD_NETHER_ORE = new NetherOre(Registries.DENSE_EMERALD_NETHER_ORE));
        BLOCKS.add(DENSE_GOLD_NETHER_ORE = new NetherOre(Registries.DENSE_GOLD_NETHER_ORE));
        BLOCKS.add(DENSE_IRON_NETHER_ORE = new NetherOre(Registries.DENSE_IRON_NETHER_ORE));
        BLOCKS.add(DENSE_LAPIS_NETHER_ORE = new NetherOre(Registries.DENSE_LAPIS_NETHER_ORE));
        BLOCKS.add(DENSE_REDSTONE_NETHER_ORE = new NetherRedstoneOre(Registries.DENSE_REDSTONE_NETHER_ORE));
    }
    
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            for (Block block: BLOCKS) {
                event.getRegistry().register(block);
            }
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);

            for (Block block: BLOCKS) {
                event.getRegistry().register(new BlockItem(block, properties).setRegistryName(block.getRegistryName()));
            }
        }
    }

}
