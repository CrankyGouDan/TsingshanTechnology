package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.experimental.UtilityClass;


@UtilityClass
public class C {
    public static final ItemGroup QS_CL = new SubGroup( "qingshan_cailiao", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode
        ("714a947c80d74243224af8b5f4a9622eafcd0d0d5743c9c4e9553fa30d10892f")),
        Y.colorPseudorandomString("青山材料")));
    public static final ItemGroup QS_YSCL = new SubGroup( "qingshan_yasuocailiao", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode
        ("b18c4ec6f14909403d6fb1ce31184fe92e1d8b90b8e1911e438612188f502a93")),
        Y.colorPseudorandomString("压缩材料")));
    public static final ItemGroup QS_JQ = new SubGroup( "qingshan_jiqi", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode
        ("48edf0c318624363c3326a677452f9e940cb6976305f75875ae330d15d157ae4")),
        Y.colorPseudorandomString
            ("青山机器")));
    public static final ItemGroup QS_JQ_V2 = new SubGroup( "qingshan_jiqi_v2", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode
        ("4f0ef1674b71f8dad7f5882f13cf2411653f6a2f9e90e45b181f44b9eef278ff")),
        Y.colorPseudorandomString
            ("高级 机器")));
    public static final ItemGroup QS_JQ_V3 = new SubGroup( "qingshan_jiqi_v3", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode
        ("fd11c96dd2b76d81bff22059e43276575666956cca8a3a75835d042acb3f428c")),
        Y.colorPseudorandomString("毕业 机器")));
    public static final ItemGroup QS_FDJ = new SubGroup( "qingshan_fadianji", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode
        ("dd7e9e0647a8bbfbd07a0e64cf352f18105b5f4bd0b324516fc3c18f16f6aef5")),
        Y.colorPseudorandomString("发电机")));

    public static final ItemGroup QSKJ = new MultiGroup( "qingshankeji", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode(
        "fe0d458edd943afcbbcae9499dea6f7d52084f3e269571b858ecbd933f83358f")),
        Y.colorPseudorandomString("青山科技")),
        QS_CL, QS_YSCL, QS_JQ, QS_JQ_V2, QS_JQ_V3, QS_FDJ
    );





    public static void setup(TsingshanTechnology qs){

        QSKJ.register(qs);
    }
}
