package fr.alasdiablo.janoeo.foundation.data.language;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(ALUMINIUM_DUST, "Aluminium dust");
        this.add(AMETHYST_DUST, "Amethyst dust");
        this.add(COAL_DUST, "Coal dust");
        this.add(COPPER_DUST, "Copper dust");
        this.add(DIAMOND_DUST, "Diamond dust");
        this.add(EMERALD_DUST, "Emerald dust");
        this.add(GOLD_DUST, "Gold dust");
        this.add(IRON_DUST, "Iron dust");
        this.add(LAPIS_DUST, "Lapis dust");
        this.add(LEAD_DUST, "Lead dust");
        this.add(NICKEL_DUST, "Nickel dust");
        this.add(SILVER_DUST, "Silver dust");
        this.add(TIN_DUST, "Tin dust");
        this.add(URANIUM_DUST, "Uranium dust");

        this.add(ALUMINIUM_NUGGET, "Aluminium nugget");
        this.add(COPPER_NUGGET, "Copper nugget");
        this.add(LEAD_NUGGET, "Lead nugget");
        this.add(NICKEL_NUGGET, "Nickel nugget");
        this.add(SILVER_NUGGET, "Silver nugget");
        this.add(TIN_NUGGET, "Tin nugget");
        this.add(URANIUM_NUGGET, "Uranium nugget");

        this.add(ALUMINIUM_INGOT, "Aluminium ingot");
        this.add(LEAD_INGOT, "Lead ingot");
        this.add(NICKEL_INGOT, "Nickel ingot");
        this.add(SILVER_INGOT, "Silver ingot");
        this.add(TIN_INGOT, "Tin ingot");
        this.add(URANIUM_INGOT, "Uranium ingot");

        this.add(RAW_ALUMINIUM, "Raw aluminium");
        this.add(RAW_LEAD, "Raw lead");
        this.add(RAW_NICKEL, "Raw nickel");
        this.add(RAW_SILVER, "Raw silver");
        this.add(RAW_TIN, "Raw Tin");
        this.add(RAW_URANIUM, "Raw uranium");

        this.add(((TranslationTextComponent) Foundation.ITEMS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Items");
        this.add(((TranslationTextComponent) Foundation.BLOCKS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Blocks");
    }
}
