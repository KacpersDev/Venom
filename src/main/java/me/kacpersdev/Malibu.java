package me.kacpersdev;

import org.bukkit.plugin.java.JavaPlugin;

public final class Malibu extends JavaPlugin {

    private static Malibu INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

    }

    public static Malibu getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void onDisable() {

    }
}
