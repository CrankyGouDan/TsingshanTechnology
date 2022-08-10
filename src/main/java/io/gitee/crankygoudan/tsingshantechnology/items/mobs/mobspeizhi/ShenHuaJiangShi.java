package io.gitee.crankygoudan.tsingshantechnology.items.mobs.mobspeizhi;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;

import io.gitee.crankygoudan.tsingshantechnology.items.mobs.CustomBoss;

import io.gitee.crankygoudan.tsingshantechnology.items.mobs.Utilss;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class ShenHuaJiangShi extends CustomBoss {

    public static class AttackPattern {
        public static short CHARGE = 0;
        public static short SHOOT = 1;
        public static short IDLE = 3;
    }

    private static final NamespacedKey PATTERN_KEY = new NamespacedKey( TsingshanTechnology.getInstance(), "pattern");

    public ShenHuaJiangShi() {
        super("SHEN_HUA_JIANG_SHI", ChatColor.RED + "神话僵尸", EntityType.ZOMBIE, 5500,
                DamageCause.BLOCK_EXPLOSION, DamageCause.ENTITY_EXPLOSION, DamageCause.THORNS);
    }

    @Override
    public void onSpawn(@Nonnull LivingEntity spawned) {
        super.onSpawn(spawned);
        spawned.setGlowing(true);

        EntityEquipment equipment = spawned.getEquipment();
        equipment.setArmorContents(new ItemStack[] { new ItemStack(Material.NETHERITE_BOOTS), new ItemStack(Material.NETHERITE_LEGGINGS),
                new ItemStack(Material.NETHERITE_CHESTPLATE), new ItemStack(Material.NETHERITE_HELMET) });

        spawned.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(500);
        spawned.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.7);
        spawned.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 3, false, false));
        spawned.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 60, 3, false, false));
        spawned.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 60, 10, false, false));

        spawned.getPersistentDataContainer().set( PATTERN_KEY, PersistentDataType.SHORT, AttackPattern.CHARGE);
    }

    @Nonnull
    @Override
    protected BossBarStyle getBossBarStyle() {
        return new BossBarStyle("神话僵尸", BarColor.RED, BarStyle.SOLID, BarFlag.PLAY_BOSS_MUSIC);
    }

    @Override
    protected void onTarget(@Nonnull EntityTargetEvent e) {
        if (!(e.getTarget() instanceof Player)) {
            e.setCancelled(true);
        }
    }

    @Override
    protected void onAttack(@Nonnull EntityDamageByEntityEvent e) {
        if (!e.isCancelled()) {
            Utilss.dealDamageBypassingArmor((LivingEntity) e.getEntity(), (e.getDamage() - e.getFinalDamage()) * 0.12);
        }
    }

    @Override
    public void onBossPattern(@Nonnull LivingEntity mob) {
        super.onBossPattern(mob);

        short pattern = (short) ThreadLocalRandom.current().nextInt(7);
        if (pattern < 2) {
            pattern = AttackPattern.CHARGE;
        } else if (pattern < 4) {
            pattern = AttackPattern.SHOOT;
            mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 100));
        } else {
            pattern = AttackPattern.IDLE;
        }

        mob.getPersistentDataContainer().set(PATTERN_KEY, PersistentDataType.SHORT, pattern);
    }

    @Override
    public void onMobTick(@Nonnull LivingEntity entity, int tick) {
        Zombie shenhuajiangshi = (Zombie) entity;

        short pattern = entity.getPersistentDataContainer().get(PATTERN_KEY, PersistentDataType.SHORT);

        if (pattern == AttackPattern.CHARGE) {
            Collection<Entity> entities = shenhuajiangshi.getWorld().getNearbyEntities(shenhuajiangshi.getLocation(), 1.6, 1.6, 1.6);

            if (tick % 10 == 0) {
                for (Entity player : entities) {
                    if (player instanceof Player && ((Player) player).getGameMode() == GameMode.SURVIVAL) {
                        shenhuajiangshi.attack(player);
                    }
                }
            }

            entities = shenhuajiangshi.getWorld().getNearbyEntities(shenhuajiangshi.getLocation(), 10, 10, 10);

            for (Entity player : entities) {
                if (player instanceof Player && ((Player) player).getGameMode() == GameMode.SURVIVAL) {
                    shenhuajiangshi.setTarget((LivingEntity) player);
                    if ((tick + 2) % 3 == 0) {
                        // TODO find out why this sometimes produces error
                        try {
                            shenhuajiangshi.setVelocity(player.getLocation().toVector().subtract(entity.getLocation().toVector()).normalize().multiply(0.32));
                        } catch (IllegalArgumentException e) { }
                    }
                }
            }
        } else if (pattern == AttackPattern.SHOOT) {
            if (shenhuajiangshi.getTarget() != null) {
                if (tick % 5 == 0) {
                    Arrow arrow = entity.launchProjectile(Arrow.class);
                    arrow.setDamage(24);
                    arrow.setColor(Color.LIME);
                    arrow.setGlowing(true);
                    arrow.setSilent(true);
                    arrow.setGravity(false);
                    arrow.setVelocity(shenhuajiangshi.getTarget().getLocation().toVector().subtract(shenhuajiangshi.getLocation().toVector()).normalize().multiply(1.42));
                }
            }
        }
    }
}
