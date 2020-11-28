package fr.alasdiablo.janoeo.event;

import com.google.gson.Gson;
import fr.alasdiablo.diolib.config.ModConfig;
import fr.alasdiablo.janoeo.Janoeo;
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
import org.apache.logging.log4j.message.FormattedMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Event Handler use of spawn a firework when an contributor(Bug Hunter and Code Writer) of Janoeo Project join a world
 */
@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Registries.MODID)
public class JanoeoContributor {
    /**
     * Function use for handle the event
     *
     * @param event Instance of the event
     */
    @SubscribeEvent
    public static void onJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (ModConfig.DefaultConfig.AUTHOR_LOGGING_EVENT.get()) {
            final PlayerEntity player = event.getPlayer();
            final World world = player.world;
            try {
                if (Arrays.asList(getContributor()).contains(player.getName().getString())) {
                    final CompoundNBT star = new CompoundNBT();
                    star.putIntArray("Colors", Collections.singletonList(4312372));
                    star.putInt("Type", 4);
                    final ItemStack firework = new ItemStack(Items.FIREWORK_ROCKET);
                    final CompoundNBT rocket = new CompoundNBT();
                    final CompoundNBT fireworkCompound = firework.getOrCreateTag();
                    rocket.putInt("Flight", 1);
                    rocket.put("Explosions", Arrays.stream(new CompoundNBT[]{star}).collect(Collectors.toCollection(ListNBT::new)));
                    fireworkCompound.put("Fireworks", rocket);
                    Janoeo.logger.debug(new FormattedMessage("Spawning Contributor[%s] Firework.", player.getName().getString()));
                    world.addEntity(new FireworkRocketEntity(world, player.prevPosX, player.prevPosY, player.prevPosZ, firework));
                }
            } catch (IOException e) {
                Janoeo.logger.error(new FormattedMessage("Error during JanoeoContributor event execution: %s", e.getMessage()));
            }
        }
    }

    private static String[] listOfContributor = null;

    private static String[] getContributor() throws IOException {
        if (listOfContributor != null) return listOfContributor;
        URL oracle = new URL("https://raw.githubusercontent.com/AlasDiablo/JANOEO-Doc/gh-pages/contributor.json");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        StringBuilder jsonStr = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) jsonStr.append(inputLine);
        in.close();
        listOfContributor = new Gson().fromJson(jsonStr.toString(), String[].class);
        for (String s : listOfContributor)
            Janoeo.logger.debug(new FormattedMessage("Contribotor found: %s", s));
        return listOfContributor;
    }
}
