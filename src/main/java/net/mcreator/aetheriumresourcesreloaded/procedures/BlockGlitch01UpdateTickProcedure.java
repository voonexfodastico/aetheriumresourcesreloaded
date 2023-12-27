package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModBlocks;

public class BlockGlitch01UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.5) {
			if (!((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get() || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get())) {
				world.setBlock(BlockPos.containing(x + 0, y + 1, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get())) {
				world.setBlock(BlockPos.containing(x + 0, y - 1, z - 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get())) {
				world.setBlock(BlockPos.containing(x + 1, y + 0, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x - 1, y + 0, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x + 0, y + 0, z + 1), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x + 0, y + 0, z - 1), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x + 0, y + 0, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get().defaultBlockState(), 3);
			}
		} else if (Math.random() >= 0.6) {
			if (!((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get() || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get())) {
				world.setBlock(BlockPos.containing(x + 0, y + 1, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get())) {
				world.setBlock(BlockPos.containing(x + 0, y - 1, z - 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.AIR
					|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get())) {
				world.setBlock(BlockPos.containing(x + 1, y + 0, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get()
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x - 1, y + 0, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x + 0, y + 0, z + 1), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			} else if (!((world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_04.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_03.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.BEDROCK
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_01.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get()
					|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.AIR)) {
				world.setBlock(BlockPos.containing(x + 0, y + 0, z - 1), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x + 0, y + 0, z + 0), AetheriumResourcesReloadedModBlocks.BLOCK_GLITCH_02.get().defaultBlockState(), 3);
			}
		}
	}
}
