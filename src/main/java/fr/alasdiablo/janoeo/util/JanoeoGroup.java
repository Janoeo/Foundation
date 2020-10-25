package fr.alasdiablo.janoeo.util;

import fr.alasdiablo.janoeo.init.IngotsItems;
import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * Mod setup class
 */
public class JanoeoGroup {

    /**
     * Mod creative tab for ore block
     */
    public static final ItemGroup ORE_BLOCKS = new ItemGroup("janoeo.ore.block") {
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
    public static final ItemGroup ORE_ITEMS = new ItemGroup("janoeo.ore.item") {
        /**
         * icon getter for the creative tab
         * @return An itemstack corresponding at the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(IngotsItems.COPPER_INGOT);
        }
    };
}
