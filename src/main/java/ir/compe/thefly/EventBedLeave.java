package ir.compe.thefly;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class EventBedLeave implements Listener {
    @EventHandler
    public void onEvent(PlayerBedLeaveEvent bedleave) {

        Player player = (Player) bedleave.getPlayer();

        player.sendMessage(ChatColor.BLUE + "You Got Leave your Bed");

    }
}
