package eu.Chaos_Lab.mc.sleeptime;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class SchlafHandler implements Listener {
	
 @EventHandler
 public void OnSleep(PlayerBedLeaveEvent e) {
	 Player p = e.getPlayer();
	 p.sendMessage("Good Morning " + p.getDisplayName()); 
	 
	 Random r = new Random();
	 int ir = r.nextInt(2);
	 switch(ir) {
	 	case 0:
	 			GoodSleep(p);
	 			
	 		break;
	 	case 1:
	 			BadSleep(p);
	 			
	 		break;
	 		
	  

	 }
 }

 public void GoodSleep(Player p) {
	 p.sendMessage("You had a very good night!");
	 p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,2400,1));
 }
 
 public void BadSleep(Player p) {
	 p.sendMessage("You had a very bad night!");
	 p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,2400,1));
 }
	
	

}
