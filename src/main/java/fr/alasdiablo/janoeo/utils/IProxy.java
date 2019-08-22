package fr.alasdiablo.janoeo.utils;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
