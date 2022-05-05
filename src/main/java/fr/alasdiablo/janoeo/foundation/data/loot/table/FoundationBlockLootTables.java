package fr.alasdiablo.janoeo.foundation.data.loot.table;

import fr.alasdiablo.diolib.api.data.loot.DioBlockLootTable;
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

public class FoundationBlockLootTables extends DioBlockLootTable {

    @Override
    protected void addTables() {
        this.dropSelf(FoundationBlocks.ALUMINIUM_BLOCK.get());
        this.dropSelf(FoundationBlocks.LEAD_BLOCK.get());
        this.dropSelf(FoundationBlocks.NICKEL_BLOCK.get());
        this.dropSelf(FoundationBlocks.SILVER_BLOCK.get());
        this.dropSelf(FoundationBlocks.TIN_BLOCK.get());
        this.dropSelf(FoundationBlocks.URANIUM_BLOCK.get());

        this.dropSelf(FoundationBlocks.RAW_ALUMINIUM_BLOCK.get());
        this.dropSelf(FoundationBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(FoundationBlocks.RAW_NICKEL_BLOCK.get());
        this.dropSelf(FoundationBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(FoundationBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(FoundationBlocks.RAW_URANIUM_BLOCK.get());

        this.registerOreLootTable(
                FoundationItems.RAW_ALUMINIUM.get(), ConstantValue.exactly(1.0F), FoundationBlocks.BAUXITE_ORE.get(), FoundationBlocks.DEEPSLATE_BAUXITE_ORE.get());
        this.registerOreLootTable(FoundationItems.RAW_LEAD.get(), ConstantValue.exactly(1.0F), FoundationBlocks.LEAD_ORE.get(), FoundationBlocks.DEEPSLATE_LEAD_ORE.get());
        this.registerOreLootTable(FoundationItems.RAW_NICKEL.get(), ConstantValue.exactly(1.0F), FoundationBlocks.NICKEL_ORE.get(), FoundationBlocks.DEEPSLATE_NICKEL_ORE.get());
        this.registerOreLootTable(FoundationItems.RAW_SILVER.get(), ConstantValue.exactly(1.0F), FoundationBlocks.SILVER_ORE.get(), FoundationBlocks.DEEPSLATE_SILVER_ORE.get());
        this.registerOreLootTable(FoundationItems.RAW_TIN.get(), ConstantValue.exactly(1.0F), FoundationBlocks.TIN_ORE.get(), FoundationBlocks.DEEPSLATE_TIN_ORE.get());
        this.registerOreLootTable(
                FoundationItems.RAW_URANIUM.get(), ConstantValue.exactly(1.0F), FoundationBlocks.URANIUM_ORE.get(), FoundationBlocks.DEEPSLATE_URANIUM_ORE.get()
        );

        this.registerOreLootTable(
                FoundationItems.ALUMINIUM_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_BAUXITE_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_BAUXITE_ORE.get(), FoundationBlocks.NETHER_BAUXITE_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.LEAD_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_LEAD_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_LEAD_ORE.get(), FoundationBlocks.NETHER_LEAD_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.NICKEL_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_NICKEL_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_NICKEL_ORE.get(), FoundationBlocks.NETHER_NICKEL_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.SILVER_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_SILVER_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_SILVER_ORE.get(), FoundationBlocks.NETHER_SILVER_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.TIN_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F),
                FoundationBlocks.TINY_TIN_ORE.get(), FoundationBlocks.DEEPSLATE_TINY_TIN_ORE.get(), FoundationBlocks.NETHER_TIN_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.URANIUM_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_URANIUM_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_URANIUM_ORE.get(), FoundationBlocks.NETHER_URANIUM_ORE.get()
        );

        this.registerOreLootTable(
                FoundationItems.COAL_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_COAL_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_COAL_ORE.get(), FoundationBlocks.NETHER_COAL_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.COPPER_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_COPPER_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_COPPER_ORE.get(), FoundationBlocks.NETHER_COPPER_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.DIAMOND_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_DIAMOND_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_DIAMOND_ORE.get(), FoundationBlocks.NETHER_DIAMOND_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.EMERALD_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_EMERALD_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_EMERALD_ORE.get(), FoundationBlocks.NETHER_EMERALD_ORE.get()
        );
        this.registerOreLootTable(
                Items.GOLD_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_GOLD_ORE.get(), FoundationBlocks.DEEPSLATE_TINY_GOLD_ORE.get()
        );
        this.registerOreLootTable(
                Items.IRON_NUGGET, UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_IRON_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_IRON_ORE.get(), FoundationBlocks.NETHER_IRON_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.LAPIS_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_LAPIS_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_LAPIS_ORE.get(), FoundationBlocks.NETHER_LAPIS_ORE.get()
        );
        this.registerOreLootTable(
                FoundationItems.REDSTONE_NUGGET.get(), UniformGenerator.between(2.0F, 6.0F), FoundationBlocks.TINY_REDSTONE_ORE.get(),
                FoundationBlocks.DEEPSLATE_TINY_REDSTONE_ORE.get(), FoundationBlocks.NETHER_REDSTONE_ORE.get()
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
