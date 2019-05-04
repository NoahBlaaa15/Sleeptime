package eu.Chaos_Lab.mc.sleeptime;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println("SLEEPTIME: START");
		System.out.println("Sleep goood");
    }

    @Override
    public void onDisable(){
        System.out.println("SLEEPTIME: STOP");
    }

}
