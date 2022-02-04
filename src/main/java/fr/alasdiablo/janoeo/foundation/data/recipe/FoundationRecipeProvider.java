package fr.alasdiablo.janoeo.foundation.data.recipe;

import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Items.*;

@ParametersAreNonnullByDefault
public class FoundationRecipeProvider extends RecipeProvider {
    private static Consumer<FinishedRecipe> finishedRecipeConsumer;

    public FoundationRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        finishedRecipeConsumer = consumer;

        this.nugget(ALUMINIUM_NUGGET, INGOTS_ALUMINIUM, "has_aluminium_ingot", "aluminium_nugget");
        this.nugget(ALUMINIUM_NUGGET, INGOTS_ALUMINUM, "has_aluminium_ingot", "aluminum_nugget");
        this.nugget(COAL_NUGGET, Items.COAL, "has_coal");
        this.nugget(COPPER_NUGGET, Items.COPPER_INGOT, "has_copper_ingot");
        this.nugget(COPPER_NUGGET, INGOTS_COPPER, "has_copper_ingot", "copper_ingot_tag");
        this.nugget(DIAMOND_NUGGET, Tags.Items.GEMS_DIAMOND, "has_diamond");
        this.nugget(EMERALD_NUGGET, Tags.Items.GEMS_EMERALD, "has_emerald");
        this.nugget(LAPIS_NUGGET, Tags.Items.GEMS_LAPIS, "has_lapis");
        this.nugget(LEAD_NUGGET, INGOTS_LEAD, "has_lead_ingot");
        this.nugget(NICKEL_NUGGET, INGOTS_NICKEL, "has_nickel_ingot");
        this.nugget(REDSTONE_NUGGET, Tags.Items.DUSTS_REDSTONE, "has_redstone_dust");
        this.nugget(SILVER_NUGGET, INGOTS_SILVER, "has_silver_ingot");
        this.nugget(TIN_NUGGET, INGOTS_TIN, "has_tin_ingot");
        this.nugget(URANIUM_NUGGET, INGOTS_URANIUM, "has_uranium_ingot");

        this.ingotFromNugget(ALUMINIUM_INGOT, NUGGETS_ALUMINIUM, "has_aluminium_nugget", "aluminium_ingot_from_nugget");
        this.ingotFromNugget(ALUMINIUM_INGOT, NUGGETS_ALUMINUM, "has_aluminium_nugget", "aluminum_ingot_from_nugget");
        this.ingotFromNugget(Items.COAL, NUGGETS_COAL, "has_coal_nugget", "coal_ingot_from_nugget");
        this.ingotFromNugget(Items.COPPER_INGOT, NUGGETS_COPPER, "has_copper_nugget", "copper_ingot_from_nugget");
        this.ingotFromNugget(Items.DIAMOND, NUGGETS_DIAMOND, "has_diamond_nugget", "diamond_from_nugget");
        this.ingotFromNugget(Items.EMERALD, NUGGETS_EMERALD, "has_emerald_nugget", "emerald_from_nugget");
        this.ingotFromNugget(Items.LAPIS_LAZULI, NUGGETS_LAPIS, "has_lapis_nugget", "lapis_from_nugget");
        this.ingotFromNugget(LEAD_INGOT, NUGGETS_LEAD, "has_lead_nugget", "lead_ingot_from_nugget");
        this.ingotFromNugget(NICKEL_INGOT, NUGGETS_NICKEL, "has_nickel_nugget", "nickel_ingot_from_nugget");
        this.ingotFromNugget(Items.REDSTONE, NUGGETS_REDSTONE, "has_redstone_nugget", "redstone_dust_from_nugget");
        this.ingotFromNugget(SILVER_INGOT, NUGGETS_SILVER, "has_silver_nugget", "silver_ingot_from_nugget");
        this.ingotFromNugget(TIN_INGOT, NUGGETS_TIN, "has_tin_nugget", "tin_ingot_from_nugget");
        this.ingotFromNugget(URANIUM_INGOT, NUGGETS_URANIUM, "has_uranium_nugget", "uranium_ingot_from_nugget");

