package io.gitee.crankygoudan.tsingshantechnology.items.mobs;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class QingShanRT {

    public static io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType QSWP= new io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType (new NamespacedKey( TsingshanTechnology.getInstance(), "qsmob_drop"),
            new CustomItemStack(Material.NETHERITE_SWORD, Y.colorPseudorandomString ("青山世界："), Y.colorPseudorandomString ( "前往青山世界查看！")));
    public static io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType YLL= new io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType (new NamespacedKey( TsingshanTechnology.getInstance(), "1qsmob_drop"),
        new CustomItemStack(Material.BLAST_FURNACE, Y.colorPseudorandomString ("超级冶炼炉"), Y.colorPseudorandomString ( "请前往青山科技查看")));

    public static io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType CXCCJ= new io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType (new NamespacedKey( TsingshanTechnology.getInstance(), "2qsmob_drop"),
        new CustomItemStack(Material.CARTOGRAPHY_TABLE, Y.colorPseudorandomString ("芯片制造机"), Y.colorPseudorandomString ( "请前往青山科技：芯片制造机查看")));
}
