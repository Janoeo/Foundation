package fr.alasdiablo.janoeo.foundation.data.loot;

import com.mojang.datafixers.util.Pair;
import fr.alasdiablo.diolib.api.data.loot.DioLootTableProvider;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.data.loot.table.FoundationBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class FoundationLootTableProvider extends DioLootTableProvider {
    public FoundationLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn, Foundation.MOD_ID);
    }

    @Override
    public void registerAdvancements() {
        this.addLootTable(Pair.of(FoundationBlockLootTables::new, LootContextParamSets.BLOCK));
    }
}
