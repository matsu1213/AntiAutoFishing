package net.azisaba.antiautofishing;

import org.bukkit.plugin.java.JavaPlugin;

public final class AntiAutoFishing extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new CheckManager(), this);
        getServer().getPluginManager().registerEvents(new JoinQuitListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
