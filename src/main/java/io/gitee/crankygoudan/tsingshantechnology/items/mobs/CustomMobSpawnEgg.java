package io.gitee.crankygoudan.tsingshantechnology.items.mobs;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class CustomMobSpawnEgg extends SimpleSlimefunItem<ItemUseHandler> {

    String id;
    SlimefunItemStack slimefunItem;

    @ParametersAreNonnullByDefault
    public CustomMobSpawnEgg(SubItemGroup itemGroup, String id, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        this.id = id;
        this.slimefunItem = item;
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            e.cancel();
            Player p = e.getPlayer();
            if (Slimefun.getProtectionManager().hasPermission(e.getPlayer(), p.getLocation(), Interaction.ATTACK_PLAYER)) {
                ItemStack item = SlimefunUtils.isItemSimilar(p.getInventory().getItemInMainHand(), slimefunItem, false, false) ? p.getInventory().getItemInMainHand() : p.getInventory().getItemInOffHand();
                item.setAmount(item.getAmount() - 1);
                CustomMob.getByID(id).spawn(e.getPlayer().getLocation());
            }
        };
    }
}
