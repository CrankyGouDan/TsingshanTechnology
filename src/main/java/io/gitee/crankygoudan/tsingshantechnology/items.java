package io.gitee.crankygoudan.tsingshantechnology;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;

/**
 * Specifies all plugin items
 */
public final class items {
    private items() {
    }
    //方块类型：
    //发电机
    public static final SlimefunItemStack GREEN_GENERATOR = new SlimefunItemStack("GREEN_GENERATOR", Material.MOSS_BLOCK, "§x§c§c§f§f§0§0环§x§8§8§f§f§0§0保§x§4§4§f§f§0§0发§x§0§0§f§f§0§0电§x§0§0§d§d§4§4机", "&8⇨ &e⚡ &7 400 J 储存", "&8⇨ &e⚡ &7 100 J/s");
    //机器
    public static final SlimefunItemStack ZDYBGZX = new SlimefunItemStack("ZDYBGZX", TL.ZDYBGZX,"&b全自动原版工作箱","&7在工作箱内自动制造&f原版&7物品");
    public static final SlimefunItemStack ZDZQXGZX = new SlimefunItemStack("ZDZQXGZX", TL.ZDZQXGZX,"&b全自动增强型工作箱","&7在增强型工作箱内自动制造&f粘液&7物品");
    public static final SlimefunItemStack ZDYGJT = new SlimefunItemStack("ZDYGJT", TL.ZDYGJT,"&b全自动远古祭坛","&7在祭坛内自动制造&f&7祭坛物品");
    public static final SlimefunItemStack ZDKJDZX = new SlimefunItemStack("ZDKJDZX", TL.ZDKJDZX,"&b全自盔甲锻造箱","&7在锻造箱内自动制造&f&7盔甲物品");
    public static final SlimefunItemStack ZDMFGZX = new SlimefunItemStack("ZDMFGZX", TL.ZDMFGZX,"&b全自魔法工作箱","&7在魔法工作箱内自动制造&f&7魔法物品");
    //工具
    public static final SlimefunItemStack YUANSHI_ZHIZAOJ = new SlimefunItemStack("YUANGUJITAN", TL.YUANSHI_ZHIZAOJ, "§x§c§c§f§f§0§0原§x§8§8§f§f§0§0石§x§4§4§f§f§0§0制§x§0§0§f§f§0§0造§x§0§0§d§d§4§4机", "&8⇨ &e⚡ &7 512 J 储存", "&8⇨ &e⚡ &7 256 J/s");
    //工具
    //运输
    public static final SlimefunItemStack ENDER_CHEST_EXTRACTION_NODE_1= new SlimefunItemStack("ENDER_CHEST_EXTRACTION_NODE_1", TL.ENDER_CHEST_EXTRACTION_NODE_1, "§x§c§c§f§f§0§0末§x§8§8§f§f§0§0影§x§4§4§f§f§0§0货§x§0§0§f§f§0§0运§x§0§0§d§d§4§4节§x§0§0§b§b§8§8点§x§0§0§8§8§f§f（§x§0§0§5§5§f§f输§x§0§0§2§2§f§f出§x§0§0§8§8§f§f)","&7请把这个机器放在&5末影箱&7的一侧","", "&7会从&5末影箱&7输出物品", "&7从相邻的&6箱子&7放入物品");
    public static final SlimefunItemStack ENDER_CHEST_INSERTION_NODE_2= new SlimefunItemStack("ENDER_CHEST_INSERTION_NODE_2", TL.ENDER_CHEST_INSERTION_NODE_2, "§x§c§c§f§f§0§0末§x§8§8§f§f§0§0影§x§4§4§f§f§0§0货§x§0§0§f§f§0§0运§x§0§0§d§d§4§4节§x§0§0§b§b§8§8点§x§0§0§8§8§f§f（§x§0§0§5§5§f§f输§x§0§0§2§2§f§f入§x§0§0§8§8§f§f)","&7请把这个机器放在&5末影箱&7的一侧","", "会从&5末影箱&7输出物品", "&7从相邻的&6箱子&7吸取物品");

}