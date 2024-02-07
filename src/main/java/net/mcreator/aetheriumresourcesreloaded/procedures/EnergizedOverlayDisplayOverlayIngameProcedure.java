package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModMobEffects;

public class EnergizedOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AetheriumResourcesReloadedModMobEffects.ENERGIZED_EFFECT.get()) : false;
	}
}
