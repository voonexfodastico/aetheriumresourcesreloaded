
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aetheriumresourcesreloaded.item.SyringeItem;
import net.mcreator.aetheriumresourcesreloaded.item.ScrewsItem;
import net.mcreator.aetheriumresourcesreloaded.item.RedstoneGearsItem;
import net.mcreator.aetheriumresourcesreloaded.item.RealityMisfortuneItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicPlayerItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscYREItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscWakeUPItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscInfinitusItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscFalseRealityItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscFallingApartItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscDistortionItem;
import net.mcreator.aetheriumresourcesreloaded.item.MusicDiscCorruptioItem;
import net.mcreator.aetheriumresourcesreloaded.item.HauntedMaskItem;
import net.mcreator.aetheriumresourcesreloaded.item.GoldenGearsItem;
import net.mcreator.aetheriumresourcesreloaded.item.GlitchyGearsItem;
import net.mcreator.aetheriumresourcesreloaded.item.GlitchingWarAxeItem;
import net.mcreator.aetheriumresourcesreloaded.item.GlitchingSwordItem;
import net.mcreator.aetheriumresourcesreloaded.item.GlitchingMatterItem;
import net.mcreator.aetheriumresourcesreloaded.item.GlitchSyringeItem;
import net.mcreator.aetheriumresourcesreloaded.item.GearsItem;
import net.mcreator.aetheriumresourcesreloaded.item.EnergyDrinkItem;
import net.mcreator.aetheriumresourcesreloaded.item.EnchantedGoldenGearsItem;
import net.mcreator.aetheriumresourcesreloaded.item.DimensionalBreakerItem;
import net.mcreator.aetheriumresourcesreloaded.item.DemonicalHandItem;
import net.mcreator.aetheriumresourcesreloaded.item.DarkMatterItem;
import net.mcreator.aetheriumresourcesreloaded.item.CrowbarItem;
import net.mcreator.aetheriumresourcesreloaded.item.CorruptedFragmentItem;
import net.mcreator.aetheriumresourcesreloaded.item.CalamityItem;
import net.mcreator.aetheriumresourcesreloaded.item.BloodSyringeItem;
import net.mcreator.aetheriumresourcesreloaded.item.BloodBottleItem;
import net.mcreator.aetheriumresourcesreloaded.item.AlphaPlushieItem;
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
	public static final RegistryObject<Item> INFECTED_GRASS_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_GRASS_BLOCK, null);
	public static final RegistryObject<Item> INFECTED_DIRT_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_DIRT_BLOCK, null);
	public static final RegistryObject<Item> INFECTED_SAND_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_SAND_BLOCK, null);
	public static final RegistryObject<Item> INFECTED_RED_SAND_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_RED_SAND_BLOCK, null);
	public static final RegistryObject<Item> INFECTED_STONE_BLOCK = block(AetheriumResourcesReloadedModBlocks.INFECTED_STONE_BLOCK, null);
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
	public static final RegistryObject<Item> GLITCHING_SWORD = REGISTRY.register("glitching_sword", () -> new GlitchingSwordItem());
	public static final RegistryObject<Item> GLITCHING_WAR_AXE = REGISTRY.register("glitching_war_axe", () -> new GlitchingWarAxeItem());
	public static final RegistryObject<Item> REALITY_MISFORTUNE = REGISTRY.register("reality_misfortune", () -> new RealityMisfortuneItem());
	public static final RegistryObject<Item> CALAMITY = REGISTRY.register("calamity", () -> new CalamityItem());
	public static final RegistryObject<Item> CROWBAR = REGISTRY.register("crowbar", () -> new CrowbarItem());
	public static final RegistryObject<Item> MINI_ALPHA = block(AetheriumResourcesReloadedModBlocks.MINI_ALPHA, null);
	public static final RegistryObject<Item> DARK_MATTER = REGISTRY.register("dark_matter", () -> new DarkMatterItem());
	public static final RegistryObject<Item> DIMENSIONAL_BREAKER = REGISTRY.register("dimensional_breaker", () -> new DimensionalBreakerItem());
	public static final RegistryObject<Item> SYRINGE = REGISTRY.register("syringe", () -> new SyringeItem());
	public static final RegistryObject<Item> BLOOD_SYRINGE = REGISTRY.register("blood_syringe", () -> new BloodSyringeItem());
	public static final RegistryObject<Item> GLITCH_SYRINGE = REGISTRY.register("glitch_syringe", () -> new GlitchSyringeItem());
	public static final RegistryObject<Item> VOID_STONE = block(AetheriumResourcesReloadedModBlocks.VOID_STONE, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> VOID_MATTER_BLOCK = block(AetheriumResourcesReloadedModBlocks.VOID_MATTER_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOOD_BOTTLE = REGISTRY.register("blood_bottle", () -> new BloodBottleItem());
	public static final RegistryObject<Item> PURPLE_POPPY = block(AetheriumResourcesReloadedModBlocks.PURPLE_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLUE_POPPY = block(AetheriumResourcesReloadedModBlocks.BLUE_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_POPPY = block(AetheriumResourcesReloadedModBlocks.LIGHT_BLUE_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> PINK_POPPY = block(AetheriumResourcesReloadedModBlocks.PINK_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> GREEN_POPPY = block(AetheriumResourcesReloadedModBlocks.GREEN_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> YELLOW_POPPY = block(AetheriumResourcesReloadedModBlocks.YELLOW_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> ORANGE_POPPY = block(AetheriumResourcesReloadedModBlocks.ORANGE_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> WHITE_POPPY = block(AetheriumResourcesReloadedModBlocks.WHITE_POPPY, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> GEARS = REGISTRY.register("gears", () -> new GearsItem());
	public static final RegistryObject<Item> REDSTONE_GEARS = REGISTRY.register("redstone_gears", () -> new RedstoneGearsItem());
	public static final RegistryObject<Item> GOLDEN_GEARS = REGISTRY.register("golden_gears", () -> new GoldenGearsItem());
	public static final RegistryObject<Item> ENCHANTED_GOLDEN_GEARS = REGISTRY.register("enchanted_golden_gears", () -> new EnchantedGoldenGearsItem());
	public static final RegistryObject<Item> GLITCHY_GEARS = REGISTRY.register("glitchy_gears", () -> new GlitchyGearsItem());
	public static final RegistryObject<Item> SCREWS = REGISTRY.register("screws", () -> new ScrewsItem());
	public static final RegistryObject<Item> INFECTED_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_TERRACOTTA, null);
	public static final RegistryObject<Item> INFECTED_WHITE_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_WHITE_TERRACOTTA, null);
	public static final RegistryObject<Item> INFECTED_RED_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_RED_TERRACOTTA, null);
	public static final RegistryObject<Item> INFECTED_YELLOW_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_YELLOW_TERRACOTTA, null);
	public static final RegistryObject<Item> INFECTED_ORANGE_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_ORANGE_TERRACOTTA, null);
	public static final RegistryObject<Item> INFECTED_LIGHT_GRAY_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_LIGHT_GRAY_TERRACOTTA, null);
	public static final RegistryObject<Item> INFECTED_BROWN_TERRACOTTA = block(AetheriumResourcesReloadedModBlocks.INFECTED_BROWN_TERRACOTTA, null);
	public static final RegistryObject<Item> ENERGY_DRINK = REGISTRY.register("energy_drink", () -> new EnergyDrinkItem());
	public static final RegistryObject<Item> HAUNTED_MASK_HELMET = REGISTRY.register("haunted_mask_helmet", () -> new HauntedMaskItem.Helmet());
	public static final RegistryObject<Item> ALPHA_PLUSHIE = REGISTRY.register("alpha_plushie", () -> new AlphaPlushieItem());
	public static final RegistryObject<Item> BLOOD_BLOCK = block(AetheriumResourcesReloadedModBlocks.BLOOD_BLOCK, AetheriumResourcesReloadedModTabs.TAB_BLOCOS_CREATIVE_TAB);
	public static final RegistryObject<Item> DEMONICAL_HAND = REGISTRY.register("demonical_hand", () -> new DemonicalHandItem());
	public static final RegistryObject<Item> MUSIC_PLAYER = REGISTRY.register("music_player", () -> new MusicPlayerItem());
	public static final RegistryObject<Item> GATO_JOIA_BLOCK = block(AetheriumResourcesReloadedModBlocks.GATO_JOIA_BLOCK, null);
	public static final RegistryObject<Item> GATO_JOIA_SPAWN_EGG = REGISTRY.register("gato_joia_spawn_egg", () -> new ForgeSpawnEggItem(AetheriumResourcesReloadedModEntities.GATO_JOIA, -1907998, -10662084, new Item.Properties().tab(null)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
