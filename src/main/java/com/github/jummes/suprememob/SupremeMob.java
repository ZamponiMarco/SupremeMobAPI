package com.github.jummes.suprememob;

import com.github.jummes.suprememob.manager.MobManager;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class SupremeMob extends JavaPlugin {

    public static SupremeMob getInstance() {
        return getPlugin(SupremeMob.class);
    }

    public abstract MobManager getMobManager();

}
