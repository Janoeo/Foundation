package fr.alasdiablo.janoeo.foundation.data;

import fr.alasdiablo.janoeo.foundation.Registries;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Items.*;

import fr.alasdiablo.janoeo.foundation.init.FoundationTags;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

@MethodsReturnNonnullByDefault
@SuppressWarnings("unchecked")
public class FoundationItemTagsProvider extends ItemTagsProvider {

    public FoundationItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        this.copy(FoundationTags.Blocks.ORES_TINY_COAL, ORES_TINY_COAL);
        this.copy(FoundationTags.Blocks.ORES_TINY_COPPER, ORES_TINY_COPPER);
        this.copy(FoundationTags.Blocks.ORES_TINY_DIAMOND, ORES_TINY_DIAMOND);
        this.copy(FoundationTags.Blocks.ORES_TINY_EMERALD, ORES_TINY_EMERALD);
        this.copy(FoundationTags.Blocks.ORES_TINY_GOLD, ORES_TINY_GOLD);
        this.copy(FoundationTags.Blocks.ORES_TINY_IRON, ORES_TINY_IRON);
        this.copy(FoundationTags.Blocks.ORES_TINY_LAPIS, ORES_TINY_LAPIS);
        this.copy(FoundationTags.Blocks.ORES_TINY_REDSTONE, ORES_TINY_REDSTONE);

        this.copy(FoundationTags.Blocks.ORES_ALUMINIUM, ORES_ALUMINIUM);
        this.copy(FoundationTags.Blocks.ORES_ALUMINUM, ORES_ALUMINUM);
        this.copy(FoundationTags.Blocks.ORES_LEAD, ORES_LEAD);
        this.copy(FoundationTags.Blocks.ORES_NICKEL, ORES_NICKEL);
        this.copy(FoundationTags.Blocks.ORES_SILVER, ORES_SILVER);
        this.copy(FoundationTags.Blocks.ORES_TIN, ORES_TIN);
        this.copy(FoundationTags.Blocks.ORES_URANIUM, ORES_URANIUM);

