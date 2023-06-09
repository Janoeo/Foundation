package fr.alasdiablo.janoeo.foundation;

import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.data.loot.FoundationLootTableProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationBlockModelProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationBlockStateProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationItemModelProvider;
import fr.alasdiablo.janoeo.foundation.data.recipe.FoundationRecipeProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationBiomeTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationBlockTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationItemTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.world.FoundationBiomeModifierProvider;
import fr.alasdiablo.janoeo.foundation.data.world.FoundationWorldGenProvider;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationCreativeTabs;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@Mod(Foundation.MOD_ID)
@MethodsReturnNonnullByDefault
public class Foundation {

    public static final String MOD_ID = "janoeo_foundation";

    public static final Logger logger = LogManager.getLogger(Foundation.MOD_ID);

    public Foundation() {
        FoundationConfig.init();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        FoundationItems.init(modBus);
        FoundationBlocks.init(modBus);
        FoundationCreativeTabs.init(modBus);

        modBus.addListener(this::gatherData);
    }

    public void gatherData(@NotNull GatherDataEvent event) {
        Foundation.logger.debug("Start data generator");
        final DataGenerator                            generator          = event.getGenerator();
        final PackOutput                               output             = generator.getPackOutput();
        final CompletableFuture<HolderLookup.Provider> lookup             = event.getLookupProvider();
        final ExistingFileHelper                       existingFileHelper = event.getExistingFileHelper();

        Foundation.logger.debug("Add Block Model Provider");
        generator.addProvider(event.includeClient(), new FoundationBlockModelProvider(output, existingFileHelper));

        Foundation.logger.debug("Add Block State Provider");
        generator.addProvider(event.includeClient(), new FoundationBlockStateProvider(output));

        Foundation.logger.debug("Add Item Model Provider");
        generator.addProvider(event.includeClient(), new FoundationItemModelProvider(output, existingFileHelper));

        Foundation.logger.debug("Add Tags Provider");
        final FoundationBlockTagsProvider blockTagsProvider = new FoundationBlockTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new FoundationItemTagsProvider(output, lookup, blockTagsProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new FoundationBiomeTagsProvider(output, lookup, existingFileHelper));

        Foundation.logger.debug("Add Recipes Provider");
        generator.addProvider(event.includeServer(), new FoundationRecipeProvider(output));

        Foundation.logger.debug("Add Loot Tables Provider");
        generator.addProvider(event.includeServer(), new FoundationLootTableProvider(output));

        Foundation.logger.debug("Add Feature Provider");
        generator.addProvider(event.includeServer(), new FoundationWorldGenProvider(output, lookup));

        Foundation.logger.debug("Add Biome Modifier Provider");
        generator.addProvider(event.includeServer(), new FoundationBiomeModifierProvider(output));
    }
}
