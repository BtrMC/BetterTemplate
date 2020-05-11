package com.your.domain.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.your.domain.Util;

public class helloWorld implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        // Uses our Util class to send messages quicker and also uses Util.cColor to be able to use & for colors in chat!
        Util.sendPl(p, Util.cColor("&cHello, world!"));
        return true;
    }
}
