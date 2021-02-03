package fr.alasdiablo.janoeo.tags;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import java.util.function.Function;

/**
 * Tags Handler
 */
@SuppressWarnings("unused")
public class ItemsTags {

    /**
     * Handle Ingot tags
     */
    public static class Ingots {
        public static final ITag.INamedTag<Item> COPPER = dustTag("copper");
        public static final ITag.INamedTag<Item> TIN = dustTag("tin");
        public static final ITag.INamedTag<Item> ALUMINIUM = dustTag("aluminium");
        public static final ITag.INamedTag<Item> LEAD = dustTag("lead");
        public static final ITag.INamedTag<Item> SILVER = dustTag("silver");
        public static final ITag.INamedTag<Item> URANIUM = dustTag("uranium");
        public static final ITag.INamedTag<Item> ZINC = dustTag("zinc");
    }

    /**
     * Handle Gem tags
     */
    public static class Gems {
        public static final ITag.INamedTag<Item> RUBY = gemTag("ruby");
        public static final ITag.INamedTag<Item> SAPPHIRE = gemTag("sapphire");
        public static final ITag.INamedTag<Item> AMETHYST = gemTag("amethyst");
    }

    /**
     * Handle Dust tags
     */
    public static class Dusts {
        public static final ITag.INamedTag<Item> DIAMOND = dustTag("diamond");
        public static final ITag.INamedTag<Item> GOLD = dustTag("gold");
        public static final ITag.INamedTag<Item> IRON = dustTag("iron");
        public static final ITag.INamedTag<Item> COAL = dustTag("coal");
        public static final ITag.INamedTag<Item> LAPIS = dustTag("lapis");
        public static final ITag.INamedTag<Item> EMERALD = dustTag("emerald");
        public static final ITag.INamedTag<Item> ALUMINIUM = dustTag("aluminium");
        public static final ITag.INamedTag<Item> LEAD = dustTag("lead");
        public static final ITag.INamedTag<Item> NICKEL = dustTag("nickel");
        public static final ITag.INamedTag<Item> PLATINUM = dustTag("platinum");
        public static final ITag.INamedTag<Item> RUBY = dustTag("ruby");
        public static final ITag.INamedTag<Item> SAPPHIRE = dustTag("sapphire");
        public static final ITag.INamedTag<Item> SILVER = dustTag("silver");
        public static final ITag.INamedTag<Item> TIN = dustTag("tin");
        public static final ITag.INamedTag<Item> URANIUM = dustTag("uranium");
        public static final ITag.INamedTag<Item> COPPER = dustTag("copper");
    }

    private static ITag.INamedTag<Item> ingotTag(String ingotName) {
        return forgeTag("ingots/" + ingotName);
    }

    private static ITag.INamedTag<Item> gemTag(String gemName) {
        return forgeTag("gems/" + gemName);
    }

    private static ITag.INamedTag<Item> dustTag(String dustName) {
        return forgeTag("dusts/" + dustName);
    }

    private static ITag.INamedTag<Item> forgeTag(String path) {
        return tag("forge", path);
    }

    private static ITag.INamedTag<Item> tag(String namespace, String path) {
        return ItemTags.makeWrapperTag(new ResourceLocation(namespace, path).toString());
    }
}
