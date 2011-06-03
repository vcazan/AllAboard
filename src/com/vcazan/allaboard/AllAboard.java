package com.vcazan.allaboard;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AllAboard extends JavaPlugin {
	
    private final CartListener cartListener = new CartListener(this);
    private final CartLeave cartLeave = new CartLeave(this);

    Logger log = Logger.getLogger("Minecraft");
    
    
    public void onEnable(){
		log.info("AllAboard v0.01 has loaded.");

    	PluginManager pm = this.getServer().getPluginManager();
	    pm.registerEvent(Event.Type.VEHICLE_EXIT, cartLeave, Event.Priority.Normal,this);

	    pm.registerEvent(Event.Type.VEHICLE_COLLISION_ENTITY, cartListener, Event.Priority.Normal,this);

    }
    
    public void onDisable(){
		log.info("AllAboard has unloaded.");

	}
    
}