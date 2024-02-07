
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.MoonlightEffectOnEffectActiveTickProcedure;

public class MoonlightEffectMobEffect extends MobEffect {
	public MoonlightEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6291473);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.moonlight_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MoonlightEffectOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
