package com.yourplugin.villagerminion;

import org.bukkit.Material;
import java.util.List;
import java.util.Map;

public class ConfigManager {
    private final VillagerMinionPlugin plugin;
    public int farmRadius, defaultInventorySize, miningInterval, farmingInterval, hologramDisplayTicks, miningDistance;
    public List<Material> miningBlockTypes, cropBlockTypes;
    public String skinsFolder, defaultSkin;
    public Map<String, String> skinFiles;

    public ConfigManager(VillagerMinionPlugin plugin) {
        this.plugin = plugin;
        loadConfig();
    }

    private void loadConfig() {
        farmRadius = plugin.getConfig().getInt("farmRadius");
        defaultInventorySize = plugin.getConfig().getInt("defaultInventorySize");
        miningInterval = plugin.getConfig().getInt("miningInterval");
        farmingInterval = plugin.getConfig().getInt("farmingInterval");
        hologramDisplayTicks = plugin.getConfig().getInt("hologramDisplayTicks");
        miningDistance = plugin.getConfig().getInt("miningDistance");
        miningBlockTypes = PluginUtils.materialList(plugin.getConfig().getStringList("miningBlockTypes"));
        cropBlockTypes = PluginUtils.materialList(plugin.getConfig().getStringList("cropBlockTypes"));
        skinsFolder = plugin.getConfig().getString("skinsFolder");
        defaultSkin = plugin.getConfig().getString("defaultSkin");
        skinFiles = (Map)plugin.getConfig().getConfigurationSection("skinFiles").getValues(false);
    }
}
