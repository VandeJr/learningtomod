package vandejr.learningtomod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import vandejr.learningtomod.block.ModBlocks;
import vandejr.learningtomod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE, 0.7f, 200, "citrine");
        offerSmelting(exporter, List.of(ModBlocks.CITRINE_ORE), RecipeCategory.MISC, ModItems.CITRINE, 0.7f, 200, "citrine");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_CITRINE_ORE), RecipeCategory.MISC, ModItems.CITRINE, 0.8f, 200, "citrine");

        offerBlasting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE, 0.7f, 100, "citrine");
        offerBlasting(exporter, List.of(ModBlocks.CITRINE_ORE), RecipeCategory.MISC, ModItems.CITRINE, 0.7f, 100, "citrine");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_CITRINE_ORE), RecipeCategory.MISC, ModItems.CITRINE, 0.8f, 100, "citrine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CITRINE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CITRINE_BLOCK);
    }
}
