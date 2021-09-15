package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.Registries.*;

import fr.alasdiablo.diolib.data.DioBlockStateProvider;
import net.minecraft.data.DataGenerator;

import java.util.Arrays;
import java.util.List;

public class FoundationBlockStateProvider extends DioBlockStateProvider {
    public FoundationBlockStateProvider(DataGenerator generator) {
        super(generator, MOD_ID);
    }

    @Override
    protected void registerStates() {
        List<String> cubeAllList = Arrays.asList(
                BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE,
                DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE, DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE,
                DEEPSLATE_URANIUM_ORE, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE,
                TINY_GOLD_ORE, TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE, DEEPSLATE_TINY_COAL_ORE,
                DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE,
                DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE,
                TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_NICKEL_ORE, TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE,
                DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_NICKEL_ORE,
                DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE
        );

        cubeAllList.forEach(this::cubeAll);
    }
}
