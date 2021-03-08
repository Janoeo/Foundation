package fr.alasdiablo.janoeo.foundation.entity;

import fr.alasdiablo.janoeo.foundation.init.FoundationEntities;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.init.FoundationParticles;
import fr.alasdiablo.janoeo.foundation.tags.ItemsTags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class GeodeEntity extends ProjectileItemEntity {

    public GeodeEntity(EntityType<? extends GeodeEntity> p_i50159_1_, World p_i50159_2_) {
        super(p_i50159_1_, p_i50159_2_);
    }

    public GeodeEntity(World worldIn, LivingEntity throwerIn) {
        super(FoundationEntities.GEODE_ENTITY, throwerIn, worldIn);
    }

    public GeodeEntity(World worldIn, double x, double y, double z) {
        super(FoundationEntities.GEODE_ENTITY, x, y, z, worldIn);
    }

    @Override
    protected Item getDefaultItem() {
        return FoundationItems.GEODE_ITEM;
    }

    @OnlyIn(Dist.CLIENT)
    private IParticleData makeParticle() {
        ItemStack itemstack = this.func_213882_k();
        return itemstack.isEmpty() ? FoundationParticles.GEODE : new ItemParticleData(ParticleTypes.ITEM, itemstack);
    }

    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 3) {
            IParticleData iparticledata = this.makeParticle();
            for (int i = 0; i < 8; ++i) {
                this.world.addParticle(iparticledata, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    protected void onEntityHit(EntityRayTraceResult p_213868_1_) {
        super.onEntityHit(p_213868_1_);
        Entity entity = p_213868_1_.getEntity();
        entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.func_234616_v_()), 2f);
    }

    protected void onImpact(RayTraceResult result) {
        super.onImpact(result);
        if (!this.world.isRemote) {
            this.world.setEntityState(this, (byte) 3);
            this.spawnDrop(world);
            this.remove();
        }
    }

    private void spawnDrop(World worldIn) {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            Item item = ItemsTags.Gems.GEMS.getRandomElement(random);
            ItemStack stack = new ItemStack(item);
            stack.setCount(random.nextInt(3));
            ItemEntity itementity = new ItemEntity(worldIn, this.getPosX(), this.getPosY(), this.getPosZ(), stack);
            itementity.setDefaultPickupDelay();
            worldIn.addEntity(itementity);
        }
    }

}
