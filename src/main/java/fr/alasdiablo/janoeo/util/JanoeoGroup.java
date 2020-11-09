package fr.alasdiablo.janoeo.util;

import fr.alasdiablo.janoeo.init.IngotsItems;
import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * Creative Tab handler
 */
public class JanoeoGroup {

    /**
     * Creative tab use by ore block
     */
    public static final ItemGroup ORE_BLOCKS = new ItemGroup("janoeo.ore.block") {
        /**
         * icon getter use by creative tab
         * @return An itemstack corresponding to the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(NetherOresBlocks.COAL_NETHER_ORE);
        }
    };

    /**
     * Creative tab use by item
     */
    public static final ItemGroup ORE_ITEMS = new ItemGroup("janoeo.ore.item") {
        /**
         * icon getter use by creative tab
         * @return An itemstack corresponding to the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(IngotsItems.COPPER_INGOT);
        }
    };
}
