package fr.alasdiablo.janoeo.foundation.data.loot;

import fr.alasdiablo.diolib.data.DioBlockLootTables;
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

public class FoundationBlockLootTables extends DioBlockLootTables {

    @Override
    protected void addTables() {
        this.registerOreLootTable(FoundationBlocks.BAUXITE_ORE, FoundationItems.RAW_ALUMINIUM, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.LEAD_ORE, FoundationItems.RAW_LEAD, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.NICKEL_ORE, FoundationItems.RAW_NICKEL, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.SILVER_ORE, FoundationItems.RAW_SILVER, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.TIN_ORE, FoundationItems.RAW_TIN, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.URANIUM_ORE, FoundationItems.RAW_URANIUM, ConstantValue.exactly(1.0F));

        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_BAUXITE_ORE, FoundationItems.RAW_ALUMINIUM, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_LEAD_ORE, FoundationItems.RAW_LEAD, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_NICKEL_ORE, FoundationItems.RAW_NICKEL, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_SILVER_ORE, FoundationItems.RAW_SILVER, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TIN_ORE, FoundationItems.RAW_TIN, ConstantValue.exactly(1.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_URANIUM_ORE, FoundationItems.RAW_URANIUM, ConstantValue.exactly(1.0F));

        this.registerOreLootTable(FoundationBlocks.TINY_COAL_ORE, FoundationItems.COAL_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_COPPER_ORE, FoundationItems.COPPER_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_DIAMOND_ORE, FoundationItems.DIAMOND_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_EMERALD_ORE, FoundationItems.EMERALD_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_GOLD_ORE, Items.GOLD_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_IRON_ORE, Items.IRON_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_LAPIS_ORE, FoundationItems.LAPIS_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.TINY_REDSTONE_ORE, FoundationItems.REDSTONE_NUGGET, UniformGenerator.between(2.0F, 6.0F));

        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_COAL_ORE, FoundationItems.COAL_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_COPPER_ORE, FoundationItems.COPPER_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_DIAMOND_ORE, FoundationItems.DIAMOND_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_EMERALD_ORE, FoundationItems.EMERALD_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_GOLD_ORE, Items.GOLD_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_IRON_ORE, Items.IRON_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_LAPIS_ORE, FoundationItems.LAPIS_NUGGET, UniformGenerator.between(2.0F, 6.0F));
        this.registerOreLootTable(FoundationBlocks.DEEPSLATE_TINY_REDSTONE_ORE, FoundationItems.REDSTONE_NUGGET, UniformGenerator.between(2.0F, 6.0F));
    }

    protected void registerOreLootTable(final Block tinyOreBlock, final Item nuggetItem, final NumberProvider valueRange) {
        this.add(tinyOreBlock, (tinyOre) -> createSilkTouchDispatchTable(tinyOre, applyExplosionDecay(tinyOre, LootItem.lootTableItem(nuggetItem).apply(SetItemCountFunction.setCount(valueRange)).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
    }
}
