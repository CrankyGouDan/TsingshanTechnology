package io.gitee.crankygoudan.tsingshantechnology.items.mobs;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

public class QingShanRT {

    public static io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType QSWP= new io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType (new NamespacedKey( TsingshanTechnology.getInstance(), "qsmob_drop"),
            new CustomItemStack(Material.NETHERITE_SWORD, Y.colorPseudorandomString ("青山世界："), Y.colorPseudorandomString ( "前往青山世界查看！")));
}
