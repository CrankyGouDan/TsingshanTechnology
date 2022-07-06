package io.gitee.crankygoudan.tsingshantechnology.HuoYun;

import io.gitee.crankygoudan.tsingshantechnology.items;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.ncbpfluffybear.fluffymachines.utils.CancelPlace;
import io.ncbpfluffybear.fluffymachines.utils.Utils;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class Events implements Listener {



    @EventHandler(ignoreCancelled = true)
    public void onExtractionNodePlace(BlockPlaceEvent e) {
        if ((e.getBlock().getY() != e.getBlockAgainst().getY() || e.getBlockAgainst().getType() != Material.ENDER_CHEST)
            && isExtractionNode(e.getItemInHand())) {
            Utils.send(e.getPlayer(), "&c你只能把这个放在末影箱旁边!");
            e.setCancelled(true);
        }
    }


    private boolean isExtractionNode(@Nonnull ItemStack item) {
        SlimefunItem sfItem = SlimefunItem.getByItem(item);

        if (sfItem == null) {
            return false;
        }
        return sfItem.getId().equals( items.ENDER_CHEST_EXTRACTION_NODE_1.getItemId()) || sfItem.getId().equals(items.ENDER_CHEST_INSERTION_NODE_2.getItemId());
    }

    @EventHandler(ignoreCancelled = true)
    private void onCancelPlace(BlockPlaceEvent e) {
        ItemStack item = e.getItemInHand();
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        if (sfItem instanceof CancelPlace) {
            e.setCancelled(true);
        }
    }
}
