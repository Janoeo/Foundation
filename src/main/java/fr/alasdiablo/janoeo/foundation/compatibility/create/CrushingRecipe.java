package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class CrushingRecipe extends ProcessingRecipe {
    public CrushingRecipe(DataGenerator dataGenerator) {
        super(dataGenerator);
        this.dust(() -> Items.AMETHYST_SHARD, () -> FoundationItems.AMETHYST_DUST);

        this.dust(() -> Items.COAL, () -> FoundationItems.COAL_DUST);

        this.dust(() -> Items.COPPER_INGOT, () -> FoundationItems.COPPER_DUST);
        this.dust(AllItems.CRUSHED_COPPER::get, () -> FoundationItems.COPPER_DUST);

        this.dust(() -> Items.DIAMOND, () -> FoundationItems.DIAMOND_DUST);

        this.dust(() -> Items.EMERALD, () -> FoundationItems.EMERALD_DUST);

        this.dust(() -> Items.GOLD_INGOT, () -> FoundationItems.GOLD_DUST);
        this.dust(AllItems.CRUSHED_GOLD::get, () -> FoundationItems.GOLD_DUST);

        this.dust(() -> Items.IRON_INGOT, () -> FoundationItems.IRON_DUST);
        this.dust(AllItems.CRUSHED_IRON::get, () -> FoundationItems.IRON_DUST);

        this.dust(() -> Items.LAPIS_LAZULI, () -> FoundationItems.LAPIS_DUST);


        this.ore(() -> FoundationBlocks.BAUXITE_ORE, AllItems.CRUSHED_BAUXITE::get, () -> Blocks.COBBLESTONE);
        this.ore(() -> FoundationBlocks.DEEPSLATE_BAUXITE_ORE, AllItems.CRUSHED_BAUXITE::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(() -> FoundationItems.RAW_ALUMINIUM, AllItems.CRUSHED_BAUXITE::get);
        this.dust(() -> FoundationItems.ALUMINIUM_INGOT, () -> FoundationItems.ALUMINIUM_DUST);
        this.dust(AllItems.CRUSHED_BAUXITE::get, () -> FoundationItems.ALUMINIUM_DUST);

        this.ore(() -> FoundationBlocks.LEAD_ORE, AllItems.CRUSHED_LEAD::get, () -> Blocks.COBBLESTONE);
        this.ore(() -> FoundationBlocks.DEEPSLATE_LEAD_ORE, AllItems.CRUSHED_LEAD::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(() -> FoundationItems.RAW_LEAD, AllItems.CRUSHED_LEAD::get);
        this.dust(() -> FoundationItems.LEAD_INGOT, () -> FoundationItems.LEAD_DUST);
        this.dust(AllItems.CRUSHED_LEAD::get, () -> FoundationItems.LEAD_DUST);

        this.ore(() -> FoundationBlocks.NICKEL_ORE, AllItems.CRUSHED_NICKEL::get, () -> Blocks.COBBLESTONE);
        this.ore(() -> FoundationBlocks.DEEPSLATE_NICKEL_ORE, AllItems.CRUSHED_NICKEL::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(() -> FoundationItems.RAW_NICKEL, AllItems.CRUSHED_NICKEL::get);
        this.dust(() -> FoundationItems.NICKEL_INGOT, () -> FoundationItems.NICKEL_DUST);
        this.dust(AllItems.CRUSHED_NICKEL::get, () -> FoundationItems.NICKEL_DUST);

        this.ore(() -> FoundationBlocks.SILVER_ORE, AllItems.CRUSHED_SILVER::get, () -> Blocks.COBBLESTONE);
        this.ore(() -> FoundationBlocks.DEEPSLATE_SILVER_ORE, AllItems.CRUSHED_SILVER::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(() -> FoundationItems.RAW_SILVER, AllItems.CRUSHED_SILVER::get);
        this.dust(() -> FoundationItems.SILVER_INGOT, () -> FoundationItems.SILVER_DUST);
        this.dust(AllItems.CRUSHED_SILVER::get, () -> FoundationItems.SILVER_DUST);

        this.ore(() -> FoundationBlocks.TIN_ORE, AllItems.CRUSHED_TIN::get, () -> Blocks.COBBLESTONE);
        this.ore(() -> FoundationBlocks.DEEPSLATE_TIN_ORE, AllItems.CRUSHED_TIN::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(() -> FoundationItems.RAW_TIN, AllItems.CRUSHED_TIN::get);
        this.dust(() -> FoundationItems.TIN_INGOT, () -> FoundationItems.TIN_DUST);
        this.dust(AllItems.CRUSHED_TIN::get, () -> FoundationItems.TIN_DUST);

        this.ore(() -> FoundationBlocks.URANIUM_ORE, AllItems.CRUSHED_URANIUM::get, () -> Blocks.COBBLESTONE);
        this.ore(() -> FoundationBlocks.DEEPSLATE_URANIUM_ORE, AllItems.CRUSHED_URANIUM::get, () -> Blocks.COBBLED_DEEPSLATE);
        this.raw(() -> FoundationItems.RAW_URANIUM, AllItems.CRUSHED_URANIUM::get);
        this.dust(() -> FoundationItems.URANIUM_INGOT, () -> FoundationItems.URANIUM_DUST);
        this.dust(AllItems.CRUSHED_URANIUM::get, () -> FoundationItems.URANIUM_DUST);
    }

    private void ore(Supplier<ItemLike> input, Supplier<ItemLike> output, Supplier<ItemLike> stone) {
        this.create(Registries.MOD_ID, input, builder -> {
            builder.duration(250);
            builder.output(output.get(), 2);
            builder.output(0.25f, output.get(), 1);
            builder.output(0.75f, AllItems.EXP_NUGGET.get(), 1);
            builder.output(0.125f, stone.get(), 1);
            return builder;
        });
    }

    private void raw(Supplier<ItemLike> input, Supplier<ItemLike> output) {
        this.create(Registries.MOD_ID, input, builder -> {
            builder.duration(400);
            builder.output(output.get(), 1);
            builder.output(0.75f, AllItems.EXP_NUGGET.get(), 1);
            return builder;
        });
    }

    private void dust(Supplier<ItemLike> input, Supplier<ItemLike> output) {
        this.create(Registries.MOD_ID, input, builder -> {
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
