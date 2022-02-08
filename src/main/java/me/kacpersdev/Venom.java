package me.kacpersdev;

import me.kacpersdev.api.API;
import me.kacpersdev.api.config.ConfigFile;
import me.kacpersdev.api.inventory.VenomInventory;
import me.kacpersdev.chatcolor.CC;

public final class Venom {

    private final ConfigFile configFile = new ConfigFile();
    private final VenomInventory venomInventory = new VenomInventory();
    private final API api = new API();
    private final CC cc = new CC();

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
