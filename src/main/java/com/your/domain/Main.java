package com.your.domain;

import org.bukkit.plugin.java.JavaPlugin;
import com.your.domain.cmds.*;
import com.your.domain.listeners.*;

public class Main extends JavaPlugin {

    public Main() {
    }
    @Override
    public void onEnable() {
        // Register hello world command
        this.getCommand("helloworld").setExecutor(new helloWorld());
        // Register chat listener
        getServer().getPluginManager().registerEvents(new chatListener(), this);
        // load the config if u have one
        loadConfig();
    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
