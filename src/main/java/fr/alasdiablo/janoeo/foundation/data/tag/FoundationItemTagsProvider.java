package fr.alasdiablo.janoeo.foundation.data.tag;

import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationTags;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Items.*;

@MethodsReturnNonnullByDefault
@SuppressWarnings("unchecked")
public class FoundationItemTagsProvider extends ItemTagsProvider {

    public FoundationItemTagsProvider(
            DataGenerator dataGenerator, BlockTagsProvider blockTagProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
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

        this.copy(FoundationTags.Blocks.ORES_TINY_ALUMINIUM, ORES_TINY_ALUMINIUM);
        this.copy(FoundationTags.Blocks.ORES_TINY_ALUMINUM, ORES_TINY_ALUMINUM);
        this.copy(FoundationTags.Blocks.ORES_TINY_LEAD, ORES_TINY_LEAD);
        this.copy(FoundationTags.Blocks.ORES_TINY_NICKEL, ORES_TINY_NICKEL);
        this.copy(FoundationTags.Blocks.ORES_TINY_SILVER, ORES_TINY_SILVER);
        this.copy(FoundationTags.Blocks.ORES_TINY_TIN, ORES_TINY_TIN);
        this.copy(FoundationTags.Blocks.ORES_TINY_URANIUM, ORES_TINY_URANIUM);

        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_ALUMINIUM, STORAGE_BLOCKS_ALUMINIUM);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_ALUMINUM, STORAGE_BLOCKS_ALUMINUM);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_LEAD, STORAGE_BLOCKS_LEAD);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_NICKEL, STORAGE_BLOCKS_NICKEL);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_SILVER, STORAGE_BLOCKS_SILVER);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_TIN, STORAGE_BLOCKS_TIN);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_URANIUM, STORAGE_BLOCKS_URANIUM);

        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_ALUMINIUM, STORAGE_BLOCKS_RAW_ALUMINIUM);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_ALUMINUM, STORAGE_BLOCKS_RAW_ALUMINUM);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_LEAD, STORAGE_BLOCKS_RAW_LEAD);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_NICKEL, STORAGE_BLOCKS_RAW_NICKEL);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_SILVER, STORAGE_BLOCKS_RAW_SILVER);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_TIN, STORAGE_BLOCKS_RAW_TIN);
        this.copy(FoundationTags.Blocks.STORAGE_BLOCKS_RAW_URANIUM, STORAGE_BLOCKS_RAW_URANIUM);

        this.copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);
        this.copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        this.copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        this.copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        this.copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        this.copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        this.copy(Tags.Blocks.ORES_COPPER, Tags.Items.ORES_COPPER);


        this.copy(FoundationTags.Blocks.ORES_TINY, ORES_TINY);

        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);

        this.copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);


        this.tag(Tags.Items.RODS).addTags(RODS_COPPER, RODS_DIAMOND, RODS_GOLD, RODS_IRON, RODS_SILVER, RODS_TIN);

        this.tag(RODS_COPPER).add(COPPER_STICK);
        this.tag(RODS_DIAMOND).add(DIAMOND_STICK);
        this.tag(RODS_GOLD).add(GOLD_STICK);
        this.tag(RODS_IRON).add(IRON_STICK);
        this.tag(RODS_SILVER).add(SILVER_STICK);
        this.tag(RODS_TIN).add(TIN_STICK);

        this.tag(GEARS).addTags(GEARS_COPPER, GEARS_DIAMOND, GEARS_GOLD, GEARS_IRON, GEARS_SILVER, GEARS_TIN, GEARS_WOODEN);

        this.tag(GEARS_COPPER).add(COPPER_GEAR);
        this.tag(GEARS_DIAMOND).add(DIAMOND_GEAR);
        this.tag(GEARS_GOLD).add(GOLD_GEAR);
        this.tag(GEARS_IRON).add(IRON_GEAR);
        this.tag(GEARS_SILVER).add(SILVER_GEAR);
        this.tag(GEARS_TIN).add(TIN_GEAR);
        this.tag(GEARS_WOODEN).add(WOODEN_GEAR);

        this.tag(Tags.Items.DUSTS)
                .addTags(DUSTS_ALUMINIUM, DUSTS_ALUMINUM, DUSTS_AMETHYST, DUSTS_COAL, DUSTS_COPPER, DUSTS_DIAMOND, DUSTS_GOLD, DUSTS_EMERALD, DUSTS_IRON,
                         DUSTS_LAPIS, DUSTS_LEAD, DUSTS_NICKEL, DUSTS_SILVER, DUSTS_TIN, DUSTS_URANIUM
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

        this.tag(Tags.Items.NUGGETS)
                .addTags(NUGGETS_ALUMINIUM, NUGGETS_ALUMINUM, NUGGETS_COAL, NUGGETS_COPPER, NUGGETS_DIAMOND, NUGGETS_EMERALD, NUGGETS_LAPIS, NUGGETS_LEAD,
                         NUGGETS_NICKEL, NUGGETS_REDSTONE, NUGGETS_SILVER, NUGGETS_TIN, NUGGETS_URANIUM
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

        this.tag(Tags.Items.INGOTS).addTags(INGOTS_ALUMINIUM, INGOTS_ALUMINUM, INGOTS_LEAD, INGOTS_NICKEL, INGOTS_SILVER, INGOTS_TIN, INGOTS_URANIUM);

        this.tag(INGOTS_ALUMINIUM).add(ALUMINIUM_INGOT);
        this.tag(INGOTS_ALUMINUM).addTags(INGOTS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.tag(INGOTS_LEAD).add(LEAD_INGOT);
        this.tag(INGOTS_NICKEL).add(NICKEL_INGOT);
        this.tag(INGOTS_SILVER).add(SILVER_INGOT);
        this.tag(INGOTS_TIN).add(TIN_INGOT);
        this.tag(INGOTS_URANIUM).add(URANIUM_INGOT);
        this.tag(INGOTS_COPPER).add(Items.COPPER_INGOT);

        this.tag(Tags.Items.RAW_MATERIALS).addTags(
                RAW_MATERIALS_ALUMINIUM, RAW_MATERIALS_ALUMINUM, RAW_MATERIALS_LEAD, RAW_MATERIALS_NICKEL, RAW_MATERIALS_SILVER, RAW_MATERIALS_TIN,
                RAW_MATERIALS_URANIUM
        );

        this.tag(RAW_MATERIALS_ALUMINIUM).add(RAW_ALUMINIUM);
        this.tag(RAW_MATERIALS_ALUMINUM).addTags(RAW_MATERIALS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.tag(RAW_MATERIALS_LEAD).add(RAW_LEAD);
        this.tag(RAW_MATERIALS_NICKEL).add(RAW_NICKEL);
        this.tag(RAW_MATERIALS_SILVER).add(RAW_SILVER);
        this.tag(RAW_MATERIALS_TIN).add(RAW_TIN);
        this.tag(RAW_MATERIALS_URANIUM).add(RAW_URANIUM);

        this.tag(FoundationTags.Items.SCRAP).add(FoundationItems.SCRAP);
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Items Tags";
    }
}
