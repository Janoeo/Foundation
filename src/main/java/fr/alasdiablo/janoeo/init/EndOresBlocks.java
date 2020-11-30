package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.diolib.generic.ExperienceRarity.*;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.block.EndOre;
import fr.alasdiablo.janoeo.block.EndRedstoneOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * The End Ore Block Handler
 */
@SuppressWarnings("unused")
public class EndOresBlocks {

    /**
     * Instance of The End Coal Ore Block
     */
    public static Block COAL_END_ORE
            = new EndOre(Registries.COAL_END_ORE, COMMON);
    /**
     * Instance of The End Diamond Ore Block
     */
    public static Block DIAMOND_END_ORE
            = new EndOre(Registries.DIAMOND_END_ORE, RARE);
    /**
     * Instance of The End Emerald Ore Block
     */
    public static Block EMERALD_END_ORE
            = new EndOre(Registries.EMERALD_END_ORE, RARE);
    /**
     * Instance of The End Gold Ore Block
     */
    public static Block GOLD_END_ORE
            = new EndOre(Registries.GOLD_END_ORE, NULL);
    /**
     * Instance of The End Iron Ore Block
     */
    public static Block IRON_END_ORE
            = new EndOre(Registries.IRON_END_ORE, NULL);
    /**
     * Instance of The End Lapis Ore Block
     */
    public static Block LAPIS_END_ORE
            = new EndOre(Registries.LAPIS_END_ORE, UNCOMMON);
    /**
     * Instance of The End Redstone Ore Block
     */
    public static Block REDSTONE_END_ORE
            = new EndRedstoneOre(Registries.REDSTONE_END_ORE);

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
                    COAL_END_ORE, DIAMOND_END_ORE, EMERALD_END_ORE,
                    GOLD_END_ORE, IRON_END_ORE, LAPIS_END_ORE,
                    REDSTONE_END_ORE
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
                    COAL_END_ORE, DIAMOND_END_ORE, EMERALD_END_ORE,
                    GOLD_END_ORE, IRON_END_ORE, LAPIS_END_ORE,
                    REDSTONE_END_ORE
            );
        }
    }
}
