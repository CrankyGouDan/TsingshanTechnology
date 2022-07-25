package io.gitee.crankygoudan.tsingshantechnology;


import io.gitee.crankygoudan.tsingshantechnology.machines.Moban.Ceishi;
import io.gitee.crankygoudan.tsingshantechnology.machines.generators.Generators;
import io.gitee.crankygoudan.tsingshantechnology.utils.*;

public class Setup {
    public static void setup(TsingshanTechnology qs) {
        // Category
        Categories.setup ( qs );
        Items.setup ( qs );
        Gongzuoxiang.setup ( qs );
        Wupin.setup ( qs );
        Yunshuzujian.setup ( qs );
        Gongju.setup ( qs );
        Baofaqi.setup ( qs );
        Teshufangkuai.setup ( qs );
        Fumoshi.setup ( qs );
        Jiqi.setup ( qs );
        Fadianji.setup ( qs );
        Generators.setup ( qs );
        Nosuocailiao.setup ( qs );
        //
        Ceishi.setup ( qs );
    }
}