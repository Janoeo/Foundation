package fr.alasdiablo.janoeo.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

/**
 * Tags Handler
 */
@SuppressWarnings("unused")
public class ItemsTags {

    /**
     * Handle Ingot tags
     */
    public static class Ingots {
        public static final Tags.IOptionalNamedTag<Item> COPPER = tag("ingots/copper");
        public static final Tags.IOptionalNamedTag<Item> TIN = tag("ingots/tin");
        public static final Tags.IOptionalNamedTag<Item> ALUMINIUM = tag("ingots/aluminium");
        public static final Tags.IOptionalNamedTag<Item> LEAD = tag("ingots/lead");
        public static final Tags.IOptionalNamedTag<Item> SILVER = tag("ingots/silver");
        public static final Tags.IOptionalNamedTag<Item> URANIUM = tag("ingots/uranium");
        public static final Tags.IOptionalNamedTag<Item> ZINC = tag("ingots/zinc");
    }

    /**
     * Handle Gem tags
     */
    public static class Gems {
        public static final Tags.IOptionalNamedTag<Item> RUBY = tag("gems/ruby");
        public static final Tags.IOptionalNamedTag<Item> SAPPHIRE = tag("gems/sapphire");
        public static final Tags.IOptionalNamedTag<Item> AMETHYST = tag("gems/amethyst");
    }

    /**
     * Handle Dust tags
     */
    public static class Dusts {
        public static final Tags.IOptionalNamedTag<Item> DIAMOND = tag("dusts/diamond");
        public static final Tags.IOptionalNamedTag<Item> GOLD = tag("dusts/gold");
        public static final Tags.IOptionalNamedTag<Item> IRON = tag("dusts/iron");
    }

    /**
     * Function use for create a instance of a tag
     *
     * @param name The name of the tag
     * @return An instant of the tag corresponding to the <i>name</i>
     */
    private static Tags.IOptionalNamedTag<Item> tag(String name) {
        return ItemTags.createOptional(new ResourceLocation("forge", name));
    }
}
