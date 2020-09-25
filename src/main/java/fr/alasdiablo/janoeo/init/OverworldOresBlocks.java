package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasicOre;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class OverworldOresBlocks {

    private static List<Block> BLOCKS;
    private static boolean init = false;

    public static Block COPPER_ORE;
    public static Block TIN_ORE;
    public static Block ALUMINIUM_ORE;
    public static Block URANIUM_ORE;
    public static Block SILVER_ORE;
    public static Block LEAD_ORE;
    public static Block RUBY_ORE;
    public static Block SAPPHIRE_ORE;
    public static Block AMETHYST_ORE;
    public static Block ZINC_ORE;

    public static void init() {
        if (init) {
            throw new RuntimeException("OverworldOresBlocks can't be init 2 time");
        } else {
            init = true;
        }

        BLOCKS = new ArrayList<>();

        BLOCKS.add(COPPER_ORE = new BasicOre(Registries.COPPER_ORE, 1));
        BLOCKS.add(TIN_ORE = new BasicOre(Registries.TIN_ORE, 1));
        BLOCKS.add(ALUMINIUM_ORE = new BasicOre(Registries.ALUMINIUM_ORE, 1));
        BLOCKS.add(URANIUM_ORE = new BasicOre(Registries.URANIUM_ORE, 2));
        BLOCKS.add(SILVER_ORE = new BasicOre(Registries.SILVER_ORE, 2));
        BLOCKS.add(LEAD_ORE = new BasicOre(Registries.LEAD_ORE, 1));
        BLOCKS.add(RUBY_ORE = new BasicOre(Registries.RUBY_ORE, 2));
        BLOCKS.add(SAPPHIRE_ORE = new BasicOre(Registries.SAPPHIRE_ORE, 2));
        BLOCKS.add(AMETHYST_ORE = new BasicOre(Registries.AMETHYST_ORE, 2));
        BLOCKS.add(ZINC_ORE = new BasicOre(Registries.ZINC_ORE, 1));
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            for (Block block: BLOCKS) {
                event.getRegistry().register(block);
            }
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);

            for (Block block: BLOCKS) {
                event.getRegistry().register(new BlockItem(block, properties).setRegistryName(block.getRegistryName()));
            }
        }
    }
}
