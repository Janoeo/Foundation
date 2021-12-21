package fr.alasdiablo.janoeo.foundation.data.loot.table;

import fr.alasdiablo.diolib.data.loot.BlockLootTable;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Arrays;

public class FoundationBlockLootTables extends BlockLootTable {

    @Override
    protected void addTables() {
        this.registerOreLootTable(
                FoundationItems.RAW_ALUMINIUM, ConstantValue.exactly(1.0F), FoundationBlocks.BAUXITE_ORE, FoundationBlocks.DEEPSLATE_BAUXITE_ORE);
        this.registerOreLootTable(FoundationItems.RAW_LEAD, ConstantValue.exactly(1.0F), FoundationBlocks.LEAD_ORE, FoundationBlocks.DEEPSLATE_LEAD_ORE);
        this.registerOreLootTable(FoundationItems.RAW_NICKEL, ConstantValue.exactly(1.0F), FoundationBlocks.NICKEL_ORE, FoundationBlocks.DEEPSLATE_NICKEL_ORE);
        this.registerOreLootTable(FoundationItems.RAW_SILVER, ConstantValue.exactly(1.0F), FoundationBlocks.SILVER_ORE, FoundationBlocks.DEEPSLATE_SILVER_ORE);
        this.registerOreLootTable(FoundationItems.RAW_TIN, ConstantValue.exactly(1.0F), FoundationBlocks.TIN_ORE, FoundationBlocks.DEEPSLATE_TIN_ORE);
        this.registerOreLootTable(
                FoundationItems.RAW_URANIUM, ConstantValue.exactly(1.0F), FoundationBlocks.URANIUM_ORE, FoundationBlocks.DEEPSLATE_URANIUM_ORE
        );

        this.registerOreLootTable(
                FoundationItems.ALUMINIUM_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_BAUXITE_ORE,
                FoundationBlocks.DEEPSLATE_TINY_BAUXITE_ORE, FoundationBlocks.NETHER_BAUXITE_ORE
        );
        this.registerOreLootTable(
                FoundationItems.LEAD_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_LEAD_ORE,
                FoundationBlocks.DEEPSLATE_TINY_LEAD_ORE, FoundationBlocks.NETHER_LEAD_ORE
        );
        this.registerOreLootTable(
                FoundationItems.NICKEL_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_NICKEL_ORE,
                FoundationBlocks.DEEPSLATE_TINY_NICKEL_ORE, FoundationBlocks.NETHER_NICKEL_ORE
        );
        this.registerOreLootTable(
                FoundationItems.SILVER_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_SILVER_ORE,
                FoundationBlocks.DEEPSLATE_TINY_SILVER_ORE, FoundationBlocks.NETHER_SILVER_ORE
        );
        this.registerOreLootTable(
                FoundationItems.TIN_NUGGET, UniformGenerator.between(2.0F, 6.0F),
                FoundationBlocks.TINY_TIN_ORE, FoundationBlocks.DEEPSLATE_TINY_TIN_ORE, FoundationBlocks.NETHER_TIN_ORE
        );
        this.registerOreLootTable(
                FoundationItems.URANIUM_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_URANIUM_ORE,
                FoundationBlocks.DEEPSLATE_TINY_URANIUM_ORE, FoundationBlocks.NETHER_URANIUM_ORE
        );

        this.registerOreLootTable(
                FoundationItems.COAL_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_COAL_ORE,
                FoundationBlocks.DEEPSLATE_TINY_COAL_ORE, FoundationBlocks.NETHER_COAL_ORE
        );
        this.registerOreLootTable(
                FoundationItems.COPPER_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_COPPER_ORE,
                FoundationBlocks.DEEPSLATE_TINY_COPPER_ORE, FoundationBlocks.NETHER_COPPER_ORE
        );
        this.registerOreLootTable(
                FoundationItems.DIAMOND_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_DIAMOND_ORE,
                FoundationBlocks.DEEPSLATE_TINY_DIAMOND_ORE, FoundationBlocks.NETHER_DIAMOND_ORE
        );
        this.registerOreLootTable(
                FoundationItems.EMERALD_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_EMERALD_ORE,
                FoundationBlocks.DEEPSLATE_TINY_EMERALD_ORE, FoundationBlocks.NETHER_EMERALD_ORE
        );
        this.registerOreLootTable(
                Items.GOLD_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_GOLD_ORE, FoundationBlocks.DEEPSLATE_TINY_GOLD_ORE
        );
        this.registerOreLootTable(
                Items.IRON_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_IRON_ORE,
                FoundationBlocks.DEEPSLATE_TINY_IRON_ORE, FoundationBlocks.NETHER_IRON_ORE
        );
        this.registerOreLootTable(
                FoundationItems.LAPIS_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_LAPIS_ORE,
                FoundationBlocks.DEEPSLATE_TINY_LAPIS_ORE, FoundationBlocks.NETHER_LAPIS_ORE
        );
        this.registerOreLootTable(
                FoundationItems.REDSTONE_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_REDSTONE_ORE,
                FoundationBlocks.DEEPSLATE_TINY_REDSTONE_ORE, FoundationBlocks.NETHER_REDSTONE_ORE
        );
    }

    protected void registerOreLootTable(final Item nuggetItem, final NumberProvider valueRange, Block... blocks) {
        Arrays.stream(blocks).forEach(block -> registerOreLootTable(block, nuggetItem, valueRange));
    }

    protected void registerOreLootTable(final Block tinyOreBlock, final Item nuggetItem, final NumberProvider valueRange) {
        this.add(
                tinyOreBlock, (tinyOre) -> createSilkTouchDispatchTable(tinyOre, applyExplosionDecay(tinyOre, LootItem.lootTableItem(nuggetItem)
                        .apply(SetItemCountFunction.setCount(valueRange)).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
    }
}
