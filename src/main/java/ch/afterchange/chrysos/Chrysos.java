package ch.afterchange.chrysos;

import org.bukkit.plugin.java.JavaPlugin;

public class Chrysos extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Chrysos has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Chrysos has been disabled!");
    }
}
