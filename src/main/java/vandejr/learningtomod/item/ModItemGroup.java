package vandejr.learningtomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import vandejr.learningtomod.LearningToMod;

public class ModItemGroup {

    public static ItemGroup CITRINE = Registry.register(Registries.ITEM_GROUP, new Identifier(LearningToMod.MOD_ID, "citrine"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.citrine"))
                    .icon(() -> new ItemStack(ModItems.CITRINE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);
                    })
                    .build());

    public static void registerItemGroups(){
        LearningToMod.LOGGER.debug("Registering Mod Group for " + LearningToMod.MOD_ID);
    }
}
