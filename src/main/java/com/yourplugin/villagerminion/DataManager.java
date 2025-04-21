package com.yourplugin.villagerminion;

public class DataManager {
    private final VillagerMinionPlugin plugin;

    public DataManager(VillagerMinionPlugin plugin) {
        this.plugin = plugin;
    }

    public void loadMinions() {
        // TODO: Load persisted minion data
    }

    public void saveMinions() {
        // TODO: Save minion data on shutdown
    }
}
