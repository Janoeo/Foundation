package fr.alasdiablo.janoeo.world.gen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class CustomOreFeatureConfig implements IFeatureConfig {
    public static final Codec<CustomOreFeatureConfig> ORE_FEATURE_CONFIG_CODEC = RecordCodecBuilder.create((oreFeatureConfigInstance) -> oreFeatureConfigInstance.group(
            CustomFillerBlockType.FILLER_BLOCK_TYPE_CODEC.fieldOf("target").forGetter((oreFeatureConfig) -> oreFeatureConfig.target),
            BlockState.field_235877_b_.fieldOf("state").forGetter((oreFeatureConfig) -> oreFeatureConfig.state),
            Codec.INT.fieldOf("size").withDefault(0).forGetter((oreFeatureConfig) -> oreFeatureConfig.size)
    ).apply(oreFeatureConfigInstance, CustomOreFeatureConfig::new));


    public final CustomFillerBlockType target;
    public final int size;
    public final BlockState state;

    public CustomOreFeatureConfig(CustomFillerBlockType target, BlockState state, int size) {
        this.size = size;
        this.state = state;
        this.target = target;
    }
}
