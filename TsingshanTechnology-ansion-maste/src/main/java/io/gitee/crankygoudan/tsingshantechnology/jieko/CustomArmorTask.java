package io.gitee.crankygoudan.tsingshantechnology.jieko;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.github.mooy1.infinitylib.common.Scheduler;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.logging.Level;

import static io.github.mooy1.infinitylib.core.AbstractAddon.log;

public class CustomArmorTask extends BukkitRunnable {
    private int counter = 0;
    private int degree = 0;

    public CustomArmorTask() {

    }

    @Override
    public void run() {
        for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            makeParticleSinCircle(1.5, 6, 0.4);
        }
    }

    public void makeParticleSinCircle(double radius, int waves, double heightOffset) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (!player.isValid() || player.isDead()) {
                continue;
            }
            ItemStack helmetStack = player.getInventory().getHelmet();
            SlimefunItem helmetSfStack = SlimefunItem.getByItem(helmetStack);
            ItemStack chestStack = player.getInventory().getChestplate();
            SlimefunItem chestSfStack = SlimefunItem.getByItem(chestStack);
            ItemStack legStack = player.getInventory().getLeggings();
            SlimefunItem legSfStack = SlimefunItem.getByItem(legStack);
            ItemStack bootStack = player.getInventory().getBoots();
            SlimefunItem bootSfStack = SlimefunItem.getByItem(bootStack);
            if (helmetSfStack instanceof Armor &&
                    chestSfStack instanceof Armor &&
                    legSfStack instanceof Armor &&
                    bootSfStack instanceof Armor) {
                if (player == null) {
                    this.cancel();
                    return;
                }
                double radians = Math.toRadians(degree);
                double x = Math.cos(radians) * radius;
                double y = Math.sin(radians * waves) * heightOffset;
                double z = Math.sin(radians) * radius;
                if(counter < (20*30)+1) {
                    Location particleLoc = player.getLocation().add(x, y, z);
                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                    Bukkit.getScheduler().runTaskLater( TsingshanTechnology.i(), () -> {
                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                        this.degree++;
                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                            this.degree++;
                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                this.degree++;
                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                    this.degree++;
                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                        this.degree++;
                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                            this.degree++;
                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                this.degree++;
                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                    this.degree++;
                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                        this.degree++;
                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                            this.degree++;
                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                this.degree++;
                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                    this.degree++;
                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                        this.degree++;
                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                            this.degree++;
                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                this.degree++;
                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                    this.degree++;
                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                        this.degree++;
                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                            this.degree++;
                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                this.degree++;
                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                    this.degree++;
                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                        this.degree++;
                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                            this.degree++;
                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                this.degree++;
                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                    this.degree++;
                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                        this.degree++;
                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                            this.degree++;
                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                this.degree++;
                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                    this.degree++;
                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                        this.degree++;
                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                            this.degree++;
                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                this.degree++;
                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                    this.degree++;
                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                        this.degree++;
                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                            this.degree++;
                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                this.degree++;
                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                    this.degree++;
                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                        this.degree++;
                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                            this.degree++;
                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                this.degree++;
                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                                this.degree++;
                                                                                                                                                                                                                                                                                                Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                                    player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                                    this.degree++;
                                                                                                                                                                                                                                                                                                    Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                                        player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                                        this.degree++;
                                                                                                                                                                                                                                                                                                        Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                                            player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                                            this.degree++;
                                                                                                                                                                                                                                                                                                            Bukkit.getScheduler().runTaskLater(TsingshanTechnology.i(), () -> {
                                                                                                                                                                                                                                                                                                                player.getWorld().spawnParticle(Particle.END_ROD, particleLoc, 0);
                                                                                                                                                                                                                                                                                                                this.degree++;

                                                                                                                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                                }, 0L);
                                                                                                                                                                                            }, 0L);
                                                                                                                                                                                        }, 0L);
                                                                                                                                                                                    }, 0L);
                                                                                                                                                                                }, 0L);
                                                                                                                                                                            }, 0L);
                                                                                                                                                                        }, 0L);
                                                                                                                                                                    }, 0L);
                                                                                                                                                                }, 0L);
                                                                                                                                                            }, 0L);
                                                                                                                                                        }, 0L);
                                                                                                                                                    }, 0L);
                                                                                                                                                }, 0L);
                                                                                                                                            }, 0L);
                                                                                                                                        }, 0L);
                                                                                                                                    }, 0L);
                                                                                                                                }, 0L);
                                                                                                                            }, 0L);
                                                                                                                        }, 0L);
                                                                                                                    }, 0L);
                                                                                                                }, 0L);
                                                                                                            }, 0L);
                                                                                                        }, 0L);
                                                                                                    }, 0L);
                                                                                                }, 0L);
                                                                                            }, 0L);
                                                                                        }, 0L);
                                                                                    }, 0L);
                                                                                }, 0L);
                                                                            }, 0L);
                                                                        }, 0L);
                                                                    }, 0L);
                                                                }, 0L);
                                                            }, 0L);
                                                        }, 0L);
                                                    }, 0L);
                                                }, 0L);
                                            }, 0L);
                                        }, 0L);
                                    }, 0L);
                                }, 0L);
                            }, 0L);
                        }, 0L);
                        counter++;}, 0L);
                }

                if(counter>20*3 && counter<20*7){
                    counter++;
                }
                if(counter==20*7){
                    counter=0;
                }
            }
        }
    }
}
