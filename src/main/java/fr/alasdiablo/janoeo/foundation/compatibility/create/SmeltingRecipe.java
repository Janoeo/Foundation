package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.AllItems;
import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class SmeltingRecipe extends RecipeProvider {
    public SmeltingRecipe(DataGenerator pGenerator) {
        super(pGenerator);

    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        this.ingot(FoundationItems.ALUMINIUM_INGOT.get(), AllItems.CRUSHED_BAUXITE.get(), consumer);
        this.ingot(FoundationItems.LEAD_INGOT.get(), AllItems.CRUSHED_LEAD.get(), consumer);
        this.ingot(FoundationItems.NICKEL_INGOT.get(), AllItems.CRUSHED_NICKEL.get(), consumer);
        this.ingot(FoundationItems.SILVER_INGOT.get(), AllItems.CRUSHED_SILVER.get(), consumer);
        this.ingot(FoundationItems.TIN_INGOT.get(), AllItems.CRUSHED_TIN.get(), consumer);
        this.ingot(FoundationItems.URANIUM_INGOT.get(), AllItems.CRUSHED_URANIUM.get(), consumer);
    }

    private void ingot(ItemLike resultIn, ItemLike ingredientIn, Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ingredientIn),
                resultIn,
                0f,
                200
        ).unlockedBy(
                Objects.requireNonNull(ingredientIn.asItem().getRegistryName()).getPath(),
                has(ingredientIn)
        ).save(consumer, ResourceLocations.of(
                        Registries.MOD_ID,
                        "smelting/" + Objects.requireNonNull(resultIn.asItem().getRegistryName()).getPath()
                )
        );

        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ingredientIn),
                resultIn,
                0f,
                100
        ).unlockedBy(
                Objects.requireNonNull(ingredientIn.asItem().getRegistryName()).getPath(),
                has(ingredientIn)
        ).save(consumer, ResourceLocations.of(
                        Registries.MOD_ID,
                        "blasting/" + Objects.requireNonNull(resultIn.asItem().getRegistryName()).getPath()
                )
        );
    }
}
