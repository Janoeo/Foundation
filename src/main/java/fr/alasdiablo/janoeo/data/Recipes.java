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

/**
 * Janoeo recipes data generator
 */
public class Recipes extends RecipeProvider {

    /**
     * constructor
     * @param generatorIn data generator instance
     */
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * load all recipes
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        this.endOreSmelting(consumer);
        this.endOreBlasting(consumer);
        this.extraOreSmelting(consumer);
        this.extraOreBlasting(consumer);
        this.netherOreSmelting(consumer);
        this.netherOreBlasting(consumer);
    }

    private void endOreSmelting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.COAL_END_ORE), Items.COAL, 0.1f, 200)
                .addCriterion("has_end_coal_ore", this.hasItem(BlocksHolder.COAL_END_ORE)).build(consumer, "coal_end_smelting");
        // diamond
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_END_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_end_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_END_ORE)).build(consumer, "diamond_end_smelting");
        // emerald
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_END_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_end_emerald_ore", this.hasItem(BlocksHolder.EMERALD_END_ORE)).build(consumer, "emerald_end_smelting");
        // gold
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_END_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_end_gold_ore", this.hasItem(BlocksHolder.GOLD_END_ORE)).build(consumer, "gold_end_smelting");
        // iron
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.IRON_END_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_end_iron_ore", this.hasItem(BlocksHolder.IRON_END_ORE)).build(consumer, "iron_end_smelting");
        // lapis
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_END_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_end_lapis_ore", this.hasItem(BlocksHolder.LAPIS_END_ORE)).build(consumer, "lapis_end_smelting");
        // redstone
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_END_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_end_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_END_ORE)).build(consumer, "redstone_end_smelting");
    }

    private void endOreBlasting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.COAL_END_ORE), Items.COAL, 0.1f, 100)
                .addCriterion("has_end_coal_ore", this.hasItem(BlocksHolder.COAL_END_ORE)).build(consumer, "coal_end_blasting");
        // diamond
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_END_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_end_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_END_ORE)).build(consumer, "diamond_end_blasting");
        // emerald
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_END_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_end_emerald_ore", this.hasItem(BlocksHolder.EMERALD_END_ORE)).build(consumer, "emerald_end_blasting");
        // gold
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_END_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_end_gold_ore", this.hasItem(BlocksHolder.GOLD_END_ORE)).build(consumer, "gold_end_blasting");
        // iron
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.IRON_END_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_end_iron_ore", this.hasItem(BlocksHolder.IRON_END_ORE)).build(consumer, "iron_end_blasting");
        // lapis
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_END_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_end_lapis_ore", this.hasItem(BlocksHolder.LAPIS_END_ORE)).build(consumer, "lapis_end_blasting");
        // redstone
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_END_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_end_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_END_ORE)).build(consumer, "redstone_end_blasting");
    }

    private void extraOreSmelting(Consumer<IFinishedRecipe> consumer) {
        // copper
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.COPPER_ORE), ItemHolder.COPPER_INGOT, 0.1f, 200)
                .addCriterion("has_copper_ore", this.hasItem(BlocksHolder.COPPER_ORE)).build(consumer, "copper_smelting");
        // tin
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.TIN_ORE), ItemHolder.TIN_INGOT, 0.1f, 200)
                .addCriterion("has_tin_ore", this.hasItem(BlocksHolder.TIN_ORE)).build(consumer, "tin_smelting");
        // aluminium
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.ALUMINIUM_ORE), ItemHolder.ALUMINIUM_INGOT, 0.1f, 200)
                .addCriterion("has_aluminium_ore", this.hasItem(BlocksHolder.ALUMINIUM_ORE)).build(consumer, "aluminium_smelting");
        // lead
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.LEAD_ORE), ItemHolder.LEAD_INGOT, 0.1f, 200)
                .addCriterion("has_lead_ore", this.hasItem(BlocksHolder.LEAD_ORE)).build(consumer, "lead_smelting");
        // silver
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.SILVER_ORE), ItemHolder.SILVER_INGOT, 0.1f, 200)
                .addCriterion("has_silver_ore", this.hasItem(BlocksHolder.SILVER_ORE)).build(consumer, "silver_smelting");
        // uranium
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.URANIUM_ORE), ItemHolder.URANIUM_INGOT, 0.1f, 200)
                .addCriterion("has_uranium_ore", this.hasItem(BlocksHolder.URANIUM_ORE)).build(consumer, "uranium_smelting");
    }

    private void extraOreBlasting(Consumer<IFinishedRecipe> consumer) {
        // copper
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.COPPER_ORE), ItemHolder.COPPER_INGOT, 0.1f, 100)
                .addCriterion("has_copper_ore", this.hasItem(BlocksHolder.COPPER_ORE)).build(consumer, "copper_blasting");
        // tin
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.TIN_ORE), ItemHolder.TIN_INGOT, 0.1f, 100)
                .addCriterion("has_tin_ore", this.hasItem(BlocksHolder.TIN_ORE)).build(consumer, "tin_blasting");
        // aluminium
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.ALUMINIUM_ORE), ItemHolder.ALUMINIUM_INGOT, 0.1f, 100)
                .addCriterion("has_aluminium_ore", this.hasItem(BlocksHolder.ALUMINIUM_ORE)).build(consumer, "aluminium_blasting");
        // lead
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.LEAD_ORE), ItemHolder.LEAD_INGOT, 0.1f, 100)
                .addCriterion("has_lead_ore", this.hasItem(BlocksHolder.LEAD_ORE)).build(consumer, "lead_blasting");
        // silver
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.SILVER_ORE), ItemHolder.SILVER_INGOT, 0.1f, 100)
                .addCriterion("has_silver_ore", this.hasItem(BlocksHolder.SILVER_ORE)).build(consumer, "silver_blasting");
        // uranium
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.URANIUM_ORE), ItemHolder.URANIUM_INGOT, 0.1f, 100)
                .addCriterion("has_uranium_ore", this.hasItem(BlocksHolder.URANIUM_ORE)).build(consumer, "uranium_blasting");
    }

    private void netherOreSmelting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.COAL_NETHER_ORE), Items.COAL, 0.1f, 200)
                .addCriterion("has_nether_coal_ore", this.hasItem(BlocksHolder.COAL_NETHER_ORE)).build(consumer, "coal_nether_smelting");
        // diamond
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_NETHER_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_nether_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_NETHER_ORE)).build(consumer, "diamond_nether_smelting");
        // emerald
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_NETHER_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_nether_emerald_ore", this.hasItem(BlocksHolder.EMERALD_NETHER_ORE)).build(consumer, "emerald_nether_smelting");
        // gold
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_NETHER_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_nether_gold_ore", this.hasItem(BlocksHolder.GOLD_NETHER_ORE)).build(consumer, "gold_nether_smelting");
        // iron
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.IRON_NETHER_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_nether_iron_ore", this.hasItem(BlocksHolder.IRON_NETHER_ORE)).build(consumer, "iron_nether_smelting");
        // lapis
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_NETHER_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_nether_lapis_ore", this.hasItem(BlocksHolder.LAPIS_NETHER_ORE)).build(consumer, "lapis_nether_smelting");
        // redstone
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_NETHER_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_nether_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_NETHER_ORE)).build(consumer, "redstone_nether_smelting");
    }

    private void netherOreBlasting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.COAL_NETHER_ORE), Items.COAL, 0.1f, 100)
                .addCriterion("has_nether_coal_ore", this.hasItem(BlocksHolder.COAL_NETHER_ORE)).build(consumer, "coal_nether_blasting");
        // diamond
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.DIAMOND_NETHER_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_nether_diamond_ore", this.hasItem(BlocksHolder.DIAMOND_NETHER_ORE)).build(consumer, "diamond_nether_blasting");
        // emerald
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.EMERALD_NETHER_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_nether_emerald_ore", this.hasItem(BlocksHolder.EMERALD_NETHER_ORE)).build(consumer, "emerald_nether_blasting");
        // gold
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.GOLD_NETHER_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_nether_gold_ore", this.hasItem(BlocksHolder.GOLD_NETHER_ORE)).build(consumer, "gold_nether_blasting");
        // iron
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.IRON_NETHER_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_nether_iron_ore", this.hasItem(BlocksHolder.IRON_NETHER_ORE)).build(consumer, "iron_nether_blasting");
        // lapis
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.LAPIS_NETHER_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_nether_lapis_ore", this.hasItem(BlocksHolder.LAPIS_NETHER_ORE)).build(consumer, "lapis_nether_blasting");
        // redstone
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BlocksHolder.REDSTONE_NETHER_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_nether_redstone_ore", this.hasItem(BlocksHolder.REDSTONE_NETHER_ORE)).build(consumer, "redstone_nether_blasting");
    }

}
