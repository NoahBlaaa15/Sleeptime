package eu.Chaos_Lab.mc.sleeptime;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;


public class SchlafHandler implements Listener {
	
 @EventHandler
 public void OnSleep(PlayerBedLeaveEvent e) {
	 Player p = e.getPlayer();
	 p.sendMessage("Good Morning " + p.getDisplayName()); 
	 
	 Random r = new Random();
	 int ir = r.nextInt(2);
	 p.sendMessage(ir + "");
	 /*switch() {
	  

	 }*/
 }
 
	
	

}
