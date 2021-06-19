package fr.alasdiablo.janoeo.foundation.data.loot;

import fr.alasdiablo.diolib.data.DioBlockLootTables;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.loot.functions.SetCount;

public class FoundationBlockLootTables extends DioBlockLootTables {

    @Override
    protected void addTables() {
        this.registerTinyOreLootTable(FoundationBlocks.TINY_COAL_ORE, FoundationItems.COAL_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_COPPER_ORE, FoundationItems.COPPER_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_DIAMOND_ORE, FoundationItems.DIAMOND_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_EMERALD_ORE, FoundationItems.EMERALD_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_GOLD_ORE, Items.GOLD_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_IRON_ORE, Items.IRON_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_LAPIS_ORE, FoundationItems.LAPIS_NUGGET);
        this.registerTinyOreLootTable(FoundationBlocks.TINY_REDSTONE_ORE, FoundationItems.REDSTONE_NUGGET);
    }

    protected void registerTinyOreLootTable(Block tinyOreBlock, Item nuggetItem) {
        this.registerLootTable(tinyOreBlock, (tinyOre) -> droppingWithSilkTouch(tinyOre, withExplosionDecay(tinyOre, ItemLootEntry.builder(nuggetItem).acceptFunction(SetCount.builder(RandomValueRange.of(2.0F, 6.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE)))));
    }
}
