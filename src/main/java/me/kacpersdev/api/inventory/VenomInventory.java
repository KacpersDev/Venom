package me.kacpersdev.api.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class VenomInventory {

    private String name;
    private int size;
    private boolean canTakeItems;
    private Inventory inventory;

    public void createInventory(Player player, Inventory inventory,String title, int size, boolean canTakeItems){
        this.name = title;
        this.size = size;
        this.canTakeItems = canTakeItems;
        this.inventory = inventory;

        inventory = Bukkit.createInventory(player, size, title);
    }

    public void openInventory(Player player){

        player.openInventory(getInventory());
    }

    public void addItem(Inventory inventory){
        this.inventory = inventory;

    }

    public void setItem(Inventory inventory, int slot) {
        this.inventory = inventory;

    }

    public void addItem(){}

    public void setItem(){}

    public String getInventoryName(){
        return this.name;
    }

    public Integer getInventorySize(){
        return this.size;
    }

    public boolean isCanTakeItems(){
        return this.canTakeItems;
    }

    public Inventory getInventory(){
        return this.inventory;
    }
}
