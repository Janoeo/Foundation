package fr.alasdiablo.janoeo.foundation.data.model;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static fr.alasdiablo.janoeo.foundation.Registries.*;

public class FoundationItemModelProvider extends ItemModelProvider {

    private static final ResourceLocation GENERATED = new ResourceLocation("item/generated");

    public FoundationItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        List<String> dusts = List.of(
                ALUMINIUM_DUST, AMETHYST_DUST, COAL_DUST, COPPER_DUST, DIAMOND_DUST, EMERALD_DUST, GOLD_DUST, IRON_DUST, LAPIS_DUST, LEAD_DUST, NICKEL_DUST,
                SILVER_DUST, TIN_DUST, URANIUM_DUST
        );

        this.registerDustItem(dusts);

        List<String> nuggets = List.of(
                ALUMINIUM_NUGGET, COAL_NUGGET, COPPER_NUGGET, DIAMOND_NUGGET, EMERALD_NUGGET, LAPIS_NUGGET, LEAD_NUGGET, NICKEL_NUGGET, REDSTONE_NUGGET,
                SILVER_NUGGET, TIN_NUGGET, URANIUM_NUGGET
        );

        this.registerNuggetItem(nuggets);

        List<String> ingots = List.of(ALUMINIUM_INGOT, LEAD_INGOT, NICKEL_INGOT, SILVER_INGOT, TIN_INGOT, URANIUM_INGOT);

        this.registerIngotItem(ingots);

        List<String> raws = List.of(RAW_ALUMINIUM, RAW_LEAD, RAW_NICKEL, RAW_SILVER, RAW_TIN, RAW_URANIUM);

        this.registerRawItem(raws);

        List<String> others = List.of(
                SCRAP
        );

        this.registerOtherItem(others);

        List<String> gears = List.of(
                COPPER_GEAR, DIAMOND_GEAR, GOLD_GEAR, IRON_GEAR, SILVER_GEAR, TIN_GEAR, WOODEN_GEAR
        );

        this.registerGearItem(gears);

        List<String> rods = List.of(
                COPPER_STICK, DIAMOND_STICK, GOLD_STICK, IRON_STICK, SILVER_STICK, TIN_STICK
        );

        this.registerRodItem(rods);

        List<String> blocks = List.of(
                BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE,
                DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE,
                TINY_GOLD_ORE, TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE, DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE,
                DEEPSLATE_TINY_EMERALD_ORE, DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE,
                TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_NICKEL_ORE, TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_BAUXITE_ORE,
                DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_NICKEL_ORE, DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE,
                NETHER_COAL_ORE, NETHER_COPPER_ORE, NETHER_DIAMOND_ORE, NETHER_EMERALD_ORE, NETHER_IRON_ORE, NETHER_LAPIS_ORE, NETHER_REDSTONE_ORE,
                NETHER_BAUXITE_ORE, NETHER_LEAD_ORE, NETHER_NICKEL_ORE, NETHER_SILVER_ORE, NETHER_TIN_ORE, NETHER_URANIUM_ORE, ALUMINIUM_BLOCK, LEAD_BLOCK,
                NICKEL_BLOCK, SILVER_BLOCK, TIN_BLOCK, URANIUM_BLOCK
        );

        this.registerBlock(blocks);
    }

    private void registerGearItem(@NotNull List<String> gears) {
        gears.forEach(gear -> withExistingParent(gear, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/gear/" + gear)));
    }

    private void registerRodItem(@NotNull List<String> rods) {
        rods.forEach(rod -> withExistingParent(rod, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/rod/" + rod)));
    }

    private void registerDustItem(@NotNull List<String> dusts) {
        dusts.forEach(dust -> withExistingParent(dust, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/dust/" + dust)));
    }

    private void registerNuggetItem(@NotNull List<String> nuggets) {
        nuggets.forEach(nugget -> withExistingParent(nugget, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/nugget/" + nugget)));
    }

    private void registerIngotItem(@NotNull List<String> ingots) {
        ingots.forEach(ingot -> withExistingParent(ingot, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/ingot/" + ingot)));
    }

    private void registerRawItem(@NotNull List<String> raws) {
        raws.forEach(raw -> withExistingParent(raw, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/raw/" + raw)));
    }

    private void registerOtherItem(@NotNull List<String> others) {
        others.forEach(other -> withExistingParent(other, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/" + other)));
    }

    private void registerBlock(@NotNull List<String> blocks) {
        blocks.forEach(block -> withExistingParent(block, new ResourceLocation(MOD_ID, "block/" + block)));
    }
}
