package fr.alasdiablo.janoeo.foundation.resource;

import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static fr.alasdiablo.janoeo.foundation.resource.ResourceType.*;

public enum Resource {
    Wooden("wooden", Gear),
    Copper("copper", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Nugget, Dust, Gear, Rod),
    Tin("tin", MaterialColor.METAL, ResourceType.values()),
    Iron("iron", TinyStoneOre, TinyDeepSlate, NetherOre, GravelOre, Dust, Gear, Rod),
    ;
    private final String name;
    private final MaterialColor materialColor;
    private final List<ResourceType> types;

    Resource(String name, MaterialColor materialColor, ResourceType... types) {
        this.name = name;
        this.materialColor = materialColor;
        this.types = List.of(types);
    }

    Resource(String name, ResourceType... types) {
        this(name, null, types);
    }

    public boolean has(ResourceType type) {
        return this.types.contains(type);
    }

    public @NotNull String getName(ResourceType type) {
        if (!has(type)) throw new IllegalStateException("This resource don't have the asked ressource type");
        return type.format(this.name);
    }

    public @Nullable MaterialColor getMaterialColor() {
        return materialColor;
    }
}
