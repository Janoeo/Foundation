package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.generic.ExperienceRarity;
import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.block.OreBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class FoundationBlocks {
    private static final AbstractBlock.Properties PROPERTIES_ORE_IRON_TIER = AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(3.0F, 3.0F);

    public static void init(RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        FoundationBlocks.initTinyOre(registry);
    }

    /* * * * * * * * * * * * * * * Tiny Ore * * *  * * * * * * * * * * */
    public static final Block TINY_GOLD_ORE = new OreBlock(PROPERTIES_ORE_IRON_TIER, ExperienceRarity.UNCOMMON, Registries.TINY_GOLD_ORE);

    private static void initTinyOre(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(registry, TINY_GOLD_ORE);
    }
}
