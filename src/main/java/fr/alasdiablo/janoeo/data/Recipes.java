package fr.alasdiablo.janoeo.data;

import fr.alasdiablo.janoeo.holder.BlocksHolder;
import fr.alasdiablo.janoeo.holder.ItemHolder;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        // coal
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.COAL_END_ORE), Items.COAL, 0.1f, 200)
                .addCriterion("has_end_coal_ore", this.hasItem(BlocksHolder.COAL_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.COAL_NETHER_ORE), Items.COAL, 0.1f, 200)
                .addCriterion("has_nether_coal_ore", this.hasItem(BlocksHolder.COAL_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.COAL_END_ORE), Items.COAL, 0.1f, 100)
                .addCriterion("has_end_coal_ore", this.hasItem(BlocksHolder.COAL_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.COAL_NETHER_ORE), Items.COAL, 0.1f, 100)
                .addCriterion("has_nether_coal_ore", this.hasItem(BlocksHolder.COAL_NETHER_ORE)).build(consumer);

        //copper
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.COPPER_ORE), ItemHolder.COPPER_INGOT, 0.1f, 200)
                .addCriterion("has_copper_ore", this.hasItem(BlocksHolder.COPPER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.COPPER_ORE), ItemHolder.COPPER_INGOT, 0.1f, 100)
                .addCriterion("has_copper_ore", this.hasItem(BlocksHolder.COPPER_ORE)).build(consumer);

        //diamond
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_END_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_end_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_NETHER_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_nether_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_END_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_end_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_NETHER_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_nether_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_NETHER_ORE)).build(consumer);

        //emerald
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_END_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_end_emerald_ore", this.hasItem(BlocksHolder.EMERALD_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_NETHER_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_nether_emerald_ore", this.hasItem(BlocksHolder.EMERALD_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_END_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_end_emerald_ore", this.hasItem(BlocksHolder.EMERALD_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_NETHER_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_nether_emerald_ore", this.hasItem(BlocksHolder.EMERALD_NETHER_ORE)).build(consumer);

        //gold
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_END_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_end_gold_ore", this.hasItem(BlocksHolder.GOLD_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_NETHER_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_nether_gold_ore", this.hasItem(BlocksHolder.GOLD_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_END_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_end_gold_ore", this.hasItem(BlocksHolder.GOLD_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_NETHER_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_nether_gold_ore", this.hasItem(BlocksHolder.GOLD_NETHER_ORE)).build(consumer);

        //iron
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.IRON_END_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_end_iron_ore", this.hasItem(BlocksHolder.IRON_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.IRON_NETHER_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_nether_iron_ore", this.hasItem(BlocksHolder.IRON_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.IRON_END_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_end_iron_ore", this.hasItem(BlocksHolder.IRON_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.IRON_NETHER_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_nether_iron_ore", this.hasItem(BlocksHolder.IRON_NETHER_ORE)).build(consumer);

        //lapis
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_END_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_end_lapis_ore", this.hasItem(BlocksHolder.LAPIS_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_NETHER_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_nether_lapis_ore", this.hasItem(BlocksHolder.LAPIS_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_END_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_end_lapis_ore", this.hasItem(BlocksHolder.LAPIS_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_NETHER_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_nether_lapis_ore", this.hasItem(BlocksHolder.LAPIS_NETHER_ORE)).build(consumer);

        //redstone
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_END_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_end_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_END_ORE)).build(consumer);
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_NETHER_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_nether_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_NETHER_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_END_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_end_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_END_ORE)).build(consumer);
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_NETHER_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_nether_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_NETHER_ORE)).build(consumer);

        //copper
        // smelting
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.TIN_ORE), ItemHolder.TIN_INGOT, 0.1f, 200)
                .addCriterion("has_tin_ore", this.hasItem(BlocksHolder.TIN_ORE)).build(consumer);
        // blasting
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.TIN_ORE), ItemHolder.TIN_INGOT, 0.1f, 100)
                .addCriterion("has_tin_ore", this.hasItem(BlocksHolder.TIN_ORE)).build(consumer);
    }
}
