package fr.alasdiablo.janoeo.foundation.data;

import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

@SuppressWarnings("unchecked")
public class FoundationItemTagsProvider extends net.minecraft.data.ItemTagsProvider {

    public FoundationItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(Tags.Items.DUSTS).addTags(
                FoundationTags.Items.DUSTS_AMETHYST,
                FoundationTags.Items.DUSTS_COAL,
                FoundationTags.Items.DUSTS_COPPER,
                FoundationTags.Items.DUSTS_DIAMOND,
                FoundationTags.Items.DUSTS_GOLD,
                FoundationTags.Items.DUSTS_EMERALD,
                FoundationTags.Items.DUSTS_IRON,
                FoundationTags.Items.DUSTS_LAPIS
        );
        getOrCreateBuilder(FoundationTags.Items.DUSTS_AMETHYST).addItemEntry(FoundationItems.AMETHYST_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_COAL).addItemEntry(FoundationItems.COAL_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_COPPER).addItemEntry(FoundationItems.COPPER_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_DIAMOND).addItemEntry(FoundationItems.DIAMOND_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_GOLD).addItemEntry(FoundationItems.GOLD_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_EMERALD).addItemEntry(FoundationItems.EMERALD_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_IRON).addItemEntry(FoundationItems.IRON_DUST);
        getOrCreateBuilder(FoundationTags.Items.DUSTS_LAPIS).addItemEntry(FoundationItems.LAPIS_DUST);

        getOrCreateBuilder(Tags.Items.NUGGETS).addTags(FoundationTags.Items.NUGGETS_COPPER);
        getOrCreateBuilder(FoundationTags.Items.NUGGETS_COPPER).addItemEntry(FoundationItems.COPPER_NUGGET);
    }

    @Override
    public String getName() {
        return "Janoeo Items Tags";
    }
}
