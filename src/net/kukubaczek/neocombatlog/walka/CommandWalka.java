package net.kukubaczek.neocombatlog.walka;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.kukubaczek.neocombatlog.Main;

public class CommandWalka implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage("NeoCombatLog "+Main.version+" by NeoGroup ");
			return true;
		}
		Player p = (Player) sender;
		return true;
	}

}
