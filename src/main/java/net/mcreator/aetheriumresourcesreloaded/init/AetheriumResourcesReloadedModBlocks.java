
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.aetheriumresourcesreloaded.block.PaneBlockGlitch03Block;
import net.mcreator.aetheriumresourcesreloaded.block.InfectedStoneBlockBlock;
import net.mcreator.aetheriumresourcesreloaded.block.InfectedSandBlockBlock;
import net.mcreator.aetheriumresourcesreloaded.block.InfectedRedSandBlockBlock;
import net.mcreator.aetheriumresourcesreloaded.block.InfectedGrassBlockBlock;
import net.mcreator.aetheriumresourcesreloaded.block.InfectedDirtBlockBlock;
import net.mcreator.aetheriumresourcesreloaded.block.BlockGlitch04Block;
import net.mcreator.aetheriumresourcesreloaded.block.BlockGlitch03Block;
import net.mcreator.aetheriumresourcesreloaded.block.BlockGlitch02DecorativeBlock;
import net.mcreator.aetheriumresourcesreloaded.block.BlockGlitch02Block;
import net.mcreator.aetheriumresourcesreloaded.block.BlockGlitch01DecorativeBlock;
import net.mcreator.aetheriumresourcesreloaded.block.BlockGlitch01Block;
import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<Block> BLOCK_GLITCH_01 = REGISTRY.register("block_glitch_01", () -> new BlockGlitch01Block());
	public static final RegistryObject<Block> BLOCK_GLITCH_01_DECORATIVE = REGISTRY.register("block_glitch_01_decorative", () -> new BlockGlitch01DecorativeBlock());
	public static final RegistryObject<Block> BLOCK_GLITCH_02 = REGISTRY.register("block_glitch_02", () -> new BlockGlitch02Block());
	public static final RegistryObject<Block> BLOCK_GLITCH_02_DECORATIVE = REGISTRY.register("block_glitch_02_decorative", () -> new BlockGlitch02DecorativeBlock());
	public static final RegistryObject<Block> BLOCK_GLITCH_03 = REGISTRY.register("block_glitch_03", () -> new BlockGlitch03Block());
	public static final RegistryObject<Block> BLOCK_GLITCH_04 = REGISTRY.register("block_glitch_04", () -> new BlockGlitch04Block());
	public static final RegistryObject<Block> INFECTED_GRASS_BLOCK = REGISTRY.register("infected_grass_block", () -> new InfectedGrassBlockBlock());
	public static final RegistryObject<Block> INFECTED_DIRT_BLOCK = REGISTRY.register("infected_dirt_block", () -> new InfectedDirtBlockBlock());
	public static final RegistryObject<Block> INFECTED_SAND_BLOCK = REGISTRY.register("infected_sand_block", () -> new InfectedSandBlockBlock());
	public static final RegistryObject<Block> INFECTED_RED_SAND_BLOCK = REGISTRY.register("infected_red_sand_block", () -> new InfectedRedSandBlockBlock());
	public static final RegistryObject<Block> INFECTED_STONE_BLOCK = REGISTRY.register("infected_stone_block", () -> new InfectedStoneBlockBlock());
	public static final RegistryObject<Block> PANE_BLOCK_GLITCH_03 = REGISTRY.register("pane_block_glitch_03", () -> new PaneBlockGlitch03Block());
}
