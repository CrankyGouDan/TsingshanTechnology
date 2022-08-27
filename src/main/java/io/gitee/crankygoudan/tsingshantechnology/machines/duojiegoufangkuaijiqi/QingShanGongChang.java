package io.gitee.crankygoudan.tsingshantechnology.machines.duojiegoufangkuaijiqi;

import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;


public class QingShanGongChang extends MultiBlockMachine {

    public static final RecipeType QS_GONG_CHANG = new RecipeType(
        new NamespacedKey( TsingshanTechnology.getInstance(), "qing_shan_gong_chang"),
        QingShanJiQi.QS_GONG_CHANG,
        Y.colorPseudorandomString ("合成青山材料"));


    public QingShanGongChang() {
        super( C.QS_JQ, QingShanJiQi.QS_GONG_CHANG, new ItemStack[] {
            new ItemStack(Material.BARREL), new ItemStack(Material.CHAIN),new ItemStack(Material.OAK_LOG),
            new ItemStack(Material.ANVIL), new ItemStack(Material.CONDUIT),new ItemStack(Material.SOUL_LANTERN),
            new ItemStack(Material.BARREL), new ItemStack(Material.DISPENSER), new ItemStack(Material.ENCHANTING_TABLE)
        }, BlockFace.SELF);
    }

    @Override
    public void onInteract(Player p, Block b) {
        Block dispBlock = b.getRelative(BlockFace.DOWN);
        BlockState state = PaperLib.getBlockState(dispBlock, false).getState();

        if (state instanceof Dispenser) {
            Dispenser disp = (Dispenser) state;
            Inventory inv = disp.getInventory();
            List<ItemStack[]> inputs = RecipeType.getRecipeInputList(this);

            for (int i = 0; i < inputs.size(); i++) {
                if (canCraft(inv, inputs.get(i))) {
                    ItemStack output = RecipeType.getRecipeOutputList(this, inputs.get(i)).clone();

                    if (SlimefunUtils.canPlayerUseItem(p, output, true)) {
                        craft(dispBlock, p, b, inv, inputs.get(i), output);
                    }

                    return;
                }
            }

            if (SlimefunUtils.isInventoryEmpty(inv)) {
                Slimefun.getLocalization().sendMessage(p, "machines.inventory-empty", true);
            } else {
                Slimefun.getLocalization().sendMessage(p, "machines.pattern-not-found", true);
            }
        }
    }

    private boolean canCraft(Inventory inv, ItemStack[] recipe) {
        for (int j = 0; j < inv.getContents().length; j++) {
            if (!SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], true)) {
                return false;
            }
        }

        return true;
    }

    protected void craft(Block dispenser, Player p, Block b, Inventory inv, ItemStack[] recipe, ItemStack output) {
        Inventory fakeInv = createVirtualInventory(inv);
        Inventory outputInv = findOutputInventory(output, dispenser, inv, fakeInv);

        if (outputInv != null) {
            craftItem(inv, recipe, b);

            outputInv.addItem(output);
        } else {
            craftItem(inv, recipe, b);

            dispenser.getWorld().dropItem(b.getLocation(), output);
            Slimefun.getLocalization().sendMessage(p, "machines.full-inventory", true);
        }
        p.sendMessage(("" + output.getItemMeta().getDisplayName() + Y.colorRandomString("合成成功!")));
    }

    public void craftItem(Inventory inv, ItemStack[] recipe, Block b){
        for (int j = 0; j < 9; j++) {
            ItemStack item = inv.getContents()[j];

            if (item != null && item.getType() != Material.AIR && SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], true)) {
                ItemUtils.consumeItem(item, recipe[j].getAmount(),true);
            }
        }
        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.getInstance(), () -> {
            b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
            b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.3, 0.4, 0.45), 2, 0.1, 0.1, 0.1, 0.1);
            b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.getInstance(), () -> {
                b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                b.getWorld().spawnParticle(Particle.FLASH, b.getLocation().add(0.4, 0.45, 0.5), 2, 0.1, 0.1, 0.1, 0.1);
                b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.4, 0.45, 0.5), 2, 0.1, 0.1, 0.1, 0.1);
                b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.getInstance(), () -> {
                    b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                    b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.2, 0.3, 0.2), 2, 0.1, 0.1, 0.1, 0.1);
                    b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.getInstance(), () -> {
                        b.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                        b.getWorld().spawnParticle(Particle.FLASH, b.getLocation().add(0.35, 0.4, 0.4), 2, 0.1, 0.1, 0.1, 0.1);
                        b.getWorld().spawnParticle(Particle.CLOUD, b.getLocation().add(0.35, 0.4, 0.4), 2, 0.1, 0.1, 0.1, 0.1);
                        b.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);

                    }, 30);
                }, 30);
            }, 30);
        }, 30);
    }

    protected @Nonnull
    Inventory createVirtualInventory(@Nonnull Inventory inv) {
        Inventory fakeInv = Bukkit.createInventory(null, 9, "Fake Inventory");

        for (int j = 0; j < inv.getContents().length; j++) {
            ItemStack stack = inv.getContents()[j];

            if (stack != null) {
                stack = stack.clone();
                ItemUtils.consumeItem(stack, true);
            }

            fakeInv.setItem(j, stack);
        }

        return fakeInv;
    }


}
