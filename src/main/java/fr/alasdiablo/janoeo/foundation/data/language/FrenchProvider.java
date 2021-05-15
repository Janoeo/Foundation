package fr.alasdiablo.janoeo.foundation.data.language;

import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.data.LanguageProvider;

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

        this.add(COPPER_NUGGET, "Pépite de cuivre");

        this.add(((TranslationTextComponent) Foundation.ITEMS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Objets");
        this.add(((TranslationTextComponent)Foundation.BLOCKS_GROUP.getGroupName()).getKey(), "Janoeo Foundation - Bloques");
    }
}
