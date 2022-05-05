package fr.alasdiablo.janoeo.foundation.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class FoundationTags {

    public static class Blocks {
        public static final TagKey<Block> ORES_ALUMINIUM = tag("ores/aluminium"); // UK also FR btw
        public static final TagKey<Block> ORES_ALUMINUM = tag("ores/aluminum");  // US // because we can found both…
        public static final TagKey<Block> ORES_LEAD = tag("ores/lead");
        public static final TagKey<Block> ORES_NICKEL = tag("ores/nickel");
        public static final TagKey<Block> ORES_SILVER = tag("ores/silver");
        public static final TagKey<Block> ORES_TIN = tag("ores/tin");
        public static final TagKey<Block> ORES_URANIUM = tag("ores/uranium");

        public static final TagKey<Block> ORES_TINY = tag("ores/tiny");
        public static final TagKey<Block> ORES_TINY_COAL = tag("ores/tiny/coal");
        public static final TagKey<Block> ORES_TINY_COPPER = tag("ores/tiny/copper");
        public static final TagKey<Block> ORES_TINY_DIAMOND = tag("ores/tiny/diamond");
        public static final TagKey<Block> ORES_TINY_EMERALD = tag("ores/tiny/emerald");
        public static final TagKey<Block> ORES_TINY_GOLD = tag("ores/tiny/gold");
        public static final TagKey<Block> ORES_TINY_IRON = tag("ores/tiny/iron");
        public static final TagKey<Block> ORES_TINY_LAPIS = tag("ores/tiny/lapis");
        public static final TagKey<Block> ORES_TINY_REDSTONE = tag("ores/tiny/redstone");

        public static final TagKey<Block> ORES_TINY_ALUMINIUM = tag("ores/tiny/aluminium"); // UK also FR btw
        public static final TagKey<Block> ORES_TINY_ALUMINUM = tag("ores/tiny/aluminum");  // US // because we can found both…
        public static final TagKey<Block> ORES_TINY_LEAD = tag("ores/tiny/lead");
        public static final TagKey<Block> ORES_TINY_NICKEL = tag("ores/tiny/nickel");
        public static final TagKey<Block> ORES_TINY_SILVER = tag("ores/tiny/silver");
        public static final TagKey<Block> ORES_TINY_TIN = tag("ores/tiny/tin");
        public static final TagKey<Block> ORES_TINY_URANIUM = tag("ores/tiny/uranium");

        public static final TagKey<Block> STORAGE_BLOCKS_ALUMINIUM = tag("storage_blocks/aluminium"); // UK also FR btw
        public static final TagKey<Block> STORAGE_BLOCKS_ALUMINUM = tag("storage_blocks/aluminum");  // US // because we can found both…
        public static final TagKey<Block> STORAGE_BLOCKS_LEAD = tag("storage_blocks/lead");
        public static final TagKey<Block> STORAGE_BLOCKS_NICKEL = tag("storage_blocks/nickel");
        public static final TagKey<Block> STORAGE_BLOCKS_SILVER = tag("storage_blocks/silver");
        public static final TagKey<Block> STORAGE_BLOCKS_TIN = tag("storage_blocks/tin");
        public static final TagKey<Block> STORAGE_BLOCKS_URANIUM = tag("storage_blocks/uranium");

        public static final TagKey<Block> STORAGE_BLOCKS_RAW_ALUMINIUM = tag("storage_blocks/raw_aluminium"); // UK also FR btw
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_ALUMINUM = tag("storage_blocks/raw_aluminum");
        // US // because we can found both…
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_LEAD = tag("storage_blocks/raw_lead");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_NICKEL = tag("storage_blocks/raw_nickel");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_SILVER = tag("storage_blocks/raw_silver");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_TIN = tag("storage_blocks/raw_tin");
        public static final TagKey<Block> STORAGE_BLOCKS_RAW_URANIUM = tag("storage_blocks/raw_uranium");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ORES_ALUMINIUM = tag("ores/aluminium"); // UK also FR btw
        public static final TagKey<Item> ORES_ALUMINUM = tag("ores/aluminum");  // US // because we can found both…
        public static final TagKey<Item> ORES_LEAD = tag("ores/lead");
        public static final TagKey<Item> ORES_NICKEL = tag("ores/nickel");
        public static final TagKey<Item> ORES_SILVER = tag("ores/silver");
        public static final TagKey<Item> ORES_TIN = tag("ores/tin");
        public static final TagKey<Item> ORES_URANIUM = tag("ores/uranium");

        public static final TagKey<Item> ORES_TINY = tag("ores/tiny");
        public static final TagKey<Item> ORES_TINY_COAL = tag("ores/tiny/coal");
        public static final TagKey<Item> ORES_TINY_COPPER = tag("ores/tiny/copper");
        public static final TagKey<Item> ORES_TINY_DIAMOND = tag("ores/tiny/diamond");
        public static final TagKey<Item> ORES_TINY_EMERALD = tag("ores/tiny/emerald");
        public static final TagKey<Item> ORES_TINY_GOLD = tag("ores/tiny/gold");
        public static final TagKey<Item> ORES_TINY_IRON = tag("ores/tiny/iron");
        public static final TagKey<Item> ORES_TINY_LAPIS = tag("ores/tiny/lapis");
        public static final TagKey<Item> ORES_TINY_REDSTONE = tag("ores/tiny/redstone");

        public static final TagKey<Item> ORES_TINY_ALUMINIUM = tag("ores/tiny/aluminium"); // UK also FR btw
        public static final TagKey<Item> ORES_TINY_ALUMINUM = tag("ores/tiny/aluminum");  // US // because we can found both…
        public static final TagKey<Item> ORES_TINY_LEAD = tag("ores/tiny/lead");
        public static final TagKey<Item> ORES_TINY_NICKEL = tag("ores/tiny/nickel");
        public static final TagKey<Item> ORES_TINY_SILVER = tag("ores/tiny/silver");
        public static final TagKey<Item> ORES_TINY_TIN = tag("ores/tiny/tin");
        public static final TagKey<Item> ORES_TINY_URANIUM = tag("ores/tiny/uranium");

        public static final TagKey<Item> DUSTS_ALUMINIUM = tag("dusts/aluminium"); // UK also FR btw
        public static final TagKey<Item> DUSTS_ALUMINUM = tag("dusts/aluminum");  // US // because we can found both…
        public static final TagKey<Item> DUSTS_AMETHYST = tag("dusts/amethyst");
        public static final TagKey<Item> DUSTS_COAL = tag("dusts/coal");
        public static final TagKey<Item> DUSTS_COPPER = tag("dusts/copper");
        public static final TagKey<Item> DUSTS_DIAMOND = tag("dusts/diamond");
        public static final TagKey<Item> DUSTS_EMERALD = tag("dusts/emerald");
        public static final TagKey<Item> DUSTS_GOLD = tag("dusts/gold");
        public static final TagKey<Item> DUSTS_IRON = tag("dusts/iron");
        public static final TagKey<Item> DUSTS_LAPIS = tag("dusts/lapis");
        public static final TagKey<Item> DUSTS_LEAD = tag("dusts/lead");
        public static final TagKey<Item> DUSTS_NICKEL = tag("dusts/nickel");
        public static final TagKey<Item> DUSTS_SILVER = tag("dusts/silver");
        public static final TagKey<Item> DUSTS_TIN = tag("dusts/tin");
        public static final TagKey<Item> DUSTS_URANIUM = tag("dusts/uranium");

        public static final TagKey<Item> NUGGETS_ALUMINIUM = tag("nuggets/aluminium"); // UK also FR btw
        public static final TagKey<Item> NUGGETS_ALUMINUM = tag("nuggets/aluminum");  // US // because we can found both…
        public static final TagKey<Item> NUGGETS_COAL = tag("nuggets/coal");
        public static final TagKey<Item> NUGGETS_COPPER = tag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_DIAMOND = tag("nuggets/diamond");
        public static final TagKey<Item> NUGGETS_EMERALD = tag("nuggets/emerald");
        public static final TagKey<Item> NUGGETS_LAPIS = tag("nuggets/lapis");
        public static final TagKey<Item> NUGGETS_LEAD = tag("nuggets/lead");
        public static final TagKey<Item> NUGGETS_NICKEL = tag("nuggets/nickel");
        public static final TagKey<Item> NUGGETS_REDSTONE = tag("nuggets/redstone");
        public static final TagKey<Item> NUGGETS_SILVER = tag("nuggets/silver");
        public static final TagKey<Item> NUGGETS_TIN = tag("nuggets/tin");
        public static final TagKey<Item> NUGGETS_URANIUM = tag("nuggets/uranium");

        public static final TagKey<Item> INGOTS_ALUMINIUM = tag("ingots/aluminium"); // UK also FR btw
        public static final TagKey<Item> INGOTS_ALUMINUM = tag("ingots/aluminum");  // US // because we can found both…
        public static final TagKey<Item> INGOTS_COPPER = tag("ingots/copper");
        public static final TagKey<Item> INGOTS_LEAD = tag("ingots/lead");
        public static final TagKey<Item> INGOTS_NICKEL = tag("ingots/nickel");
        public static final TagKey<Item> INGOTS_SILVER = tag("ingots/silver");
        public static final TagKey<Item> INGOTS_TIN = tag("ingots/tin");
        public static final TagKey<Item> INGOTS_URANIUM = tag("ingots/uranium");

        public static final TagKey<Item> RAW_MATERIALS_ALUMINIUM = tag("raw_materials/aluminium"); // UK also FR btw
        public static final TagKey<Item> RAW_MATERIALS_ALUMINUM = tag("raw_materials/aluminum");  // US // because we can found both…
        public static final TagKey<Item> RAW_MATERIALS_LEAD = tag("raw_materials/lead");
        public static final TagKey<Item> RAW_MATERIALS_NICKEL = tag("raw_materials/nickel");
        public static final TagKey<Item> RAW_MATERIALS_SILVER = tag("raw_materials/silver");
        public static final TagKey<Item> RAW_MATERIALS_TIN = tag("raw_materials/tin");
        public static final TagKey<Item> RAW_MATERIALS_URANIUM = tag("raw_materials/uranium");

        public static final TagKey<Item> STORAGE_BLOCKS_ALUMINIUM = tag("storage_blocks/aluminium"); // UK also FR btw
        public static final TagKey<Item> STORAGE_BLOCKS_ALUMINUM = tag("storage_blocks/aluminum");  // US // because we can found both…
        public static final TagKey<Item> STORAGE_BLOCKS_LEAD = tag("storage_blocks/lead");
        public static final TagKey<Item> STORAGE_BLOCKS_NICKEL = tag("storage_blocks/nickel");
        public static final TagKey<Item> STORAGE_BLOCKS_SILVER = tag("storage_blocks/silver");
        public static final TagKey<Item> STORAGE_BLOCKS_TIN = tag("storage_blocks/tin");
        public static final TagKey<Item> STORAGE_BLOCKS_URANIUM = tag("storage_blocks/uranium");

        public static final TagKey<Item> STORAGE_BLOCKS_RAW_ALUMINIUM = tag("storage_blocks/raw_aluminium"); // UK also FR btw
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_ALUMINUM = tag("storage_blocks/raw_aluminum");  // US // because we can found both…
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_LEAD = tag("storage_blocks/raw_lead");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_NICKEL = tag("storage_blocks/raw_nickel");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_SILVER = tag("storage_blocks/raw_silver");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_TIN = tag("storage_blocks/raw_tin");
        public static final TagKey<Item> STORAGE_BLOCKS_RAW_URANIUM = tag("storage_blocks/raw_uranium");

        public static final TagKey<Item> RODS_COPPER = tag("rods/copper");
        public static final TagKey<Item> RODS_DIAMOND = tag("rods/diamond");
        public static final TagKey<Item> RODS_GOLD = tag("rods/gold");
        public static final TagKey<Item> RODS_IRON = tag("rods/iron");
        public static final TagKey<Item> RODS_SILVER = tag("rods/silver");
        public static final TagKey<Item> RODS_TIN = tag("rods/tin");

        public static final TagKey<Item> GEARS = tag("gears");
        public static final TagKey<Item> GEARS_COPPER = tag("gears/copper");
        public static final TagKey<Item> GEARS_DIAMOND = tag("gears/diamond");
        public static final TagKey<Item> GEARS_GOLD = tag("gears/gold");
        public static final TagKey<Item> GEARS_IRON = tag("gears/iron");
        public static final TagKey<Item> GEARS_SILVER = tag("gears/silver");
        public static final TagKey<Item> GEARS_TIN = tag("gears/tin");
        public static final TagKey<Item> GEARS_WOODEN = tag("gears/wooden");

        public static final TagKey<Item> SCRAP = tag("scrap");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
