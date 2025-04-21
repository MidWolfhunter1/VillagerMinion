package com.yourplugin.villagerminion;

import org.bukkit.entity.Player;

public class GUIManager {
    private final VillagerMinionPlugin plugin;

    public GUIManager(VillagerMinionPlugin plugin) {
        this.plugin = plugin;
    }

    public void openMainMenu(Player player) {
        // TODO: Build and open the main GUI for spawning/managing minions
    }

    public void openMinionOptions(Player player, Minion minion) {
        // TODO: Build and open GUI for a specific minion (upgrade/remove)
    }
}
