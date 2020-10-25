package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.block.GravelOre;
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
public class GravelsOresBlocks {

    public static Block DIAMOND_GRAVEL_ORE
            = new GravelOre(Registries.DIAMOND_GRAVEL_ORE, RARE);
    public static Block IRON_GRAVEL_ORE
            = new GravelOre(Registries.IRON_GRAVEL_ORE, COMMON);
    public static Block GOLD_GRAVEL_ORE
            = new GravelOre(Registries.GOLD_GRAVEL_ORE, UNCOMMON);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    DIAMOND_GRAVEL_ORE, IRON_GRAVEL_ORE, GOLD_GRAVEL_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    DIAMOND_GRAVEL_ORE, IRON_GRAVEL_ORE, GOLD_GRAVEL_ORE
            );
        }
    }
}
