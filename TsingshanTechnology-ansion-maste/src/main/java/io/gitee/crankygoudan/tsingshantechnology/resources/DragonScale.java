package io.gitee.crankygoudan.tsingshantechnology.resources;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.entity.IronGolem;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RandomMobDrop;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class DragonScale extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable, RandomMobDrop {

    private final ItemSetting<Boolean> dropSetting = new ItemSetting<> ( this, "drop-from-dragon", true );
    private final ItemSetting<Integer> chance = new IntRangeSetting ( this, "dragon-drop-chance", 99, 100, 100 );

    @ParametersAreNonnullByDefault
    public DragonScale(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super ( itemGroup, item, recipeType, recipe );

        addItemSetting ( dropSetting );
        addItemSetting ( chance );
    }

    @Override
    public int getMobDropChance() {
        return chance.getValue ();
    }

    public boolean isDroppedFromDragons() {
        return dropSetting.getValue ();
    }

    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }

}