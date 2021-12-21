package fr.alasdiablo.janoeo.foundation.data.language;

import fr.alasdiablo.diolib.data.SimpleUnicode;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

public class FrenchProvider extends LanguageProvider {
    public FrenchProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        this.add(ALUMINIUM_DUST, SimpleUnicode.encodeOf("Poussière d'aluminium"));
        this.add(AMETHYST_DUST, SimpleUnicode.encodeOf("Poussière d'améthyste"));
        this.add(COAL_DUST, SimpleUnicode.encodeOf("Poussière de charbon"));
        this.add(COPPER_DUST, SimpleUnicode.encodeOf("Poussière de cuivre "));
        this.add(DIAMOND_DUST, SimpleUnicode.encodeOf("Poussière de diamant"));
        this.add(EMERALD_DUST, SimpleUnicode.encodeOf("Poussière d'émeraude"));
        this.add(GOLD_DUST, SimpleUnicode.encodeOf("Poussière d'or"));
        this.add(IRON_DUST, SimpleUnicode.encodeOf("Poussière de fer"));
        this.add(LAPIS_DUST, SimpleUnicode.encodeOf("Poussière de lapis-lazuli"));
        this.add(LEAD_DUST, SimpleUnicode.encodeOf("Poussière de plomb"));
        this.add(NICKEL_DUST, SimpleUnicode.encodeOf("Poussière de nickel"));
        this.add(SILVER_DUST, SimpleUnicode.encodeOf("Poussière d'argent"));
        this.add(TIN_DUST, SimpleUnicode.encodeOf("Poussière d'étain"));
        this.add(URANIUM_DUST, SimpleUnicode.encodeOf("Poussière d'uranium"));

        this.add(ALUMINIUM_NUGGET, SimpleUnicode.encodeOf("Pépite d'aluminium"));
        this.add(COAL_NUGGET, SimpleUnicode.encodeOf("Morceau de charbon"));
        this.add(COPPER_NUGGET, SimpleUnicode.encodeOf("Pépite de cuivre"));
        this.add(DIAMOND_NUGGET, SimpleUnicode.encodeOf("Éclat de diamant"));
        this.add(EMERALD_NUGGET, SimpleUnicode.encodeOf("Éclat d'émeraude"));
        this.add(LAPIS_NUGGET, SimpleUnicode.encodeOf("Fragment de lapis-lazuli"));
        this.add(LEAD_NUGGET, SimpleUnicode.encodeOf("Pépite de plomb"));
        this.add(NICKEL_NUGGET, SimpleUnicode.encodeOf("Pépite de nickel"));
        this.add(REDSTONE_NUGGET, SimpleUnicode.encodeOf("Petit tas de redstone"));
        this.add(SILVER_NUGGET, SimpleUnicode.encodeOf("Pépite d'argent"));
        this.add(TIN_NUGGET, SimpleUnicode.encodeOf("Pépite d'étain"));
        this.add(URANIUM_NUGGET, SimpleUnicode.encodeOf("Pépite d'uranium"));

        this.add(ALUMINIUM_INGOT, SimpleUnicode.encodeOf("Lingot d'aluminium"));
        this.add(LEAD_INGOT, SimpleUnicode.encodeOf("Lingot de plomb"));
        this.add(NICKEL_INGOT, SimpleUnicode.encodeOf("Lingot de nickel"));
        this.add(SILVER_INGOT, SimpleUnicode.encodeOf("Lingot d'argent"));
        this.add(TIN_INGOT, SimpleUnicode.encodeOf("Lingot d'étain"));
        this.add(URANIUM_INGOT, SimpleUnicode.encodeOf("Lingot d'uranium"));

        this.add(RAW_ALUMINIUM, SimpleUnicode.encodeOf("Aluminium brut"));
        this.add(RAW_LEAD, SimpleUnicode.encodeOf("Plomb brut"));
        this.add(RAW_NICKEL, SimpleUnicode.encodeOf("Nickel brut"));
        this.add(RAW_SILVER, SimpleUnicode.encodeOf("Argent brut"));
        this.add(RAW_TIN, SimpleUnicode.encodeOf("Étain brut"));
        this.add(RAW_URANIUM, SimpleUnicode.encodeOf("Uranium brut"));

        this.add(SCRAP, SimpleUnicode.encodeOf("ferraille"));

        this.add(BAUXITE_ORE, SimpleUnicode.encodeOf("Minerai de bauxite"));
        this.add(LEAD_ORE, SimpleUnicode.encodeOf("Minerai de plomb"));
        this.add(NICKEL_ORE, SimpleUnicode.encodeOf("Minerai de nickel"));
        this.add(SILVER_ORE, SimpleUnicode.encodeOf("Minerai d'argent"));
        this.add(TIN_ORE, SimpleUnicode.encodeOf("Minerai d'étain"));
        this.add(URANIUM_ORE, SimpleUnicode.encodeOf("Minerai d'uranium"));

        this.add(DEEPSLATE_BAUXITE_ORE, SimpleUnicode.encodeOf("Minerai de bauxite des abîmes"));
        this.add(DEEPSLATE_LEAD_ORE, SimpleUnicode.encodeOf("Minerai de plomb des abîmes"));
        this.add(DEEPSLATE_NICKEL_ORE, SimpleUnicode.encodeOf("Minerai de nickel des abîmes"));
        this.add(DEEPSLATE_SILVER_ORE, SimpleUnicode.encodeOf("Minerai d'argent des abîmes"));
        this.add(DEEPSLATE_TIN_ORE, SimpleUnicode.encodeOf("Minerai d'étain des abîmes"));
        this.add(DEEPSLATE_URANIUM_ORE, SimpleUnicode.encodeOf("Minerai d'uranium des abîmes"));

