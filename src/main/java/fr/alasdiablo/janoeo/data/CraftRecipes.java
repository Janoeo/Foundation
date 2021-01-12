package fr.alasdiablo.janoeo.data;

import fr.alasdiablo.janoeo.init.*;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

/**
 * Janoeo recipes data generator
 */
public class CraftRecipes extends RecipeProvider {

    /**
     * constructor
     * @param generatorIn data generator instance
     */
    public CraftRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * load all recipes
     */
    @SuppressWarnings("NullableProblems")
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(GemsItems.RUBY, 9)
                .addIngredient(ModBlocks.RUBY_BLOCK)
                .addCriterion("has_ruby_block", hasItem(ModBlocks.RUBY_BLOCK))
                .build(consumer, new ResourceLocation(Registries.MODID, "ruby_from_block"));

        ShapelessRecipeBuilder.shapelessRecipe(GemsItems.SAPPHIRE, 9)
                .addIngredient(ModBlocks.SAPPHIRE_BLOCK)
                .addCriterion("has_sapphire_block", hasItem(ModBlocks.SAPPHIRE_BLOCK))
                .build(consumer, new ResourceLocation(Registries.MODID, "sapphire_from_block"));

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.RUBY_BLOCK)
                .key('R', GemsItems.RUBY)
                .patternLine("RRR")
                .patternLine("RRR")
                .patternLine("RRR")
                .addCriterion("has_ruby", hasItem(ModBlocks.RUBY_BLOCK))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.SAPPHIRE_BLOCK)
                .key('S', GemsItems.SAPPHIRE)
                .patternLine("SSS")
                .patternLine("SSS")
                .patternLine("SSS")
                .addCriterion("has_sapphire", hasItem(ModBlocks.SAPPHIRE_BLOCK))
                .build(consumer);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public String getName() {
        return "Janoeo - Recipes";
    }
}
