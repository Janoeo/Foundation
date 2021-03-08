package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.block.NetherOre;
import fr.alasdiablo.janoeo.foundation.block.NetherRedstoneOre;
import fr.alasdiablo.janoeo.foundation.util.JanoeoGroup;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static fr.alasdiablo.diolib.generic.ExperienceRarity.*;

/**
 * Dense Nether Ore Block Handler
 */
@SuppressWarnings("unused")
public class NetherDenseOresBlocks {

    /**
     * Instance of Dense Nether Quartz Ore Block
     */
    public static Block DENSE_QUARTZ_NETHER_ORE
            = new NetherOre(Registries.DENSE_QUARTZ_NETHER_ORE, UNCOMMON);
    /**
     * Instance of Dense Nether Coal Ore Block
     */
    public static Block DENSE_COAL_NETHER_ORE
            = new NetherOre(Registries.DENSE_COAL_NETHER_ORE, COMMON);
    /**
     * Instance of Dense Nether Diamond Ore Block
     */
    public static Block DENSE_DIAMOND_NETHER_ORE
            = new NetherOre(Registries.DENSE_DIAMOND_NETHER_ORE, RARE);
    /**
     * Instance of Dense Nether Emerald Ore Block
     */
    public static Block DENSE_EMERALD_NETHER_ORE
            = new NetherOre(Registries.DENSE_EMERALD_NETHER_ORE, RARE);
    /**
     * Instance of Dense Nether Gold Ore Block
     */
    public static Block DENSE_GOLD_NETHER_ORE
            = new NetherOre(Registries.DENSE_GOLD_NETHER_ORE, UNCOMMON);
    /**
     * Instance of Dense Nether Iron Ore Block
     */
    public static Block DENSE_IRON_NETHER_ORE
            = new NetherOre(Registries.DENSE_IRON_NETHER_ORE, COMMON);
    /**
     * Instance of Dense Nether Lapis Ore Block
     */
    public static Block DENSE_LAPIS_NETHER_ORE
            = new NetherOre(Registries.DENSE_LAPIS_NETHER_ORE, UNCOMMON);
    /**
     * Instance of Dense Nether Redstone Ore Block
     */
    public static Block DENSE_REDSTONE_NETHER_ORE
            = new NetherRedstoneOre(Registries.DENSE_REDSTONE_NETHER_ORE);

    /**
     * Registry Event Handler
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        /**
         * Handle Block registries
         *
         * @param event Instance of the event
         */
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            RegistryHelper.registerBlock(event.getRegistry(),
                    DENSE_QUARTZ_NETHER_ORE, DENSE_COAL_NETHER_ORE, DENSE_DIAMOND_NETHER_ORE,
                    DENSE_EMERALD_NETHER_ORE, DENSE_GOLD_NETHER_ORE, DENSE_IRON_NETHER_ORE,
                    DENSE_LAPIS_NETHER_ORE, DENSE_REDSTONE_NETHER_ORE
            );
        }

        /**
         * Handle Item registries
         *
         * @param event Instance of the event
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            RegistryHelper.registerBlockItem(event.getRegistry(), properties,
                    DENSE_QUARTZ_NETHER_ORE, DENSE_COAL_NETHER_ORE, DENSE_DIAMOND_NETHER_ORE,
                    DENSE_EMERALD_NETHER_ORE, DENSE_GOLD_NETHER_ORE, DENSE_IRON_NETHER_ORE,
                    DENSE_LAPIS_NETHER_ORE, DENSE_REDSTONE_NETHER_ORE
            );
        }
    }

}
