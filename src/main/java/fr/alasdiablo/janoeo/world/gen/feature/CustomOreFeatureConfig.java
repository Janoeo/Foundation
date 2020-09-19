package fr.alasdiablo.janoeo.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class CustomOreFeatureConfig implements IFeatureConfig {
    public final CustomFillerBlockType target;
    public final int size;
    public final BlockState state;

    public CustomOreFeatureConfig(CustomFillerBlockType target, BlockState state, int size) {
        this.size = size;
        this.state = state;
        this.target = target;
    }

    @Override
    public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
        return new Dynamic<>(ops,
                ops.createMap(ImmutableMap.of(
                        ops.createString("size"), ops.createInt(this.size),
                        ops.createString("target"), ops.createString(this.target.getName()),
                        ops.createString("state"), BlockState.serialize(ops, this.state).getValue()
                        )
                )
        );
    }

    public static CustomOreFeatureConfig deserialize(Dynamic<?> in) {
        int i = in.get("size").asInt(0);
        CustomFillerBlockType fillerblocktype = CustomFillerBlockType.byName(in.get("target").asString(""));
        BlockState blockstate = in.get("state").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
        return new CustomOreFeatureConfig(fillerblocktype, blockstate, i);
    }
}
