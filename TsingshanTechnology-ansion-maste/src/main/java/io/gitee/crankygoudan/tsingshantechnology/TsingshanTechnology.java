package io.gitee.crankygoudan.tsingshantechnology;


import io.gitee.crankygoudan.tsingshantechnology.jieko.CustomArmorTask;
import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import lombok.SneakyThrows;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;

import java.util.HashMap;
import java.util.List;


public final class TsingshanTechnology extends AbstractAddon {
    private static TsingshanTechnology instance;
    private final  TsingshanTechnology plugin = this;
    public static final HashMap<ItemStack, List<Pair<ItemStack, List<RecipeChoice>>>> shapedVanillaRecipes = new HashMap<>();
    public static final HashMap<ItemStack, List<Pair<ItemStack, List<RecipeChoice>>>> shapelessVanillaRecipes =
            new HashMap<>();


    public static final MiniMessage MM = MiniMessage.builder ()
            .tags ( TagResolver.builder ()
                    .resolver ( StandardTags.color () )
                    .resolver ( StandardTags.decorations () )
                    .resolver ( StandardTags.gradient () )
                    .build ()
            )
            .build ();


    public TsingshanTechnology() {
        super ( "yitoudaidai", "TsingshanTechnology", "master", "options.auto-update" );
    }
    @SneakyThrows
    @Override
    public void enable() {
        instance = this;
        //armor

        new CustomArmorTask ().runTaskTimerAsynchronously(this, 0L, 0L);


        // Setup item
        Setup.setup(this);
    }
    @Override
    public void disable() {
        // Set instance to null
        instance = null;
    }




    public static TsingshanTechnology getInstance() {
        return instance;
    }

    public static TsingshanTechnology i() {
        return instance;
    }
}
