package com.vcazan.allaboard;

import java.util.logging.Logger;

import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleListener;

public class CartLeave extends VehicleListener  {
	
	public static AllAboard plugin;
    Logger log = Logger.getLogger("Minecraft");

	public CartLeave(AllAboard instance) {
		plugin = instance;
	}

	public void onVehicleExit(VehicleExitEvent event){
		event.getVehicle().remove();
	}

}