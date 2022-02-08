package me.kacpersdev.api.config;

import me.kacpersdev.Venom;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigFile {

    private final Venom venom = new Venom();

    public void createConfig(File file, FileConfiguration configuration, String dir){

        if (!(file.exists())) {
            file.getParentFile().mkdir();
            venom.saveResource(dir, false);
        }

        try {
            configuration.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
