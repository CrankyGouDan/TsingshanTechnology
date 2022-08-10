package io.gitee.crankygoudan.tsingshantechnology.utils;


import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanYaSuoCaiLiao;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.fadianjizhuce.QingShanFaDianJi;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi_V2;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi_V3;

public class S {
    public static void setup(TsingshanTechnology qs) {
        // Category
        C.setup ( qs );
        //
        QingShanJiQi.setup ( qs );
        QingShanJiQi_V2.setup ( qs );
        QingShanJiQi_V3.setup ( qs );
        QingShanCaiLiao.setup ( qs );
        QingShanYaSuoCaiLiao.setup ( qs );
        QingShanFaDianJi.setup ( qs );

    }
}
