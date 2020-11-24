package fr.alasdiablo.janoeo.data;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import fr.alasdiablo.janoeo.init.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ModBlockLootTable extends BlockLootTables {

    private final Map<ResourceLocation, LootTable.Builder> lootTables = Maps.newHashMap();

    private static class Provider {
        // Dense ore value : (base value 4.0F(min), 9.0F(max)) min = (base value max), max = (base value max) + (base value min) * 2, or 9.0F, 17.0F
        private static final Function<Block, LootTable.Builder> LAPIS_LOOT_PROVIDER = (lapis) -> droppingWithSilkTouch(lapis, withExplosionDecay(lapis, ItemLootEntry.builder(Items.LAPIS_LAZULI).acceptFunction(SetCount.builder(RandomValueRange.of(4.0F, 9.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> COAL_LOOT_PROVIDER =  (coal) -> droppingItemWithFortune(coal, Items.COAL);
        private static final Function<Block, LootTable.Builder> DIAMOND_LOOT_PROVIDER =  (diamond) -> droppingItemWithFortune(diamond, Items.DIAMOND);
        private static final Function<Block, LootTable.Builder> EMERALD_LOOT_PROVIDER =  (emerald) -> droppingItemWithFortune(emerald, Items.EMERALD);
        private static final Function<Block, LootTable.Builder> RUBY_LOOT_PROVIDER = (ruby) -> droppingItemWithFortune(ruby, GemsItems.RUBY);
        private static final Function<Block, LootTable.Builder> SAPPHIRE_LOOT_PROVIDER = (sapphire) -> droppingItemWithFortune(sapphire, GemsItems.SAPPHIRE);
        private static final Function<Block, LootTable.Builder> REDSTONE_LOOT_PROVIDER = (redstone) -> droppingWithSilkTouch(redstone, withExplosionDecay(redstone, ItemLootEntry.builder(Items.REDSTONE).acceptFunction(SetCount.builder(RandomValueRange.of(4.0F, 5.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_LAPIS_LOOT_PROVIDER = (lapis) -> droppingWithSilkTouch(lapis, withExplosionDecay(lapis, ItemLootEntry.builder(Items.LAPIS_LAZULI).acceptFunction(SetCount.builder(RandomValueRange.of(9.0F, 17.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_COAL_LOOT_PROVIDER = (coal) -> droppingWithSilkTouch(coal, withExplosionDecay(coal, ItemLootEntry.builder(Items.COAL).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_REDSTONE_LOOT_PROVIDER = (redstone) -> droppingWithSilkTouch(redstone, withExplosionDecay(redstone, ItemLootEntry.builder(Items.REDSTONE).acceptFunction(SetCount.builder(RandomValueRange.of(9.0F, 17.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_DIAMOND_LOOT_PROVIDER = (diamond) -> droppingWithSilkTouch(diamond, withExplosionDecay(diamond, ItemLootEntry.builder(Items.DIAMOND).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_EMERALD_LOOT_PROVIDER = (emerald) -> droppingWithSilkTouch(emerald, withExplosionDecay(emerald, ItemLootEntry.builder(Items.EMERALD).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_IRON_LOOT_PROVIDER = (iron) -> droppingWithSilkTouch(iron, withExplosionDecay(iron, ItemLootEntry.builder(Blocks.IRON_ORE).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_GOLD_LOOT_PROVIDER = (gold) -> droppingWithSilkTouch(gold, withExplosionDecay(gold, ItemLootEntry.builder(Blocks.GOLD_ORE).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_COPPER_LOOT_PROVIDER = (copper) -> droppingWithSilkTouch(copper, withExplosionDecay(copper, ItemLootEntry.builder(OverworldOresBlocks.COPPER_ORE).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_TIN_LOOT_PROVIDER = (tin) -> droppingWithSilkTouch(tin, withExplosionDecay(tin, ItemLootEntry.builder(OverworldOresBlocks.TIN_ORE).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_QUARTZ_LOOT_PROVIDER = (quartz) -> droppingWithSilkTouch(quartz, withExplosionDecay(quartz, ItemLootEntry.builder(Items.QUARTZ).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_NETHER_IRON_LOOT_PROVIDER = (iron) -> droppingWithSilkTouch(iron, withExplosionDecay(iron, ItemLootEntry.builder(NetherOresBlocks.IRON_NETHER_ORE).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
        private static final Function<Block, LootTable.Builder> DENSE_NETHER_GOLD_LOOT_PROVIDER = (gold) -> droppingWithSilkTouch(gold, withExplosionDecay(gold, ItemLootEntry.builder(NetherOresBlocks.GOLD_NETHER_ORE).acceptFunction(SetCount.builder(RandomValueRange.of(1.0F, 3.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))));
    }

    @Override
    protected void addTables() {
        this.registerDropSelfLootTable(BasaltOresBlocks.GOLD_BASALT_ORE);
        this.registerDropSelfLootTable(BasaltOresBlocks.IRON_BASALT_ORE);
        this.registerDropSelfLootTable(EndOresBlocks.GOLD_END_ORE);
        this.registerDropSelfLootTable(EndOresBlocks.IRON_END_ORE);
        this.registerDropSelfLootTable(ModBlocks.RUBY_BLOCK);
        this.registerDropSelfLootTable(ModBlocks.SAPPHIRE_BLOCK);
        this.registerDropSelfLootTable(NetherOresBlocks.ALUMINIUM_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.COPPER_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.GOLD_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.IRON_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.OSMIUM_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.SILVER_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.LEAD_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.TIN_NETHER_ORE);
        this.registerDropSelfLootTable(NetherOresBlocks.URANIUM_NETHER_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.COPPER_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.ALUMINIUM_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.LEAD_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.SILVER_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.TIN_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.URANIUM_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.ZINC_ORE);
        this.registerDropSelfLootTable(OverworldOresBlocks.OSMIUM_ORE);
        this.registerLootTable(BasaltOresBlocks.COAL_BASALT_ORE, Provider.COAL_LOOT_PROVIDER);
        this.registerLootTable(BasaltOresBlocks.DIAMOND_BASALT_ORE, Provider.DIAMOND_LOOT_PROVIDER);
        this.registerLootTable(BasaltOresBlocks.EMERALD_BASALT_ORE, Provider.EMERALD_LOOT_PROVIDER);
        this.registerLootTable(EndOresBlocks.COAL_END_ORE, Provider.COAL_LOOT_PROVIDER);
        this.registerLootTable(EndOresBlocks.DIAMOND_END_ORE, Provider.DIAMOND_LOOT_PROVIDER);
        this.registerLootTable(EndOresBlocks.EMERALD_END_ORE, Provider.EMERALD_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.COAL_NETHER_ORE, Provider.COAL_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.DIAMOND_NETHER_ORE, Provider.DIAMOND_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.EMERALD_NETHER_ORE, Provider.EMERALD_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.RUBY_NETHER_ORE, Provider.RUBY_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.SAPPHIRE_NETHER_ORE, Provider.SAPPHIRE_LOOT_PROVIDER);
        this.registerLootTable(OverworldOresBlocks.RUBY_ORE, Provider.RUBY_LOOT_PROVIDER);
        this.registerLootTable(OverworldOresBlocks.SAPPHIRE_ORE, Provider.SAPPHIRE_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.LAPIS_NETHER_ORE, Provider.LAPIS_LOOT_PROVIDER);
        this.registerLootTable(EndOresBlocks.LAPIS_END_ORE, Provider.LAPIS_LOOT_PROVIDER);
        this.registerLootTable(BasaltOresBlocks.LAPIS_BASALT_ORE, Provider.LAPIS_LOOT_PROVIDER);
        this.registerLootTable(NetherOresBlocks.REDSTONE_NETHER_ORE, Provider.REDSTONE_LOOT_PROVIDER);
        this.registerLootTable(EndOresBlocks.REDSTONE_END_ORE, Provider.REDSTONE_LOOT_PROVIDER);
        this.registerLootTable(BasaltOresBlocks.REDSTONE_BASALT_ORE, Provider.REDSTONE_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_COAL_ORE, Provider.DENSE_COAL_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_COPPER_ORE, Provider.DENSE_COPPER_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_DIAMOND_ORE, Provider.DENSE_DIAMOND_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_EMERALD_ORE, Provider.DENSE_EMERALD_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_GOLD_ORE, Provider.DENSE_GOLD_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_IRON_ORE, Provider.DENSE_IRON_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_LAPIS_ORE, Provider.DENSE_LAPIS_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_REDSTONE_ORE, Provider.DENSE_REDSTONE_LOOT_PROVIDER);
        this.registerLootTable(OverworldDenseOresBlocks.DENSE_TIN_ORE, Provider.DENSE_TIN_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE, Provider.DENSE_COAL_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE, Provider.DENSE_DIAMOND_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE, Provider.DENSE_EMERALD_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE, Provider.DENSE_NETHER_GOLD_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE, Provider.DENSE_NETHER_IRON_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE, Provider.DENSE_LAPIS_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE, Provider.DENSE_REDSTONE_LOOT_PROVIDER);
        this.registerLootTable(NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE, Provider.DENSE_QUARTZ_LOOT_PROVIDER);
        this.registerLootTable(OverworldOresBlocks.AMETHYST_ORE, (amethyst) -> droppingItemWithFortune(amethyst, GemsItems.AMETHYST));
        this.registerLootTable(GravelsOresBlocks.DIAMOND_GRAVEL_ORE, (diamond) -> droppingItemWithFortune(diamond, DustsItems.DIAMOND_DUST));
        this.registerLootTable(GravelsOresBlocks.GOLD_GRAVEL_ORE, (gold) -> droppingItemWithFortune(gold, DustsItems.GOLD_DUST));
        this.registerLootTable(GravelsOresBlocks.IRON_GRAVEL_ORE, (iron) -> droppingItemWithFortune(iron, DustsItems.IRON_DUST));
    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> lootTable) {
        this.addTables();
        Set<ResourceLocation> set = Sets.newHashSet();

        for(Block block : getKnownBlocks()) {
            ResourceLocation resourcelocation = block.getLootTable();
            if (resourcelocation != LootTables.EMPTY && set.add(resourcelocation)) {
                LootTable.Builder lootTableBuilder = this.lootTables.remove(resourcelocation);
                if (lootTableBuilder != null) {
                    lootTable.accept(resourcelocation, lootTableBuilder);
                }
            }
        }

        if (!this.lootTables.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + this.lootTables.keySet());
        }
    }

    @Override
    protected void registerLootTable(Block blockIn, LootTable.Builder table) {
        this.lootTables.put(blockIn.getLootTable(), table);
    }
}
