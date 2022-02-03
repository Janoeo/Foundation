package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public class WashingRecipe extends ProcessingRecipe {
    public WashingRecipe(DataGenerator generator) {
        super(generator);
        this.crushedOre(AllItems.CRUSHED_BAUXITE::get, FoundationItems.ALUMINIUM_NUGGET);
        this.crushedOre(AllItems.CRUSHED_LEAD::get, FoundationItems.LEAD_NUGGET);
        this.crushedOre(AllItems.CRUSHED_NICKEL::get, FoundationItems.NICKEL_NUGGET);
        this.crushedOre(AllItems.CRUSHED_SILVER::get, FoundationItems.SILVER_NUGGET);
        this.crushedOre(AllItems.CRUSHED_TIN::get, FoundationItems.TIN_NUGGET);
        this.crushedOre(AllItems.CRUSHED_URANIUM::get, FoundationItems.URANIUM_NUGGET);
    }

    private void crushedOre(Supplier<ItemLike> input, ItemLike output) { // TODO Add extra drop
        this.create(Registries.MOD_ID, input, builder -> {
            builder.output(output, 9);
            return builder;
        });
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.SPLASHING;
    }
}
