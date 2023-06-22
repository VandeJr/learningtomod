package vandejr.learningtomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import vandejr.learningtomod.LearningToMod;
import vandejr.learningtomod.block.ModBlocks;

public class ModItemGroup {

    public static ItemGroup CITRINE = Registry.register(Registries.ITEM_GROUP, new Identifier(LearningToMod.MOD_ID, "citrine"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.citrine"))
                    .icon(() -> new ItemStack(ModItems.CITRINE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);

                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);

                        entries.add(ModBlocks.RED_MAPLE_LOG);
                        entries.add(ModBlocks.RED_MAPLE_WOOD);
                        entries.add(ModBlocks.RED_MAPLE_PLANKS);
                        entries.add(ModBlocks.RED_MAPLE_SAPLING);
                        entries.add(ModBlocks.STRIPPED_RED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);
                    })
                    .build());


    public static void registerItemGroups(){
        LearningToMod.LOGGER.debug("Registering Mod Group for " + LearningToMod.MOD_ID);
    }
}
