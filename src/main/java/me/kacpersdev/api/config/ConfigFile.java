package me.kacpersdev.api.config;

import me.kacpersdev.Venom;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigFile {

    public void createConfig(File file, FileConfiguration configuration, String dir){

        if (!(file.exists())) {
            file.getParentFile().mkdir();
            Venom.getINSTANCE().saveResource(dir, false);
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
