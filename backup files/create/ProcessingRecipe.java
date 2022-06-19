package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.DataGenerator;

public abstract class ProcessingRecipe extends ProcessingRecipeGen {
    public ProcessingRecipe(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Create Recipes Patch: " + this.getRecipeType().getId().getPath();
    }
}
