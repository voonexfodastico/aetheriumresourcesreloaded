package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.UUID;

public class SunshineEffectOnTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		double flower = 0;
		ItemStack modifier = ItemStack.EMPTY;
		if (!world.isClientSide()) {
			if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) == 15) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
						.hasModifier((new AttributeModifier(UUID.fromString("736d226a-278e-4f49-85c2-0dfbf6cf439a"), "sunshine", 0.6, AttributeModifier.Operation.MULTIPLY_BASE)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
							.addTransientModifier((new AttributeModifier(UUID.fromString("736d226a-278e-4f49-85c2-0dfbf6cf439a"), "sunshine", 0.6, AttributeModifier.Operation.MULTIPLY_BASE)));
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
						.hasModifier((new AttributeModifier(UUID.fromString("3e4b480f-ce56-4dc3-87a2-33fe0aa306fd"), "sunshine2", 2, AttributeModifier.Operation.ADDITION)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
							.addTransientModifier((new AttributeModifier(UUID.fromString("3e4b480f-ce56-4dc3-87a2-33fe0aa306fd"), "sunshine2", 2, AttributeModifier.Operation.ADDITION)));
			} else if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 15) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("736d226a-278e-4f49-85c2-0dfbf6cf439a"));
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removeModifier(UUID.fromString("3e4b480f-ce56-4dc3-87a2-33fe0aa306fd"));
			}
			if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) <= 10) {
				if (world.getBlockState(new BlockPos(x, y, z)).getLightEmission(world, new BlockPos(x, y, z)) <= 12) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 1, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 0, false, false));
				}
			}
			if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert"))) {
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
						.hasModifier((new AttributeModifier(UUID.fromString("9a63ee94-07d3-4890-bee8-e9736c2a4bb7"), "sunshine3", 0.6, AttributeModifier.Operation.MULTIPLY_BASE)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
							.addTransientModifier((new AttributeModifier(UUID.fromString("9a63ee94-07d3-4890-bee8-e9736c2a4bb7"), "sunshine3", 0.6, AttributeModifier.Operation.MULTIPLY_BASE)));
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
						.hasModifier((new AttributeModifier(UUID.fromString("d69baaa5-1dfb-4cc7-a07d-d29b8b4c6670"), "sunshine4", 2, AttributeModifier.Operation.ADDITION)))))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
							.addTransientModifier((new AttributeModifier(UUID.fromString("d69baaa5-1dfb-4cc7-a07d-d29b8b4c6670"), "sunshine4", 2, AttributeModifier.Operation.ADDITION)));
			} else if (!world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert")) || !world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert"))
					|| !world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("desert"))) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("9a63ee94-07d3-4890-bee8-e9736c2a4bb7"));
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removeModifier(UUID.fromString("d69baaa5-1dfb-4cc7-a07d-d29b8b4c6670"));
			}
			if (entity.isInWaterRainOrBubble()) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getY() - 0.5), (entity.getDeltaMovement().z())));
			}
		}
	}
}
