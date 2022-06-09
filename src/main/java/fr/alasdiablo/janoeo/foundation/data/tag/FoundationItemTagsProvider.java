package fr.alasdiablo.janoeo.foundation.data.tag;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationTags;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
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
        super(dataGenerator, blockTagProvider, Foundation.MOD_ID, existingFileHelper);
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

        this.tag(RODS_COPPER).add(RODS.get(Resource.Copper).get());
        this.tag(RODS_DIAMOND).add(RODS.get(Resource.Diamond).get());
        this.tag(RODS_GOLD).add(RODS.get(Resource.Gold).get());
        this.tag(RODS_IRON).add(RODS.get(Resource.Iron).get());
        this.tag(RODS_SILVER).add(RODS.get(Resource.Silver).get());
        this.tag(RODS_TIN).add(RODS.get(Resource.Tin).get());

        this.tag(FoundationTags.Items.GEARS).addTags(GEARS_COPPER, GEARS_DIAMOND, GEARS_GOLD, GEARS_IRON, GEARS_SILVER, GEARS_TIN, GEARS_WOODEN);

        this.tag(GEARS_COPPER).add(FoundationItems.GEARS.get(Resource.Copper).get());
        this.tag(GEARS_DIAMOND).add(FoundationItems.GEARS.get(Resource.Diamond).get());
        this.tag(GEARS_GOLD).add(FoundationItems.GEARS.get(Resource.Gold).get());
        this.tag(GEARS_IRON).add(FoundationItems.GEARS.get(Resource.Iron).get());
        this.tag(GEARS_SILVER).add(FoundationItems.GEARS.get(Resource.Silver).get());
        this.tag(GEARS_TIN).add(FoundationItems.GEARS.get(Resource.Tin).get());
        this.tag(GEARS_WOODEN).add(FoundationItems.GEARS.get(Resource.Wooden).get());

        this.tag(Tags.Items.DUSTS)
                .addTags(DUSTS_ALUMINIUM, DUSTS_ALUMINUM, DUSTS_AMETHYST, DUSTS_COAL, DUSTS_COPPER, DUSTS_DIAMOND, DUSTS_GOLD, DUSTS_EMERALD, DUSTS_IRON,
                        DUSTS_LAPIS, DUSTS_LEAD, DUSTS_NICKEL, DUSTS_SILVER, DUSTS_TIN, DUSTS_URANIUM
                );

        this.tag(DUSTS_ALUMINIUM).add(DUSTS.get(Resource.Aluminium).get());
        this.tag(DUSTS_ALUMINUM).addTags(DUSTS_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        this.tag(DUSTS_AMETHYST).add(DUSTS.get(Resource.Amethyst).get());
        this.tag(DUSTS_COAL).add(DUSTS.get(Resource.Coal).get());
        this.tag(DUSTS_COPPER).add(DUSTS.get(Resource.Copper).get());
        this.tag(DUSTS_DIAMOND).add(DUSTS.get(Resource.Diamond).get());
        this.tag(DUSTS_GOLD).add(DUSTS.get(Resource.Gold).get());
        this.tag(DUSTS_EMERALD).add(DUSTS.get(Resource.Emerald).get());
        this.tag(DUSTS_IRON).add(DUSTS.get(Resource.Iron).get());
        this.tag(DUSTS_LAPIS).add(DUSTS.get(Resource.Lapis).get());
        this.tag(DUSTS_LEAD).add(DUSTS.get(Resource.Lead).get());
        this.tag(DUSTS_NICKEL).add(DUSTS.get(Resource.Nickel).get());
        this.tag(DUSTS_SILVER).add(DUSTS.get(Resource.Silver).get());
        this.tag(DUSTS_TIN).add(DUSTS.get(Resource.Tin).get());
        this.tag(DUSTS_URANIUM).add(DUSTS.get(Resource.Uranium).get());

        this.tag(Tags.Items.NUGGETS)
                .addTags(NUGGETS_ALUMINIUM, NUGGETS_ALUMINUM, NUGGETS_COAL, NUGGETS_COPPER, NUGGETS_DIAMOND, NUGGETS_EMERALD, NUGGETS_LAPIS, NUGGETS_LEAD,
                        NUGGETS_NICKEL, NUGGETS_REDSTONE, NUGGETS_SILVER, NUGGETS_TIN, NUGGETS_URANIUM
                );

        this.tag(NUGGETS_ALUMINIUM).add(NUGGETS.get(Resource.Aluminium).get());
        this.tag(NUGGETS_ALUMINUM).addTags(NUGGETS_ALUMINIUM); // Reference to NUGGETS_ALUMINIUM
        this.tag(NUGGETS_COAL).add(NUGGETS.get(Resource.Coal).get());
        this.tag(NUGGETS_COPPER).add(NUGGETS.get(Resource.Copper).get());
        this.tag(NUGGETS_DIAMOND).add(NUGGETS.get(Resource.Diamond).get());
        this.tag(NUGGETS_EMERALD).add(NUGGETS.get(Resource.Emerald).get());
        this.tag(NUGGETS_LAPIS).add(NUGGETS.get(Resource.Lapis).get());
        this.tag(NUGGETS_LEAD).add(NUGGETS.get(Resource.Lead).get());
        this.tag(NUGGETS_NICKEL).add(NUGGETS.get(Resource.Nickel).get());
        this.tag(NUGGETS_REDSTONE).add(NUGGETS.get(Resource.RedStone).get());
        this.tag(NUGGETS_SILVER).add(NUGGETS.get(Resource.Silver).get());
        this.tag(NUGGETS_TIN).add(NUGGETS.get(Resource.Tin).get());
        this.tag(NUGGETS_URANIUM).add(NUGGETS.get(Resource.Uranium).get());

        this.tag(Tags.Items.INGOTS).addTags(INGOTS_ALUMINIUM, INGOTS_ALUMINUM, INGOTS_LEAD, INGOTS_NICKEL, INGOTS_SILVER, INGOTS_TIN, INGOTS_URANIUM);

        this.tag(INGOTS_ALUMINIUM).add(INGOTS.get(Resource.Aluminium).get());
        this.tag(INGOTS_ALUMINUM).addTags(INGOTS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.tag(INGOTS_LEAD).add(INGOTS.get(Resource.Lead).get());
        this.tag(INGOTS_NICKEL).add(INGOTS.get(Resource.Nickel).get());
        this.tag(INGOTS_SILVER).add(INGOTS.get(Resource.Silver).get());
        this.tag(INGOTS_TIN).add(INGOTS.get(Resource.Tin).get());
        this.tag(INGOTS_URANIUM).add(INGOTS.get(Resource.Uranium).get());
        this.tag(INGOTS_COPPER).add(Items.COPPER_INGOT);

        this.tag(Tags.Items.RAW_MATERIALS).addTags(
                RAW_MATERIALS_ALUMINIUM, RAW_MATERIALS_ALUMINUM, RAW_MATERIALS_LEAD, RAW_MATERIALS_NICKEL, RAW_MATERIALS_SILVER, RAW_MATERIALS_TIN,
                RAW_MATERIALS_URANIUM
        );

        this.tag(RAW_MATERIALS_ALUMINIUM).add(RAWS.get(Resource.Aluminium).get());
        this.tag(RAW_MATERIALS_ALUMINUM).addTags(RAW_MATERIALS_ALUMINIUM); // Reference to INGOTS_ALUMINIUM
        this.tag(RAW_MATERIALS_LEAD).add(RAWS.get(Resource.Lead).get());
        this.tag(RAW_MATERIALS_NICKEL).add(RAWS.get(Resource.Nickel).get());
        this.tag(RAW_MATERIALS_SILVER).add(RAWS.get(Resource.Silver).get());
        this.tag(RAW_MATERIALS_TIN).add(RAWS.get(Resource.Tin).get());
        this.tag(RAW_MATERIALS_URANIUM).add(RAWS.get(Resource.Uranium).get());
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Items Tags";
    }
}
