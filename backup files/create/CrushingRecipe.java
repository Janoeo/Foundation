package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class CrushingRecipe extends ProcessingRecipe {
    public CrushingRecipe(DataGenerator dataGenerator) {
        super(dataGenerator);
        this.dust(() -> Items.AMETHYST_SHARD, FoundationItems.DUSTS.get(Resource.Amethyst)::get);

        this.dust(() -> Items.COAL, FoundationItems.DUSTS.get(Resource.Coal)::get);

        this.dust(() -> Items.COPPER_INGOT, FoundationItems.DUSTS.get(Resource.Copper)::get);
        this.dust(AllItems.CRUSHED_COPPER::get, FoundationItems.DUSTS.get(Resource.Copper)::get);

        this.dust(() -> Items.DIAMOND, FoundationItems.DUSTS.get(Resource.Diamond)::get);

        this.dust(() -> Items.EMERALD, FoundationItems.DUSTS.get(Resource.Emerald)::get);

        this.dust(() -> Items.GOLD_INGOT, FoundationItems.DUSTS.get(Resource.Gold)::get);
        this.dust(AllItems.CRUSHED_GOLD::get, FoundationItems.DUSTS.get(Resource.Gold)::get);

        this.dust(() -> Items.IRON_INGOT, FoundationItems.DUSTS.get(Resource.Iron)::get);
        this.dust(AllItems.CRUSHED_IRON::get, FoundationItems.DUSTS.get(Resource.Iron)::get);

        this.dust(() -> Items.LAPIS_LAZULI, FoundationItems.DUSTS.get(Resource.Lapis)::get);


        this.ore(FoundationBlocks.STONE_ORES.get(Resource.Aluminium)::get, AllItems.CRUSHED_BAUXITE::get, () -> Blocks.COBBLESTONE);
        this.ore(FoundationBlocks.DEEPSLATE_ORES.get(Resource.Aluminium)::get, AllItems.CRUSHED_BAUXITE::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(FoundationItems.RAWS.get(Resource.Aluminium)::get, AllItems.CRUSHED_BAUXITE::get);
        this.rawBlock(FoundationBlocks.RAW_BLOCKS.get(Resource.Aluminium)::get, AllItems.CRUSHED_BAUXITE::get);
        this.dust(FoundationItems.INGOTS.get(Resource.Aluminium)::get, FoundationItems.DUSTS.get(Resource.Aluminium)::get);
        this.dust(AllItems.CRUSHED_BAUXITE::get, FoundationItems.DUSTS.get(Resource.Aluminium)::get);

        this.ore(FoundationBlocks.STONE_ORES.get(Resource.Lead)::get, AllItems.CRUSHED_LEAD::get, () -> Blocks.COBBLESTONE);
        this.ore(FoundationBlocks.DEEPSLATE_ORES.get(Resource.Lead)::get, AllItems.CRUSHED_LEAD::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(FoundationItems.RAWS.get(Resource.Lead)::get, AllItems.CRUSHED_LEAD::get);
        this.rawBlock(FoundationBlocks.RAW_BLOCKS.get(Resource.Lead)::get, AllItems.CRUSHED_LEAD::get);
        this.dust(FoundationItems.INGOTS.get(Resource.Lead)::get, FoundationItems.DUSTS.get(Resource.Lead)::get);
        this.dust(AllItems.CRUSHED_LEAD::get, FoundationItems.DUSTS.get(Resource.Lead)::get);

        this.ore(FoundationBlocks.STONE_ORES.get(Resource.Nickel)::get, AllItems.CRUSHED_NICKEL::get, () -> Blocks.COBBLESTONE);
        this.ore(FoundationBlocks.DEEPSLATE_ORES.get(Resource.Nickel)::get, AllItems.CRUSHED_NICKEL::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(FoundationItems.RAWS.get(Resource.Nickel)::get, AllItems.CRUSHED_NICKEL::get);
        this.rawBlock(FoundationBlocks.RAW_BLOCKS.get(Resource.Nickel)::get, AllItems.CRUSHED_NICKEL::get);
        this.dust(FoundationItems.INGOTS.get(Resource.Nickel)::get, FoundationItems.DUSTS.get(Resource.Nickel)::get);
        this.dust(AllItems.CRUSHED_NICKEL::get, FoundationItems.DUSTS.get(Resource.Nickel)::get);

        this.ore(FoundationBlocks.STONE_ORES.get(Resource.Silver)::get, AllItems.CRUSHED_SILVER::get, () -> Blocks.COBBLESTONE);
        this.ore(FoundationBlocks.DEEPSLATE_ORES.get(Resource.Silver)::get, AllItems.CRUSHED_SILVER::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(FoundationItems.RAWS.get(Resource.Silver)::get, AllItems.CRUSHED_SILVER::get);
        this.rawBlock(FoundationBlocks.RAW_BLOCKS.get(Resource.Silver)::get, AllItems.CRUSHED_SILVER::get);
        this.dust(FoundationItems.INGOTS.get(Resource.Silver)::get, FoundationItems.DUSTS.get(Resource.Silver)::get);
        this.dust(AllItems.CRUSHED_SILVER::get, FoundationItems.DUSTS.get(Resource.Silver)::get);

        this.ore(FoundationBlocks.STONE_ORES.get(Resource.Silver)::get, AllItems.CRUSHED_TIN::get, () -> Blocks.COBBLESTONE);
        this.ore(FoundationBlocks.DEEPSLATE_ORES.get(Resource.Silver)::get, AllItems.CRUSHED_TIN::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(FoundationItems.RAWS.get(Resource.Tin)::get, AllItems.CRUSHED_TIN::get);
        this.rawBlock(FoundationBlocks.RAW_BLOCKS.get(Resource.Tin)::get, AllItems.CRUSHED_TIN::get);
        this.dust(FoundationItems.INGOTS.get(Resource.Tin)::get, FoundationItems.DUSTS.get(Resource.Tin)::get);
        this.dust(AllItems.CRUSHED_TIN::get, FoundationItems.DUSTS.get(Resource.Tin)::get);

        this.ore(FoundationBlocks.STONE_ORES.get(Resource.Uranium)::get, AllItems.CRUSHED_URANIUM::get, () -> Blocks.COBBLESTONE);
        this.ore(FoundationBlocks.DEEPSLATE_ORES.get(Resource.Uranium)::get, AllItems.CRUSHED_URANIUM::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(FoundationItems.RAWS.get(Resource.Uranium)::get, AllItems.CRUSHED_URANIUM::get);
        this.rawBlock(FoundationBlocks.RAW_BLOCKS.get(Resource.Uranium)::get, AllItems.CRUSHED_URANIUM::get);
        this.dust(FoundationItems.INGOTS.get(Resource.Uranium)::get, FoundationItems.DUSTS.get(Resource.Uranium)::get);
        this.dust(AllItems.CRUSHED_URANIUM::get, FoundationItems.DUSTS.get(Resource.Uranium)::get);
    }

    private void ore(Supplier<ItemLike> input, Supplier<ItemLike> output, Supplier<ItemLike> stone) {
        this.create(Foundation.MOD_ID, input, builder -> {
            builder.duration(250);
            builder.output(output.get(), 2);
            builder.output(0.25f, output.get(), 1);
            builder.output(0.75f, AllItems.EXP_NUGGET.get(), 1);
            builder.output(0.125f, stone.get(), 1);
            return builder;
        });
    }

    private void raw(Supplier<ItemLike> input, Supplier<ItemLike> output) {
        this.create(Foundation.MOD_ID, input, builder -> {
            builder.duration(400);
            builder.output(output.get(), 1);
            builder.output(0.75f, AllItems.EXP_NUGGET.get(), 1);
            return builder;
        });
    }

    private void rawBlock(Supplier<ItemLike> input, Supplier<ItemLike> output) {
        this.create(Foundation.MOD_ID, input, builder -> {
            builder.duration(400);
            builder.output(output.get(), 9);
            builder.output(0.75f, AllItems.EXP_NUGGET.get(), 9);
            return builder;
        });
    }

    private void dust(Supplier<ItemLike> input, Supplier<ItemLike> output) {
        this.create(Foundation.MOD_ID, input, builder -> {
            builder.duration(350);
            builder.output(output.get(), 1);
            return builder;
        });
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.CRUSHING;
    }
}
