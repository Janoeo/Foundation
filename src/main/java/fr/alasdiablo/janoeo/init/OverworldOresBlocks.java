package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.block.BasicOre;
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
public class OverworldOresBlocks {

    public static Block COPPER_ORE
            = new BasicOre(Registries.COPPER_ORE, 1, NULL);
    public static Block TIN_ORE
            = new BasicOre(Registries.TIN_ORE, 1, NULL);
    public static Block ALUMINIUM_ORE
            = new BasicOre(Registries.ALUMINIUM_ORE, 1, NULL);
    public static Block URANIUM_ORE
            = new BasicOre(Registries.URANIUM_ORE, 2, NULL);
    public static Block SILVER_ORE
            = new BasicOre(Registries.SILVER_ORE, 2, NULL);
    public static Block LEAD_ORE
            = new BasicOre(Registries.LEAD_ORE, 1, NULL);
    public static Block RUBY_ORE
            = new BasicOre(Registries.RUBY_ORE, 2, RARE);
    public static Block SAPPHIRE_ORE
            = new BasicOre(Registries.SAPPHIRE_ORE, 2, RARE);
    public static Block AMETHYST_ORE
            = new BasicOre(Registries.AMETHYST_ORE, 2, RARE);
    public static Block ZINC_ORE
            = new BasicOre(Registries.ZINC_ORE, 1, NULL);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    COPPER_ORE, TIN_ORE, ALUMINIUM_ORE, URANIUM_ORE,
                    SILVER_ORE, LEAD_ORE, RUBY_ORE, SAPPHIRE_ORE,
                    AMETHYST_ORE, ZINC_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    COPPER_ORE, TIN_ORE, ALUMINIUM_ORE, URANIUM_ORE,
                    SILVER_ORE, LEAD_ORE, RUBY_ORE, SAPPHIRE_ORE,
                    AMETHYST_ORE, ZINC_ORE
            );
        }
    }
}
