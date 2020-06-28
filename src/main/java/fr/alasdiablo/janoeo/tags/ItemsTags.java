package fr.alasdiablo.janoeo.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("unused")
public class ItemsTags {

    public static class Ingots {
        public static final ITag.INamedTag<Item> COPPER = tag("ingots/copper");
        public static final ITag.INamedTag<Item> TIN = tag("ingots/tin");
        public static final ITag.INamedTag<Item> ALUMINIUM = tag("ingots/aluminium");
        public static final ITag.INamedTag<Item> LEAD = tag("ingots/lead");
        public static final ITag.INamedTag<Item> SILVER = tag("ingots/silver");
        public static final ITag.INamedTag<Item> URANIUM = tag("ingots/uranium");
        public static final ITag.INamedTag<Item> ZINC = tag("ingots/zinc");
    }

    public static class Gems {
        public static final ITag.INamedTag<Item> RUBY = tag("gems/ruby");
        public static final ITag.INamedTag<Item> SAPPHIRE = tag("gems/sapphire");
        public static final ITag.INamedTag<Item> AMETHYST = tag("gems/amethyst");
    }

    public static class Dusts {
        public static final ITag.INamedTag<Item> DIAMOND = tag("dusts/diamond");
        public static final ITag.INamedTag<Item> GOLD = tag("dusts/gold");
        public static final ITag.INamedTag<Item> IRON = tag("dusts/iron");
    }

    private static ITag.INamedTag<Item> tag(String name) {
        return ItemTags.makeWrapperTag(new ResourceLocation("forge", name).toString());
    }
}
