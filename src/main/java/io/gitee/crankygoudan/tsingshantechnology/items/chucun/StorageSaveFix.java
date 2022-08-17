package io.gitee.crankygoudan.tsingshantechnology.items.chucun;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.github.thebusybiscuit.slimefun4.libraries.dough.common.CommonPatterns;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class StorageSaveFix {

    public static void fixStuff(Logger logger) {
        long time = System.nanoTime();

        File folder = new File("data-storage/Slimefun/stored-blocks/");
        if (!folder.exists()) {
            return;
        }

        int fixed = 0;
        String[] ids = new String[] {
            "QS_MU_XIANG",
            "QS_TIE_XIANG",
            "QS_JIN_XIANG",
            "QS_ZUAN_SHI_XIANG",
            "QS_CHU_XUE_ZHE_BAO_XIANG",
            "QS_BIAO_ZHUN_REN_WU_BAO_XIANG",
            "QS_QIANG_DA_DE_REN_WU_BAO_XIANG",
            "QS_JIE_JING_SHI_SHI_REN_WU_BAO_XIANG",
            "QS_MI_FENG_SHI_SHI_REN_WU_BAO_XIANG",
            "QS_HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG",
            "QS_XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG",
            "QS_DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG",
            "WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG"
        };

        for (File world : folder.listFiles()) {
            String name = world.getName();
            int locationBeginIndex = name.length() + 1;
            Map<String, String> locations = new HashMap<>();

            for (String id : ids) {
                File storages = new File(world, id + ".sfb");

                if (!storages.exists()) {
                    continue;
                }

                List<String> lines;
                boolean changed = false;

                try {
                    lines = Files.readAllLines(storages.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }

                Iterator<String> iterator = lines.listIterator();
                while (iterator.hasNext()) {
                    String line = iterator.next();
                    String location = line.substring(locationBeginIndex, line.indexOf(':'));
                    String correct = locations.get(location);

                    if (correct == null) {
                        locations.put(location, id);
                    } else {
                        iterator.remove();
                        changed = true;
                        if (fixed++ < 25) {
                            String[] cords = CommonPatterns.SEMICOLON.split(location);
                            logger.log(Level.INFO, "已修复有问题的存储单元 " + correct + " , 位于 "
                                    + name + " @ "
                                    + cords[0] + ", "
                                    + cords[1] + ", "
                                    + cords[2]);
                        }
                    }
                }

                if (changed) try {
                    Files.write(storages.toPath(), lines);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        time = System.nanoTime() - time;
        if (fixed > 0) {
            logger.log(Level.INFO, "已修复 " + fixed + " 个有问题的存储单元，耗时: " + (time / 1000000) + " ms");
        }
    }

}
