package me.kacpersdev;

import me.kacpersdev.api.API;
import me.kacpersdev.api.config.ConfigFile;
import me.kacpersdev.api.inventory.VenomInventory;
import me.kacpersdev.chatcolor.CC;

public final class Venom {

    private ConfigFile configFile;
    private VenomInventory venomInventory;
    private API api;
    private CC cc;

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
