package ir.compe.thefly;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class EventBedEnter implements Listener {
    @EventHandler
    public void onEvent(PlayerBedEnterEvent bedenter) {

        Player player = (Player) bedenter.getPlayer();

        player.sendMessage(ChatColor.YELLOW + "Respawn Point Set !");

    }
}
