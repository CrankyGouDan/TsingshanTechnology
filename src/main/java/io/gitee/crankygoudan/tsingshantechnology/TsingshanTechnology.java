package io.gitee.crankygoudan.tsingshantechnology;

import io.gitee.crankygoudan.tsingshantechnology.Generator.GreenGenerator;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class TsingshanTechnology extends JavaPlugin implements SlimefunAddon {

    private NestedItemGroup nestedItemGroup;
    private ItemGroup fadianjiGroup;
    private ItemGroup jiqiGroup;
    private ItemGroup cailioaGroup;

    private void registerItems() {
        //A
        nestedItemGroup = new NestedItemGroup(new NamespacedKey(this, "HAI_MAN"), new CustomItemStack( PlayerHead.getItemStack(PlayerSkin.fromHashCode("fe0d458edd943afcbbcae9499dea6f7d52084f3e269571b858ecbd933f83358f")), "§x§f§f§f§f§0§0青§x§c§c§f§f§0§0山§x§8§8§f§f§0§0科§x§4§4§f§f§0§0技","",  "&a> 点击打开 "));
        //b
        fadianjiGroup = new SubItemGroup (new NamespacedKey(this, "qing_shan_fadianji"), nestedItemGroup,  new CustomItemStack( PlayerHead.getItemStack(PlayerSkin.fromHashCode("77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422")),
                "§x§f§f§0§0§0§0发" +
                "§x§f§f§3§3§0§0电" +
                "§x§f§f§6§6§0§0机","", "&a> 点击查看"));

        jiqiGroup = new SubItemGroup (new NamespacedKey(this, "qing_shan_jiqi"), nestedItemGroup,  new CustomItemStack( PlayerHead.getItemStack(PlayerSkin.fromHashCode("330a591e7c2b258a8ae81db51099139872be4c89664c4ae24fd78d67f475cc5d")),
                "§x§0§0§2§2§f§f机" +
                "§x§0§0§5§5§f§f器", "", "&a> 点击查看"));

        cailioaGroup = new SubItemGroup (new NamespacedKey(this, "qing_shan_cailiao"), nestedItemGroup,  new CustomItemStack( PlayerHead.getItemStack(PlayerSkin.fromHashCode("9774928d51298e7d66aee92aa5d33e442bd4e037324463ff5a5440dce9e13f65")),
                "§x§6§6§0§0§f§f材" +
                        "§x§9§9§0§0§f§f料", "", "&a> 点击查看"));

    }


    @Override
    public void onEnable() {
        // 从您的 config.yml 中读取一些内容
        registerItems();
        /*
         * 1. 创建一个新的类别
         * 该类别将使用以下 ItemStack
         */
        //子


        // 为您的类别提供一个唯一的 ID。


        /*
         * 3. 创建配方
         * 配方是一个长度为 9 的 ItemStack 数组。
         * 它代表 3x3 合成网格中的异形配方。
         * 指定制作此配方的机器
         * 进一步向下作为 RecipeType。
         */
        //发电机配方：
        ItemStack[] greenGeneratorRecipe = {
                new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.OAK_LEAVES),
                new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.OAK_LEAVES),
                new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.OAK_LEAVES)
        };
        //机器配方：


        /*
         * 4. 注册项目
         * 现在您只需注册该项目_1
         * RecipeType.ENHANCED_CRAFTING_TABLE 指的是机器
         * 制作此物品的材料。
         * 来自 Slimefun 的配方类型会自动将配方添加到该机器。
         */
        //发电机的注册项目列表
        GreenGenerator greenGenerator = new GreenGenerator(fadianjiGroup, items.GREEN_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, greenGeneratorRecipe);

        //发电机的项目项目_2
        greenGenerator.register(this);





        // 我们的项目现已注册

    }

    @Override
    public void onDisable() {
        // 禁用插件的逻辑...
    }

    @Override
    public String getBugTrackerURL() {
        // 您可以在此处返回指向 Bug Tracker 的链接而不是 null
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * 您需要在此处返回对您的插件的引用。
         * 如果您为此使用主类，只需返回“this”。
         */
        return this;
    }

}
