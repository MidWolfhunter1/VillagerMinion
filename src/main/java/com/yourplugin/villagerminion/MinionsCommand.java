package com.yourplugin.villagerminion;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MinionsCommand implements CommandExecutor {
    private final VillagerMinionPlugin plugin;

    public MinionsCommand(VillagerMinionPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }
        Player player = (Player) sender;
        plugin.getGuiManager().openMainMenu(player);
        return true;
    }
}
