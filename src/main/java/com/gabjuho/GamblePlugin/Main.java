package com.gabjuho.GamblePlugin;

import com.gabjuho.GamblePlugin.events.MainEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new MainEvent(),this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[GamblePlugin]: Plugin is enabled!");
    }
    @Override
    public void onDisable()
    {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[GamblePlugin]: Plugin is disabled!");
    }
}
