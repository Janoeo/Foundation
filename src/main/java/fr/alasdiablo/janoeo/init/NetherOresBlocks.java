package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.diolib.block.ExperienceRarity.*;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.NetherRedstoneOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Nether Ore Block Handler
 */
@SuppressWarnings("unused")
public class NetherOresBlocks {

    /**
     * Instance of Nether Aluminium Ore Block
     */
    public static Block ALUMINIUM_NETHER_ORE
            = new NetherOre(Registries.ALUMINIUM_NETHER_ORE, NULL);
    /**
     * Instance of Nether Coal Ore Block
     */
    public static Block COAL_NETHER_ORE
            = new NetherOre(Registries.COAL_NETHER_ORE, COMMON);
    /**
     * Instance of Nether Copper Ore Block
     */
    public static Block COPPER_NETHER_ORE
            = new NetherOre(Registries.COPPER_NETHER_ORE, NULL);
    /**
     * Instance of Nether Diamond Ore Block
     */
    public static Block DIAMOND_NETHER_ORE
            = new NetherOre(Registries.DIAMOND_NETHER_ORE, RARE);
    /**
     * Instance of Nether Emerald Ore Block
     */
    public static Block EMERALD_NETHER_ORE
            = new NetherOre(Registries.EMERALD_NETHER_ORE, RARE);
    /**
     * Instance of Nether Gold Ore Block
     */
    public static Block GOLD_NETHER_ORE
            = new NetherOre(Registries.GOLD_NETHER_ORE, NULL);
    /**
     * Instance of Nether Iron Ore Block
     */
    public static Block IRON_NETHER_ORE
            = new NetherOre(Registries.IRON_NETHER_ORE, NULL);
    /**
     * Instance of Nether Lapis Ore Block
     */
    public static Block LAPIS_NETHER_ORE
            = new NetherOre(Registries.LAPIS_NETHER_ORE, UNCOMMON);
    /**
     * Instance of Nether Lead Ore Block
     */
    public static Block LEAD_NETHER_ORE
            = new NetherOre(Registries.LEAD_NETHER_ORE, NULL);
    /**
     * Instance of Nether Redstone Ore Block
     */
    public static Block REDSTONE_NETHER_ORE
            = new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE);
    /**
     * Instance of Nether Ruby Ore Block
     */
    public static Block RUBY_NETHER_ORE
            = new NetherOre(Registries.RUBY_NETHER_ORE, RARE);
    /**
     * Instance of Nether Sapphire Ore Block
     */
    public static Block SAPPHIRE_NETHER_ORE
            = new NetherOre(Registries.SAPPHIRE_NETHER_ORE, RARE);
    /**
     * Instance of Nether Silver Ore Block
     */
    public static Block SILVER_NETHER_ORE
            = new NetherOre(Registries.SILVER_NETHER_ORE, NULL);
    /**
     * Instance of Nether Tin Ore Block
     */
    public static Block TIN_NETHER_ORE
            = new NetherOre(Registries.TIN_NETHER_ORE, NULL);
    /**
     * Instance of Nether Uranium Ore Block
     */
    public static Block URANIUM_NETHER_ORE
            = new NetherOre(Registries.URANIUM_NETHER_ORE, NULL);

    /**
     * Instance of Nether Osmium Ore Block
     */
    public static Block OSMIUM_NETHER_ORE
            = new NetherOre(Registries.OSMIUM_NETHER_ORE, NULL);

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
                    ALUMINIUM_NETHER_ORE, COAL_NETHER_ORE, COPPER_NETHER_ORE,
                    DIAMOND_NETHER_ORE, EMERALD_NETHER_ORE, GOLD_NETHER_ORE,
                    IRON_NETHER_ORE, LAPIS_NETHER_ORE, LEAD_NETHER_ORE,
                    REDSTONE_NETHER_ORE, RUBY_NETHER_ORE, SAPPHIRE_NETHER_ORE,
                    SILVER_NETHER_ORE, TIN_NETHER_ORE, URANIUM_NETHER_ORE,
                    OSMIUM_NETHER_ORE
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
                    ALUMINIUM_NETHER_ORE, COAL_NETHER_ORE, COPPER_NETHER_ORE,
                    DIAMOND_NETHER_ORE, EMERALD_NETHER_ORE, GOLD_NETHER_ORE,
                    IRON_NETHER_ORE, LAPIS_NETHER_ORE, LEAD_NETHER_ORE,
                    REDSTONE_NETHER_ORE, RUBY_NETHER_ORE, SAPPHIRE_NETHER_ORE,
                    SILVER_NETHER_ORE, TIN_NETHER_ORE, URANIUM_NETHER_ORE,
                    OSMIUM_NETHER_ORE
            );
        }
    }
}
