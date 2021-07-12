package com.github.jummes.suprememob.manager;

import com.github.jummes.suprememob.mob.Mob;

import java.util.List;

public abstract class MobManager {

    public abstract List<Mob> getMobs();

    public abstract Mob getByName(String name);
}
