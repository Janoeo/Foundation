package fr.alasdiablo.janoeo.foundation.compatibility.create;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class CompactingRecipe extends ProcessingRecipe {
    public CompactingRecipe(DataGenerator generator) {
        super(generator);
        this.dustToOriginal("amethyst_shard_from_dust", FoundationItems.AMETHYST_DUST.get(), Items.AMETHYST_SHARD);
        this.dustToOriginal("coal_from_dust", FoundationItems.COAL_DUST.get(), Items.COAL);
        this.dustToOriginal("diamond_from_dust", FoundationItems.DIAMOND_DUST.get(), Items.DIAMOND);
        this.dustToOriginal("emerald_from_dust", FoundationItems.EMERALD_DUST.get(), Items.EMERALD);
        this.dustToOriginal("lapis_lazuli_from_dust", FoundationItems.LAPIS_DUST.get(), Items.LAPIS_LAZULI);
    }

    private void dustToOriginal(String name, ItemLike input, ItemLike output) {
        this.create(ResourceLocations.of(Registries.MOD_ID, name), builder -> {
            builder.require(input);
            builder.output(output);
            return builder;
        });
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.COMPACTING;
    }
}
