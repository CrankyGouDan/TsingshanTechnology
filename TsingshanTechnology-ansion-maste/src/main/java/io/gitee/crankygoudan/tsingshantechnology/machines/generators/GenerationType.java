package io.gitee.crankygoudan.tsingshantechnology.machines.generators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.World;
import org.bukkit.block.Block;

import javax.annotation.Nonnull;

@AllArgsConstructor
public enum GenerationType {

    QS_FDJ("VIP专属发电机") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            return def;
        }
    };

    @Getter


    private final String toString;

    protected abstract int generate(@Nonnull World world, @Nonnull Block block, int def);

}
