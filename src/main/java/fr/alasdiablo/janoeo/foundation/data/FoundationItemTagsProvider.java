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
    protected void addTags() {
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


        this.tag(Tags.Items.DUSTS).addTags(
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
        this.tag(DUSTS_ALUMINIUM).add(ALUMINIUM_DUST);
        this.tag(DUSTS_ALUMINUM).addTags(DUSTS_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        this.tag(DUSTS_AMETHYST).add(AMETHYST_DUST);
        this.tag(DUSTS_COAL).add(COAL_DUST);
        this.tag(DUSTS_COPPER).add(COPPER_DUST);
        this.tag(DUSTS_DIAMOND).add(DIAMOND_DUST);
        this.tag(DUSTS_GOLD).add(GOLD_DUST);
        this.tag(DUSTS_EMERALD).add(EMERALD_DUST);
        this.tag(DUSTS_IRON).add(IRON_DUST);
        this.tag(DUSTS_LAPIS).add(LAPIS_DUST);
        this.tag(DUSTS_LEAD).add(LEAD_DUST);
        this.tag(DUSTS_NICKEL).add(NICKEL_DUST);
        this.tag(DUSTS_SILVER).add(SILVER_DUST);
        this.tag(DUSTS_TIN).add(TIN_DUST);
        this.tag(DUSTS_URANIUM).add(URANIUM_DUST);

        this.tag(Tags.Items.NUGGETS).addTags(
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
        this.tag(NUGGETS_ALUMINIUM).add(ALUMINIUM_NUGGET);
        this.tag(NUGGETS_ALUMINUM).addTags(NUGGETS_ALUMINIUM); // Reference to NUGGETS_ALUMINIUM
        this.tag(NUGGETS_COAL).add(COAL_NUGGET);
        this.tag(NUGGETS_COPPER).add(COPPER_NUGGET);
        this.tag(NUGGETS_DIAMOND).add(DIAMOND_NUGGET);
        this.tag(NUGGETS_EMERALD).add(EMERALD_NUGGET);
        this.tag(NUGGETS_LAPIS).add(LAPIS_NUGGET);
        this.tag(NUGGETS_LEAD).add(LEAD_NUGGET);
        this.tag(NUGGETS_NICKEL).add(NICKEL_NUGGET);
        this.tag(NUGGETS_REDSTONE).add(REDSTONE_NUGGET);
        this.tag(NUGGETS_SILVER).add(SILVER_NUGGET);
        this.tag(NUGGETS_TIN).add(TIN_NUGGET);
        this.tag(NUGGETS_URANIUM).add(URANIUM_NUGGET);

        this.tag(Tags.Items.INGOTS).addTags(
                INGOTS_ALUMINIUM,
                INGOTS_ALUMINUM,
                INGOTS_LEAD,
                INGOTS_NICKEL,
                INGOTS_SILVER,
                INGOTS_TIN,
                INGOTS_URANIUM
        );
        this.tag(INGOTS_ALUMINIUM).add(ALUMINIUM_INGOT);
        this.tag(INGOTS_ALUMINUM).addTags(INGOTS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.tag(INGOTS_LEAD).add(LEAD_INGOT);
        this.tag(INGOTS_NICKEL).add(NICKEL_INGOT);
        this.tag(INGOTS_SILVER).add(SILVER_INGOT);
        this.tag(INGOTS_TIN).add(TIN_INGOT);
        this.tag(INGOTS_URANIUM).add(URANIUM_INGOT);

        this.tag(RAWS).addTags(
                RAWS_ALUMINIUM,
                RAWS_ALUMINUM,
                RAWS_LEAD,
                RAWS_NICKEL,
                RAWS_SILVER,
                RAWS_TIN,
                RAWS_URANIUM
        );
        this.tag(RAWS_ALUMINIUM).add(RAW_ALUMINIUM);
        this.tag(RAWS_ALUMINUM).addTags(RAWS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.tag(RAWS_LEAD).add(RAW_LEAD);
        this.tag(RAWS_NICKEL).add(RAW_NICKEL);
        this.tag(RAWS_SILVER).add(RAW_SILVER);
        this.tag(RAWS_TIN).add(RAW_TIN);
        this.tag(RAWS_URANIUM).add(RAW_URANIUM);
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Items Tags";
    }
}
