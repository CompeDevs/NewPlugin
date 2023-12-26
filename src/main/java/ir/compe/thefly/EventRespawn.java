package ir.compe.thefly;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;

public class EventRespawn implements Listener {

    @EventHandler
    public void onEvent(PlayerRespawnEvent event) {

        Player player = (Player) event.getPlayer();

        player.sendMessage(ChatColor.GREEN + "You Have Respanwned!");

    }

}