package fr.alasdiablo.janoeo.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

/**
 * Client side proxy
 */
public class ClientProxy implements IProxy {

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
        return Minecraft.getInstance().world;
    }
}