        this.ingotFromDust(ALUMINIUM_INGOT, DUSTS_ALUMINIUM, "has_aluminium_dust", "aluminium_ingot_from_dust");
        this.ingotFromDust(ALUMINIUM_INGOT, DUSTS_ALUMINUM, "has_aluminium_dust", "aluminum_ingot_from_dust");
        this.ingotFromDust(Items.COPPER_INGOT, DUSTS_COPPER, "has_copper_nugget", "copper_ingot_from_dust");
        this.ingotFromDust(Items.GOLD_INGOT, DUSTS_GOLD, "has_gold_dust", "gold_ingot_from_dust");
        this.ingotFromDust(Items.IRON_INGOT, DUSTS_IRON, "has_iron_dust", "iron_ingot_from_dust");
        this.ingotFromDust(LEAD_INGOT, DUSTS_LEAD, "has_lead_dust", "lead_ingot_from_dust");
        this.ingotFromDust(NICKEL_INGOT, DUSTS_NICKEL, "has_nickel_dust", "nickel_ingot_from_dust");
        this.ingotFromDust(SILVER_INGOT, DUSTS_SILVER, "has_silver_dust", "silver_ingot_from_dust");
        this.ingotFromDust(TIN_INGOT, DUSTS_TIN, "has_tin_dust", "tin_ingot_from_dust");
        this.ingotFromDust(URANIUM_INGOT, DUSTS_URANIUM, "has_uranium_dust", "uranium_ingot_from_dust");

        this.ingotFromRaw(ALUMINIUM_INGOT, RAW_MATERIALS_ALUMINIUM, "has_raw_aluminium", "aluminium_ingot_from_raw");
        this.ingotFromRaw(ALUMINIUM_INGOT, RAW_MATERIALS_ALUMINUM, "has_raw_aluminium", "aluminum_ingot_from_raw");
        this.ingotFromRaw(LEAD_INGOT, RAW_MATERIALS_LEAD, "has_raw_lead", "lead_ingot_from_raw");
        this.ingotFromRaw(NICKEL_INGOT, RAW_MATERIALS_NICKEL, "has_raw_nickel", "nickel_ingot_from_raw");
        this.ingotFromRaw(SILVER_INGOT, RAW_MATERIALS_SILVER, "has_raw_silver", "silver_ingot_from_raw");
        this.ingotFromRaw(TIN_INGOT, RAW_MATERIALS_TIN, "has_raw_tin", "tin_ingot_from_raw");
        this.ingotFromRaw(URANIUM_INGOT, RAW_MATERIALS_URANIUM, "has_raw_uranium", "uranium_ingot_from_raw");

        this.ingotFromOre(ALUMINIUM_INGOT, ORES_ALUMINIUM, "has_aluminium_ore", "aluminium_ingot_from_ore");
        this.ingotFromOre(ALUMINIUM_INGOT, ORES_ALUMINUM, "has_aluminium_ore", "aluminum_ingot_from_ore");
        this.ingotFromOre(LEAD_INGOT, ORES_LEAD, "has_lead_ore", "lead_ingot_from_ore");
        this.ingotFromOre(NICKEL_INGOT, ORES_NICKEL, "has_nickel_ore", "nickel_ingot_from_ore");
        this.ingotFromOre(SILVER_INGOT, ORES_SILVER, "has_silver_ore", "silver_ingot_from_ore");
        this.ingotFromOre(TIN_INGOT, ORES_TIN, "has_tin_ore", "tin_ingot_from_ore");
        this.ingotFromOre(URANIUM_INGOT, ORES_URANIUM, "has_uranium_ore", "uranium_ingot_from_ore");

        this.ingotFromOre(Items.COAL, Tags.Items.ORES_COAL, "has_coal_ore", "coal_from_ore");
        this.ingotFromOre(Items.COPPER_INGOT, Tags.Items.ORES_COPPER, "has_copper_ore", "copper_ingot_from_ore");
        this.ingotFromOre(Items.DIAMOND, Tags.Items.ORES_DIAMOND, "has_diamond_ore", "diamond_from_ore");
        this.ingotFromOre(Items.EMERALD, Tags.Items.ORES_EMERALD, "has_emerald_ore", "emerald_from_ore");
        this.ingotFromOre(Items.IRON_INGOT, Tags.Items.ORES_IRON, "has_iron_ore", "iron_ingot_from_ore");
        this.ingotFromOre(Items.LAPIS_LAZULI, Tags.Items.ORES_LAPIS, "has_lapis_ore", "lapis_from_ore");
        this.ingotFromOre(Items.REDSTONE, Tags.Items.ORES_REDSTONE, "has_redstone_ore", "redstone_from_ore");

