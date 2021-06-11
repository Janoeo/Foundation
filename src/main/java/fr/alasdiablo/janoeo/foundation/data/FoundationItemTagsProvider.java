package fr.alasdiablo.janoeo.foundation.data;

import fr.alasdiablo.janoeo.foundation.Registries;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Items.*;

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
        getOrCreateBuilder(Tags.Items.DUSTS).addTags(
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
        getOrCreateBuilder(DUSTS_ALUMINIUM).addItemEntry(ALUMINIUM_DUST);
        getOrCreateBuilder(DUSTS_ALUMINUM).addTags(DUSTS_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        getOrCreateBuilder(DUSTS_AMETHYST).addItemEntry(AMETHYST_DUST);
        getOrCreateBuilder(DUSTS_COAL).addItemEntry(COAL_DUST);
        getOrCreateBuilder(DUSTS_COPPER).addItemEntry(COPPER_DUST);
        getOrCreateBuilder(DUSTS_DIAMOND).addItemEntry(DIAMOND_DUST);
        getOrCreateBuilder(DUSTS_GOLD).addItemEntry(GOLD_DUST);
        getOrCreateBuilder(DUSTS_EMERALD).addItemEntry(EMERALD_DUST);
        getOrCreateBuilder(DUSTS_IRON).addItemEntry(IRON_DUST);
        getOrCreateBuilder(DUSTS_LAPIS).addItemEntry(LAPIS_DUST);
        getOrCreateBuilder(DUSTS_LEAD).addItemEntry(LEAD_DUST);
        getOrCreateBuilder(DUSTS_NICKEL).addItemEntry(NICKEL_DUST);
        getOrCreateBuilder(DUSTS_SILVER).addItemEntry(SILVER_DUST);
        getOrCreateBuilder(DUSTS_TIN).addItemEntry(TIN_DUST);
        getOrCreateBuilder(DUSTS_URANIUM).addItemEntry(URANIUM_DUST);

        getOrCreateBuilder(Tags.Items.NUGGETS).addTags(
                NUGGETS_ALUMINIUM,
                NUGGETS_ALUMINUM,
                NUGGETS_COPPER,
                NUGGETS_LEAD,
                NUGGETS_NICKEL,
                NUGGETS_SILVER,
                NUGGETS_TIN,
                NUGGETS_URANIUM
        );
        getOrCreateBuilder(NUGGETS_ALUMINIUM).addItemEntry(ALUMINIUM_NUGGET);
        getOrCreateBuilder(NUGGETS_ALUMINUM).addTags(NUGGETS_ALUMINIUM); // Reference to NUGGETS_ALUMINIUM
        getOrCreateBuilder(NUGGETS_COPPER).addItemEntry(COPPER_NUGGET);
        getOrCreateBuilder(NUGGETS_LEAD).addItemEntry(LEAD_NUGGET);
        getOrCreateBuilder(NUGGETS_NICKEL).addItemEntry(NICKEL_NUGGET);
        getOrCreateBuilder(NUGGETS_SILVER).addItemEntry(SILVER_NUGGET);
        getOrCreateBuilder(NUGGETS_TIN).addItemEntry(TIN_NUGGET);
        getOrCreateBuilder(NUGGETS_URANIUM).addItemEntry(URANIUM_NUGGET);

        getOrCreateBuilder(Tags.Items.INGOTS).addTags(
                INGOTS_ALUMINIUM,
                INGOTS_ALUMINUM,
                INGOTS_LEAD,
                INGOTS_NICKEL,
                INGOTS_SILVER,
                INGOTS_TIN,
                INGOTS_URANIUM
        );
        getOrCreateBuilder(INGOTS_ALUMINIUM).addItemEntry(ALUMINIUM_INGOT);
        getOrCreateBuilder(INGOTS_ALUMINUM).addTags(INGOTS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        getOrCreateBuilder(INGOTS_LEAD).addItemEntry(LEAD_INGOT);
        getOrCreateBuilder(INGOTS_NICKEL).addItemEntry(NICKEL_INGOT);
        getOrCreateBuilder(INGOTS_SILVER).addItemEntry(SILVER_INGOT);
        getOrCreateBuilder(INGOTS_TIN).addItemEntry(TIN_INGOT);
        getOrCreateBuilder(INGOTS_URANIUM).addItemEntry(URANIUM_INGOT);

        getOrCreateBuilder(RAWS).addTags(
                RAWS_ALUMINIUM,
                RAWS_ALUMINUM,
                RAWS_LEAD,
                RAWS_NICKEL,
                RAWS_SILVER,
                RAWS_TIN,
                RAWS_URANIUM
        );
        getOrCreateBuilder(RAWS_ALUMINIUM).addItemEntry(RAW_ALUMINIUM);
        getOrCreateBuilder(RAWS_ALUMINUM).addTags(RAWS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        getOrCreateBuilder(RAWS_LEAD).addItemEntry(RAW_LEAD);
        getOrCreateBuilder(RAWS_NICKEL).addItemEntry(RAW_NICKEL);
        getOrCreateBuilder(RAWS_SILVER).addItemEntry(RAW_SILVER);
        getOrCreateBuilder(RAWS_TIN).addItemEntry(RAW_TIN);
        getOrCreateBuilder(RAWS_URANIUM).addItemEntry(RAW_URANIUM);
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Items Tags";
    }
}
