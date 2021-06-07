package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.Registries.*;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FoundationItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    private static final ResourceLocation GENERATED = new ResourceLocation("item/generated");

    public FoundationItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        List<String> dusts = Arrays.asList(
                AMETHYST_DUST, COAL_DUST, COPPER_DUST, DIAMOND_DUST,
                EMERALD_DUST, GOLD_DUST, IRON_DUST, LAPIS_DUST
        );
        this.registerDustItem(dusts);

        List<String> nuggets = Collections.singletonList(COPPER_NUGGET);
        this.registerNuggetItem(nuggets);

        List<String> ingots = Arrays.asList(
                ALUMINIUM_INGOT, LEAD_INGOT, NICKEL_INGOT,
                SILVER_INGOT, TIN_INGOT, URANIUM_INGOT
        );
        this.registerIngotItem(ingots);
    }

    private void registerDustItem(List<String> dusts) {
        dusts.forEach(dust -> withExistingParent(dust, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/dust/" + dust)));
    }

    private void registerNuggetItem(List<String> nuggets) {
        nuggets.forEach(nugget -> withExistingParent(nugget, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/nugget/" + nugget)));
    }

    private void registerIngotItem(List<String> ingots) {
        ingots.forEach(ingot -> withExistingParent(ingot, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/ingot/" + ingot)));
    }
}
