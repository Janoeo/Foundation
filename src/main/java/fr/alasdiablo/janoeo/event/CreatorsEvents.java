package fr.alasdiablo.janoeo.event;

import com.google.common.collect.Lists;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Registries.MODID)
public class CreatorsEvents {

    // TODO: Fix firework not spawn on player join

    @SubscribeEvent
    public static void onJoin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerEntity player = event.getPlayer();
        World world = player.world;
        if (player.getName().getString().equals("AlasDiablo")) {
            ItemStack firework = new ItemStack(Items.FIREWORK_ROCKET);
            CompoundNBT rocket = new CompoundNBT();
            CompoundNBT star = new CompoundNBT();
            CompoundNBT fireworkCompound = firework.getOrCreateTag();

            star.putIntArray("Colors", Collections.singletonList(15790320));
            star.putIntArray("FadeColors", Collections.singletonList(11743532));
            star.putBoolean("Flicker", true);
            star.putBoolean("Trail", true);
            star.putInt("Type", 1);
            generateFirework(player, world, firework, rocket, star, fireworkCompound);
        } else if (player.getName().getString().equals("Safyrus")) {
            ItemStack firework = new ItemStack(Items.FIREWORK_ROCKET);
            CompoundNBT rocket = new CompoundNBT();
            CompoundNBT star = new CompoundNBT();
            CompoundNBT fireworkCompound = firework.getOrCreateTag();

            star.putIntArray("Colors", Lists.newArrayList(6719955, 15790320));
            star.putIntArray("FadeColors", Lists.newArrayList(2437522,11250603));
            star.putBoolean("Flicker", true);
            star.putBoolean("Trail", true);
            star.putInt("Type", 2);
            generateFirework(player, world, firework, rocket, star, fireworkCompound);
        }
    }

    private static void generateFirework(PlayerEntity player, World world, ItemStack firework, CompoundNBT rocket, CompoundNBT star, CompoundNBT fireworkCompound) {
        rocket.putInt("Flight", 3);
        rocket.put("Explosions", Arrays.stream(new CompoundNBT[] {star}).collect(Collectors.toCollection(ListNBT::new)));
        fireworkCompound.put("Fireworks", rocket);
        world.addEntity(new FireworkRocketEntity(world, player.prevPosX, player.prevPosY, player.prevPosZ, firework));
    }
}
