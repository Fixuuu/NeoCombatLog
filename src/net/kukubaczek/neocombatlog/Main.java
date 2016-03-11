package net.kukubaczek.neocombatlog;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.kukubaczek.neocombatlog.listeners.*;

public class Main extends JavaPlugin {
	
	public void onEnable(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new LoginListener(), this);
	}
	
	public void onDisable(){
		
	}

}
