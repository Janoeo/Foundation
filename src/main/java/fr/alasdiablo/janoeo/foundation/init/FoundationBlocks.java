package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.block.ExperienceRarity;
import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.block.OreBlock;
import fr.alasdiablo.janoeo.foundation.block.RedstoneOreBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class FoundationBlocks {
    private static final Item.Properties PROPERTIES_ITEM_BLOCK = new Item.Properties().tab(Foundation.BLOCKS_GROUP);

    private static final BlockBehaviour.Properties PROPERTIES_STONE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F);
    /* * * * * * * * * * * * * * * Ore * * *  * * * * * * * * * * */
    public static final Block BAUXITE_ORE = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.BAUXITE_ORE);
    public static final Block LEAD_ORE    = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.LEAD_ORE);
    public static final Block NICKEL_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.NICKEL_ORE);
    public static final Block SILVER_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.SILVER_ORE);
    public static final Block TIN_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TIN_ORE);
    public static final Block URANIUM_ORE = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.URANIUM_ORE);
    /* * * * * * * * * * * * * * * Tiny Ore * * * * * * * * * * * * * */
    public static final Block TINY_COAL_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_COAL_ORE);
    public static final Block TINY_COPPER_ORE   = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_COPPER_ORE);
    public static final Block TINY_DIAMOND_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.RARE, Registries.TINY_DIAMOND_ORE);
    public static final Block TINY_EMERALD_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.RARE, Registries.TINY_EMERALD_ORE);
    public static final Block TINY_GOLD_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_GOLD_ORE);
    public static final Block TINY_IRON_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_IRON_ORE);
    public static final Block TINY_LAPIS_ORE    = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_LAPIS_ORE);
    public static final Block TINY_REDSTONE_ORE = new RedstoneOreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_REDSTONE_ORE);
    public static final Block TINY_BAUXITE_ORE = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_BAUXITE_ORE);
    public static final Block TINY_LEAD_ORE    = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_LEAD_ORE);
    public static final Block TINY_NICKEL_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_NICKEL_ORE);
    public static final Block TINY_SILVER_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_SILVER_ORE);
    public static final Block TINY_TIN_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_TIN_ORE);
    public static final Block TINY_URANIUM_ORE = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_URANIUM_ORE);
    private static final BlockBehaviour.Properties PROPERTIES_DEEPSLATE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .color(MaterialColor.DEEPSLATE)
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE);
    public static final Block DEEPSLATE_BAUXITE_ORE = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_BAUXITE_ORE);
    public static final Block DEEPSLATE_LEAD_ORE    = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_LEAD_ORE);
    public static final Block DEEPSLATE_NICKEL_ORE  = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_NICKEL_ORE);
    public static final Block DEEPSLATE_SILVER_ORE  = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_SILVER_ORE);
    public static final Block DEEPSLATE_TIN_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TIN_ORE);
    public static final Block DEEPSLATE_URANIUM_ORE = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_URANIUM_ORE);
    public static final Block DEEPSLATE_TINY_COAL_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_COAL_ORE);
    public static final Block DEEPSLATE_TINY_COPPER_ORE   = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_COPPER_ORE);
    public static final Block DEEPSLATE_TINY_DIAMOND_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.RARE, Registries.DEEPSLATE_TINY_DIAMOND_ORE);
    public static final Block DEEPSLATE_TINY_EMERALD_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.RARE, Registries.DEEPSLATE_TINY_EMERALD_ORE);
    public static final Block DEEPSLATE_TINY_GOLD_ORE     = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_GOLD_ORE);
    public static final Block DEEPSLATE_TINY_IRON_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_IRON_ORE);
    public static final Block DEEPSLATE_TINY_LAPIS_ORE    = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_LAPIS_ORE);
    public static final Block DEEPSLATE_TINY_REDSTONE_ORE = new RedstoneOreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_REDSTONE_ORE);
    public static final Block DEEPSLATE_TINY_BAUXITE_ORE = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_BAUXITE_ORE);
    public static final Block DEEPSLATE_TINY_LEAD_ORE    = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_LEAD_ORE);
    public static final Block DEEPSLATE_TINY_NICKEL_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_NICKEL_ORE);
    public static final Block DEEPSLATE_TINY_SILVER_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_SILVER_ORE);
    public static final Block DEEPSLATE_TINY_TIN_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_TIN_ORE);
    public static final Block DEEPSLATE_TINY_URANIUM_ORE = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_URANIUM_ORE);

    public static void initBlock(RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        FoundationBlocks.initOreBlock(registry);
        FoundationBlocks.initTinyOreBlock(registry);
    }

    public static void initItem(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        FoundationBlocks.initOreItem(registry);
        FoundationBlocks.initTinyOreItem(registry);
    }

    private static void initOreBlock(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(
                registry, BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE,
                DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE
        );
    }

    private static void initOreItem(IForgeRegistry<Item> registry) {
        RegistryHelper.registerBlockItem(
                registry, PROPERTIES_ITEM_BLOCK, BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE,
                DEEPSLATE_NICKEL_ORE, DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE
        );
    }

    private static void initTinyOreBlock(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(
                registry, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE, TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE,
                DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE, DEEPSLATE_TINY_GOLD_ORE,
                DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_NICKEL_ORE,
                TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_NICKEL_ORE,
                DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE
        );
    }

    private static void initTinyOreItem(IForgeRegistry<Item> registry) {
        RegistryHelper.registerBlockItem(
                registry, PROPERTIES_ITEM_BLOCK, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE, TINY_IRON_ORE,
                TINY_LAPIS_ORE, TINY_REDSTONE_ORE, DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE,
                DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE,
                TINY_NICKEL_ORE, TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE,
                DEEPSLATE_TINY_NICKEL_ORE, DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE
        );
    }
}
