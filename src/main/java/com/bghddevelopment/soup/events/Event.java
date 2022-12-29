package com.bghddevelopment.soup.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Event implements Listener {

    @EventHandler
    public void useSoup(PlayerInteractEvent event) {
        if (event.getItem() == null) return;
        Player player = event.getPlayer();
        ItemStack bowl = new ItemStack(Material.BOWL);
        player.getInventory().remove(bowl);
    }
}