        this.blockFromIngot(ALUMINIUM_BLOCK, INGOTS_ALUMINIUM, "has_aluminium_ingot", "aluminium_block");
        this.blockFromIngot(ALUMINIUM_BLOCK, INGOTS_ALUMINUM, "has_aluminum_ingot", "aluminum_block");
        this.blockFromIngot(LEAD_BLOCK, INGOTS_LEAD, "has_lead_ingot", "lead_block");
        this.blockFromIngot(NICKEL_BLOCK, INGOTS_NICKEL, "has_nickel_ingot", "nickel_block");
        this.blockFromIngot(SILVER_BLOCK, INGOTS_SILVER, "has_silver_ingot", "silver_block");
        this.blockFromIngot(TIN_BLOCK, INGOTS_TIN, "has_tin_ingot", "tin_block");
        this.blockFromIngot(URANIUM_BLOCK, INGOTS_URANIUM, "has_uranium_ingot", "uranium_block");

        this.ingotFromBlock(ALUMINIUM_INGOT, STORAGE_BLOCKS_ALUMINIUM, "has_aluminium_block", "aluminium_ingot_from_block");
        this.ingotFromBlock(ALUMINIUM_INGOT, STORAGE_BLOCKS_ALUMINUM, "has_aluminum_block", "aluminum_ingot_from_block");
        this.ingotFromBlock(LEAD_INGOT, STORAGE_BLOCKS_LEAD, "has_lead_block", "lead_ingot_from_block");
        this.ingotFromBlock(NICKEL_INGOT, STORAGE_BLOCKS_NICKEL, "has_nickel_block", "nickel_ingot_from_block");
        this.ingotFromBlock(SILVER_INGOT, STORAGE_BLOCKS_SILVER, "has_silver_block", "silver_ingot_from_block");
        this.ingotFromBlock(TIN_INGOT, STORAGE_BLOCKS_TIN, "has_tin_block", "tin_ingot_from_block");
        this.ingotFromBlock(URANIUM_INGOT, STORAGE_BLOCKS_URANIUM, "has_uranium_block", "uranium_ingot_from_block");

        this.blockFromIngot(RAW_ALUMINIUM_BLOCK, RAW_MATERIALS_ALUMINIUM, "has_raw_aluminium", "raw_aluminium_block");
        this.blockFromIngot(RAW_ALUMINIUM_BLOCK, RAW_MATERIALS_ALUMINUM, "has_raw_aluminum", "raw_aluminum_block");
        this.blockFromIngot(RAW_LEAD_BLOCK, RAW_MATERIALS_LEAD, "has_raw_lead", "raw_lead_block");
        this.blockFromIngot(RAW_NICKEL_BLOCK, RAW_MATERIALS_NICKEL, "has_raw_nickel", "raw_nickel_block");
        this.blockFromIngot(RAW_SILVER_BLOCK, RAW_MATERIALS_SILVER, "has_raw_silver", "raw_silver_block");
        this.blockFromIngot(RAW_TIN_BLOCK, RAW_MATERIALS_TIN, "has_raw_tin", "raw_tin_block");
        this.blockFromIngot(RAW_URANIUM_BLOCK, RAW_MATERIALS_URANIUM, "has_raw_uranium", "raw_uranium_block");

        this.ingotFromBlock(RAW_ALUMINIUM, STORAGE_BLOCKS_RAW_ALUMINIUM, "has_raw_aluminium_block", "raw_aluminium_from_block");
        this.ingotFromBlock(RAW_ALUMINIUM, STORAGE_BLOCKS_RAW_ALUMINUM, "has_raw_aluminum_block", "raw_aluminum_from_block");
        this.ingotFromBlock(RAW_LEAD, STORAGE_BLOCKS_RAW_LEAD, "has_raw_lead_block", "raw_lead_from_block");
        this.ingotFromBlock(RAW_NICKEL, STORAGE_BLOCKS_RAW_NICKEL, "has_raw_nickel_block", "raw_nickel_from_block");
        this.ingotFromBlock(RAW_SILVER, STORAGE_BLOCKS_RAW_SILVER, "has_raw_silver_block", "raw_silver_from_block");
        this.ingotFromBlock(RAW_TIN, STORAGE_BLOCKS_RAW_TIN, "has_raw_tin_block", "raw_tin_from_block");
        this.ingotFromBlock(RAW_URANIUM, STORAGE_BLOCKS_RAW_URANIUM, "has_raw_uranium_block", "raw_uranium_from_block");

