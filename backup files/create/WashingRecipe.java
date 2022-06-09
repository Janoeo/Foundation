package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public class WashingRecipe extends ProcessingRecipe {
    public WashingRecipe(DataGenerator generator) {
        super(generator);
        this.crushedOre(AllItems.CRUSHED_BAUXITE::get, FoundationItems.NUGGETS.get(Resource.Aluminium).get());
        this.crushedOre(AllItems.CRUSHED_LEAD::get, FoundationItems.NUGGETS.get(Resource.Lead).get());
        this.crushedOre(AllItems.CRUSHED_NICKEL::get, FoundationItems.NUGGETS.get(Resource.Nickel).get());
        this.crushedOre(AllItems.CRUSHED_SILVER::get, FoundationItems.NUGGETS.get(Resource.Silver).get());
        this.crushedOre(AllItems.CRUSHED_TIN::get, FoundationItems.NUGGETS.get(Resource.Tin).get());
        this.crushedOre(AllItems.CRUSHED_URANIUM::get, FoundationItems.NUGGETS.get(Resource.Uranium).get());
    }

    private void crushedOre(Supplier<ItemLike> input, ItemLike output) { // TODO Add extra drop
        this.create(Foundation.MOD_ID, input, builder -> {
            builder.output(output, 9);
            return builder;
        });
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.SPLASHING;
    }
}
