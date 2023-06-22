package vandejr.learningtomod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import vandejr.learningtomod.block.ModBlocks;
import vandejr.learningtomod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        gen.registerCubeAllModelTexturePool(ModBlocks.CITRINE_BLOCK);
        gen.registerCubeAllModelTexturePool(ModBlocks.CITRINE_ORE);
        gen.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_CITRINE_ORE);

        gen.registerLog(ModBlocks.RED_MAPLE_LOG).log(ModBlocks.RED_MAPLE_LOG).wood(ModBlocks.RED_MAPLE_WOOD);
        gen.registerLog(ModBlocks.STRIPPED_RED_MAPLE_LOG).log(ModBlocks.STRIPPED_RED_MAPLE_LOG).wood(ModBlocks.STRIPPED_RED_MAPLE_WOOD);

        gen.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_PLANKS);
        gen.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_LEAVES);

        gen.registerTintableCrossBlockState(ModBlocks.RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        gen.register(ModItems.CITRINE, Models.GENERATED);
        gen.register(ModItems.RAW_CITRINE, Models.GENERATED);
    }
}
