package me.kacpersdev;

import me.kacpersdev.api.API;
import me.kacpersdev.api.config.ConfigFile;
import me.kacpersdev.api.inventory.VenomInventory;
import me.kacpersdev.chatcolor.CC;
import me.kacpersdev.listener.InventoryClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Venom extends JavaPlugin {

    private static Venom INSTANCE;
    private ConfigFile configFile;
    private VenomInventory venomInventory;
    private API api;
    private CC cc;

    @Override
    public void onEnable() {
        INSTANCE = this;
        this.pluginListeners();


    }

    public static Venom getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void onDisable() {

    }

    private void pluginListeners(){

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new InventoryClick(), this);
    }

    public ConfigFile getConfigFile(){
        return this.configFile;
    }

    public VenomInventory getVenomInventory(){
        return this.venomInventory;
    }

    public CC getCC(){
        return this.cc;
    }

    public API getApi(){ return this.api; }
}
