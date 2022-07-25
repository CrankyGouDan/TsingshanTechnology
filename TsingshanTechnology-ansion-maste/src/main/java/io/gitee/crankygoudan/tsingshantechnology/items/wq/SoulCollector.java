package io.gitee.crankygoudan.tsingshantechnology.items.wq;

import io.gitee.crankygoudan.tsingshantechnology.Items;
import io.github.mooy1.infinitylib.common.Events;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityKillHandler;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class SoulCollector extends SlimefunItem {


    public SoulCollector(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
            super(category, item, type, recipe);}

    @Nonnull
    private EntityKillHandler getEntityKillHandler() {
        return (e, en, p, item) -> {
                int expMultiplier = 10;
                e.setDroppedExp(e.getDroppedExp() * expMultiplier);

        };
    }

    @Override
    public void preRegister() {
        this.addItemHandler(getEntityKillHandler());
    }
}
