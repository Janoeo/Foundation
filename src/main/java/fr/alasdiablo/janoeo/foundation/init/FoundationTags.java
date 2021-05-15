package fr.alasdiablo.janoeo.foundation.init;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class FoundationTags {

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> DUSTS_AMETHYST = tag("dusts/amethyst");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COAL = tag("dusts/coal");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COPPER = tag("dusts/copper");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_DIAMOND = tag("dusts/diamond");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_EMERALD = tag("dusts/emerald");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_GOLD = tag("dusts/gold");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_IRON = tag("dusts/iron");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LAPIS = tag("dusts/lapis");

        public static final Tags.IOptionalNamedTag<Item> NUGGETS_COPPER = tag("nuggets/copper");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
