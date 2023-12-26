package ir.compe.thefly;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandInfo implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {

        sender.sendMessage(ChatColor.GREEN + "You Are Using CoCoolEvents Version 1.8 By CompeDevs");
        sender.sendMessage(ChatColor.BLUE + "Enjoy This Plugin");

        return false;
    }
}