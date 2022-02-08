package me.kacpersdev.listener;

import me.kacpersdev.Venom;
import me.kacpersdev.api.inventory.VenomInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {

    private final VenomInventory venomInventory = new VenomInventory();
    private final Venom venom = new Venom();

    @EventHandler
    public void onClick(InventoryClickEvent event){

        if (event.getInventory().getTitle().equalsIgnoreCase(venom.getCC().translate(venomInventory.getInventoryName()))){
            if (venomInventory.isCanTakeItems()) {
                event.setCancelled(true);
            }
        }
    }
}
