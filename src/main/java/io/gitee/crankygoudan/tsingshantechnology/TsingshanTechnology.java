package io.gitee.crankygoudan.tsingshantechnology;


import io.gitee.crankygoudan.tsingshantechnology.items.chucun.StorageSaveFix;
import io.gitee.crankygoudan.tsingshantechnology.items.mobs.CustomBoss;
import io.gitee.crankygoudan.tsingshantechnology.items.mobs.ItemSetup;
import io.gitee.crankygoudan.tsingshantechnology.items.mobs.MobTicker;
import io.gitee.crankygoudan.tsingshantechnology.utils.S;
import io.github.mooy1.infinitylib.common.Scheduler;
import io.github.mooy1.infinitylib.core.AbstractAddon;

import lombok.SneakyThrows;


public final class TsingshanTechnology extends AbstractAddon {
    private static TsingshanTechnology instance;





    public TsingshanTechnology() {
        super ( "yitoudaidai", "TsingshanTechnology", "master","options.auto-update");
        StorageSaveFix.fixStuff(getLogger());
    }

    @Override
    @SneakyThrows
    public void enable() {

        getLogger().info("⊙≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈⊙");
        getLogger().info("‖yi‖                  ⊂ヽ(　^ω^)つ^ω^)つ                ‖一‖");
        getLogger().info("‖tou‖                    ＼ 　《作／者》／                 ‖头‖");
        getLogger().info("‖dai‖                     ( ＿_フ( ＿_フ                  ‖呆‖");
        getLogger().info("‖dai‖　                    (／　　(／                     ‖呆‖");
        getLogger().info("⊙≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈⊙");
        getLogger().info("⊙未经本人允许加载擅自宣传-发现我将停止所用权⊙");


        instance = this;
        //armor

        ItemSetup.init ();



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