        this.add(TINY_BAUXITE_ORE, SimpleUnicode.encodeOf("Minuscule minerai de bauxite"));
        this.add(TINY_LEAD_ORE, SimpleUnicode.encodeOf("Minuscule minerai de plomb"));
        this.add(TINY_NICKEL_ORE, SimpleUnicode.encodeOf("Minuscule minerai de nickel"));
        this.add(TINY_SILVER_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'argent"));
        this.add(TINY_TIN_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'étain"));
        this.add(TINY_URANIUM_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'uranium"));

        this.add(DEEPSLATE_TINY_BAUXITE_ORE, SimpleUnicode.encodeOf("Minuscule minerai de bauxite des abîmes"));
        this.add(DEEPSLATE_TINY_LEAD_ORE, SimpleUnicode.encodeOf("Minuscule minerai de plomb des abîmes"));
        this.add(DEEPSLATE_TINY_NICKEL_ORE, SimpleUnicode.encodeOf("Minuscule minerai de nickel des abîmes"));
        this.add(DEEPSLATE_TINY_SILVER_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'argent des abîmes"));
        this.add(DEEPSLATE_TINY_TIN_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'étain des abîmes"));
        this.add(DEEPSLATE_TINY_URANIUM_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'uranium des abîmes"));

        this.add(TINY_COAL_ORE, SimpleUnicode.encodeOf("Minuscule minerai de charbon"));
        this.add(TINY_COPPER_ORE, SimpleUnicode.encodeOf("Minuscule minerai de cuivre"));
        this.add(TINY_DIAMOND_ORE, SimpleUnicode.encodeOf("Minuscule minerai de diamant"));
        this.add(TINY_EMERALD_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'émeraude"));
        this.add(TINY_GOLD_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'or"));
        this.add(TINY_IRON_ORE, SimpleUnicode.encodeOf("Minuscule minerai de fer"));
        this.add(TINY_LAPIS_ORE, SimpleUnicode.encodeOf("Minuscule minerai de lapis-lazuli"));
        this.add(TINY_REDSTONE_ORE, SimpleUnicode.encodeOf("Minuscule minerai de redstone"));

        this.add(DEEPSLATE_TINY_COAL_ORE, SimpleUnicode.encodeOf("Minuscule minerai de charbon des abîmes"));
        this.add(DEEPSLATE_TINY_COPPER_ORE, SimpleUnicode.encodeOf("Minuscule minerai de cuivre des abîmes"));
        this.add(DEEPSLATE_TINY_DIAMOND_ORE, SimpleUnicode.encodeOf("Minuscule minerai de diamant des abîmes"));
        this.add(DEEPSLATE_TINY_EMERALD_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'émeraude des abîmes"));
        this.add(DEEPSLATE_TINY_GOLD_ORE, SimpleUnicode.encodeOf("Minuscule minerai d'or des abîmes"));
        this.add(DEEPSLATE_TINY_IRON_ORE, SimpleUnicode.encodeOf("Minuscule minerai de fer des abîmes"));
        this.add(DEEPSLATE_TINY_LAPIS_ORE, SimpleUnicode.encodeOf("Minuscule minerai de lapis-lazuli des abîmes"));
        this.add(DEEPSLATE_TINY_REDSTONE_ORE, SimpleUnicode.encodeOf("Minuscule minerai de redstone des abîmes"));

        this.add(NETHER_COAL_ORE, SimpleUnicode.encodeOf("Minerai de Charbon du Nether"));
        this.add(NETHER_COPPER_ORE, SimpleUnicode.encodeOf("Minerai de cuivre du Nether"));
        this.add(NETHER_DIAMOND_ORE, SimpleUnicode.encodeOf("Minerai de diamant du Nether"));
        this.add(NETHER_EMERALD_ORE, SimpleUnicode.encodeOf("Minerai d'émeraude du Nether"));
        this.add(NETHER_IRON_ORE, SimpleUnicode.encodeOf("Minerai de fer du Nether"));
        this.add(NETHER_LAPIS_ORE, SimpleUnicode.encodeOf("Minerai de lapis-lazuli du Nether"));
        this.add(NETHER_REDSTONE_ORE, SimpleUnicode.encodeOf("Minerai de redstone du Nether"));

        this.add(NETHER_BAUXITE_ORE, SimpleUnicode.encodeOf("Minerai de bauxite du Nether"));
        this.add(NETHER_LEAD_ORE, SimpleUnicode.encodeOf("Minerai de plomb du Nether"));
        this.add(NETHER_NICKEL_ORE, SimpleUnicode.encodeOf("Minerai de nickel du Nether"));
        this.add(NETHER_SILVER_ORE, SimpleUnicode.encodeOf("Minerai d'argent du Nether"));
        this.add(NETHER_TIN_ORE, SimpleUnicode.encodeOf("Minerai d'étain du Nether"));
        this.add(NETHER_URANIUM_ORE, SimpleUnicode.encodeOf("Minerai d'uranium du Nether"));

        this.add(
                ((TranslatableComponent) Foundation.ITEMS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Objets"
        );
        this.add(
                ((TranslatableComponent) Foundation.BLOCKS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Blocs"
        );
    }
}
