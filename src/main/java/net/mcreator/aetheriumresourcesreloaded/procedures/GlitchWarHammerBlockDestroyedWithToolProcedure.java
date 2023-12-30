package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GlitchWarHammerBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos(x + 1, y, z), false);
		world.destroyBlock(new BlockPos(x - 1, y, z), false);
		world.destroyBlock(new BlockPos(x, y + 1, z), false);
		world.destroyBlock(new BlockPos(x, y - 1, z), false);
		world.destroyBlock(new BlockPos(x, y, z + 1), false);
		world.destroyBlock(new BlockPos(x, y, z - 1), false);
		world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
		world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
		world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
		world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
		world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
		world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
		world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
		world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
	}
}
