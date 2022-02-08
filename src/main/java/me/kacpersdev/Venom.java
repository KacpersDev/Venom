package me.kacpersdev;

import me.kacpersdev.api.API;
import me.kacpersdev.api.config.ConfigFile;
import me.kacpersdev.api.inventory.VenomInventory;
import me.kacpersdev.item.Item;
import org.bukkit.plugin.java.JavaPlugin;

public final class Venom extends JavaPlugin {

    private static Venom INSTANCE;
    private ConfigFile configFile;
    private VenomInventory venomInventory;
    private API api;
    private Item item;

    @Override
    public void onEnable() {
        INSTANCE = this;

    }

    public static Venom getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void onDisable() {

    }

    public ConfigFile getConfigFile(){
        return this.configFile;
    }

    public VenomInventory getVenomInventory(){
        return this.venomInventory;
    }

    public Item getItem(){
        return this.item;
    }

    public API getApi(){ return this.api; }
}
