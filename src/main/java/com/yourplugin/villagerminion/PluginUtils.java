package com.yourplugin.villagerminion;

import org.bukkit.Material;
import java.util.ArrayList;
import java.util.List;

public class PluginUtils {
    public static List<Material> materialList(List<String> strings) {
        List<Material> materials = new ArrayList<>();
        for (String s : strings) {
            try {
                materials.add(Material.valueOf(s));
            } catch (Exception ignored) {}
        }
        return materials;
    }
}
