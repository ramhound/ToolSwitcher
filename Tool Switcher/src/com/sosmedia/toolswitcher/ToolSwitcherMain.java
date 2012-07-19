package com.sosmedia.toolswitcher;
import org.bukkit.plugin.java.JavaPlugin;


public class ToolSwitcherMain extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new ClickListener(), this);
		
	}
	@Override
	public void onDisable() {

	}
}
 