package io.gitee.crankygoudan.tsingshantechnology.items.mobs;


import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;

import io.gitee.crankygoudan.tsingshantechnology.items.mobs.mobspeizhi.ShenHuaJiangShi;
import io.gitee.crankygoudan.tsingshantechnology.utils.Cs;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public final class ItemSetup {
    private ItemSetup() {}

    public static void init() {


        boolean customMobs = TsingshanTechnology.getInstance().getConfig().getBoolean("custom-mobs");





        if (customMobs) {
            new CustomMobSpawnEgg(Cs.QS_SHSW_XG, "SHEN_HUA_JIANG_SHI", MobsZhuCe.SHEN_HUA_JIANG_SHI_DAN, RecipeType.NULL, new ItemStack[]{
                    null, null, null,
                    null, null, null,
                    null, null, null
                    }).register( TsingshanTechnology.getInstance());

            new ShenHuaJiangShi ();
        } else {
            Cs.QS_SHSW.removeSubGroup(Cs.QS_SHSW_XG);
        }
    }
}

