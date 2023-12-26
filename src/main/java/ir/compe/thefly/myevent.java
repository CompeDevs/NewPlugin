package ir.compe.thefly;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;

public class myevent implements Listener {

    @EventHandler
    public void onEvent(PlayerRespawnEvent event) {

        Player player = (Player) event.getPlayer();

        player.sendMessage(ChatColor.GREEN + "You Have Respanwned!");

    }
    @EventHandler
    public void onEvent(PlayerDeathEvent death) {

        Player player = (Player) death.getPlayer();

        player.sendMessage(ChatColor.GREEN + "You Have Go To Death R.I.P");

    }
    @EventHandler
    public void onEvent(PlayerKickEvent kick) {

        Player player = (Player) kick.getPlayer();

        player.sendMessage(ChatColor.GREEN + "player Kicked !");

    }
    @EventHandler
    public void onEvent(PlayerJoinEvent join) {

        Player player = (Player) join.getPlayer();

        player.sendMessage(ChatColor.BLUE + "Welcome Back To Our Server");

    }
    @EventHandler
    public void onEvent(PlayerCommandSendEvent command) {

        Player player = (Player) command.getPlayer();

        player.sendMessage(ChatColor.BLUE + "You Have Excuted A Command");

    }
    @EventHandler
    public void onEvent(PlayerBedLeaveEvent bedleave) {

        Player player = (Player) bedleave.getPlayer();

        player.sendMessage(ChatColor.BLUE + "You Got Leave your Bed");

    }
    @EventHandler
    public void onEvent(PlayerBedEnterEvent bedlay) {

        Player player = (Player) bedlay.getPlayer();

        player.sendMessage(ChatColor.GREEN + "You Have Go To Sleep");

    }

    @EventHandler
    public void onEvent(PlayerEditBookEvent EditBook) {

        Player player = (Player) EditBook.getPlayer();

        player.sendMessage(ChatColor.BLUE + "You Have Edited A Book");

    }

    @EventHandler
    public void onEvent(PlayerChangedWorldEvent world) {

        Player player = (Player) world.getPlayer();

        player.sendMessage(ChatColor.BLUE + "You Have Switched To Another World");

    }

    @EventHandler
    public void onEvent(PlayerDropItemEvent drop) {

        Player player = (Player) drop.getPlayer();

        player.sendMessage(ChatColor.BLUE + "You Have Dropped A Item");

    }


}
