package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModBlocks;

import java.util.UUID;

public class FlowerFieldEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		double flower = 0;
		ItemStack modifier = ItemStack.EMPTY;
		if (!world.isClientSide()) {
			random = Math.random();
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK && ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR)
					&& random <= 0.05) {
				flower = Mth.nextInt(RandomSource.create(), 1, 9);
				if (flower == 1) {
					world.setBlock(new BlockPos(x, y, z), Blocks.POPPY.defaultBlockState(), 3);
				} else if (flower == 2) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.ORANGE_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 3) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.YELLOW_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 4) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.GREEN_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 5) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.LIGHT_BLUE_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 6) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.BLUE_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 7) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.PURPLE_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 8) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.PINK_POPPY.get().defaultBlockState(), 3);
				} else if (flower == 9) {
					world.setBlock(new BlockPos(x, y, z), AetheriumResourcesReloadedModBlocks.WHITE_POPPY.get().defaultBlockState(), 3);
				}
			} else if (random >= 0.2) {
				random = Math.random();
			}
			if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("flower_forest"))) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
						.hasModifier((new AttributeModifier(UUID.fromString("75051d5d-c0d3-4924-858e-324520f8e76a"), "flowerfield", 1.2, AttributeModifier.Operation.MULTIPLY_BASE)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
							.addTransientModifier((new AttributeModifier(UUID.fromString("75051d5d-c0d3-4924-858e-324520f8e76a"), "flowerfield", 1.2, AttributeModifier.Operation.MULTIPLY_BASE)));
			} else if (!world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("flower_forest"))) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("75051d5d-c0d3-4924-858e-324520f8e76a"));
			}
		}
	}
}
