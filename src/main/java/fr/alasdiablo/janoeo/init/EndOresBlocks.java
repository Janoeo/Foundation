package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.block.EndOre;
import fr.alasdiablo.janoeo.block.EndRedstoneOre;
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
public class EndOresBlocks {

    public static Block COAL_END_ORE
            = new EndOre(Registries.COAL_END_ORE, COMMON);
    public static Block DIAMOND_END_ORE
            = new EndOre(Registries.DIAMOND_END_ORE, RARE);
    public static Block EMERALD_END_ORE
            = new EndOre(Registries.EMERALD_END_ORE, RARE);
    public static Block GOLD_END_ORE
            = new EndOre(Registries.GOLD_END_ORE, NULL);
    public static Block IRON_END_ORE
            = new EndOre(Registries.IRON_END_ORE, NULL);
    public static Block LAPIS_END_ORE
            = new EndOre(Registries.LAPIS_END_ORE, UNCOMMON);
    public static Block REDSTONE_END_ORE
            = new EndRedstoneOre(Registries.REDSTONE_END_ORE);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    COAL_END_ORE, DIAMOND_END_ORE, EMERALD_END_ORE,
                    GOLD_END_ORE, IRON_END_ORE, LAPIS_END_ORE,
                    REDSTONE_END_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    COAL_END_ORE, DIAMOND_END_ORE, EMERALD_END_ORE,
                    GOLD_END_ORE, IRON_END_ORE, LAPIS_END_ORE,
                    REDSTONE_END_ORE
            );
        }
    }
}
