package com.your.domain.listeners;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import com.your.domain.Util;

public class chatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        Util.sendPl(p, Util.cColor("&cYou sent a message!"));
    }
}
