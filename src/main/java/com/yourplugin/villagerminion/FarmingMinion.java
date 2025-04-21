package com.yourplugin.villagerminion;

import org.bukkit.Location;

public class FarmingMinion extends Minion {
    public FarmingMinion(String id, Location loc) {
        super(id, loc);
    }

    @Override
    public void performTask() {
        // TODO: harvest and replant crops, deposit into nearest chest within farmRadius
    }

    @Override
    public void showOptionsGUI() {
        // TODO: Delegate to GUIManager
    }
}
