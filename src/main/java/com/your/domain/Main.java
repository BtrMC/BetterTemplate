package com.your.domain;

import org.bukkit.plugin.java.JavaPlugin;
import com.your.domain.cmds.*;

public class Main extends JavaPlugin {

    public Main() {
    }
    @Override
    public void onEnable() {
        this.getCommand("helloworld").setExecutor(new helloWorld());
        // getServer().getPluginManager().registerEvents(new evtListenerClass(), this);
        loadConfig();

    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
