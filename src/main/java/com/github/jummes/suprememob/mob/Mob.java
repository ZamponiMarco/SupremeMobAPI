package com.github.jummes.suprememob.mob;

import com.github.jummes.supremeitem.action.source.Source;
import com.github.jummes.suprememob.SupremeMob;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

public abstract class Mob {

    public abstract Entity spawn(Location l, int level, Source source);

    public abstract ItemStack getGUIItem();

    public abstract String getName();

    public abstract EntityType getType();

    public static Mob fromEntity(Entity e) {
        return null;
    }

    public static boolean isMob(Entity e) {
        return false;
    }

    public static int getLevel(Entity e) {
        return 0;
    }

}
