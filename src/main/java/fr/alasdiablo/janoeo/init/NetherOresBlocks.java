package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.diolib.generic.ExperienceRarity.*;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.Janoeo;
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

    // ------------------------------------------- nether -------------------------------------------
    public static Block COAL_NETHER_ORE             = new NetherOre(Registries.COAL_NETHER_ORE,         COMMON);
    public static Block IRON_NETHER_ORE             = new NetherOre(Registries.IRON_NETHER_ORE,         NULL);
    public static Block GOLD_NETHER_ORE             = new NetherOre(Registries.GOLD_NETHER_ORE,         NULL);
    public static Block DIAMOND_NETHER_ORE          = new NetherOre(Registries.DIAMOND_NETHER_ORE,      RARE);
    public static Block EMERALD_NETHER_ORE          = new NetherOre(Registries.EMERALD_NETHER_ORE,      RARE);
    public static Block LAPIS_NETHER_ORE            = new NetherOre(Registries.LAPIS_NETHER_ORE,        UNCOMMON);
    public static Block REDSTONE_NETHER_ORE         = new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE);

    // --> MODDED ORE
    public static Block ALUMINIUM_NETHER_ORE		 = new NetherOre(Registries.ALUMINIUM_NETHER_ORE,   NULL);
    public static Block AMBER_NETHER_ORE			 = new NetherOre(Registries.AMBER_NETHER_ORE,       NULL);
    public static Block AMETHYST_NETHER_ORE		     = new NetherOre(Registries.AMETHYST_NETHER_ORE,    NULL);
    public static Block APATITE_NETHER_ORE 		     = new NetherOre(Registries.APATITE_NETHER_ORE,     NULL);
    public static Block BITUMINOUS_NETHER_ORE 		 = new NetherOre(Registries.BITUMINOUS_NETHER_ORE,  NULL);
    public static Block CINNABAR_NETHER_ORE		     = new NetherOre(Registries.CINNABAR_NETHER_ORE,    NULL);
    public static Block COPPER_NETHER_ORE			 = new NetherOre(Registries.COPPER_NETHER_ORE,      NULL);
    public static Block LEAD_NETHER_ORE		    	 = new NetherOre(Registries.LEAD_NETHER_ORE,        NULL);
    public static Block NICKEL_NETHER_ORE			 = new NetherOre(Registries.NICKEL_NETHER_ORE,      NULL);
    public static Block NITER_NETHER_ORE			 = new NetherOre(Registries.NITER_NETHER_ORE,       NULL);
    public static Block OSMIUM_NETHER_ORE			 = new NetherOre(Registries.OSMIUM_NETHER_ORE,      NULL);
    public static Block PLATINUM_NETHER_ORE		     = new NetherOre(Registries.PLATINUM_NETHER_ORE,    NULL);
    public static Block RUBY_NETHER_ORE			     = new NetherOre(Registries.RUBY_NETHER_ORE,        NULL);
    public static Block SALTPETER_NETHER_ORE		 = new NetherOre(Registries.SALTPETER_NETHER_ORE,   NULL);
    public static Block SAPPHIRE_NETHER_ORE		     = new NetherOre(Registries.SAPPHIRE_NETHER_ORE,    NULL);
    public static Block SILVER_NETHER_ORE			 = new NetherOre(Registries.SILVER_NETHER_ORE,      NULL);
    public static Block SULFUR_NETHER_ORE			 = new NetherOre(Registries.SULFUR_NETHER_ORE,      NULL);
    public static Block TIN_NETHER_ORE				 = new NetherOre(Registries.TIN_NETHER_ORE,         NULL);
    public static Block URANIUM_NETHER_ORE			 = new NetherOre(Registries.URANIUM_NETHER_ORE,     NULL);
    public static Block ZINC_NETHER_ORE		    	 = new NetherOre(Registries.ZINC_NETHER_ORE,        NULL);

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
                    COAL_NETHER_ORE,
                    IRON_NETHER_ORE,
                    GOLD_NETHER_ORE,
                    DIAMOND_NETHER_ORE,
                    EMERALD_NETHER_ORE,
                    LAPIS_NETHER_ORE,
                    REDSTONE_NETHER_ORE,
                    // --> MODDED ORE
                    ALUMINIUM_NETHER_ORE,
                    AMBER_NETHER_ORE,
                    AMETHYST_NETHER_ORE,
                    APATITE_NETHER_ORE,
                    BITUMINOUS_NETHER_ORE,
                    CINNABAR_NETHER_ORE,
                    COPPER_NETHER_ORE,
                    LEAD_NETHER_ORE,
                    NICKEL_NETHER_ORE,
                    NITER_NETHER_ORE,
                    OSMIUM_NETHER_ORE,
                    PLATINUM_NETHER_ORE,
                    RUBY_NETHER_ORE,
                    SALTPETER_NETHER_ORE,
                    SAPPHIRE_NETHER_ORE,
                    SILVER_NETHER_ORE,
                    SULFUR_NETHER_ORE,
                    TIN_NETHER_ORE,
                    URANIUM_NETHER_ORE,
                    ZINC_NETHER_ORE
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
                    COAL_NETHER_ORE,
                    IRON_NETHER_ORE,
                    GOLD_NETHER_ORE,
                    DIAMOND_NETHER_ORE,
                    EMERALD_NETHER_ORE,
                    LAPIS_NETHER_ORE,
                    REDSTONE_NETHER_ORE,
                    // --> MODDED ORE
                    ALUMINIUM_NETHER_ORE,
                    AMBER_NETHER_ORE,
                    AMETHYST_NETHER_ORE,
                    APATITE_NETHER_ORE,
                    BITUMINOUS_NETHER_ORE,
                    CINNABAR_NETHER_ORE,
                    COPPER_NETHER_ORE,
                    LEAD_NETHER_ORE,
                    NICKEL_NETHER_ORE,
                    NITER_NETHER_ORE,
                    OSMIUM_NETHER_ORE,
                    PLATINUM_NETHER_ORE,
                    RUBY_NETHER_ORE,
                    SALTPETER_NETHER_ORE,
                    SAPPHIRE_NETHER_ORE,
                    SILVER_NETHER_ORE,
                    SULFUR_NETHER_ORE,
                    TIN_NETHER_ORE,
                    URANIUM_NETHER_ORE,
                    ZINC_NETHER_ORE
            );
        }
    }
}
