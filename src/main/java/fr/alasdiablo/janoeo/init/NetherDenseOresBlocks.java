package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.NetherRedstoneOre;
import static fr.alasdiablo.janoeo.block.util.ExperienceRarity.*;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class NetherDenseOresBlocks {

    public static Block DENSE_QUARTZ_NETHER_ORE
            = new NetherOre(Registries.DENSE_QUARTZ_NETHER_ORE, UNCOMMON);
    public static Block DENSE_COAL_NETHER_ORE
            = new NetherOre(Registries.DENSE_COAL_NETHER_ORE, COMMON);
    public static Block DENSE_DIAMOND_NETHER_ORE
            = new NetherOre(Registries.DENSE_DIAMOND_NETHER_ORE, RARE);
    public static Block DENSE_EMERALD_NETHER_ORE
            = new NetherOre(Registries.DENSE_EMERALD_NETHER_ORE, RARE);
    public static Block DENSE_GOLD_NETHER_ORE
            = new NetherOre(Registries.DENSE_GOLD_NETHER_ORE, UNCOMMON);
    public static Block DENSE_IRON_NETHER_ORE
            = new NetherOre(Registries.DENSE_IRON_NETHER_ORE, COMMON);
    public static Block DENSE_LAPIS_NETHER_ORE
            = new NetherOre(Registries.DENSE_LAPIS_NETHER_ORE, UNCOMMON);
    public static Block DENSE_REDSTONE_NETHER_ORE
            = new NetherRedstoneOre(Registries.DENSE_REDSTONE_NETHER_ORE);
    
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    DENSE_QUARTZ_NETHER_ORE, DENSE_COAL_NETHER_ORE, DENSE_DIAMOND_NETHER_ORE,
                    DENSE_EMERALD_NETHER_ORE, DENSE_GOLD_NETHER_ORE, DENSE_IRON_NETHER_ORE,
                    DENSE_LAPIS_NETHER_ORE, DENSE_REDSTONE_NETHER_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    DENSE_QUARTZ_NETHER_ORE, DENSE_COAL_NETHER_ORE, DENSE_DIAMOND_NETHER_ORE,
                    DENSE_EMERALD_NETHER_ORE, DENSE_GOLD_NETHER_ORE, DENSE_IRON_NETHER_ORE,
                    DENSE_LAPIS_NETHER_ORE, DENSE_REDSTONE_NETHER_ORE
            );
        }
    }

}
