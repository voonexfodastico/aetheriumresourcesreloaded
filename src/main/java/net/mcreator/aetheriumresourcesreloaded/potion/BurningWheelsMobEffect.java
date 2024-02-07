
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.BurningWheelsOnEffectActiveTickProcedure;

public class BurningWheelsMobEffect extends MobEffect {
	public BurningWheelsMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.burning_wheels";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BurningWheelsOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