        this.rod(COPPER_STICK, Tags.Items.INGOTS_COPPER, "has_copper_ingot");
        this.rod(DIAMOND_STICK, Tags.Items.GEMS_DIAMOND, "has_diamond_ingot");
        this.rod(GOLD_STICK, Tags.Items.INGOTS_GOLD, "has_gold_ingot");
        this.rod(IRON_STICK, Tags.Items.INGOTS_IRON, "has_iron_ingot");
        this.rod(SILVER_STICK, INGOTS_SILVER, "has_silver_ingot");
        this.rod(TIN_STICK, INGOTS_TIN, "has_tin_ingot");

        this.gear(WOODEN_GEAR, Tags.Items.RODS_WOODEN, ItemTags.PLANKS, "has_wooden_rod", "has_wooden_planks");
        this.gear(TIN_GEAR, RODS_TIN, GEARS_WOODEN, "has_tin_rod", "has_wooden_gear");
        this.gear(COPPER_GEAR, RODS_COPPER, GEARS_TIN, "has_copper_rod", "has_tin_gear");
        this.gear(IRON_GEAR, RODS_IRON, GEARS_COPPER, "has_iron_rod", "has_copper_gear");
        this.gear(SILVER_GEAR, RODS_SILVER, GEARS_IRON, "has_silver_rod", "has_iron_gear");
        this.gear(GOLD_GEAR, RODS_GOLD, GEARS_SILVER, "has_gold_rod", "has_silver_gear");
        this.gear(DIAMOND_GEAR, RODS_DIAMOND, GEARS_GOLD, "has_diamond_rod", "has_gold_gear");
    }

    private void rod(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn) {
        ShapedRecipeBuilder.shaped(resultIn, 2)
                .define('I', ingredientIn)
                .pattern("I")
                .pattern("I")
                .unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer);
    }

    private void gear(ItemLike resultIn, Tag<Item> rod, Tag<Item> middle, String criterionNameIn, String middleCriterionNameIn) {
        ShapedRecipeBuilder.shaped(resultIn)
                .define('R', rod)
                .define('M', middle)
                .pattern(" R ")
                .pattern("RMR")
                .pattern(" R ")
                .unlockedBy(criterionNameIn, has(rod))
                .unlockedBy(middleCriterionNameIn, has(middle))
                .save(finishedRecipeConsumer);
    }

    private void nugget(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn) {
        ShapelessRecipeBuilder.shapeless(resultIn, 9).requires(Ingredient.of(ingredientIn)).unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer);
    }

    private void nugget(ItemLike resultIn, Item ingredientIn, String criterionNameIn) {
        ShapelessRecipeBuilder.shapeless(resultIn, 9).requires(Ingredient.of(ingredientIn)).unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer);
    }

    private void nugget(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        ShapelessRecipeBuilder.shapeless(resultIn, 9).requires(Ingredient.of(ingredientIn)).unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer, RegistryHelper.rl(Registries.MOD_ID, nameIn));
    }

    private void ingotFromNugget(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        ShapedRecipeBuilder.shaped(resultIn).define('A', ingredientIn).pattern("AAA").pattern("AAA").pattern("AAA")
                .unlockedBy(criterionNameIn, has(ingredientIn)).save(finishedRecipeConsumer, RegistryHelper.rl(Registries.MOD_ID, nameIn));
    }

    private void blockFromIngot(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        this.ingotFromNugget(resultIn, ingredientIn, criterionNameIn, nameIn);
    }

    private void ingotFromBlock(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        ShapelessRecipeBuilder.shapeless(resultIn, 9).requires(ingredientIn).unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer, RegistryHelper.rl(Registries.MOD_ID, nameIn));
    }

    private void ingotFromDust(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredientIn), resultIn, 0f, 200).unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer, new ResourceLocation(Registries.MOD_ID, "smelting_" + nameIn));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredientIn), resultIn, 0f, 100).unlockedBy(criterionNameIn, has(ingredientIn))
                .save(finishedRecipeConsumer, new ResourceLocation(Registries.MOD_ID, "blasting_" + nameIn));
    }

    private void ingotFromRaw(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        this.ingotFromDust(resultIn, ingredientIn, criterionNameIn, nameIn);
    }

    private void ingotFromOre(ItemLike resultIn, Tag<Item> ingredientIn, String criterionNameIn, String nameIn) {
        this.ingotFromDust(resultIn, ingredientIn, criterionNameIn, nameIn);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Foundation Recipes";
    }
}
