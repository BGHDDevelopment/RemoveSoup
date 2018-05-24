package me.noodles.soup;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {


    @EventHandler
    public void useSoup(final PlayerInteractEvent e) {
        if (e.getItem() == null) {
            return;
        }
        Player p = e.getPlayer();
        final ItemStack bowl = new ItemStack(Material.BOWL);
        p.getInventory().remove(bowl);

    }

}
