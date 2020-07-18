package fr.alasdiablo.janoeo.util;

import fr.alasdiablo.janoeo.item.IngotsItems;
import fr.alasdiablo.janoeo.block.NetherOresBlocks;
import fr.alasdiablo.janoeo.world.gen.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Mod setup class
 */
public class ModSetup {

    /**
     * Mod creative tab for ore block
     */
    public ItemGroup janoeoOreGroup = new ItemGroup("janoeo.ore.group") {
        /**
         * icon getter for the creative tab
         * @return An itemstack corresponding at the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(NetherOresBlocks.COAL_NETHER_ORE);
        }
    };

    /**
     * Mod creative tab for item
     */
    public ItemGroup janoeoItemGroup = new ItemGroup("janoeo.item.group") {
        /**
         * icon getter for the creative tab
         * @return An itemstack corresponding at the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(IngotsItems.COPPER_INGOT);
        }
    };

    /**
     * Mod setup init
     */
    public void init() {
        List<IWorldGenerator> generators = new ArrayList<>();
        generators.add(new OverworldOreGenerator());
        generators.add(new NetherOreGenerator());
        generators.add(new EndOreGenerator());
        generators.add(new GravelOreGenerator());
        generators.forEach(IWorldGenerator::startWorldGeneration);
    }
}
