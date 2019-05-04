package eu.Chaos_Lab.mc.sleeptime;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println("SLEEPTIME: START");

        registerEvents();
    }

    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new SchlafHandler(), this);
    }

    @Override
    public void onDisable(){
        System.out.println("SLEEPTIME: STOP");
    }

}
