package ir.compe.thefly;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EventBedEnter(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded BedEnterEvent");
        getServer().getPluginCommand("CoCoolEvents").setExecutor(new CommandInfo());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded Info Command");
        getServer().getPluginCommand("Joke").setExecutor(new CommandJoke());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded Joke Command");
        getServer().getPluginManager().registerEvents(new EventBedLeave(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded BedLeave Event");
        getServer().getPluginManager().registerEvents(new EventRespawn(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded Respawn Event");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded COCOOLEVENTS 1.8 by CompeDevs");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Disabling All Command And Events");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "COCOOLEVENTS 1.8 Disabled");
    }
}
