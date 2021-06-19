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
        this.registerOreLootTable(FoundationBlocks.BAUXITE_ORE, FoundationItems.RAW_ALUMINIUM, new RandomValueRange(1.0F));
        this.registerOreLootTable(FoundationBlocks.LEAD_ORE, FoundationItems.RAW_LEAD, new RandomValueRange(1.0F));
        this.registerOreLootTable(FoundationBlocks.NICKEL_ORE, FoundationItems.RAW_NICKEL, new RandomValueRange(1.0F));
        this.registerOreLootTable(FoundationBlocks.SILVER_ORE, FoundationItems.RAW_SILVER, new RandomValueRange(1.0F));
        this.registerOreLootTable(FoundationBlocks.TIN_ORE, FoundationItems.RAW_TIN, new RandomValueRange(1.0F));
        this.registerOreLootTable(FoundationBlocks.URANIUM_ORE, FoundationItems.RAW_URANIUM, new RandomValueRange(1.0F));

        this.registerOreLootTable(FoundationBlocks.TINY_COAL_ORE, FoundationItems.COAL_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_COPPER_ORE, FoundationItems.COPPER_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_DIAMOND_ORE, FoundationItems.DIAMOND_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_EMERALD_ORE, FoundationItems.EMERALD_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_GOLD_ORE, Items.GOLD_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_IRON_ORE, Items.IRON_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_LAPIS_ORE, FoundationItems.LAPIS_NUGGET, RandomValueRange.of(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_REDSTONE_ORE, FoundationItems.REDSTONE_NUGGET, RandomValueRange.of(2.0F, 6.0F));
    }

    protected void registerOreLootTable(final Block tinyOreBlock, final Item nuggetItem, final RandomValueRange valueRange) {
        this.registerLootTable(tinyOreBlock, (tinyOre) -> droppingWithSilkTouch(tinyOre, withExplosionDecay(tinyOre, ItemLootEntry.builder(nuggetItem).acceptFunction(SetCount.builder(valueRange)).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE)))));
    }
}
