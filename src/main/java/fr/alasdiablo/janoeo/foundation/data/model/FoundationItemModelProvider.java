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

        List<String> gears = List.of(
                COPPER_GEAR, DIAMOND_GEAR, GOLD_GEAR, IRON_GEAR, SILVER_GEAR, TIN_GEAR, WOODEN_GEAR
        );

        this.registerGearItem(gears);

        List<String> rods = List.of(
                COPPER_STICK, DIAMOND_STICK, GOLD_STICK, IRON_STICK, SILVER_STICK, TIN_STICK
        );

        this.registerRodItem(rods);

        this.registerBlock(FoundationBlockStateProvider.getBlocksList());
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
