package io.gitee.crankygoudan.tsingshantechnology.gzt.gztjieko;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.gzt.Qingshan_gzt;
import io.gitee.crankygoudan.tsingshantechnology.utils.Gongzuoxiang;
import io.github.mooy1.infinitylib.common.Scheduler;
import io.github.mooy1.infinitylib.common.StackUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideImplementation;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import lombok.AllArgsConstructor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;

/**
 * A custom category for displaying 6x6 recipes and their sub-recipes
 * this guy is a god XD
 *
 * @author DAIDAI
 */
public class Qingshan_gzt_jieko extends FlexItemGroup {

    private static final int[] FORGE_RECIPE_SLOTS = {
            3, 4, 5, 6, 7, 8,
            12, 13, 14, 15, 16, 17,
            21, 22, 23, 24, 25, 26,
            30, 31, 32, 33, 34, 35,
            39, 40, 41, 42, 43, 44,
            48, 49, 50, 51, 52, 53
    };
    private static final int[] NORMAL_RECIPE_SLOTS = {
            12, 13, 14,
            21, 22, 23,
            30, 31, 32
    };
    private static final int NORMAL_RECIPE_TYPE = 19;
    private static final int NORMAL_RECIPE_OUTPUT = 25;
    private static final int[] NORMAL_RECIPE_BACKGROUND = {
            1, 2, 3, 4, 5, 6, 7, 8,
            36, 37, 38, 39, 40, 41, 42, 43, 44
    };
    private static final int[] FORGE_OUTPUT_BORDER = {
            18, 19,
    };

    private static final int[] FORGE_BACKGROUND = {2, 11, 20, 29, 38, 47};
    private static final int FORGE_OUTPUT = 27;
    private static final int BACK = 0;
    private static final int NEXT = 46;
    private static final int PREV = 45;
    private static final int FORGE_TABLE = 10;
    private static final int[] WORKBENCH_BORDER = {
            1, 9
    };
    private static final ItemStack CRAFT = new CustomItemStack ( Material.OBSIDIAN,
            ChatColor.GREEN + "使用储存中的物品: ",
            "&a左击 制作1个",
            "&a右击 制作多个"
    );
    private static final ItemStack INFO = new CustomItemStack ( Material.CYAN_STAINED_GLASS_PANE, "&a信息" );
    private static final SlimefunGuideImplementation GUIDE = Slimefun.getRegistry ().getSlimefunGuide ( SlimefunGuideMode.SURVIVAL_MODE );
    private static final Map<UUID, String> HISTORY = new HashMap<> ();
    private static final LinkedHashMap<String, Pair<SlimefunItemStack, ItemStack[]>> ITEMS = new LinkedHashMap<> ();
    private static final List<String> IDS = new ArrayList<> ();
    public static ItemStack OUTPUT_BORDER = new CustomItemStack ( Material.GREEN_STAINED_GLASS_PANE, "&6输出" );
    public String id;

    public Qingshan_gzt_jieko(NamespacedKey key, ItemStack item, int tier) {
        super ( key, item, tier );
        Qingshan_gzt.TYPE.sendRecipesTo ( (input, output) -> {
            SlimefunItemStack sfStack = (SlimefunItemStack) output;
            IDS.add ( sfStack.getItemId () );
            ITEMS.put ( sfStack.getItemId (), new Pair<> ( sfStack, input ) );
        } );
    }

    public static void open(Player player, BlockMenu menu) {
        PlayerProfile.get ( player, profile -> Scheduler.run ( () -> open ( player, new BackEntry ( menu, profile, null ), true ) ) );
    }

