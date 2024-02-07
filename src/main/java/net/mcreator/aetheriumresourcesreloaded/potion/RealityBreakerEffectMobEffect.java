
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.RealityBreakerEffectOnEffectActiveTickProcedure;

public class RealityBreakerEffectMobEffect extends MobEffect {
	public RealityBreakerEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -4041985);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.reality_breaker_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RealityBreakerEffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
