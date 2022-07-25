package io.gitee.crankygoudan.tsingshantechnology.jieko;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class CustomArmorTaskTest extends BukkitRunnable {

    private int counter = 0;

    public CustomArmorTaskTest() {

    }

    @Override
    public void run() {
        for (Player p : Bukkit.getServer ().getOnlinePlayers ()) {
            makeParticleSinCircle ( 1.5, p, 6, .5 );
        }
    }

    public void makeParticleSinCircle(double radius, Player player, int waves, double heightOffset) {

        if (player == null) {
            this.cancel ();
            return;
        }
        int degree = 0;
        double radians = Math.toRadians ( degree );
        double x = Math.cos ( radians ) * radius;
        double y = Math.sin ( radians * waves ) * heightOffset;
        double z = Math.sin ( radians ) * radius;
        if (counter < 101) {
            Location particleLoc = player.getLocation ().add ( x, y, z );
            player.getWorld ().spawnParticle ( Particle.END_ROD, particleLoc, 0 );
        }
        counter++;
        if (counter == 150) {
            counter = 0;
        }
    }
}
