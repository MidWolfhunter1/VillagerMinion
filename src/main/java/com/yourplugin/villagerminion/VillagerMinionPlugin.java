package com.yourplugin.villagerminion;

import org.bukkit.plugin.java.JavaPlugin;

public class VillagerMinionPlugin extends JavaPlugin {
    private static VillagerMinionPlugin instance;
    private ConfigManager configManager;
    private DataManager dataManager;
    private GUIManager guiManager;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        this.configManager = new ConfigManager(this);
        this.dataManager = new DataManager(this);
        this.guiManager = new GUIManager(this);

        getCommand("minions").setExecutor(new MinionsCommand(this));
        getServer().getPluginManager().registerEvents(new MinionListener(this), this);
        dataManager.loadMinions();
        getLogger().info("VillagerMinionPlugin enabled!");
    }

    @Override
    public void onDisable() {
        dataManager.saveMinions();
        getLogger().info("VillagerMinionPlugin disabled.");
    }

    public static VillagerMinionPlugin getInstance() {
        return instance;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public DataManager getDataManager() {
        return dataManager;
    }

    public GUIManager getGuiManager() {
        return guiManager;
    }
}
