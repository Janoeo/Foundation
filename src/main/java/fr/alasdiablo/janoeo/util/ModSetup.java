package fr.alasdiablo.janoeo.util;

import fr.alasdiablo.janoeo.init.IngotsItems;
import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * Mod setup class
 */
public class ModSetup {

    // TODO: Move this class content into JANOEO.java can be better ?

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
        OreGenUtils.setupOres();
    }
}
