package fr.alasdiablo.janoeo.foundation;

import fr.alasdiablo.janoeo.foundation.config.*;
import fr.alasdiablo.janoeo.foundation.entity.GeodeEntity;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationParticles;
import fr.alasdiablo.janoeo.foundation.particle.FondationBreakingParticle;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import fr.alasdiablo.janoeo.foundation.world.OreGenUtils;
import fr.alasdiablo.janoeo.foundation.world.gen.feature.OresFeatures;
import net.minecraft.block.DispenserBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.dispenser.IPosition;
import net.minecraft.dispenser.ProjectileDispenseBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Janoeo Main class
 */
@Mod(Registries.MODID)
public class Foundation {

    public static final Logger logger = LogManager.getLogger(Registries.MODID);

    public static class Compact {
        public static boolean CREATE = false;
    }

    /**
     * Jannoeo default constructor
     */
    public Foundation() {
        FMLLoader.getLoadingModList().getMods().forEach(modInfo -> {
            if (modInfo.getModId().equals("create")) Compact.CREATE = true;
        });
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
     *
     * @param e FMLCommonSetupEvent (not use in this case)
     */
    private void setup(final FMLCommonSetupEvent e) {
        OreGenUtils.initOreGen();
        this.dispenseItemBehavior();
        this.registerParticleManager();
    }

    private void registerParticleManager() {
        Minecraft minecraft = Minecraft.getInstance();
        ParticleManager particleManager = minecraft.particles;
        particleManager.registerFactory(FoundationParticles.GEODE, new FondationBreakingParticle.GeodeFactory());
    }

    private void dispenseItemBehavior() {
        DispenserBlock.registerDispenseBehavior(FoundationItems.GEODE_ITEM, new ProjectileDispenseBehavior() {
            @Override
            protected ProjectileEntity getProjectileEntity(World worldIn, IPosition position, ItemStack stackIn) {
                return Util.make(new GeodeEntity(worldIn, position.getX(), position.getY(), position.getZ()), (geode) -> {
                    geode.setItem(stackIn);
                });
            }
        });
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

        WorldGenConfig.setup();
    }

    private void createConfigDir(Path configPath) {
        try {
            Files.createDirectory(configPath);
        } catch (FileAlreadyExistsException ignored) {} catch (IOException e) {
            Foundation.logger.error("Failed to create Janoeo config directory.", e);
        }
    }
}
