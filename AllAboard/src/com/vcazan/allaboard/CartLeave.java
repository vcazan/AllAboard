package com.vcazan.allaboard;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

public class CartLeave implements Listener  {
	
	public static AllAboard plugin;
    Logger log = Logger.getLogger("Minecraft");

	public CartLeave(AllAboard instance) {
		plugin = instance;
	}

	@EventHandler
	public void onVehicleExit(VehicleExitEvent event){
		if (plugin.enabled){
		event.getVehicle().remove();
		}
	}

}