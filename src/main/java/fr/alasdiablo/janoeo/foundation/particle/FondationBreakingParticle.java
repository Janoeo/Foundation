package fr.alasdiablo.janoeo.foundation.particle;

import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.client.particle.BreakingParticle;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FondationBreakingParticle extends BreakingParticle {

    protected FondationBreakingParticle(ClientWorld world, double x, double y, double z, ItemStack stack) {
        super(world, x, y, z, stack);
    }

    @OnlyIn(Dist.CLIENT)
    public static class GeodeFactory implements IParticleFactory<BasicParticleType> {
        public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new FondationBreakingParticle(worldIn, x, y, z, new ItemStack(FoundationItems.GEODE_ITEM));
        }
    }
}
