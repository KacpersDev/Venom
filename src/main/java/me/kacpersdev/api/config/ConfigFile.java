package me.kacpersdev.api.config;

import me.kacpersdev.Venom;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigFile {

    private final Venom venom = new Venom();
    private File file;
    private FileConfiguration configuration;

    public void createConfig(File file, FileConfiguration configuration, String dir){

        this.file = file;
        this.configuration = configuration;

        if (!(file.exists())) {
            file.getParentFile().mkdir();

        }

        try {
            configuration.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void save(){

        try {
            configuration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(){

        try {
            configuration.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public String getString(String path){
        return this.configuration.getString(path);
    }
}
