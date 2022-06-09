package fr.alasdiablo.janoeo.foundation.resource;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static fr.alasdiablo.janoeo.foundation.resource.ResourceType.*;

public enum Resource {
    Wooden("wooden", Gear),
    Coal("coal", UniformInts.COMMON, TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Nugget, Dust),
    Aluminium("bauxite", "aluminium", MaterialColor.METAL, UniformInts.COMMON, ALL_ORE_WITH_ITEM),
    Copper("copper", UniformInts.COMMON, TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Nugget, Dust, Gear, Rod),
    Tin("tin", MaterialColor.METAL, UniformInts.COMMON, ALL),
    Iron("iron", UniformInts.COMMON, TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Dust, Gear, Rod),
    Lead("lead", MaterialColor.COLOR_GRAY, UniformInts.COMMON, ALL_ORE_WITH_ITEM),
    Nickel("nickel", MaterialColor.METAL, UniformInts.COMMON, ALL_ORE_WITH_ITEM),
    Silver("silver", MaterialColor.SNOW, UniformInts.UNCOMMON, ALL),
    Lapis("lapis", UniformInts.UNCOMMON, TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Nugget, Dust),
    Gold("gold", UniformInts.UNCOMMON, TinyStoneOre, TinyDeepSlateOre, GravelOre, Dust, Gear, Rod),
    Uranium("uranium", MaterialColor.COLOR_YELLOW, UniformInts.UNCOMMON, ALL_ORE_WITH_ITEM),
    Amethyst("amethyst", Dust),
    Diamond("diamond", UniformInts.RARE, TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Nugget, Dust, Gear, Rod),
    Emerald("emerald", UniformInts.RARE, TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Nugget, Dust),
    RedStone("redstone", TinyStoneOre, TinyDeepSlateOre, NetherOre, GravelOre, Nugget);

    private final String             oreName;
    private final String             resourceName;
    private final MaterialColor      materialColor;
    private final UniformInt         xp;
    private final List<ResourceType> types;

    Resource(String oreName, String resourceName, MaterialColor materialColor, UniformInt xp, ResourceType... types) {
        this.resourceName  = resourceName;
        this.oreName       = oreName;
        this.materialColor = materialColor;
        this.xp            = xp;
        this.types         = List.of(types);
    }

    Resource(String name, MaterialColor materialColor, UniformInt xp, ResourceType... types) {
        this(name, name, materialColor, xp, types);
    }

    Resource(String name, UniformInt xp, ResourceType... types) {
        this(name, name, null, xp, types);
    }

    Resource(String name, ResourceType... types) {
        this(name, name, null, UniformInts.NONE, types);
    }

    public boolean has(ResourceType type) {
        return this.types.contains(type);
    }

    public @NotNull String getName(ResourceType type) {
        if (!has(type)) throw new IllegalStateException("This resource don't have the asked resource type");
        String name = type.isOre() ? this.oreName : this.resourceName;
        return type.format(name);
    }

    public @Nullable MaterialColor getMaterialColor() {
        return materialColor;
    }

    public UniformInt getXp() {
        return xp;
    }
}
