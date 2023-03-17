package net.azisaba.antiautofishing;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class JoinQuitListener implements Listener {

    @EventHandler
    public void onQuit(org.bukkit.event.player.PlayerQuitEvent e){
        CheckManager.removePlayer(e.getPlayer());
    }

}
