package me.Paabl0.essences;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.Paabl0.TypicalPaabl0Plugin.TypicalPabloPlugin;

public final class Essences extends JavaPlugin {

    TypicalPabloPlugin core = (TypicalPabloPlugin) Bukkit.getPluginManager().getPlugin("TypicalPaabl0Plugin");

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
