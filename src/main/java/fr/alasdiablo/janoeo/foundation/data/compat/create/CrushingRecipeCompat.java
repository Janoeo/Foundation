package fr.alasdiablo.janoeo.foundation.data.compat.create;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import fr.alasdiablo.janoeo.foundation.init.AllItems;
import fr.alasdiablo.janoeo.foundation.init.BasaltOresBlocks;
import fr.alasdiablo.janoeo.foundation.init.EndOresBlocks;
import fr.alasdiablo.janoeo.foundation.init.NetherOresBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.crafting.conditions.NotCondition;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;

import java.util.function.Supplier;

public class CrushingRecipeCompat extends ProcessingRecipeGen {

    private class Provider {

        private void coalOre(Supplier<IItemProvider> ingredient, final Block extra) {
            CrushingRecipeCompat.this.create(ingredient, builder -> builder.duration(300).output(Items.COAL, 2).output(0.5F, Items.COAL, 2).output(0.125F, extra));
        }

        private void redstoneOre(Supplier<IItemProvider> ingredient, final Block extra) {
            CrushingRecipeCompat.this.create(ingredient, (builder) -> builder.duration(300).output(Items.REDSTONE, 8).output(0.25F, Items.REDSTONE, 6).output(0.125F, extra));
        }

        private void dustFromIngotWithTag(String name, Item dust, int duration) {
            CrushingRecipeCompat.this.create(name + "_dust", (builder) -> builder.duration(duration).withCondition(new NotCondition(new TagEmptyCondition("forge", "ingots/" + name))).require(AllTags.forgeItemTag("ingots/" + name)).output(dust));
        }

        private void dustFromGemsWithTag(String name, Item dust, int duration) {
            CrushingRecipeCompat.this.create(name + "_dust", (builder) -> builder.duration(duration).withCondition(new NotCondition(new TagEmptyCondition("forge", "gems/" + name))).require(AllTags.forgeItemTag("gems/" + name)).output(dust));
        }
    }

    private final Provider provider;

    public CrushingRecipeCompat(DataGenerator generator) {
        super(generator);
        this.provider = new Provider();
        this.ore();
        this.dust();
    }

    private void ore() {
        this.provider.coalOre(() -> NetherOresBlocks.COAL_NETHER_ORE, Blocks.NETHERRACK);
        this.provider.coalOre(() -> EndOresBlocks.COAL_END_ORE, Blocks.END_STONE);
        this.provider.coalOre(() -> BasaltOresBlocks.COAL_BASALT_ORE, Blocks.BASALT);

        this.provider.redstoneOre(() -> NetherOresBlocks.REDSTONE_NETHER_ORE, Blocks.NETHERRACK);
        this.provider.redstoneOre(() -> EndOresBlocks.REDSTONE_END_ORE, Blocks.END_STONE);
        this.provider.redstoneOre(() -> BasaltOresBlocks.REDSTONE_BASALT_ORE, Blocks.BASALT);
    }

    private void dust() {
        this.create(() -> Items.DIAMOND, builder -> builder.duration(500).output(AllItems.Dusts.DIAMOND));
        this.create(() -> Items.EMERALD, builder -> builder.duration(500).output(AllItems.Dusts.EMERALD));
        this.create(() -> Items.IRON_INGOT, builder -> builder.duration(400).output(AllItems.Dusts.IRON));
        this.create(() -> Items.GOLD_INGOT, builder -> builder.duration(300).output(AllItems.Dusts.GOLD));
        this.create(() -> Items.LAPIS_LAZULI, builder -> builder.duration(300).output(AllItems.Dusts.LAPIS));
        this.create(() -> Items.COAL, builder -> builder.duration(300).output(AllItems.Dusts.COAL));
        this.provider.dustFromIngotWithTag("aluminium", AllItems.Dusts.ALUMINIUM, 300);
        this.provider.dustFromIngotWithTag("copper", AllItems.Dusts.COPPER, 350);
        this.provider.dustFromIngotWithTag("lead", AllItems.Dusts.LEAD, 250);
        this.provider.dustFromIngotWithTag("nickel", AllItems.Dusts.NICKEL, 350);
        this.provider.dustFromIngotWithTag("platinum", AllItems.Dusts.PLATINUM, 350);
        this.provider.dustFromIngotWithTag("silver", AllItems.Dusts.SILVER, 400);
        this.provider.dustFromIngotWithTag("tin", AllItems.Dusts.TIN, 300);
        this.provider.dustFromIngotWithTag("uranium", AllItems.Dusts.URANIUM, 400);
        this.provider.dustFromGemsWithTag("ruby", AllItems.Dusts.RUBY, 500);
        this.provider.dustFromGemsWithTag("sapphire", AllItems.Dusts.SAPPHIRE, 500);
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.CRUSHING;
    }
}
