package io.gitee.crankygoudan.tsingshantechnology;


import com.google.common.base.Suppliers;

import io.gitee.crankygoudan.tsingshantechnology.items.mobs.CustomBoss;
import io.gitee.crankygoudan.tsingshantechnology.items.mobs.*;
import io.gitee.crankygoudan.tsingshantechnology.items.mobs.MobTicker;
import io.gitee.crankygoudan.tsingshantechnology.utils.S;
import io.github.mooy1.infinitylib.common.Scheduler;
import io.github.mooy1.infinitylib.core.AbstractAddon;


import lombok.SneakyThrows;

import org.bukkit.inventory.ItemStack;

import java.io.File;


public final class TsingshanTechnology extends AbstractAddon {
    private static TsingshanTechnology instance;


    public String folderPath;



    public TsingshanTechnology() {
        super ( "yitoudaidai", "TsingshanTechnology", "master", "options.auto-update" );
    }

    @Override
    @SneakyThrows
    public void enable() {
        instance = this;
        //armor

        ItemSetup.init ();
        this.folderPath = getDataFolder().getAbsolutePath() + File.separator + "data-storage" + File.separator;


        if (getConfig().getBoolean("custom-mobs")) {
            Scheduler.repeat(2, new MobTicker ());
        }

        // S item
        S.setup(this);
    }


    @SneakyThrows
    @Override
    public void disable() {

        if (getConfig().getBoolean("scustom-mobs")) {
            CustomBoss.removeBossBars();

            instance = null;
        }
    }


    public static TsingshanTechnology getInstance() {
        return instance;
    }

}
