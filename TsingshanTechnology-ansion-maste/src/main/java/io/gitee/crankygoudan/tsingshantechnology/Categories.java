package io.gitee.crankygoudan.tsingshantechnology;

import io.gitee.crankygoudan.tsingshantechnology.gzt.gztjieko.Qingshan_fmx_jieko;
import io.gitee.crankygoudan.tsingshantechnology.gzt.gztjieko.Qingshan_gzt_jieko;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public class Categories {

    public static final ItemGroup QS_GJ = new SubGroup( "qingshan_gongju", new CustomItemStack(Material.SHEARS,
            TextUtil.colorPseudorandomString("工具")) );
    public static final ItemGroup QS_TSFK = new SubGroup( "qingshan_teshufnagkuai", new CustomItemStack(Material.FEATHER,
            TextUtil.colorPseudorandomString("特殊方块")) );
    public static final ItemGroup QS_NSCL = new SubGroup( "qingshan_nosuocailiao", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode("d006d387a68b7aea38140cd242ea9353948c9c2129c76c019ce1fd9d30a87cd6")),
            TextUtil.colorPseudorandomString("浓缩材料")));
    public static final ItemGroup QS_WP = new SubGroup( "qingshan_wupin", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode("227243e743106447b6912dbae81282573db610c403a8aaa540405cb783829f16")),
            TextUtil.colorPseudorandomString("物品")));
    public static final ItemGroup QS_GYX = new SubGroup( "qingshan_gongyizuo", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode("2b92abeb44c34b998a018ec5b6022e8fc158ee8b13404c0fe6dd0917fed844eb")),
            TextUtil.colorPseudorandomString("工艺箱")));
    public static final ItemGroup QS_YSZJ = new SubGroup( "qingshan_yunshuzujian", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode("b2bb2483449fb689ab60e776cf9efe22e181cbd7c1bdbd8bb6d91c4d7e2a146b")),
            TextUtil.colorPseudorandomString("运输组件")));
    public static final ItemGroup QS_JQ = new SubGroup( "qingshan_jiqi", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("330a591e7c2b258a8ae81db51099139872be4c89664c4ae24fd78d67f475cc5d")),
            TextUtil.colorPseudorandomString("基础机器")));
    public static final ItemGroup QS_BFQ_V2 = new SubGroup( "qingshan_baofaqi_v2", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("ec103f6eba5d1f23613af90628668929e4d83ff1abddfaac72226e94c0447fa5")),
            TextUtil.colorPseudorandomString("高级 机器")));
    public static final ItemGroup QS_BFQ_V3 = new SubGroup( "qingshan_baofaqi_v3", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("845dd395dbd64d4ded11871f0636cbc29b2ce19283b98d9f5bdcff5b4e1c41c2")),
            TextUtil.colorPseudorandomString("究极 机器")));
    public static final ItemGroup QS_FDJ = new SubGroup( "qingshan_fadianji", new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("240775c3ad75763613f32f04986881bbe4eee4366d0c57f17f7c7514e2d0a77d")),
            TextUtil.colorPseudorandomString("发电机")));
    public static final ItemGroup QS_DLW = new SubGroup( "qingshan_diaoluowu", new CustomItemStack(new ItemStack(Material.NETHERITE_SWORD),
            TextUtil.colorPseudorandomString("生物掉落物")));
    public static final ItemGroup QS_GZT = new Qingshan_gzt_jieko ( TsingshanTechnology.createKey("qingshan_gzt_wupin"), new CustomItemStack(Material.SMITHING_TABLE,
            TextUtil.colorPseudorandomString("青山物品")),3);
    public static final ItemGroup QS_FMS = new Qingshan_fmx_jieko ( TsingshanTechnology.createKey("qingshan_fms"), new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("7caa5bf1bede9a27a0d0b985f77e8b9730d5db3eda952dfe3f1a31b87d5efec8")),
            TextUtil.colorPseudorandomString("附魔石列表")),3);
    public static final ItemGroup QSKJ = new MultiGroup( "qingshankeji", new CustomItemStack(PlayerHead.getItemStack( PlayerSkin.fromHashCode("fe0d458edd943afcbbcae9499dea6f7d52084f3e269571b858ecbd933f83358f")),
            TextUtil.colorPseudorandomString("青山科技")),
            QS_DLW, QS_GJ, QS_TSFK, QS_WP, QS_NSCL, QS_GYX, QS_JQ, QS_BFQ_V2, QS_BFQ_V3, QS_FDJ, QS_YSZJ,
            QS_GZT, QS_FMS
    );
    public static final ItemGroup QS_ZBMS = new SubGroup("qingshan_zuobimoshi", new CustomItemStack(Material.KNOWLEDGE_BOOK,
            TextUtil.colorPseudorandomString("青山物品  - 作弊模式")));
    public static final ItemGroup QS_ZBMS_FMS = new SubGroup("qingshan_zuobimoshi_fumo", new CustomItemStack(Material.KNOWLEDGE_BOOK,
            TextUtil.colorPseudorandomString("附魔石  - 作弊模式")));





    public static void setup(TsingshanTechnology qs){
        QS_FMS.register(qs);
        QS_GZT.register(qs);
        QSKJ.register(qs);
        QS_ZBMS.register(qs);
        QS_ZBMS_FMS.register(qs);
    }
}
