package fr.alasdiablo.janoeo.foundation.data;

import com.mojang.datafixers.util.Pair;
import fr.alasdiablo.diolib.data.provider.DioLootTableProvider;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.data.loot.FoundationBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class FoundationLootTableProvider extends DioLootTableProvider {
    public FoundationLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn, Registries.MOD_ID);
    }

    @Override
    public void registerAdvancements() {
        this.addLootTable(Pair.of(FoundationBlockLootTables::new, LootContextParamSets.BLOCK));
    }
}
