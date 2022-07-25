package io.gitee.crankygoudan.tsingshantechnology;

import org.bukkit.Color;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author DAIDAI
 * @since 2.0
 */
public class TextUtil {
    public static final String COLOR_NORMAL = "§x§8§8§f§f§f§f"; // 通常
    public static final String COLOR_STRESS = "§x§f§f§f§f§8§8"; // 强调
    public static final String COLOR_ACTION = "§x§f§f§8§8§0§0"; // 主动操作
    public static final String COLOR_INITIATIVE = "§x§0§0§8§8§f§f"; // 主动
    public static final String COLOR_PASSIVE = "§x§0§0§f§f§8§8"; // 被动
    public static final String COLOR_NUMBER = "§x§f§f§8§8§f§f"; // 数字
    public static final String COLOR_POSITIVE = "§x§8§8§f§f§8§8"; // 正面
    public static final String COLOR_NEGATIVE = "§x§f§f§8§8§8§8"; // 负面
    public static final String COLOR_INPUT = "§9";
    public static final String COLOR_OUTPUT = "§6";

    @Nonnull
    public static String colorString(@Nonnull String string, @Nonnull List<Color> colorList) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string.length() == 0) {
            string += " ";
        }
        if (string.length() == 1) {
            string += " ";
        }
        for (int i = 0, length = string.length() - 1; i <= length; i++) {
            double p = ((double) i) / length * (colorList.size() - 1);
            Color color1 = colorList.get((int)Math.floor(p));
            Color color2 = colorList.get((int)Math.ceil(p));
            int blue = (int)(color1.getBlue() * (1 - p + Math.floor(p)) + color2.getBlue() * (p - Math.floor(p)));
            int green = (int)(color1.getGreen() * (1 - p + Math.floor(p)) + color2.getGreen() * (p - Math.floor(p)));
            int red = (int)(color1.getRed() * (1 - p + Math.floor(p)) + color2.getRed() * (p - Math.floor(p)));
            String color = "§x" +
                    "§" + TextUtil.codeColor(red / 16) +
                    "§" + TextUtil.codeColor(red % 16) +
                    "§" + TextUtil.codeColor(green / 16) +
                    "§" + TextUtil.codeColor(green % 16) +
                    "§" + TextUtil.codeColor(blue / 16) +
                    "§" + TextUtil.codeColor(blue % 16);
            stringBuilder.append(color);
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    @Nonnull
    public static String colorRandomString(@Nonnull String string) {
        List<Color> colorList = new ArrayList<>();
        double r = 1;
        while (1 / r >= Math.random() && r * r <= string.length()) {
            int red = (int) ((Math.random() * 8 + 8) * 15 + Math.random() * 12 + 4);
            int green = (int) ((Math.random() * 8 + 8) * 15 + Math.random() * 12 + 4);
            int blue = (int) ((Math.random() * 8 + 8) * 15 + Math.random() * 12 + 4);
            colorList.add(Color.fromRGB(red, green, blue));
            r++;
        }
        return TextUtil.colorString(string, colorList);
    }

    @Nonnull
    public static String colorPseudorandomString(@Nonnull String string) {
        List<Color> colorList = new ArrayList<>();
        double r = 1;
        Random random = new Random(string.hashCode() / 2 + TsingshanTechnology.getInstance().getServer().getName().hashCode() / 2);
        while (1 / r >= random.nextDouble() && r * r <= string.length()) {
            int red = (int) ((random.nextDouble() * 8 + 8) * 15 + random.nextDouble() * 12 + 4);
            int green = (int) ((random.nextDouble() * 8 + 8) * 15 + random.nextDouble() * 12 + 4);
            int blue = (int) ((random.nextDouble() * 8 + 8) * 15 + random.nextDouble() * 12 + 4);
            colorList.add(Color.fromRGB(red, green, blue));
            r++;
        }
        return TextUtil.colorString(string, colorList);
    }

    @Nonnull
    public static String toTextCode(@Nonnull Color color) {
        return "§x" + "§" + TextUtil.codeColor(color.getRed() / 16) + "§" + TextUtil.codeColor(color.getRed() % 16) + "§" + TextUtil.codeColor(color.getGreen() / 16) + "§" + TextUtil.codeColor(color.getGreen() % 16) + "§" + TextUtil.codeColor(color.getBlue() / 16) + "§" + TextUtil.codeColor(color.getBlue() % 16);
    }

    @Nonnull
    public static String codeColor(int c) {
        if (c < 10 && c >= 0) {
            return String.valueOf(c);
        }
        return switch (c) {
            case 10 -> "a";
            case 11 -> "b";
            case 12 -> "c";
            case 13 -> "d";
            case 14 -> "e";
            case 15 -> "f";
            default -> "0";
        };
    }
}
