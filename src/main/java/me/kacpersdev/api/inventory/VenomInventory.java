package me.kacpersdev.api.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class VenomInventory {

    private String name;
    private int size;
    private boolean canTakeItems;

    public void createInventory(Player player, Inventory inventory,String title, int size, boolean canTakeItems){
        this.name = title;
        this.size = size;
        this.canTakeItems = canTakeItems;

        inventory = Bukkit.createInventory(player, size, title);

        player.openInventory(inventory);
    }

    public String getInventoryName(){
        return this.name;
    }

    public Integer getInventorySize(){
        return this.size;
    }

    public boolean isCanTakeItems(){
        return this.canTakeItems;
    }
}
