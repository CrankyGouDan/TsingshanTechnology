package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Cs {
    public static NestedItemGroup QS_SHSW = new NestedItemGroup(
        new NamespacedKey ( TsingshanTechnology.getInstance(), "qs_shenhuashengwu"),
        new CustomItemStack ( Material.NETHERITE_SWORD, Y.colorPseudorandomString("青山科技——神话生物"))
    );


    public static SubItemGroup QS_SHSW_XG = new SubItemGroup(
        new NamespacedKey( TsingshanTechnology.getInstance(), "qs_shenhuashengwu_xiaoguai"), QS_SHSW,
        new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode
            ("ed1103c53ed823e4a334d4d50257cbe384e5ccf4c12c1fb8d4b214dbb09391ba")),
            Y.colorPseudorandomString ("神话-小怪")));
}
