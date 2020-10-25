package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.NetherRedstoneOre;
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
public class NetherOresBlocks {

    public static Block ALUMINIUM_NETHER_ORE
            = new NetherOre(Registries.ALUMINIUM_NETHER_ORE, NULL);
    public static Block COAL_NETHER_ORE
            = new NetherOre(Registries.COAL_NETHER_ORE, COMMON);
    public static Block COPPER_NETHER_ORE
            = new NetherOre(Registries.COPPER_NETHER_ORE, NULL);
    public static Block DIAMOND_NETHER_ORE
            = new NetherOre(Registries.DIAMOND_NETHER_ORE, RARE);
    public static Block EMERALD_NETHER_ORE
            = new NetherOre(Registries.EMERALD_NETHER_ORE, RARE);
    public static Block GOLD_NETHER_ORE
            = new NetherOre(Registries.GOLD_NETHER_ORE, NULL);
    public static Block IRON_NETHER_ORE
            = new NetherOre(Registries.IRON_NETHER_ORE, NULL);
    public static Block LAPIS_NETHER_ORE
            = new NetherOre(Registries.LAPIS_NETHER_ORE, UNCOMMON);
    public static Block LEAD_NETHER_ORE
            = new NetherOre(Registries.LEAD_NETHER_ORE, NULL);
    public static Block REDSTONE_NETHER_ORE
            = new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE);
    public static Block RUBY_NETHER_ORE
            = new NetherOre(Registries.RUBY_NETHER_ORE, RARE);
    public static Block SAPPHIRE_NETHER_ORE
            = new NetherOre(Registries.SAPPHIRE_NETHER_ORE, RARE);
    public static Block SILVER_NETHER_ORE
            = new NetherOre(Registries.SILVER_NETHER_ORE, NULL);
    public static Block TIN_NETHER_ORE
            = new NetherOre(Registries.TIN_NETHER_ORE, NULL);
    public static Block URANIUM_NETHER_ORE
            = new NetherOre(Registries.URANIUM_NETHER_ORE, NULL);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    ALUMINIUM_NETHER_ORE, COAL_NETHER_ORE, COPPER_NETHER_ORE,
                    DIAMOND_NETHER_ORE, EMERALD_NETHER_ORE, GOLD_NETHER_ORE,
                    IRON_NETHER_ORE, LAPIS_NETHER_ORE, LEAD_NETHER_ORE,
                    REDSTONE_NETHER_ORE, RUBY_NETHER_ORE, SAPPHIRE_NETHER_ORE,
                    SILVER_NETHER_ORE, TIN_NETHER_ORE, URANIUM_NETHER_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    ALUMINIUM_NETHER_ORE, COAL_NETHER_ORE, COPPER_NETHER_ORE,
                    DIAMOND_NETHER_ORE, EMERALD_NETHER_ORE, GOLD_NETHER_ORE,
                    IRON_NETHER_ORE, LAPIS_NETHER_ORE, LEAD_NETHER_ORE,
                    REDSTONE_NETHER_ORE, RUBY_NETHER_ORE, SAPPHIRE_NETHER_ORE,
                    SILVER_NETHER_ORE, TIN_NETHER_ORE, URANIUM_NETHER_ORE
            );
        }
    }
}
