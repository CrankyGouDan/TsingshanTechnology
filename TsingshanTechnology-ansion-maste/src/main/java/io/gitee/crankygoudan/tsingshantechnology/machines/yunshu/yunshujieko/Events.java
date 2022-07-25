package io.gitee.crankygoudan.tsingshantechnology.machines.yunshu.yunshujieko;

import io.gitee.crankygoudan.tsingshantechnology.Items;
import io.gitee.crankygoudan.tsingshantechnology.jieko.Utils;
import io.gitee.crankygoudan.tsingshantechnology.utils.Yunshuzujian;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
        return sfItem.getId().equals( Yunshuzujian.QS_HYZJ_MYXYSJD_1.getItemId()) || sfItem.getId().equals(Yunshuzujian.QS_HYZJ_MYXYSJD_2.getItemId());
    }
}