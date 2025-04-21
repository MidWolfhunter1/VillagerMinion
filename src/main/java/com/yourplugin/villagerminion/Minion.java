package com.yourplugin.villagerminion;

import org.bukkit.Location;

public abstract class Minion {
    protected final String id;
    protected Location location;

    public Minion(String id, Location location) {
        this.id = id;
        this.location = location;
    }

    public abstract void performTask();
    public abstract void showOptionsGUI();
}
