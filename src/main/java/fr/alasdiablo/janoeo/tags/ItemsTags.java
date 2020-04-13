package fr.alasdiablo.janoeo.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("unused")
public class ItemsTags {

    public static class Ingots {
        public static final Tag<Item> COPPER = tag("ingots/copper");
        public static final Tag<Item> TIN = tag("ingots/tin");
        public static final Tag<Item> ALUMINIUM = tag("ingots/aluminium");
        public static final Tag<Item> LEAD = tag("ingots/lead");
        public static final Tag<Item> SILVER = tag("ingots/silver");
        public static final Tag<Item> URANIUM = tag("ingots/uranium");
        public static final Tag<Item> ZINC = tag("ingots/zinc");
    }

    public static class Gems {
        public static final Tag<Item> RUBY = tag("gems/ruby");
        public static final Tag<Item> SAPPHIRE = tag("gems/sapphire");
        public static final Tag<Item> AMETHYST = tag("gems/amethyst");
    }

    public static class Dusts {
        public static final Tag<Item> DIAMOND = tag("dusts/diamond");
        public static final Tag<Item> GOLD = tag("dusts/gold");
        public static final Tag<Item> IRON = tag("dusts/iron");
    }

    private static Tag<Item> tag(String name) {
        return new ItemTags.Wrapper(new ResourceLocation("forge", name));
    }
}
