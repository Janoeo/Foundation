package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.Registries.*;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

import java.util.Arrays;
import java.util.List;

public class FoundationItemModelProvider extends ItemModelProvider {

    private static final ResourceLocation GENERATED = new ResourceLocation("item/generated");

    public FoundationItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        List<String> dusts = Arrays.asList(
                ALUMINIUM_DUST, AMETHYST_DUST, COAL_DUST, COPPER_DUST,
                DIAMOND_DUST, EMERALD_DUST, GOLD_DUST, IRON_DUST,
                LAPIS_DUST, LEAD_DUST, NICKEL_DUST, SILVER_DUST,
                TIN_DUST, URANIUM_DUST
        );
        this.registerDustItem(dusts);

        List<String> nuggets = Arrays.asList(
                ALUMINIUM_NUGGET, COAL_NUGGET, COPPER_NUGGET, DIAMOND_NUGGET,
                EMERALD_NUGGET, LAPIS_NUGGET, LEAD_NUGGET, NICKEL_NUGGET,
                REDSTONE_NUGGET, SILVER_NUGGET, TIN_NUGGET, URANIUM_NUGGET
        );
        this.registerNuggetItem(nuggets);

        List<String> ingots = Arrays.asList(
                ALUMINIUM_INGOT, LEAD_INGOT, NICKEL_INGOT, SILVER_INGOT,
                TIN_INGOT, URANIUM_INGOT
        );
        this.registerIngotItem(ingots);

        List<String> raws = Arrays.asList(
                RAW_ALUMINIUM, RAW_LEAD, RAW_NICKEL, RAW_SILVER,
                RAW_TIN, RAW_URANIUM
        );
        this.registerRawItem(raws);

        List<String> blocks = Arrays.asList(
                BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE,
                TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE,
                DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE,
                DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE,
                DEEPSLATE_URANIUM_ORE, TINY_COAL_ORE, TINY_COPPER_ORE,
                TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE,
                TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE,
                DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE,
                DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE,
                DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE,
                DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE
        );
        this.registerBlock(blocks);
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

    private void registerRawItem(List<String> raws) {
        raws.forEach(raw -> withExistingParent(raw, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/raw/" + raw)));
    }

    private void registerBlock(List<String> blocks) {
        blocks.forEach(block -> withExistingParent(block, new ResourceLocation(MOD_ID, "block/" + block)));
    }
}
