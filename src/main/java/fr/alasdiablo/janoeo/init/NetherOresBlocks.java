package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.NetherRedstoneOre;
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
public class NetherOresBlocks {

    private static List<Block> BLOCKS;
    private static boolean init = false;

    public static Block ALUMINIUM_NETHER_ORE;
    public static Block COAL_NETHER_ORE;
    public static Block COPPER_NETHER_ORE;
    public static Block DIAMOND_NETHER_ORE;
    public static Block EMERALD_NETHER_ORE;
    public static Block GOLD_NETHER_ORE;
    public static Block IRON_NETHER_ORE;
    public static Block LAPIS_NETHER_ORE;
    public static Block LEAD_NETHER_ORE;
    public static Block REDSTONE_NETHER_ORE;
    public static Block RUBY_NETHER_ORE;
    public static Block SAPPHIRE_NETHER_ORE;
    public static Block SILVER_NETHER_ORE;
    public static Block TIN_NETHER_ORE;
    public static Block URANIUM_NETHER_ORE;

    public static void init() {
        if (init) {
            throw new RuntimeException("OverworldDenseOresBlocks can't be init 2 time");
        } else {
            init = true;
        }

        BLOCKS = new ArrayList<>();

        BLOCKS.add(ALUMINIUM_NETHER_ORE = new NetherOre(Registries.ALUMINIUM_NETHER_ORE));
        BLOCKS.add(COAL_NETHER_ORE = new NetherOre(Registries.COAL_NETHER_ORE));
        BLOCKS.add(COPPER_NETHER_ORE = new NetherOre(Registries.COPPER_NETHER_ORE));
        BLOCKS.add(DIAMOND_NETHER_ORE = new NetherOre(Registries.DIAMOND_NETHER_ORE));
        BLOCKS.add(EMERALD_NETHER_ORE = new NetherOre(Registries.EMERALD_NETHER_ORE));
        BLOCKS.add(GOLD_NETHER_ORE = new NetherOre(Registries.GOLD_NETHER_ORE));
        BLOCKS.add(IRON_NETHER_ORE = new NetherOre(Registries.IRON_NETHER_ORE));
        BLOCKS.add(LAPIS_NETHER_ORE = new NetherOre(Registries.LAPIS_NETHER_ORE));
        BLOCKS.add(LEAD_NETHER_ORE = new NetherOre(Registries.LEAD_NETHER_ORE));
        BLOCKS.add(REDSTONE_NETHER_ORE = new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE));
        BLOCKS.add(RUBY_NETHER_ORE = new NetherOre(Registries.RUBY_NETHER_ORE));
        BLOCKS.add(SAPPHIRE_NETHER_ORE = new NetherOre(Registries.SAPPHIRE_NETHER_ORE));
        BLOCKS.add(SILVER_NETHER_ORE = new NetherOre(Registries.SILVER_NETHER_ORE));
        BLOCKS.add(TIN_NETHER_ORE = new NetherOre(Registries.TIN_NETHER_ORE));
        BLOCKS.add(URANIUM_NETHER_ORE = new NetherOre(Registries.URANIUM_NETHER_ORE));
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
