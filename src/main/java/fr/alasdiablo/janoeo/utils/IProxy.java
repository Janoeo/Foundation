package fr.alasdiablo.janoeo.utils;

import net.minecraft.world.World;

/**
 * Proxy interface
 */
public interface IProxy {

    /**
     * init function
     */
    void init();

    /**
     * function for get the client world (not use)
     * @return World
     */
    World getClientWorld();
}
