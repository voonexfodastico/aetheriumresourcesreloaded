
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.MagneticEffectOnEffectActiveTickProcedure;

public class MagneticEffectMobEffect extends MobEffect {
	public MagneticEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -7500403);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.magnetic_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MagneticEffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
