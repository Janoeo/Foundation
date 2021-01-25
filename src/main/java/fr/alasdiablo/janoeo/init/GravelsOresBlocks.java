package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.diolib.generic.ExperienceRarity.*;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.block.GravelOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Gravel Ore Block Handler
 */
@SuppressWarnings("unused")
public class GravelsOresBlocks {

    /**
     * Instance of Gravel Diamond Ore Block
     */
    public static Block DIAMOND_GRAVEL_ORE
            = new GravelOre(Registries.DIAMOND_GRAVEL_ORE, RARE);
    /**
     * Instance of Gravel Iron Ore Block
     */
    public static Block IRON_GRAVEL_ORE
            = new GravelOre(Registries.IRON_GRAVEL_ORE, COMMON);
    /**
     * Instance of Gravel Gold Ore Block
     */
    public static Block GOLD_GRAVEL_ORE
            = new GravelOre(Registries.GOLD_GRAVEL_ORE, UNCOMMON);


    public static Block COAL_GRAVEL_ORE = new GravelOre(Registries.COAL_GRAVEL_ORE, COMMON);
    public static Block LAPIS_GRAVEL_ORE = new GravelOre(Registries.LAPIS_GRAVEL_ORE, UNCOMMON);
    public static Block EMERALD_GRAVEL_ORE = new GravelOre(Registries.EMERALD_GRAVEL_ORE, RARE);

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
                    DIAMOND_GRAVEL_ORE, IRON_GRAVEL_ORE, GOLD_GRAVEL_ORE,
                    COAL_GRAVEL_ORE, LAPIS_GRAVEL_ORE, EMERALD_GRAVEL_ORE
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
                    DIAMOND_GRAVEL_ORE, IRON_GRAVEL_ORE, GOLD_GRAVEL_ORE,
                    COAL_GRAVEL_ORE, LAPIS_GRAVEL_ORE, EMERALD_GRAVEL_ORE
            );
        }
    }
}
