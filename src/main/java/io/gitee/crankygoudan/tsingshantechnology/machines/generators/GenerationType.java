package io.gitee.crankygoudan.tsingshantechnology.machines.generators;

import javax.annotation.Nonnull;

import org.bukkit.World;
import org.bukkit.block.Block;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum GenerationType {


    PAOPAOFADIANJI("跑跑发电机")
    {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            return def;
        }
    },



    I_FADIANJI_FDL("?????") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            return def;
        }
    };



    @Getter
    private final String toString;

    protected abstract int generate(@Nonnull World world, @Nonnull Block block, int def);

}
