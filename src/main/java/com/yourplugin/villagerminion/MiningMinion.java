package com.yourplugin.villagerminion;

import org.bukkit.Location;

public class MiningMinion extends Minion {
    public MiningMinion(String id, Location loc) {
        super(id, loc);
    }

    @Override
    public void performTask() {
        // TODO: break block in front if matches config.miningBlockTypes
    }

    @Override
    public void showOptionsGUI() {
        // TODO: Delegate to GUIManager
    }
}
