
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.SwimmerEffectOnEffectActiveTickProcedure;

public class SwimmerEffectMobEffect extends MobEffect {
	public SwimmerEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16759123);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.swimmer_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SwimmerEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
