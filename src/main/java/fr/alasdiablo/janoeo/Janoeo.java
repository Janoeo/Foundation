package fr.alasdiablo.janoeo;

import fr.alasdiablo.diolib.util.DateRange;
import fr.alasdiablo.janoeo.config.*;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import fr.alasdiablo.janoeo.world.gen.feature.OresFeatures;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

/**
 * Janoeo Main class
 */
@Mod(Registries.MODID)
public class Janoeo {

    public static final Logger logger = LogManager.getLogger(Registries.MODID);

    /**
     * Jannoeo default constructor
     */
    public Janoeo() {
        this.initConfig();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::initFeatures);
    }

    /**
     * Initialized all ConfiguredFeature
     * @param e RegistryEvent (not use in this case)
     */
    private void initFeatures(RegistryEvent.NewRegistry e) {
        OresFeatures.initOverworld();
        OresFeatures.initNether();
        OresFeatures.initGravel();
        OresFeatures.initOceanGravel();
        OresFeatures.initNetherGravel();
        OresFeatures.initNetherBasalt();
        OresFeatures.initTheEnd();
        OresFeatures.initDenseOre();
        OresFeatures.initNetherDenseOre();
    }

    /**
     * Step function use for initialized ore generation
     * @param e FMLCommonSetupEvent (not use in this case)
     */
    private void setup(final FMLCommonSetupEvent e) {
        OreGenUtils.initOreGen();
    }

    /**
     * Function called by Janoeo during mod construction
     */
    private void initConfig() {
        Path configPath = FMLPaths.CONFIGDIR.get();
        this.createConfigDir(Paths.get(configPath.toAbsolutePath().toString(), "janoeo"));
        this.createConfigDir(Paths.get(configPath.toAbsolutePath().toString(), "janoeo/ore"));
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GlobalConfig.CONFIG_SPEC, "janoeo/janoeo.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, NetherConfig.CONFIG_SPEC, "janoeo/ore/nether.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, OverworldConfig.CONFIG_SPEC, "janoeo/ore/overworld.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EndConfig.CONFIG_SPEC, "janoeo/ore/end.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GravelConfig.CONFIG_SPEC, "janoeo/ore/gravel.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FrequencyConfig.CONFIG_SPEC, "janoeo/ore/frequency.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BasaltConfig.CONFIG_SPEC, "janoeo/ore/basalt.toml");
    }

    private void createConfigDir(Path configPath) {
        try {
            Files.createDirectory(configPath);
        } catch (FileAlreadyExistsException ignored) {} catch (IOException e) {
            Janoeo.logger.error("Failed to create Janoeo config directory.", e);
        }
    }
}
