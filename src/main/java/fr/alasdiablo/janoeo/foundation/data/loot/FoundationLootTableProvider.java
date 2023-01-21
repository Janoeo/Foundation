package fr.alasdiablo.janoeo.foundation.data.loot;


import fr.alasdiablo.janoeo.foundation.data.loot.table.FoundationBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class FoundationLootTableProvider extends LootTableProvider {
    public FoundationLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(FoundationBlockLootTables::new, LootContextParamSets.BLOCK)));
    }
}
