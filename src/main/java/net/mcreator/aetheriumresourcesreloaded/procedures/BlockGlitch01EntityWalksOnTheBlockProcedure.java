package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModMobEffects;

public class BlockGlitch01EntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(AetheriumResourcesReloadedModMobEffects.CORRUPTED_EFFECT.get(), 60, 1, false, false));
	}
}
