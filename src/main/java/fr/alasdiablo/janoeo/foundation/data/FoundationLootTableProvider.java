package fr.alasdiablo.janoeo.foundation.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import fr.alasdiablo.diolib.data.DioLootTableProvider;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.data.loot.FoundationBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.LootParameterSets;

public class FoundationLootTableProvider extends DioLootTableProvider {
    public FoundationLootTableProvider(DataGenerator dataGeneratorIn) {
        super(
                dataGeneratorIn,
                ImmutableList.of(Pair.of(FoundationBlockLootTables::new, LootParameterSets.BLOCK)),
                LootParameterSets.BLOCK,
                Registries.MOD_ID
        );
    }
}
