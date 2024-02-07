package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class SunshineEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getModifier(UUID.fromString("736d226a-278e-4f49-85c2-0dfbf6cf439a")) != null
				|| ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getModifier(UUID.fromString("3e4b480f-ce56-4dc3-87a2-33fe0aa306fd")) != null) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("736d226a-278e-4f49-85c2-0dfbf6cf439a"));
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removeModifier(UUID.fromString("3e4b480f-ce56-4dc3-87a2-33fe0aa306fd"));
		}
		if (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getModifier(UUID.fromString("9a63ee94-07d3-4890-bee8-e9736c2a4bb7")) != null
				|| ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getModifier(UUID.fromString("d69baaa5-1dfb-4cc7-a07d-d29b8b4c6670")) != null) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("9a63ee94-07d3-4890-bee8-e9736c2a4bb7"));
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removeModifier(UUID.fromString("d69baaa5-1dfb-4cc7-a07d-d29b8b4c6670"));
		}
	}
}
