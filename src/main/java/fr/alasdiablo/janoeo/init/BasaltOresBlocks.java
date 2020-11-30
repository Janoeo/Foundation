package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.diolib.generic.ExperienceRarity.*;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.block.BasaltOre;
import fr.alasdiablo.janoeo.block.BasaltRedstoneOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Basalt Ore Block Handler
 */
@SuppressWarnings("unused")
public class BasaltOresBlocks {

    /**
     * Instance of Basalt Coal Ore Block
     */
    public static Block COAL_BASALT_ORE
            = new BasaltOre(Registries.COAL_BASALT_ORE, COMMON);
    /**
     * Instance of Basalt Diamond Ore Block
     */
    public static Block DIAMOND_BASALT_ORE
            = new BasaltOre(Registries.DIAMOND_BASALT_ORE, RARE);
    /**
     * Instance of Basalt Emerald Ore Block
     */
    public static Block EMERALD_BASALT_ORE
            = new BasaltOre(Registries.EMERALD_BASALT_ORE, RARE);
    /**
     * Instance of Basalt Gold Ore Block
     */
    public static Block GOLD_BASALT_ORE
            = new BasaltOre(Registries.GOLD_BASALT_ORE, NULL);
    /**
     * Instance of Basalt Iron Ore Block
     */
    public static Block IRON_BASALT_ORE
            = new BasaltOre(Registries.IRON_BASALT_ORE, NULL);
    /**
     * Instance of Basalt Lapis Ore Block
     */
    public static Block LAPIS_BASALT_ORE
            = new BasaltOre(Registries.LAPIS_BASALT_ORE, UNCOMMON);
    /**
     * Instance of Basalt Redstone Ore Block
     */
    public static Block REDSTONE_BASALT_ORE
            = new BasaltRedstoneOre(Registries.REDSTONE_BASALT_ORE);

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
                    COAL_BASALT_ORE, DIAMOND_BASALT_ORE, EMERALD_BASALT_ORE,
                    GOLD_BASALT_ORE, IRON_BASALT_ORE, LAPIS_BASALT_ORE,
                    REDSTONE_BASALT_ORE
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
                    COAL_BASALT_ORE, DIAMOND_BASALT_ORE, EMERALD_BASALT_ORE,
                    GOLD_BASALT_ORE, IRON_BASALT_ORE, LAPIS_BASALT_ORE,
                    REDSTONE_BASALT_ORE
            );
        }
    }
}
