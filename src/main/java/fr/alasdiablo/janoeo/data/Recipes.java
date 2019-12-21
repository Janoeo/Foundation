package fr.alasdiablo.janoeo.data;

import fr.alasdiablo.janoeo.ore.end.EndOresBlocks;
import fr.alasdiablo.janoeo.ingots.IngotsItems;
import fr.alasdiablo.janoeo.ore.nether.NetherOresBlocks;
import fr.alasdiablo.janoeo.ore.overworld.OverworldOresBlocks;
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
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.COAL_END_ORE), Items.COAL, 0.1f, 200)
                .addCriterion("has_end_coal_ore", this.hasItem(EndOresBlocks.COAL_END_ORE)).build(consumer, "coal_end_smelting");
        // diamond
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.DIAMOND_END_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_end_diamond_ore", this.hasItem(EndOresBlocks.DIAMOND_END_ORE)).build(consumer, "diamond_end_smelting");
        // emerald
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.EMERALD_END_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_end_emerald_ore", this.hasItem(EndOresBlocks.EMERALD_END_ORE)).build(consumer, "emerald_end_smelting");
        // gold
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.GOLD_END_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_end_gold_ore", this.hasItem(EndOresBlocks.GOLD_END_ORE)).build(consumer, "gold_end_smelting");
        // iron
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.IRON_END_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_end_iron_ore", this.hasItem(EndOresBlocks.IRON_END_ORE)).build(consumer, "iron_end_smelting");
        // lapis
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.LAPIS_END_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_end_lapis_ore", this.hasItem(EndOresBlocks.LAPIS_END_ORE)).build(consumer, "lapis_end_smelting");
        // redstone
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(EndOresBlocks.REDSTONE_END_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_end_redstone_ore", this.hasItem(EndOresBlocks.REDSTONE_END_ORE)).build(consumer, "redstone_end_smelting");
    }

    private void endOreBlasting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.COAL_END_ORE), Items.COAL, 0.1f, 100)
                .addCriterion("has_end_coal_ore", this.hasItem(EndOresBlocks.COAL_END_ORE)).build(consumer, "coal_end_blasting");
        // diamond
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.DIAMOND_END_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_end_diamond_ore", this.hasItem(EndOresBlocks.DIAMOND_END_ORE)).build(consumer, "diamond_end_blasting");
        // emerald
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.EMERALD_END_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_end_emerald_ore", this.hasItem(EndOresBlocks.EMERALD_END_ORE)).build(consumer, "emerald_end_blasting");
        // gold
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.GOLD_END_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_end_gold_ore", this.hasItem(EndOresBlocks.GOLD_END_ORE)).build(consumer, "gold_end_blasting");
        // iron
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.IRON_END_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_end_iron_ore", this.hasItem(EndOresBlocks.IRON_END_ORE)).build(consumer, "iron_end_blasting");
        // lapis
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.LAPIS_END_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_end_lapis_ore", this.hasItem(EndOresBlocks.LAPIS_END_ORE)).build(consumer, "lapis_end_blasting");
        // redstone
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(EndOresBlocks.REDSTONE_END_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_end_redstone_ore", this.hasItem(EndOresBlocks.REDSTONE_END_ORE)).build(consumer, "redstone_end_blasting");
    }

    private void extraOreSmelting(Consumer<IFinishedRecipe> consumer) {
        // copper
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(OverworldOresBlocks.COPPER_ORE), IngotsItems.COPPER_INGOT, 0.1f, 200)
                .addCriterion("has_copper_ore", this.hasItem(OverworldOresBlocks.COPPER_ORE)).build(consumer, "copper_smelting");
        // tin
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(OverworldOresBlocks.TIN_ORE), IngotsItems.TIN_INGOT, 0.1f, 200)
                .addCriterion("has_tin_ore", this.hasItem(OverworldOresBlocks.TIN_ORE)).build(consumer, "tin_smelting");
        // aluminium
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(OverworldOresBlocks.ALUMINIUM_ORE), IngotsItems.ALUMINIUM_INGOT, 0.1f, 200)
                .addCriterion("has_aluminium_ore", this.hasItem(OverworldOresBlocks.ALUMINIUM_ORE)).build(consumer, "aluminium_smelting");
        // lead
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(OverworldOresBlocks.LEAD_ORE), IngotsItems.LEAD_INGOT, 0.1f, 200)
                .addCriterion("has_lead_ore", this.hasItem(OverworldOresBlocks.LEAD_ORE)).build(consumer, "lead_smelting");
        // silver
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(OverworldOresBlocks.SILVER_ORE), IngotsItems.SILVER_INGOT, 0.1f, 200)
                .addCriterion("has_silver_ore", this.hasItem(OverworldOresBlocks.SILVER_ORE)).build(consumer, "silver_smelting");
        // uranium
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(OverworldOresBlocks.URANIUM_ORE), IngotsItems.URANIUM_INGOT, 0.1f, 200)
                .addCriterion("has_uranium_ore", this.hasItem(OverworldOresBlocks.URANIUM_ORE)).build(consumer, "uranium_smelting");
    }

    private void extraOreBlasting(Consumer<IFinishedRecipe> consumer) {
        // copper
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(OverworldOresBlocks.COPPER_ORE), IngotsItems.COPPER_INGOT, 0.1f, 100)
                .addCriterion("has_copper_ore", this.hasItem(OverworldOresBlocks.COPPER_ORE)).build(consumer, "copper_blasting");
        // tin
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(OverworldOresBlocks.TIN_ORE), IngotsItems.TIN_INGOT, 0.1f, 100)
                .addCriterion("has_tin_ore", this.hasItem(OverworldOresBlocks.TIN_ORE)).build(consumer, "tin_blasting");
        // aluminium
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(OverworldOresBlocks.ALUMINIUM_ORE), IngotsItems.ALUMINIUM_INGOT, 0.1f, 100)
                .addCriterion("has_aluminium_ore", this.hasItem(OverworldOresBlocks.ALUMINIUM_ORE)).build(consumer, "aluminium_blasting");
        // lead
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(OverworldOresBlocks.LEAD_ORE), IngotsItems.LEAD_INGOT, 0.1f, 100)
                .addCriterion("has_lead_ore", this.hasItem(OverworldOresBlocks.LEAD_ORE)).build(consumer, "lead_blasting");
        // silver
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(OverworldOresBlocks.SILVER_ORE), IngotsItems.SILVER_INGOT, 0.1f, 100)
                .addCriterion("has_silver_ore", this.hasItem(OverworldOresBlocks.SILVER_ORE)).build(consumer, "silver_blasting");
        // uranium
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(OverworldOresBlocks.URANIUM_ORE), IngotsItems.URANIUM_INGOT, 0.1f, 100)
                .addCriterion("has_uranium_ore", this.hasItem(OverworldOresBlocks.URANIUM_ORE)).build(consumer, "uranium_blasting");
    }

    private void netherOreSmelting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.COAL_NETHER_ORE), Items.COAL, 0.1f, 200)
                .addCriterion("has_nether_coal_ore", this.hasItem(NetherOresBlocks.COAL_NETHER_ORE)).build(consumer, "coal_nether_smelting");
        // diamond
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.DIAMOND_NETHER_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_nether_diamond_ore", this.hasItem(NetherOresBlocks.DIAMOND_NETHER_ORE)).build(consumer, "diamond_nether_smelting");
        // emerald
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.EMERALD_NETHER_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_nether_emerald_ore", this.hasItem(NetherOresBlocks.EMERALD_NETHER_ORE)).build(consumer, "emerald_nether_smelting");
        // gold
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.GOLD_NETHER_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_nether_gold_ore", this.hasItem(NetherOresBlocks.GOLD_NETHER_ORE)).build(consumer, "gold_nether_smelting");
        // iron
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.IRON_NETHER_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_nether_iron_ore", this.hasItem(NetherOresBlocks.IRON_NETHER_ORE)).build(consumer, "iron_nether_smelting");
        // lapis
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.LAPIS_NETHER_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_nether_lapis_ore", this.hasItem(NetherOresBlocks.LAPIS_NETHER_ORE)).build(consumer, "lapis_nether_smelting");
        // redstone
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(NetherOresBlocks.REDSTONE_NETHER_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_nether_redstone_ore", this.hasItem(NetherOresBlocks.REDSTONE_NETHER_ORE)).build(consumer, "redstone_nether_smelting");
    }

    private void netherOreBlasting(Consumer<IFinishedRecipe> consumer) {
        // coal
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.COAL_NETHER_ORE), Items.COAL, 0.1f, 100)
                .addCriterion("has_nether_coal_ore", this.hasItem(NetherOresBlocks.COAL_NETHER_ORE)).build(consumer, "coal_nether_blasting");
        // diamond
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.DIAMOND_NETHER_ORE), Items.DIAMOND, 0.1f, 200)
                .addCriterion("has_nether_diamond_ore", this.hasItem(NetherOresBlocks.DIAMOND_NETHER_ORE)).build(consumer, "diamond_nether_blasting");
        // emerald
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.EMERALD_NETHER_ORE), Items.EMERALD, 0.1f, 200)
                .addCriterion("has_nether_emerald_ore", this.hasItem(NetherOresBlocks.EMERALD_NETHER_ORE)).build(consumer, "emerald_nether_blasting");
        // gold
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.GOLD_NETHER_ORE), Items.GOLD_INGOT, 0.1f, 200)
                .addCriterion("has_nether_gold_ore", this.hasItem(NetherOresBlocks.GOLD_NETHER_ORE)).build(consumer, "gold_nether_blasting");
        // iron
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.IRON_NETHER_ORE), Items.IRON_INGOT, 0.1f, 200)
                .addCriterion("has_nether_iron_ore", this.hasItem(NetherOresBlocks.IRON_NETHER_ORE)).build(consumer, "iron_nether_blasting");
        // lapis
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.LAPIS_NETHER_ORE), Items.LAPIS_LAZULI, 0.1f, 200)
                .addCriterion("has_nether_lapis_ore", this.hasItem(NetherOresBlocks.LAPIS_NETHER_ORE)).build(consumer, "lapis_nether_blasting");
        // redstone
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(NetherOresBlocks.REDSTONE_NETHER_ORE), Items.REDSTONE, 0.1f, 200)
                .addCriterion("has_nether_redstone_ore", this.hasItem(NetherOresBlocks.REDSTONE_NETHER_ORE)).build(consumer, "redstone_nether_blasting");
    }

}
