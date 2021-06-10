package fr.alasdiablo.janoeo.foundation.data;

import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationTags;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

@MethodsReturnNonnullByDefault
@SuppressWarnings("unchecked")
public class FoundationItemTagsProvider extends net.minecraft.data.ItemTagsProvider {

    public FoundationItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(Tags.Items.DUSTS).addTags(
                FoundationTags.Items.DUSTS_ALUMINIUM,
                FoundationTags.Items.DUSTS_ALUMINUM,
                FoundationTags.Items.DUSTS_AMETHYST,
                FoundationTags.Items.DUSTS_COAL,
                FoundationTags.Items.DUSTS_COPPER,
                FoundationTags.Items.DUSTS_DIAMOND,
                FoundationTags.Items.DUSTS_GOLD,
                FoundationTags.Items.DUSTS_EMERALD,
                FoundationTags.Items.DUSTS_IRON,
                FoundationTags.Items.DUSTS_LAPIS,
                FoundationTags.Items.DUSTS_LEAD,
                FoundationTags.Items.DUSTS_NICKEL,
                FoundationTags.Items.DUSTS_SILVER,
                FoundationTags.Items.DUSTS_TIN,
                FoundationTags.Items.DUSTS_URANIUM
        );
        getOrCreateBuilder(FoundationTags.Items.DUSTS_ALUMINIUM).addItemEntry(FoundationItems.ALUMINIUM_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_ALUMINUM).addTags(FoundationTags.Items.DUSTS_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        getOrCreateBuilder(FoundationTags.Items.DUSTS_AMETHYST).addItemEntry(FoundationItems.AMETHYST_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_COAL).addItemEntry(FoundationItems.COAL_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_COPPER).addItemEntry(FoundationItems.COPPER_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_DIAMOND).addItemEntry(FoundationItems.DIAMOND_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_GOLD).addItemEntry(FoundationItems.GOLD_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_EMERALD).addItemEntry(FoundationItems.EMERALD_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_IRON).addItemEntry(FoundationItems.IRON_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_LAPIS).addItemEntry(FoundationItems.LAPIS_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_LEAD).addItemEntry(FoundationItems.LEAD_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_NICKEL).addItemEntry(FoundationItems.NICKEL_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_SILVER).addItemEntry(FoundationItems.SILVER_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_TIN).addItemEntry(FoundationItems.TIN_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_URANIUM).addItemEntry(FoundationItems.URANIUM_DUST);

        getOrCreateBuilder(Tags.Items.NUGGETS).addTags(
                FoundationTags.Items.NUGGETS_ALUMINIUM,
                FoundationTags.Items.NUGGETS_ALUMINUM,
                FoundationTags.Items.NUGGETS_COPPER,
                FoundationTags.Items.NUGGETS_LEAD,
                FoundationTags.Items.NUGGETS_NICKEL,
                FoundationTags.Items.NUGGETS_SILVER,
                FoundationTags.Items.NUGGETS_TIN,
                FoundationTags.Items.NUGGETS_URANIUM
        );
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_ALUMINIUM).addItemEntry(FoundationItems.ALUMINIUM_NUGGET);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_ALUMINUM).addTags(FoundationTags.Items.NUGGETS_ALUMINIUM); // Reference to NUGGETS_ALUMINIUM
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_COPPER).addItemEntry(FoundationItems.COPPER_NUGGET);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_LEAD).addItemEntry(FoundationItems.LEAD_NUGGET);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_NICKEL).addItemEntry(FoundationItems.NICKEL_NUGGET);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_SILVER).addItemEntry(FoundationItems.SILVER_NUGGET);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_TIN).addItemEntry(FoundationItems.TIN_NUGGET);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_URANIUM).addItemEntry(FoundationItems.URANIUM_NUGGET);

        getOrCreateBuilder(Tags.Items.INGOTS).addTags(
                FoundationTags.Items.INGOTS_ALUMINIUM,
                FoundationTags.Items.INGOTS_ALUMINUM,
                FoundationTags.Items.INGOTS_LEAD,
                FoundationTags.Items.INGOTS_NICKEL,
                FoundationTags.Items.INGOTS_SILVER,
                FoundationTags.Items.INGOTS_TIN,
                FoundationTags.Items.INGOTS_URANIUM
        );
        getOrCreateBuilder(FoundationTags.Items.INGOTS_ALUMINIUM).addItemEntry(FoundationItems.ALUMINIUM_INGOT);
        getOrCreateBuilder(FoundationTags.Items.INGOTS_ALUMINUM).addTags(FoundationTags.Items.INGOTS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        getOrCreateBuilder(FoundationTags.Items.INGOTS_LEAD).addItemEntry(FoundationItems.LEAD_INGOT);
        getOrCreateBuilder(FoundationTags.Items.INGOTS_NICKEL).addItemEntry(FoundationItems.NICKEL_INGOT);
        getOrCreateBuilder(FoundationTags.Items.INGOTS_SILVER).addItemEntry(FoundationItems.SILVER_INGOT);
        getOrCreateBuilder(FoundationTags.Items.INGOTS_TIN).addItemEntry(FoundationItems.TIN_INGOT);
        getOrCreateBuilder(FoundationTags.Items.INGOTS_URANIUM).addItemEntry(FoundationItems.URANIUM_INGOT);

        getOrCreateBuilder(FoundationTags.Items.RAWS).addTags(
                FoundationTags.Items.RAWS_ALUMINIUM,
                FoundationTags.Items.RAWS_ALUMINUM,
                FoundationTags.Items.RAWS_LEAD,
                FoundationTags.Items.RAWS_NICKEL,
                FoundationTags.Items.RAWS_SILVER,
                FoundationTags.Items.RAWS_TIN,
                FoundationTags.Items.RAWS_URANIUM
        );
        getOrCreateBuilder(FoundationTags.Items.RAWS_ALUMINIUM).addItemEntry(FoundationItems.RAW_ALUMINIUM);
        getOrCreateBuilder(FoundationTags.Items.RAWS_ALUMINUM).addTags(FoundationTags.Items.RAWS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        getOrCreateBuilder(FoundationTags.Items.RAWS_LEAD).addItemEntry(FoundationItems.RAW_LEAD);
        getOrCreateBuilder(FoundationTags.Items.RAWS_NICKEL).addItemEntry(FoundationItems.RAW_NICKEL);
        getOrCreateBuilder(FoundationTags.Items.RAWS_SILVER).addItemEntry(FoundationItems.RAW_SILVER);
        getOrCreateBuilder(FoundationTags.Items.RAWS_TIN).addItemEntry(FoundationItems.RAW_TIN);
        getOrCreateBuilder(FoundationTags.Items.RAWS_URANIUM).addItemEntry(FoundationItems.RAW_URANIUM);
    }

    @Override
    public String getName() {
        return "Janoeo Items Tags";
    }
}
