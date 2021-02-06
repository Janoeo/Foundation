package fr.alasdiablo.janoeo.init;

import static fr.alasdiablo.diolib.generic.ExperienceRarity.*;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.Janoeo;
import fr.alasdiablo.janoeo.block.BasicOre;
import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Overworld Ore Block Handler
 */
@SuppressWarnings("unused")
public class OverworldOresBlocks {


    public static HashMap<String, Block> Ores = new HashMap<String, Block>() {{
        // --------------------------------------- overworld.stone --------------------------------------
        // --> MODDED ORE
        put("ALUMINIUM_ORE",       new BasicOre(Registries.ALUMINIUM_ORE,  	1, NULL));
        put("AMBER_ORE",           new BasicOre(Registries.AMBER_ORE,  	    1, NULL));
        put("AMETHYST_ORE",        new BasicOre(Registries.AMETHYST_ORE,    1, NULL));
        put("APATITE_ORE",         new BasicOre(Registries.APATITE_ORE,    	1, NULL));
        put("BITUMINOUS_ORE",      new BasicOre(Registries.BITUMINOUS_ORE,  1, NULL));
        put("CINNABAR_ORE",        new BasicOre(Registries.CINNABAR_ORE,   	1, NULL));
        put("COPPER_ORE",          new BasicOre(Registries.COPPER_ORE,      1, NULL));
        put("LEAD_ORE",            new BasicOre(Registries.LEAD_ORE,   	    1, NULL));
        put("NICKEL_ORE",          new BasicOre(Registries.NICKEL_ORE,     	1, NULL));
        put("NITER_ORE",           new BasicOre(Registries.NITER_ORE,      	1, NULL));
        put("OSMIUM_ORE",          new BasicOre(Registries.OSMIUM_ORE,     	1, NULL));
        put("PLATINUM_ORE",        new BasicOre(Registries.PLATINUM_ORE,   	1, NULL));
        put("RUBY_ORE",            new BasicOre(Registries.RUBY_ORE,       	1, NULL));
        put("SALTPETER_ORE",       new BasicOre(Registries.SALTPETER_ORE,  	1, NULL));
        put("SAPPHIRE_ORE",        new BasicOre(Registries.SAPPHIRE_ORE,   	1, NULL));
        put("SILVER_ORE",          new BasicOre(Registries.SILVER_ORE, 	    1, NULL));
        put("SULFUR_ORE",          new BasicOre(Registries.SULFUR_ORE,     	1, NULL));
        put("TIN_ORE",             new BasicOre(Registries.TIN_ORE,        	1, NULL));
        put("URANIUM_ORE",         new BasicOre(Registries.URANIUM_ORE,    	1, NULL));
        put("ZINC_ORE",            new BasicOre(Registries.ZINC_ORE,       	1, NULL));
    }};

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
            Janoeo.logger.debug("REGISTIERING JANOEO OVERWORLD ORES");
            //RegistryHelper.registerBlock(event.getRegistry(), ALUMINIUM_ORE);
            for (Map.Entry<String, Block> Ore : Ores.entrySet()) {
                String OreName = Ore.getKey();
                Block OreBlock = Ore.getValue();

                Janoeo.logger.debug("REGISTIERING JANOEO OVERWORLD ORE BLOCK: " + OreBlock);
                RegistryHelper.registerBlock(event.getRegistry(), OreBlock);
            }
        }

        /**
         * Handle Item registries
         *
         * @param event Instance of the event
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Janoeo.logger.debug("REGISTIERING JANOEO OVERWORLD ORE ITEMS");
            for (Map.Entry<String, Block> Ore : Ores.entrySet()) {
                String OreName = Ore.getKey();
                Block OreBlock = Ore.getValue();

                Janoeo.logger.debug("REGISTIERING JANOEO OVERWORLD ORE ITEM: " + OreBlock);
                RegistryHelper.registerBlockItem(event.getRegistry(), new Item.Properties().group(JanoeoGroup.ORE_BLOCKS), OreBlock);
            }
        }
    }
}
