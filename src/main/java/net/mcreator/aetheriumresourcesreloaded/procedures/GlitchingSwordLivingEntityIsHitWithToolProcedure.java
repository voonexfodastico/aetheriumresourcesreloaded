package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModMobEffects;

public class GlitchingSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(AetheriumResourcesReloadedModMobEffects.CORRUPTED_EFFECT.get(), 40, 1));
		}
	}
}
