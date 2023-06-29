package me.retroedge.globaliagdp;

import me.retroedge.globaliagdp.cmd.gdp.GCmd;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class GlobaliaGDP extends JavaPlugin {

    public static GlobaliaGDP instance;

    public GlobaliaGDP() {
        instance = this;
    }

    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("gdp")).setExecutor(new GCmd());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