    private static void open(@Nonnull Player player, @Nonnull BackEntry entry, boolean useHistory) {

        if (useHistory) {
            String id = HISTORY.get ( player.getUniqueId () );

            if (id != null) {
                openFORGERecipe ( player, id, entry );
                return;
            }
        }

        ChestMenu menu = new ChestMenu ( "&b青山工作箱 " );

        if (entry.bench != null) {
            menu.addMenuClickHandler ( 1, (player1, i, itemStack, clickAction) -> {
                entry.bench.open ( player1 );
                return false;
            } );
        } else {
            menu.addMenuClickHandler ( 1, (player1, i, itemStack, clickAction) -> {
                entry.profile.getGuideHistory ().goBack ( entry.impl );
                return false;
            } );
        }

        menu.addItem ( 0, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        menu.setEmptySlotsClickable ( false );
        for (int i = 2; i < 9; i++) {
            menu.addItem ( i, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        }
        menu.addItem ( 45, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        menu.addItem ( 46, ChestMenuUtils.getPreviousButton ( player, 1, 1 ), ChestMenuUtils.getEmptyClickHandler () );
        for (int i = 47; i < 52; i++) {
            menu.addItem ( i, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        }
        menu.addItem ( 52, ChestMenuUtils.getNextButton ( player, 1, 1 ), ChestMenuUtils.getEmptyClickHandler () );
        menu.addItem ( 53, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );

        menu.addItem ( 1, new CustomItemStack ( ChestMenuUtils.getBackButton (
                player, "", ChatColor.GRAY + Slimefun.getLocalization ().getMessage ( player, "guide.back.guide" ) ) ) );

        int i = 9;
        for (Pair<SlimefunItemStack, ItemStack[]> item : ITEMS.values ()) {
            if (i == 45) {
                break;
            }

            SlimefunItem sfItem = item.getFirstValue ().getItem ();
            if (sfItem == null) {
                return;
            }

            Research research = sfItem.getResearch ();
            if (research != null && !entry.profile.hasUnlocked ( research )) {
                ItemStack resItem = new CustomItemStack (
                        ChestMenuUtils.getNotResearchedItem (),
                        ChatColor.WHITE + ItemUtils.getItemName ( sfItem.getItem () ),
                        "&4&l" + Slimefun.getLocalization ().getMessage ( player, "guide.locked" ),
                        "",
                        "&a> 单击解锁",
                        "",
                        "&7耗费: &b" + research.getCost () + " 等级"
                );
                menu.addItem ( i, resItem, (p, slot, item1, action) -> {
                    research.unlockFromGuide ( GUIDE, p, entry.profile, sfItem, Categories.QS_GZT, 0 );
                    return false;
                } );
            } else {
                menu.addItem ( i, item.getFirstValue (), (p, slot, item1, action) -> {
                    openFORGERecipe ( p, item.getFirstValue ().getItemId (), entry );
                    return false;
                } );
            }

            i++;
        }

        player.playSound ( player.getLocation (), Sound.ITEM_BOOK_PAGE_TURN, 1, 1 );

        HISTORY.put ( player.getUniqueId (), null );

        menu.open ( player );
    }

    @ParametersAreNonnullByDefault
    private static void openFORGERecipe(Player player, String id, BackEntry entry) {
        Pair<SlimefunItemStack, ItemStack[]> pair = ITEMS.get ( id );

        if (pair == null) {
            return;
        }

        ChestMenu menu = new ChestMenu ( Objects.requireNonNull ( pair.getFirstValue ().getDisplayName () ) );
        menu.setEmptySlotsClickable ( false );

        menu.addItem ( BACK, ChestMenuUtils.getBackButton ( player, "" ), (player12, i, itemStack, clickAction) -> {
            open ( player12, entry, false );
            return false;
        } );

        for (int i = 0; i < FORGE_RECIPE_SLOTS.length; i++) {
            ItemStack recipeItem = pair.getSecondValue ()[i];
            if (recipeItem != null) {
                menu.addItem ( FORGE_RECIPE_SLOTS[i], recipeItem, (p, slot, item, action) -> {
                    SlimefunItem slimefunItem = SlimefunItem.getByItem ( recipeItem );
                    if (slimefunItem != null && !slimefunItem.isDisabled ()) {
                        if (slimefunItem.getRecipeType () == Qingshan_gzt.TYPE) {
                            openFORGERecipe ( p, slimefunItem.getId (), entry );
                        } else {
                            LinkedList<SlimefunItem> list = new LinkedList<> ();
                            list.add ( slimefunItem );
                            openSlimefunRecipe ( p, entry, id, list );
                        }
                    }
                    return false;
                } );
            }
        }

        if (entry.bench == null) {
            menu.addItem ( FORGE_TABLE, Gongzuoxiang.QS_GYX_QSGZX, (p, slot, item, action) -> {
                SlimefunItem slimefunItem = Gongzuoxiang.QS_GYX_QSGZX.getItem ();
                if (slimefunItem != null) {
                    LinkedList<SlimefunItem> list = new LinkedList<> ();
                    list.add ( slimefunItem );
                    openSlimefunRecipe ( p, entry, id, list );
                }
                return false;
            } );
        } else {
            menu.addItem ( FORGE_TABLE, CRAFT, (p, slot, item, action) -> {
                moveRecipe ( p, entry.bench, pair, action.isRightClicked () );
                return false;
            } );
        }

        int page = IDS.indexOf ( id );

        menu.addItem ( PREV, ChestMenuUtils.getPreviousButton ( player, page + 1, IDS.size () ), (player1, i, itemStack, clickAction) -> {
            if (page > 0) {
                openFORGERecipe ( player1, IDS.get ( page - 1 ), entry );
            }
            return false;
        } );

        menu.addItem ( NEXT, ChestMenuUtils.getNextButton ( player, page + 1, IDS.size () ), (player1, i, itemStack, clickAction) -> {
            if (page < IDS.size () - 1) {
                openFORGERecipe ( player1, IDS.get ( page + 1 ), entry );
            }
            return false;
        } );

        for (int slot : FORGE_BACKGROUND) {
            menu.addItem ( slot, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        }
        for (int slot : FORGE_BACKGROUND) {
            menu.addItem ( slot, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        }
        for (int slot : FORGE_OUTPUT_BORDER) {
            menu.addItem(slot, Qingshan_gzt_jieko.OUTPUT_BORDER, ChestMenuUtils.getEmptyClickHandler());
        }
        menu.addItem ( FORGE_OUTPUT, pair.getFirstValue (), ChestMenuUtils.getEmptyClickHandler () );
        for (int slot : WORKBENCH_BORDER) {
            menu.addItem ( slot, INFO, ChestMenuUtils.getEmptyClickHandler () );
        }

        player.playSound ( player.getLocation (), Sound.ITEM_BOOK_PAGE_TURN, 1, 1 );

        HISTORY.put ( player.getUniqueId (), id );

        menu.open ( player );

    }

    private static void moveRecipe(@Nonnull Player player, @Nonnull BlockMenu menu, Pair<SlimefunItemStack, ItemStack[]> pair, boolean max) {
        ItemStack[] recipe = pair.getSecondValue ();
        PlayerInventory inv = player.getInventory ();

        for (int i = 0; i < (max ? 64 : 1); i++) {
            for (int slot = 0; slot < recipe.length; slot++) { //each item in recipe
                ItemStack recipeItem = recipe[slot];

                if (recipeItem == null) {
                    continue;
                }

                String id = StackUtils.getIdOrType ( recipeItem );

                for (ItemStack item : inv.getContents ()) { //each slot in their inv
                    if (item != null && StackUtils.getIdOrType ( item ).equals ( id )) { //matches recipe
                        //get item
                        ItemStack output = item.clone ();
                        output.setAmount ( 1 );

                        if (menu.fits ( output, Qingshan_gzt.INPUT_SLOTS[slot] )) {//not null and fits
                            //remove item
                            ItemUtils.consumeItem ( item, 1, false );
                            //push item
                            menu.pushItem ( output, Qingshan_gzt.INPUT_SLOTS[slot] );
                            break;
                        }
                    }
                }
            }
        }

        menu.open ( player );

    }

    @ParametersAreNonnullByDefault
    private static void openSlimefunRecipe(Player player, BackEntry entry, String backID, LinkedList<SlimefunItem> slimefunHistory) {
        SlimefunItem slimefunItem = slimefunHistory.peekLast ();

        if (slimefunItem == null) {
            return;
        }

        ItemStack output = slimefunItem.getRecipeOutput ().clone ();

        ChestMenu menu = new ChestMenu ( ItemUtils.getItemName ( output ) );
        menu.setEmptySlotsClickable ( false );

        int length = slimefunHistory.size ();

        menu.addItem ( 0, ChestMenuUtils.getBackButton ( player, "" ), (p, slot, item, action) -> {
            if (length == 1) {
                openFORGERecipe ( player, backID, entry );
            } else {
                slimefunHistory.removeLast ();
                openSlimefunRecipe ( player, entry, backID, slimefunHistory );
            }
            return false;
        } );

        for (int i = 0; i < NORMAL_RECIPE_SLOTS.length; i++) {
            ItemStack recipeItem = slimefunItem.getRecipe ()[i];

            if (recipeItem != null) {
                menu.addItem ( NORMAL_RECIPE_SLOTS[i], recipeItem, (p, slot, item, action) -> {
                    SlimefunItem recipeSlimefunItem = SlimefunItem.getByItem ( recipeItem );

                    if (recipeSlimefunItem != null) {
                        slimefunHistory.add ( recipeSlimefunItem );
                        openSlimefunRecipe ( player, entry, backID, slimefunHistory );
                    }
                    return false;
                } );
            }

        }

        menu.addItem ( NORMAL_RECIPE_TYPE, slimefunItem.getRecipeType ().toItem (), ChestMenuUtils.getEmptyClickHandler () );

        for (int slot : NORMAL_RECIPE_BACKGROUND) {
            menu.addItem ( slot, ChestMenuUtils.getBackground (), ChestMenuUtils.getEmptyClickHandler () );
        }

        menu.addItem ( NORMAL_RECIPE_OUTPUT, output, ChestMenuUtils.getEmptyClickHandler () );

        player.playSound ( player.getLocation (), Sound.ITEM_BOOK_PAGE_TURN, 1, 1 );
        menu.open ( player );
    }

    @Override
    public boolean isVisible(@Nonnull Player p, @Nonnull PlayerProfile profile, @Nonnull SlimefunGuideMode layout) {
        return false;
    }

    @Override
    public void open(Player player, PlayerProfile playerProfile, SlimefunGuideMode slimefunGuideMode) {
        open ( player, new BackEntry ( null, playerProfile, Slimefun.getRegistry ().getSlimefunGuide ( slimefunGuideMode ) ), false );
        playerProfile.getGuideHistory ().add ( this, 1 );
    }

    public String getVIID(ItemStack vanillaItem) {
        return id;
    }

    @AllArgsConstructor
    private static final class BackEntry {

        private final BlockMenu bench;
        private final PlayerProfile profile;
        private final SlimefunGuideImplementation impl;

    }
}
