
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AetheriumResourcesReloadedModTabs {
	public static CreativeModeTab TAB_BLOCOS_CREATIVE_TAB;
	public static CreativeModeTab TAB_ITENS_CREATIVE_TAB;

	public static void load() {
		TAB_BLOCOS_CREATIVE_TAB = new CreativeModeTab("tabblocos_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITENS_CREATIVE_TAB = new CreativeModeTab("tabitens_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AetheriumResourcesReloadedModItems.GLITCHING_MATTER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
