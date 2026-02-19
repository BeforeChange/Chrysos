package ch.afterchange.elegance;

import org.bukkit.plugin.java.JavaPlugin;

public class Elegance extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Elegance has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Elegance has been disabled!");
    }
}
