package me.kacpersdev.api;

import org.bukkit.Bukkit;

public class API {

    public String getServerName(){
        return Bukkit.getServer().getName();
    }

    public boolean isServerWhitelisted(){
        return Bukkit.hasWhitelist();
    }

    public Integer getOnlinePlayers() {
        return Bukkit.getOnlinePlayers().size();
    }

    public Integer getMaxPlayers(){
        return Bukkit.getMaxPlayers();
    }
}
