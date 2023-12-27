
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AetheriumResourcesReloadedModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("aetherium_resources_reloaded", "blocos_creative_tab"), builder -> builder.title(Component.translatable("item_group.aetherium_resources_reloaded.blocos_creative_tab"))
				.icon(() -> new ItemStack(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01_DECORATIVE.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02_DECORATIVE.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.INFECTED_GRASS_BLOCK.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.INFECTED_DIRT_BLOCK.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.INFECTED_SAND_BLOCK.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.INFECTED_RED_SAND_BLOCK.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.INFECTED_STONE_BLOCK.get().asItem());
					tabData.accept(AetheriumResourcesReloadedModBlocks.PANE_BLOCK_GLITCH_03.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("aetherium_resources_reloaded", "itens_creative_tab"), builder -> builder.title(Component.translatable("item_group.aetherium_resources_reloaded.itens_creative_tab"))
				.icon(() -> new ItemStack(AetheriumResourcesReloadedModItems.GLITCHING_MATTER.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AetheriumResourcesReloadedModItems.GLITCHING_MATTER.get());
					tabData.accept(AetheriumResourcesReloadedModItems.CORRUPTED_FRAGMENT.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_CORRUPTIO.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_FALLING_APART.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_INFINITUS.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_FALSE_REALITY.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_WAKE_UP.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_YRE.get());
					tabData.accept(AetheriumResourcesReloadedModItems.MUSIC_DISC_DISTORTION.get());
				})

		);
	}
}
