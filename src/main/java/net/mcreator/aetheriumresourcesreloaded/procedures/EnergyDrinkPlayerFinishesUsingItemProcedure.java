package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModMobEffects;

public class EnergyDrinkPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		random = Math.random();
		if (random <= 0.5) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(AetheriumResourcesReloadedModMobEffects.ENERGIZED_EFFECT.get(), 200, 0));
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AetheriumResourcesReloadedModMobEffects.ENERGIZED_EFFECT.get()) : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1));
		}
	}
}
