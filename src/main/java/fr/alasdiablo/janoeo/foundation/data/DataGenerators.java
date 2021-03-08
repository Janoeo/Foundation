package fr.alasdiablo.janoeo.foundation.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import fr.alasdiablo.diolib.data.DioAdvancementProvider;
import fr.alasdiablo.diolib.data.DioLootTableProvider;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.data.advancements.FoundationAdvancements;
import fr.alasdiablo.janoeo.foundation.data.compat.create.CrushingRecipeCompat;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.loot.LootParameterSets;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import java.io.IOException;

/**
 * Data generator event handler
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("unused")
public class DataGenerators {

    /**
     * Handle the data event
     *
     * @param event Instance of the event
     */
    @SubscribeEvent
    public static void gatherDate(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new CraftRecipes(generator));
        generator.addProvider(new SmeltingBlastingRecipes(generator));
        generator.addProvider(new DioLootTableProvider(generator, ImmutableList.of(Pair.of(ModBlockLootTable::new, LootParameterSets.BLOCK)), LootParameterSets.BLOCK, "Janoeo"));
        generator.addProvider(new DioAdvancementProvider(generator, ImmutableList.of(new FoundationAdvancements())));

        if (Foundation.Compact.CREATE) {
            generator.addProvider(new IDataProvider() {
                @Override
                public void act(DirectoryCache cache) throws IOException {
                    new CrushingRecipeCompat(generator).act(cache);
                }

                @Override
                public String getName() {
                    return "Janoeo - Create Compatibility Patch";
                }
            });
        }
    }
}
