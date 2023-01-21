package fr.alasdiablo.janoeo.foundation.data.loot.table;

import fr.alasdiablo.diolib.api.data.loot.DioBlockLootSubProvider;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import net.minecraft.world.flag.FeatureFlags;
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
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

public class FoundationBlockLootTables extends DioBlockLootSubProvider {

    public FoundationBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.registerDropSelf(FoundationBlocks.STORAGE_BLOCKS);
        this.registerDropSelf(FoundationBlocks.RAW_BLOCKS);

        this.registerOre(FoundationBlocks.STONE_ORES);
        this.registerOre(FoundationBlocks.DEEPSLATE_ORES);

        this.registerTinyOre(FoundationBlocks.TINY_STONE_ORES);
        this.registerTinyOre(FoundationBlocks.TINY_DEEPSLATE_ORES);
        this.registerTinyOre(FoundationBlocks.NETHER_ORES);

        FoundationBlocks.GRAVEL_ORES.forEach((resource, block) -> {
            Item item = resource == Resource.RedStone ? Items.REDSTONE : FoundationItems.DUSTS.get(resource).get();
            this.registerOreLootTable(item, ConstantValue.exactly(1.0F), block.get());
        });
    }

    protected void registerDropSelf(@NotNull Map<Resource, RegistryObject<Block>> registryMap) {
        registryMap.forEach((resource, block) -> this.dropSelf(block.get()));
    }

    protected void registerOre(@NotNull Map<Resource, RegistryObject<Block>> registryMap) {
        registryMap.forEach((resource, block) -> this.registerOreLootTable(FoundationItems.RAWS.get(resource).get(), ConstantValue.exactly(1.0F), block.get()));
    }

    protected void registerTinyOre(@NotNull Map<Resource, RegistryObject<Block>> registryMap) {
        registryMap.forEach((resource, block) -> {
            Item item = switch (resource) {
                case Iron -> Items.IRON_NUGGET;
                case Gold -> Items.GOLD_NUGGET;
                default -> FoundationItems.NUGGETS.get(resource).get();
            };
            this.registerOreLootTable(item, UniformGenerator.between(2.0F, 6.0F), block.get());
        });
    }

    protected void registerOreLootTable(final Item item, final NumberProvider valueRange, Block block) {
        this.add(
                block, (tinyOre) -> createSilkTouchDispatchTable(tinyOre, applyExplosionDecay(tinyOre, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(valueRange)).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
    }
}
