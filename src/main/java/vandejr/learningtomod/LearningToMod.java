package vandejr.learningtomod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vandejr.learningtomod.item.ModItemGroup;
import vandejr.learningtomod.item.ModItems;

public class LearningToMod implements ModInitializer {
	public static final String MOD_ID = "learningtomod";
	public static final Logger LOGGER = LoggerFactory.getLogger("learningtomod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}