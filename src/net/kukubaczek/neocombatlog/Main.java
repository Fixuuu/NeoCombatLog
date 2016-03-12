package net.kukubaczek.neocombatlog;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.kukubaczek.neocombatlog.listeners.*;
import net.kukubaczek.neocombatlog.walka.CommandWalka;

public class Main extends JavaPlugin {
	
	public static int logoutTime = 20;
	public static String version;
	
	public static boolean deathKick = true;
	public static boolean deathLogout = true;
	
	public void onEnable(){
		log("-=- Rozpoczynanie ladowania... -=-");
		
		log("Ladowanie konfiguracji...");
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
		
        version = this.getDescription().getVersion();
        
		log("Ladowanie listenerów...");
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new LoginListener(), this);
        
		if(deathLogout) pm.registerEvents(new QuitListener(), this);
		if(deathKick) pm.registerEvents(new KickListener(), this);
		
		log("Ladowanie komend...");
		getCommand("walka").setExecutor(new CommandWalka());
		
		log("-=- Dziekujemy za korzystanie z pluginów grupy Neo -=-");
	}
	
	public void onDisable(){
		
	}

	public void log(String msg){
		System.out.print("[NeoCombatLog] " + msg);
	}
	
}
