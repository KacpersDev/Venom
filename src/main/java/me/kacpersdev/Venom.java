package me.kacpersdev;

import me.kacpersdev.api.API;
import me.kacpersdev.api.config.ConfigFile;
import me.kacpersdev.api.inventory.VenomInventory;
import me.kacpersdev.api.inventory.VenomInventoryItem;
import me.kacpersdev.api.item.VenomItem;
import org.bukkit.plugin.java.JavaPlugin;

public final class Venom extends JavaPlugin {

    private static Venom INSTANCE;
    private ConfigFile configFile;
    private VenomItem venomItem;
    private VenomInventory venomInventory;
    private VenomInventoryItem venomInventoryItem;
    private API api;

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

    public VenomItem getVenomItem(){
        return this.venomItem;
    }

    public VenomInventory getVenomInventory(){
        return this.venomInventory;
    }

    public VenomInventoryItem getVenomInventoryItem(){
        return this.venomInventoryItem;
    }

    public API getApi(){ return this.api; }
}
