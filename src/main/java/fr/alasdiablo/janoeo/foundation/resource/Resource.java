package fr.alasdiablo.janoeo.foundation.resource;

import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static fr.alasdiablo.janoeo.foundation.resource.ResourceType.*;

public enum Resource {
    Wooden("wooden", Gear),
    Coal("coal", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust),
    Aluminium("bauxite", "aluminium", MaterialColor.METAL, ALL_ORE_WITH_ITEM),
    Copper("copper", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust, Gear, Rod),
    Tin("tin", MaterialColor.METAL, ALL),
    Iron("iron", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Dust, Gear, Rod),
    Lead("lead", MaterialColor.COLOR_GRAY, ALL_ORE_WITH_ITEM),
    Nickel("nickel", MaterialColor.METAL, ALL_ORE_WITH_ITEM),
    Silver("silver", MaterialColor.SNOW, ALL),
    Lapis("lapis", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust),
    Gold("gold", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Dust, Gear, Rod),
    Uranium("uranium", MaterialColor.COLOR_YELLOW, ALL_ORE_WITH_ITEM),
    Amethyst("amethyst", Dust),
    Diamond("diamond", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust, Gear, Rod),
    Emerald("emerald", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust),
    RedStone("redstone", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust);

    private final String oreName;
    private final String resourceName;
    private final MaterialColor materialColor;
    private final List<ResourceType> types;

    Resource(String oreName, String resourceName, MaterialColor materialColor, ResourceType... types) {
        this.resourceName = resourceName;
        this.oreName = oreName;
        this.materialColor = materialColor;
        this.types = List.of(types);
    }

    Resource(String name, MaterialColor materialColor, ResourceType... types) {
        this(name, name, materialColor, types);
    }

    Resource(String oreName, String resourceName, ResourceType... types) {
        this(oreName, resourceName, null, types);
    }

    Resource(String name, ResourceType... types) {
        this(name, name, types);
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
}
