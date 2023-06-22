package vandejr.learningtomod.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import vandejr.learningtomod.world.ModConfiguredFeatures;

public class RedMapleSaplingGenerator extends SaplingGenerator {
    public RedMapleSaplingGenerator() {
        super();
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.RED_MAPLE_KEY;
    }

}
