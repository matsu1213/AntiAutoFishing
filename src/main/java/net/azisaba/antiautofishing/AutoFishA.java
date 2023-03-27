package net.azisaba.antiautofishing;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class AutoFishA extends Check{

    private final Player player;

    private long lastFished = 0;

    private boolean moved = false;
    private int buffer = 0;

    AutoFishA(Player player){
        this.player = player;
        lastFished = System.currentTimeMillis();
    }

    public void onMove(PlayerMoveEvent e){
        moved = true;
    }

    public void onFish(PlayerFishEvent e){

        if(e.getState() == PlayerFishEvent.State.FISHING) {
            if (moved) {
                moved = false;
                buffer = 0;
            } else {
                buffer++;
                if (buffer >= 4) {
                    e.setCancelled(true);
                }
            }
        }
    }

}
