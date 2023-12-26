package ir.compe.thefly;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandJoke implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {

        sender.sendMessage(ChatColor.RED + "Coming Soon !");
        sender.sendMessage(ChatColor.GREEN + "Please Help Me In Discord");

        return false;
    }
}