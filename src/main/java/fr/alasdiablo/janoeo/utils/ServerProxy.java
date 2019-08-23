package fr.alasdiablo.janoeo.utils;

import net.minecraft.world.World;

/**
 * server side proxy
 */
public class ServerProxy implements IProxy {

    /**
     * init function
     */
    @Override
    public void init() {
    }

    /**
     * function for get the client world (not use)
     * @return World
     */
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on client!");
    }
}
