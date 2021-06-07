package fr.alasdiablo.janoeo.foundation.data.language;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

public class FrenchProvider extends LanguageProvider {

    public FrenchProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        this.add(AMETHYST_DUST, "Poussière d'améthyste");
        this.add(COAL_DUST, "Poussière de charbon");
        this.add(COPPER_DUST, "Poussière de cuivre ");
        this.add(DIAMOND_DUST, "Poussière de diamant");
        this.add(EMERALD_DUST, "Poussière d'émeraude");
        this.add(GOLD_DUST, "Poussière d'or");
        this.add(IRON_DUST, "Poussière de fer");
        this.add(LAPIS_DUST, "Poussière de lapis");

        this.add(ALUMINIUM_NUGGET, "Pépite d'aluminium");
        this.add(COPPER_NUGGET, "Pépite de cuivre");
        this.add(LEAD_NUGGET, "Pépite de plomp");
        this.add(NICKEL_NUGGET, "Pépite de nickel");
        this.add(SILVER_NUGGET, "Pépite d'argent");
        this.add(TIN_NUGGET, "Pépite d'étain");
        this.add(URANIUM_NUGGET, "Pépite d'uranium");

        this.add(ALUMINIUM_INGOT, "Lingot d'aluminium");
        this.add(LEAD_INGOT, "Lingot de plomp");
        this.add(NICKEL_INGOT, "Lingot de nickel");
        this.add(SILVER_INGOT, "Lingot d'argent");
        this.add(TIN_INGOT, "Lingot d'étain");
        this.add(URANIUM_INGOT, "Lingot d'uranium");

        this.add(((TranslationTextComponent) Foundation.ITEMS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Objets");
        this.add(((TranslationTextComponent) Foundation.BLOCKS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Bloques");
    }
}
