package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.Registries.*;

import fr.alasdiablo.diolib.data.BlockStateBuilder;
import fr.alasdiablo.diolib.data.BlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;
import java.util.List;

public class FoundationBlockStateProvider extends BlockStateProvider {
    public FoundationBlockStateProvider(DataGenerator generator) {
        super(generator, MOD_ID);
    }

    @Override
    protected void registerStates() {
        List<String> cubeAllList = Arrays.asList(
                BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE,
                TIN_ORE, URANIUM_ORE, TINY_COAL_ORE, TINY_COPPER_ORE,
                TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE,
                TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE,
                DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE,
                DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE,
                DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE,
                DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE
        );

        cubeAllList.forEach(this::defaultState);
    }

    private void defaultState(String blockName) {
        BlockStateBuilder stateBuilder = new BlockStateBuilder();
        stateBuilder.addVariants("", new ResourceLocation(MOD_ID, "block/" + blockName));
        this.addBlockState(blockName, stateBuilder);
    }
}
