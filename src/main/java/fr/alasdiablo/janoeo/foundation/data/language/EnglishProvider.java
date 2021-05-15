package fr.alasdiablo.janoeo.foundation.data.language;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(AMETHYST_DUST, "Amethyst dust");
        this.add(COAL_DUST, "Coal dust");
        this.add(COPPER_DUST, "Copper dust");
        this.add(DIAMOND_DUST, "Diamond dust");
        this.add(EMERALD_DUST, "Emerald dust");
        this.add(GOLD_DUST, "Gold dust");
        this.add(IRON_DUST, "Iron dust");
        this.add(LAPIS_DUST, "Lapis dust");

        this.add(COPPER_NUGGET, "Copper nugget");

        this.add(((TranslationTextComponent)Foundation.ITEMS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Items");
        this.add(((TranslationTextComponent)Foundation.BLOCKS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Blocks");
    }
}
