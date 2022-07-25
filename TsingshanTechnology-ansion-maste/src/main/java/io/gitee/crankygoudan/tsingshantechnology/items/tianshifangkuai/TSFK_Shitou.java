package io.gitee.crankygoudan.tsingshantechnology.items.tianshifangkuai;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.utils.Teshufangkuai;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;


public class TSFK_Shitou extends SimpleSlimefunItem<ItemUseHandler> {
    private static final ArrayList<Block> angelBlockBufferList = new ArrayList<Block>();

    @ParametersAreNonnullByDefault
    public TSFK_Shitou(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }


    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            Player p = e.getPlayer();
            final Location playerLocation = p.getLocation();
            final Location blockLocation = playerLocation;
            blockLocation.setY(blockLocation.getY() - 1);
            Block targetBlock = p.getWorld().getBlockAt(blockLocation);
            if (targetBlock.getType() != Material.AIR) {
                return;
            }
            targetBlock.setType(Material.STONE);
            angelBlockBufferList.add(targetBlock);
            if (p.getInventory().containsAtLeast( Teshufangkuai.QS_TSFK_SHITOU, 1)) {
                p.getInventory().removeItem(Teshufangkuai.QS_TSFK_SHITOU);
                p.updateInventory();
            }
            Bukkit.getScheduler().scheduleSyncDelayedTask( TsingshanTechnology.getInstance(), new Runnable() {
                public void run() {
                    if (targetBlock.getType() == Material.COBBLESTONE) {
                        targetBlock.setType(Material.AIR);
                        p.playSound(playerLocation, Sound.BLOCK_BAMBOO_BREAK, 100, 1);
                        p.playEffect(playerLocation, Effect.ENDER_SIGNAL, null);
                    }
                    angelBlockBufferList.remove(targetBlock);
                }
            }, 200);

        };
    }

    public static void onDisable() {
        for (Block angelBlock : TSFK_Shitou.angelBlockBufferList) {
            angelBlock.setType(Material.AIR);
        }
        TSFK_Shitou.angelBlockBufferList.clear();
    }


}
