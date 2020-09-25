package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class OverworldOresBlocks {

    public static Block COPPER_ORE = new BasicOre(Registries.COPPER_ORE, 1);

    public static Block TIN_ORE = new BasicOre(Registries.TIN_ORE, 1);

    public static Block ALUMINIUM_ORE = new BasicOre(Registries.ALUMINIUM_ORE, 1);

    public static Block URANIUM_ORE = new BasicOre(Registries.URANIUM_ORE, 2);

    public static Block SILVER_ORE = new BasicOre(Registries.SILVER_ORE, 2);

    public static Block LEAD_ORE = new BasicOre(Registries.LEAD_ORE, 1);

    public static Block RUBY_ORE = new BasicOre(Registries.RUBY_ORE, 2);

    public static Block SAPPHIRE_ORE = new BasicOre(Registries.SAPPHIRE_ORE, 2);

    public static Block AMETHYST_ORE = new BasicOre(Registries.AMETHYST_ORE, 2);

    public static Block ZINC_ORE = new BasicOre(Registries.ZINC_ORE, 1);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(OverworldOresBlocks.COPPER_ORE);
            event.getRegistry().register(OverworldOresBlocks.TIN_ORE);
            event.getRegistry().register(OverworldOresBlocks.ALUMINIUM_ORE);
            event.getRegistry().register(OverworldOresBlocks.URANIUM_ORE);
            event.getRegistry().register(OverworldOresBlocks.SILVER_ORE);
            event.getRegistry().register(OverworldOresBlocks.LEAD_ORE);
            event.getRegistry().register(OverworldOresBlocks.RUBY_ORE);
            event.getRegistry().register(OverworldOresBlocks.SAPPHIRE_ORE);
            event.getRegistry().register(OverworldOresBlocks.AMETHYST_ORE);
            event.getRegistry().register(OverworldOresBlocks.ZINC_ORE);
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.COPPER_ORE, properties).setRegistryName(Registries.COPPER_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.TIN_ORE, properties).setRegistryName(Registries.TIN_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.ALUMINIUM_ORE, properties).setRegistryName(Registries.ALUMINIUM_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.URANIUM_ORE, properties).setRegistryName(Registries.URANIUM_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.SILVER_ORE, properties).setRegistryName(Registries.SILVER_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.LEAD_ORE, properties).setRegistryName(Registries.LEAD_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.RUBY_ORE, properties).setRegistryName(Registries.RUBY_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.SAPPHIRE_ORE, properties).setRegistryName(Registries.SAPPHIRE_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.AMETHYST_ORE, properties).setRegistryName(Registries.AMETHYST_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.ZINC_ORE, properties).setRegistryName(Registries.ZINC_ORE));
        }
    }
}
