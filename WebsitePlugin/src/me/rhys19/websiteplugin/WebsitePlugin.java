package me.rhys19.websiteplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class WebsitePlugin extends JavaPlugin {
	
	public void onEnable(){
		getServer().getLogger().info("WebsitePlugin has been Enabled!");
	}
	
	public void onDisable(){
		getServer().getLogger().info("WebsitePlugin has been Disabled!");
	}
		public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments){
			
			if(command.getName().equalsIgnoreCase("Website")){
				if(sender instanceof Player){
					Player player = (Player) sender;
					sender.sendMessage("Exoticcraft.sytes.net/xenforo/");
					return true;
				} else {
					sender.sendMessage("You must be a player to execute this command!");
					return true;
				}
			}
			
			return false;
	}

}
