package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Items.*;

import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@ParametersAreNonnullByDefault
public class FoundationRecipeProvider extends RecipeProvider {
    public FoundationRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    private static Consumer<IFinishedRecipe> finishedRecipeConsumer;

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        finishedRecipeConsumer = consumer;

        this.nugget(ALUMINIUM_NUGGET, INGOTS_ALUMINIUM, "has_aluminium_ingot", "aluminium_nugget");
        this.nugget(ALUMINIUM_NUGGET, INGOTS_ALUMINUM, "has_aluminium_ingot", "aluminum_nugget");
        this.nugget(COPPER_NUGGET, INGOTS_COPPER, "has_copper_ingot");
        this.nugget(LEAD_NUGGET, INGOTS_LEAD, "has_lead_ingot");
        this.nugget(NICKEL_NUGGET, INGOTS_NICKEL, "has_nickel_ingot");
        this.nugget(SILVER_NUGGET, INGOTS_SILVER, "has_silver_ingot");
        this.nugget(TIN_NUGGET, INGOTS_TIN, "has_tin_ingot");
        this.nugget(URANIUM_NUGGET, INGOTS_URANIUM, "has_uranium_ingot");

        this.ingotFromNugget(ALUMINIUM_INGOT, NUGGETS_ALUMINIUM, "has_aluminium_nugget", "aluminium_ingot_from_nugget");
        this.ingotFromNugget(ALUMINIUM_INGOT, NUGGETS_ALUMINUM, "has_aluminium_nugget", "aluminum_ingot_from_nugget");
        // this.ingotFromNuggetRecipe(Items.COPPER_INGOT, NUGGETS_COPPER, "has_copper_nugget", "copper_ingot_from_nugget");
        this.ingotFromNugget(LEAD_INGOT, NUGGETS_LEAD, "has_lead_nugget", "lead_ingot_from_nugget");
        this.ingotFromNugget(NICKEL_INGOT, NUGGETS_NICKEL, "has_nickel_nugget", "nickel_ingot_from_nugget");
        this.ingotFromNugget(SILVER_INGOT, NUGGETS_SILVER, "has_silver_nugget", "silver_ingot_from_nugget");
        this.ingotFromNugget(TIN_INGOT, NUGGETS_TIN, "has_tin_nugget", "tin_ingot_from_nugget");
        this.ingotFromNugget(URANIUM_INGOT, NUGGETS_URANIUM, "has_uranium_nugget", "uranium_ingot_from_nugget");

        this.ingotFromDust(ALUMINIUM_INGOT, DUSTS_ALUMINIUM, "has_aluminium_dust", "aluminium_ingot_from_dust");
        this.ingotFromDust(ALUMINIUM_INGOT, DUSTS_ALUMINUM, "has_aluminium_dust", "aluminum_ingot_from_dust");
        // this.ingotFromNuggetRecipe(Items.COPPER_INGOT, DUSTS_COPPER, "has_copper_nugget", "copper_ingot_from_dust");
        this.ingotFromDust(Items.GOLD_INGOT, DUSTS_GOLD, "has_gold_dust", "gold_ingot_from_dust");
        this.ingotFromDust(Items.IRON_INGOT, DUSTS_IRON, "has_iron_dust", "iron_ingot_from_dust");
        this.ingotFromDust(LEAD_INGOT, DUSTS_LEAD, "has_lead_dust", "lead_ingot_from_dust");
        this.ingotFromDust(NICKEL_INGOT, DUSTS_NICKEL, "has_nickel_dust", "nickel_ingot_from_dust");
        this.ingotFromDust(SILVER_INGOT, DUSTS_SILVER, "has_silver_dust", "silver_ingot_from_dust");
        this.ingotFromDust(TIN_INGOT, DUSTS_TIN, "has_tin_dust", "tin_ingot_from_dust");
        this.ingotFromDust(URANIUM_INGOT, DUSTS_URANIUM, "has_uranium_dust", "uranium_ingot_from_dust");
    }

    private void nugget(IItemProvider resultIn, ITag<Item> ingredientIn, String criterionNameIn) {
        ShapelessRecipeBuilder.shapelessRecipe(resultIn, 9).addIngredient(Ingredient.fromTag(ingredientIn)).addCriterion(criterionNameIn, hasItem(ingredientIn)).build(finishedRecipeConsumer);
    }

    private void nugget(IItemProvider resultIn, ITag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        ShapelessRecipeBuilder.shapelessRecipe(resultIn, 9).addIngredient(Ingredient.fromTag(ingredientIn)).addCriterion(criterionNameIn, hasItem(ingredientIn)).build(finishedRecipeConsumer, new ResourceLocation(Registries.MOD_ID, nameIn));
    }

    private void ingotFromNugget(IItemProvider resultIn, ITag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        ShapedRecipeBuilder.shapedRecipe(resultIn).key('A', ingredientIn).patternLine("AAA").patternLine("AAA").patternLine("AAA").addCriterion(criterionNameIn, hasItem(ingredientIn)).build(finishedRecipeConsumer, new ResourceLocation(Registries.MOD_ID, nameIn));
    }

    private void ingotFromDust(IItemProvider resultIn, ITag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ingredientIn), resultIn, 0f, 200).addCriterion(criterionNameIn, hasItem(ingredientIn)).build(finishedRecipeConsumer, new ResourceLocation(Registries.MOD_ID, "smelting_" + nameIn));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromTag(ingredientIn), resultIn, 0f, 100).addCriterion(criterionNameIn, hasItem(ingredientIn)).build(finishedRecipeConsumer, new ResourceLocation(Registries.MOD_ID, "blasting_" + nameIn));
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Foundation Recipes";
    }
}
