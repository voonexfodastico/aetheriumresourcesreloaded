
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscYREItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscWakeUPItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscInfinitusItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscFalseRealityItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscFallingApartItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscDistortionItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscCorruptioItem;
import net.mcreator.aetheriumresourcesreloaded.item.GlitchingMatterItem;
import net.mcreator.aetheriumresourcesreloaded.item.CorruptedFragmentItem;
import net.mcreator.aetheriumresourcesreloaded.item.AetheriumLogoItem;
import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<Item> BLOCK_GLITCH_01 = block(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOCK_GLITCH_01_DECORATIVE = block(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01_DECORATIVE, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOCK_GLITCH_02 = block(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOCK_GLITCH_02_DECORATIVE = block(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02_DECORATIVE, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOCK_GLITCH_03 = block(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> PANE_BLOCK_GLITCH_03 = block(AetheriumResourcesReloadedModBlocks.PANE_BLOCK_GLITCH_03, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOCK_GLITCH_04 = block(AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> INFECTED_GRASS_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_GRASS_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> INFECTED_DIRT_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_DIRT_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> INFECTED_SAND_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_SAND_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> INFECTED_RED_SAND_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_RED_SAND_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> INFECTED_STONE_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_STONE_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> GLITCHING_MATTER = REGISTRY.register("glitching_matter", () -> new GlitchingMatterItem());
	public static final RegistryObject<Item> CORRUPTED_FRAGMENT = REGISTRY.register("corrupted_fragment", () -> new CorruptedFragmentItem());
	public static final RegistryObject<Item> MUSIC_DISC_CORRUPTIO = REGISTRY.register("music_disc_corruptio", () -> new MusicDiscCorruptioItem());
	public static final RegistryObject<Item> MUSIC_DISC_FALLING_APART = REGISTRY.register("music_disc_falling_apart", () -> new MusicDiscFallingApartItem());
	public static final RegistryObject<Item> MUSIC_DISC_INFINITUS = REGISTRY.register("music_disc_infinitus", () -> new MusicDiscInfinitusItem());
	public static final RegistryObject<Item> MUSIC_DISC_FALSE_REALITY = REGISTRY.register("music_disc_false_reality", () -> new MusicDiscFalseRealityItem());
	public static final RegistryObject<Item> MUSIC_DISC_WAKE_UP = REGISTRY.register("music_disc_wake_up", () -> new MusicDiscWakeUPItem());
	public static final RegistryObject<Item> MUSIC_DISC_YRE = REGISTRY.register("music_disc_yre", () -> new MusicDiscYREItem());
	public static final RegistryObject<Item> MUSIC_DISC_DISTORTION = REGISTRY.register("music_disc_distortion", () -> new MusicDiscDistortionItem());
	public static final RegistryObject<Item> AETHERIUM_LOGO = REGISTRY.register("aetherium_logo", () -> new AetheriumLogoItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
