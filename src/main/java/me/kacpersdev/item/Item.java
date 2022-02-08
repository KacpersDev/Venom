package me.kacpersdev.item;

import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Item {

    private ItemStack item;
    private boolean nameEnabled;
    private String itemName;
    private ArrayList<String> lore;
    private boolean enchantEnabled;
    private boolean loreEnabled;
    private String loreMessage;
    private String enchantByName;
    private int level;

    public void createItem(ItemStack item, boolean nameEnabled, String itemName, boolean loreEnabled, ArrayList<String> lore, String loreMessage, boolean enchantEnabled, String enchantByName, int level){
        this.item = item;
        this.itemName = itemName;
        this.lore = lore;
        this.enchantEnabled = enchantEnabled;
        this.enchantByName = enchantByName;
        this.level = level;
        this.loreMessage = loreMessage;
        this.loreEnabled = loreEnabled;
        this.nameEnabled = nameEnabled;

        ItemMeta meta = item.getItemMeta();
        if (nameEnabled) {
            meta.setDisplayName(itemName);
        }
        if (loreEnabled) {
            lore.add(loreMessage);
            meta.setLore(lore);
        }
        if (enchantEnabled) {
            item.addUnsafeEnchantment(Enchantment.getByName(enchantByName), level);
        }
        item.setItemMeta(meta);

    }

    public void setItem(Player player, int amount, int slot){

        item.setAmount(amount);
        player.getInventory().setItem(slot, item);
    }

    public void giveItem(Player player, int amount){

        item.setAmount(amount);
        player.getInventory().addItem(item);
    }

    public void giveAllItem(int amount){

        item.setAmount(amount);

        for (final Player online : Bukkit.getServer().getOnlinePlayers()) {
            online.getInventory().addItem(item);
        }
    }

    public void setAllItem(int amount, int slot) {

        item.setAmount(amount);
        for (final Player online : Bukkit.getOnlinePlayers()) {
            online.getInventory().setItem(slot, item);
        }
    }

    public void setItemInventory(Inventory inventory, int amount){
        getItem().setAmount(amount);
        inventory.addItem(getItem());
    }

    public void addItemInventory(Inventory inventory, int slot, int amount){
        getItem().setAmount(amount);
        inventory.setItem(slot, getItem());
    }

    public ItemStack getItem() {
        return item;
    }

    public String getItemName() {
        return itemName;
    }

    public ArrayList<String> getLore() {
        return lore;
    }

    public int getLevel() {
        return level;
    }

    public String getEnchantByName() {
        return enchantByName;
    }

    public boolean isEnchant(){
        return this.enchantEnabled;
    }

    public String getLoreMessage(){
        return this.loreMessage;
    }

    public boolean isLoreEnabled(){
        return this.loreEnabled;
    }

    public boolean isEnchantEnabled(){
        return this.enchantEnabled;
    }

    public boolean isNameEnabled(){
        return this.nameEnabled;
    }
}
