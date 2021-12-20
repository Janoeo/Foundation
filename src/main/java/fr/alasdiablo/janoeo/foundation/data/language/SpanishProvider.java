package fr.alasdiablo.janoeo.foundation.data.language;

import fr.alasdiablo.diolib.data.SimpleUnicode;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

public class SpanishProvider extends LanguageProvider {
    public SpanishProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "es_es");
    }

    @Override
    protected void addTranslations() {
        this.add(ALUMINIUM_DUST, SimpleUnicode.encodeOf("Polvo de aluminio"));
        this.add(AMETHYST_DUST, SimpleUnicode.encodeOf("Polvo de amatista"));
        this.add(COAL_DUST, SimpleUnicode.encodeOf("Polvo de carbón"));
        this.add(COPPER_DUST, SimpleUnicode.encodeOf("Polvo de cobre"));
        this.add(DIAMOND_DUST, SimpleUnicode.encodeOf("Polvo de diamante"));
        this.add(EMERALD_DUST, SimpleUnicode.encodeOf("Polvo de esmeralda"));
        this.add(GOLD_DUST, SimpleUnicode.encodeOf("Polvo de oro"));
        this.add(IRON_DUST, SimpleUnicode.encodeOf("Polvo de hierro"));
        this.add(LAPIS_DUST, SimpleUnicode.encodeOf("Polvo de lapislázuli"));
        this.add(LEAD_DUST, SimpleUnicode.encodeOf("Polvo de plomo"));
        this.add(NICKEL_DUST, SimpleUnicode.encodeOf("Polvo de níquel"));
        this.add(SILVER_DUST, SimpleUnicode.encodeOf("Polvo de plata"));
        this.add(TIN_DUST, SimpleUnicode.encodeOf("Polvo de estaño"));
        this.add(URANIUM_DUST, SimpleUnicode.encodeOf("Polvo de uranio"));

        this.add(ALUMINIUM_NUGGET, SimpleUnicode.encodeOf("Pepita de aluminio"));
        this.add(COAL_NUGGET, SimpleUnicode.encodeOf("Trozo de carbón"));
        this.add(COPPER_NUGGET, SimpleUnicode.encodeOf("Pepita de cobre"));
        this.add(DIAMOND_NUGGET, SimpleUnicode.encodeOf("Brillo de diamante"));
        this.add(EMERALD_NUGGET, SimpleUnicode.encodeOf("Brillo de esmeralda"));
        this.add(LAPIS_NUGGET, SimpleUnicode.encodeOf("Fragmento de lapislázuli"));
        this.add(LEAD_NUGGET, SimpleUnicode.encodeOf("Pepita de plomo"));
        this.add(NICKEL_NUGGET, SimpleUnicode.encodeOf("Pepita de níquel"));
        this.add(REDSTONE_NUGGET, SimpleUnicode.encodeOf("Pila pequeña de redstone"));
        this.add(SILVER_NUGGET, SimpleUnicode.encodeOf("Pepita de plata"));
        this.add(TIN_NUGGET, SimpleUnicode.encodeOf("Pepita de estaño"));
        this.add(URANIUM_NUGGET, SimpleUnicode.encodeOf("Pepita de uranio"));

        this.add(ALUMINIUM_INGOT, SimpleUnicode.encodeOf("Lingote de aluminio"));
        this.add(LEAD_INGOT, SimpleUnicode.encodeOf("Lingote de plomo"));
        this.add(NICKEL_INGOT, SimpleUnicode.encodeOf("Lingote de níquel"));
        this.add(SILVER_INGOT, SimpleUnicode.encodeOf("Lingote de plata"));
        this.add(TIN_INGOT, SimpleUnicode.encodeOf("Lingote de estaño"));
        this.add(URANIUM_INGOT, SimpleUnicode.encodeOf("Lingote de uranio"));

        this.add(RAW_ALUMINIUM, SimpleUnicode.encodeOf("Aluminio en bruto"));
        this.add(RAW_LEAD, SimpleUnicode.encodeOf("Plomo en bruto"));
        this.add(RAW_NICKEL, SimpleUnicode.encodeOf("Níquel en  bruto"));
        this.add(RAW_SILVER, SimpleUnicode.encodeOf("Plata en bruto"));
        this.add(RAW_TIN, SimpleUnicode.encodeOf("Estaño en bruto"));
        this.add(RAW_URANIUM, SimpleUnicode.encodeOf("Uranio en bruto"));

        this.add(BAUXITE_ORE, SimpleUnicode.encodeOf("Mena de bauxita"));
        this.add(LEAD_ORE, SimpleUnicode.encodeOf("Mena de plomo"));
        this.add(NICKEL_ORE, SimpleUnicode.encodeOf("Mena de níquel"));
        this.add(SILVER_ORE, SimpleUnicode.encodeOf("Mena de plata"));
        this.add(TIN_ORE, SimpleUnicode.encodeOf("Mena de estaño"));
        this.add(URANIUM_ORE, SimpleUnicode.encodeOf("Mena de uranio"));

        this.add(DEEPSLATE_BAUXITE_ORE, SimpleUnicode.encodeOf("Mena de bauxita de las profundidades"));
        this.add(DEEPSLATE_LEAD_ORE, SimpleUnicode.encodeOf("Mena de plomo de las profundidades"));
        this.add(DEEPSLATE_NICKEL_ORE, SimpleUnicode.encodeOf("Mena de níquel de las profundidades"));
        this.add(DEEPSLATE_SILVER_ORE, SimpleUnicode.encodeOf("Mena de plata de las profundidades"));
        this.add(DEEPSLATE_TIN_ORE, SimpleUnicode.encodeOf("Mena de estaño de las profundidades"));
        this.add(DEEPSLATE_URANIUM_ORE, SimpleUnicode.encodeOf("Mena de uranio de las profundidades"));

        this.add(TINY_BAUXITE_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de bauxita"));
        this.add(TINY_LEAD_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de plomo"));
        this.add(TINY_NICKEL_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de níquel"));
        this.add(TINY_SILVER_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de plata"));
        this.add(TINY_TIN_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de estaño"));
        this.add(TINY_URANIUM_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de uranio"));

        this.add(DEEPSLATE_TINY_BAUXITE_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de bauxita de las profundidades"));
        this.add(DEEPSLATE_TINY_LEAD_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de plomo de las profundidades"));
        this.add(DEEPSLATE_TINY_NICKEL_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de níquel de las profundidades"));
        this.add(DEEPSLATE_TINY_SILVER_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de plata de las profundidades"));
        this.add(DEEPSLATE_TINY_TIN_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de estaño de las profundidades"));
        this.add(DEEPSLATE_TINY_URANIUM_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de uranio de las profundidades"));

        this.add(TINY_COAL_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de carbón"));
        this.add(TINY_COPPER_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de cobre"));
        this.add(TINY_DIAMOND_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de diamante"));
        this.add(TINY_EMERALD_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de esmeralda"));
        this.add(TINY_GOLD_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de oro"));
        this.add(TINY_IRON_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de hierro"));
        this.add(TINY_LAPIS_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de lapislázuli"));
        this.add(TINY_REDSTONE_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de redstone"));

        this.add(DEEPSLATE_TINY_COAL_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de carbón de las profundidades"));
        this.add(DEEPSLATE_TINY_COPPER_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de cobre de las profundidades"));
        this.add(DEEPSLATE_TINY_DIAMOND_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de diamante de las profundidades"));
        this.add(DEEPSLATE_TINY_EMERALD_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de esmeralda de las profundidades"));
        this.add(DEEPSLATE_TINY_GOLD_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de oro de las profundidades"));
        this.add(DEEPSLATE_TINY_IRON_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de hierro de las profundidades"));
        this.add(DEEPSLATE_TINY_LAPIS_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de lapislázuli de las profundidades"));
        this.add(DEEPSLATE_TINY_REDSTONE_ORE, SimpleUnicode.encodeOf("Minúsculo mineral de redstone de las profundidades"));

        this.add(
                ((TranslatableComponent) Foundation.ITEMS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Objetos"
        );
        this.add(
                ((TranslatableComponent) Foundation.BLOCKS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Bloques"
        );
    }
}
