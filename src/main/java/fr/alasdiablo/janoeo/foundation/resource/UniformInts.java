package fr.alasdiablo.janoeo.foundation.resource;

import net.minecraft.util.valueproviders.UniformInt;

public class UniformInts {
    public static final UniformInt NONE     = UniformInt.of(0, 0);
    public static final UniformInt COMMON   = UniformInt.of(0, 2);
    public static final UniformInt UNCOMMON = UniformInt.of(2, 5);
    public static final UniformInt RARE     = UniformInt.of(3, 7);
}
