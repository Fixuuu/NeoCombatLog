package net.kukubaczek.neocombatlog.utils;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossBarUtil {

	public void test(Player p){
		BossBar bar = Bukkit.createBossBar("Test", BarColor.GREEN, BarStyle.SEGMENTED_12);
		bar.setProgress(50.00);
		bar.addPlayer(p);
	}
	
}
