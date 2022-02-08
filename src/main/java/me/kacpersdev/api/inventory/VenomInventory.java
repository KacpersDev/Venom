package me.kacpersdev.api.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class VenomInventory {

    public void createInventory(Player player, Inventory inventory, String title, int size){

        inventory = Bukkit.createInventory(player, size, title);

        player.openInventory(inventory);
    }
}
