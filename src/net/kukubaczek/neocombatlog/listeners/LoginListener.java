package net.kukubaczek.neocombatlog.listeners;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener{
	
	@EventHandler
	public void login(PlayerLoginEvent e){
		Player p = e.getPlayer();
		BossBar bar = Bukkit.createBossBar("Test", BarColor.GREEN, BarStyle.SEGMENTED_12);
		bar.setProgress(50.00);
		bar.addPlayer(p);
	}

}
