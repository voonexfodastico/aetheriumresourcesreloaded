
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.EnergizedEffectOnEffectActiveTickProcedure;

public class EnergizedEffectMobEffect extends MobEffect {
	public EnergizedEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10027162);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.energized_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnergizedEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
