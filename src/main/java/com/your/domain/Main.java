package com.your.domain;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public Main() {
    }
    @Override
    public void onEnable() {
        // this.getCommand("cmdname").setExecutor(new cmdclass());
        // getServer().getPluginManager().registerEvents(new evtListenerClass(), this);
        loadConfig();

    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
