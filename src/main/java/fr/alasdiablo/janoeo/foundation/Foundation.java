package fr.alasdiablo.janoeo.foundation;

import fr.alasdiablo.diolib.gui.GroundItemGroup;
import fr.alasdiablo.janoeo.foundation.data.FoundationBlockTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.FoundationItemModelProvider;
import fr.alasdiablo.janoeo.foundation.data.FoundationItemTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.FoundationRecipeProvider;
import fr.alasdiablo.janoeo.foundation.data.language.EnglishProvider;
import fr.alasdiablo.janoeo.foundation.data.language.FrenchProvider;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Registries.MOD_ID)
public class Foundation {

    public static final Logger logger = LogManager.getLogger(Registries.MOD_ID);

    public static final ItemGroup ITEMS_GROUP = new GroundItemGroup("janoeo.foundation.item") {
        @Override public ItemStack createIcon() {
            return new ItemStack(Items.COAL);
        }
    };

    public static final ItemGroup BLOCKS_GROUP = new GroundItemGroup("janoeo.foundation.block") {
        @Override public ItemStack createIcon() {
            return new ItemStack(Blocks.COAL_BLOCK);
        }
    };

    public static class Compact {
        public static boolean CREATE = false;
        public static boolean JUST_ENOUGH_RESOURCES = false;
    }

    private void foundCompact() {
        final ModList modList = ModList.get();
        Compact.CREATE = modList.isLoaded("create");
        Compact.JUST_ENOUGH_RESOURCES = modList.isLoaded("jeresources");
    }

    public Foundation() {
        this.foundCompact();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::setup);
        modBus.addListener(this::gatherData);
        modBus.addListener(this::initFeatures);
        modBus.addGenericListener(Block.class, FoundationBlocks::init);
        modBus.addGenericListener(Item.class, FoundationItems::init);
    }

    private void gatherData(GatherDataEvent event) {
        Foundation.logger.debug("Start data generator");
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        Foundation.logger.debug("Add Item Model Provider");
        generator.addProvider(new FoundationItemModelProvider(generator, existingFileHelper));

        Foundation.logger.debug("Add Language Provider");
        generator.addProvider(new EnglishProvider(generator));
        generator.addProvider(new FrenchProvider(generator));

        Foundation.logger.debug("Add Tags Provider");
        final FoundationBlockTagsProvider blockTagsProvider = new FoundationBlockTagsProvider(generator, existingFileHelper);
        generator.addProvider(blockTagsProvider);
        generator.addProvider(new FoundationItemTagsProvider(generator, blockTagsProvider, existingFileHelper));

        Foundation.logger.debug("Add Recipes Provider");
        generator.addProvider(new FoundationRecipeProvider(generator));
    }

    private void setup(final FMLCommonSetupEvent commonSetupEvent) {
    }

    private void initFeatures(RegistryEvent.NewRegistry newRegistry) {
    }
}