        this.copy(FoundationTags.Blocks.ORES_TINY, ORES_TINY);
        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);


        this.getOrCreateBuilder(Tags.Items.DUSTS).addTags(
                DUSTS_ALUMINIUM,
                DUSTS_ALUMINUM,
                DUSTS_AMETHYST,
                DUSTS_COAL,
                DUSTS_COPPER,
                DUSTS_DIAMOND,
                DUSTS_GOLD,
                DUSTS_EMERALD,
                DUSTS_IRON,
                DUSTS_LAPIS,
                DUSTS_LEAD,
                DUSTS_NICKEL,
                DUSTS_SILVER,
                DUSTS_TIN,
                DUSTS_URANIUM
        );
        this.getOrCreateBuilder(DUSTS_ALUMINIUM).addItemEntry(ALUMINIUM_DUST);
        this.getOrCreateBuilder(DUSTS_ALUMINUM).addTags(DUSTS_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        this.getOrCreateBuilder(DUSTS_AMETHYST).addItemEntry(AMETHYST_DUST);
        this.getOrCreateBuilder(DUSTS_COAL).addItemEntry(COAL_DUST);
        this.getOrCreateBuilder(DUSTS_COPPER).addItemEntry(COPPER_DUST);
        this.getOrCreateBuilder(DUSTS_DIAMOND).addItemEntry(DIAMOND_DUST);
        this.getOrCreateBuilder(DUSTS_GOLD).addItemEntry(GOLD_DUST);
        this.getOrCreateBuilder(DUSTS_EMERALD).addItemEntry(EMERALD_DUST);
        this.getOrCreateBuilder(DUSTS_IRON).addItemEntry(IRON_DUST);
        this.getOrCreateBuilder(DUSTS_LAPIS).addItemEntry(LAPIS_DUST);
        this.getOrCreateBuilder(DUSTS_LEAD).addItemEntry(LEAD_DUST);
        this.getOrCreateBuilder(DUSTS_NICKEL).addItemEntry(NICKEL_DUST);
        this.getOrCreateBuilder(DUSTS_SILVER).addItemEntry(SILVER_DUST);
        this.getOrCreateBuilder(DUSTS_TIN).addItemEntry(TIN_DUST);
        this.getOrCreateBuilder(DUSTS_URANIUM).addItemEntry(URANIUM_DUST);

        this.getOrCreateBuilder(Tags.Items.NUGGETS).addTags(
                NUGGETS_ALUMINIUM,
                NUGGETS_ALUMINUM,
                NUGGETS_COAL,
                NUGGETS_COPPER,
                NUGGETS_DIAMOND,
                NUGGETS_EMERALD,
                NUGGETS_LAPIS,
                NUGGETS_LEAD,
                NUGGETS_NICKEL,
                NUGGETS_REDSTONE,
                NUGGETS_SILVER,
                NUGGETS_TIN,
                NUGGETS_URANIUM
        );
        this.getOrCreateBuilder(NUGGETS_ALUMINIUM).addItemEntry(ALUMINIUM_NUGGET);
        this.getOrCreateBuilder(NUGGETS_ALUMINUM).addTags(NUGGETS_ALUMINIUM); // Reference to NUGGETS_ALUMINIUM
        this.getOrCreateBuilder(NUGGETS_COAL).addItemEntry(COAL_NUGGET);
        this.getOrCreateBuilder(NUGGETS_COPPER).addItemEntry(COPPER_NUGGET);
        this.getOrCreateBuilder(NUGGETS_DIAMOND).addItemEntry(DIAMOND_NUGGET);
        this.getOrCreateBuilder(NUGGETS_EMERALD).addItemEntry(EMERALD_NUGGET);
        this.getOrCreateBuilder(NUGGETS_LAPIS).addItemEntry(LAPIS_NUGGET);
        this.getOrCreateBuilder(NUGGETS_LEAD).addItemEntry(LEAD_NUGGET);
        this.getOrCreateBuilder(NUGGETS_NICKEL).addItemEntry(NICKEL_NUGGET);
        this.getOrCreateBuilder(NUGGETS_REDSTONE).addItemEntry(REDSTONE_NUGGET);
        this.getOrCreateBuilder(NUGGETS_SILVER).addItemEntry(SILVER_NUGGET);
        this.getOrCreateBuilder(NUGGETS_TIN).addItemEntry(TIN_NUGGET);
        this.getOrCreateBuilder(NUGGETS_URANIUM).addItemEntry(URANIUM_NUGGET);

        this.getOrCreateBuilder(Tags.Items.INGOTS).addTags(
                INGOTS_ALUMINIUM,
                INGOTS_ALUMINUM,
                INGOTS_LEAD,
                INGOTS_NICKEL,
                INGOTS_SILVER,
                INGOTS_TIN,
                INGOTS_URANIUM
        );
        this.getOrCreateBuilder(INGOTS_ALUMINIUM).addItemEntry(ALUMINIUM_INGOT);
        this.getOrCreateBuilder(INGOTS_ALUMINUM).addTags(INGOTS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.getOrCreateBuilder(INGOTS_LEAD).addItemEntry(LEAD_INGOT);
        this.getOrCreateBuilder(INGOTS_NICKEL).addItemEntry(NICKEL_INGOT);
        this.getOrCreateBuilder(INGOTS_SILVER).addItemEntry(SILVER_INGOT);
        this.getOrCreateBuilder(INGOTS_TIN).addItemEntry(TIN_INGOT);
        this.getOrCreateBuilder(INGOTS_URANIUM).addItemEntry(URANIUM_INGOT);

        this.getOrCreateBuilder(RAWS).addTags(
                RAWS_ALUMINIUM,
                RAWS_ALUMINUM,
                RAWS_LEAD,
                RAWS_NICKEL,
                RAWS_SILVER,
                RAWS_TIN,
                RAWS_URANIUM
        );
        this.getOrCreateBuilder(RAWS_ALUMINIUM).addItemEntry(RAW_ALUMINIUM);
        this.getOrCreateBuilder(RAWS_ALUMINUM).addTags(RAWS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.getOrCreateBuilder(RAWS_LEAD).addItemEntry(RAW_LEAD);
        this.getOrCreateBuilder(RAWS_NICKEL).addItemEntry(RAW_NICKEL);
        this.getOrCreateBuilder(RAWS_SILVER).addItemEntry(RAW_SILVER);
        this.getOrCreateBuilder(RAWS_TIN).addItemEntry(RAW_TIN);
        this.getOrCreateBuilder(RAWS_URANIUM).addItemEntry(RAW_URANIUM);
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Items Tags";
    }
}
