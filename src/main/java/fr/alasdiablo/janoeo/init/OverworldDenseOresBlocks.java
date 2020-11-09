package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.janoeo.block.util.ExperienceRarity.*;

import fr.alasdiablo.janoeo.block.BasicOre;
import fr.alasdiablo.janoeo.block.RedstoneOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Dense Overworld Ore Block Handler
 */
@SuppressWarnings("unused")
public class OverworldDenseOresBlocks {

    /**
     * Instance of Dense Overworld Coal Ore Block
     */
    public static Block DENSE_COAL_ORE
            = new BasicOre(Registries.DENSE_COAL_ORE, 1, COMMON);
    /**
     * Instance of Dense Overworld Copper Ore Block
     */
    public static Block DENSE_COPPER_ORE
            = new BasicOre(Registries.DENSE_COPPER_ORE, 1, COMMON);
    /**
     * Instance of Dense Overworld Diamond Ore Block
     */
    public static Block DENSE_DIAMOND_ORE
            = new BasicOre(Registries.DENSE_DIAMOND_ORE, 2, RARE);
    /**
     * Instance of Dense Overworld Emerald Ore Block
     */
    public static Block DENSE_EMERALD_ORE
            = new BasicOre(Registries.DENSE_EMERALD_ORE, 2, RARE);
    /**
     * Instance of Dense Overworld Gold Ore Block
     */
    public static Block DENSE_GOLD_ORE
            = new BasicOre(Registries.DENSE_GOLD_ORE, 2, UNCOMMON);
    /**
     * Instance of Dense Overworld Iron Ore Block
     */
    public static Block DENSE_IRON_ORE
            = new BasicOre(Registries.DENSE_IRON_ORE, 1, COMMON);
    /**
     * Instance of Dense Overworld Lapis Ore Block
     */
    public static Block DENSE_LAPIS_ORE
            = new BasicOre(Registries.DENSE_LAPIS_ORE, 2, UNCOMMON);
    /**
     * Instance of Dense Overworld Redstone Ore Block
     */
    public static Block DENSE_REDSTONE_ORE
            = new RedstoneOre(Registries.DENSE_REDSTONE_ORE);
    /**
     * Instance of Dense Overworld Tin Ore Block
     */
    public static Block DENSE_TIN_ORE
            = new BasicOre(Registries.DENSE_TIN_ORE, 1, COMMON);

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
            Utils.registerBlock(event.getRegistry(),
                    DENSE_COAL_ORE, DENSE_COPPER_ORE, DENSE_DIAMOND_ORE,
                    DENSE_EMERALD_ORE, DENSE_GOLD_ORE, DENSE_IRON_ORE,
                    DENSE_LAPIS_ORE, DENSE_REDSTONE_ORE, DENSE_TIN_ORE
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
            Utils.registerBlockItem(event.getRegistry(), properties,
                    DENSE_COAL_ORE, DENSE_COPPER_ORE, DENSE_DIAMOND_ORE,
                    DENSE_EMERALD_ORE, DENSE_GOLD_ORE, DENSE_IRON_ORE,
                    DENSE_LAPIS_ORE, DENSE_REDSTONE_ORE, DENSE_TIN_ORE
            );
        }
    }

}
