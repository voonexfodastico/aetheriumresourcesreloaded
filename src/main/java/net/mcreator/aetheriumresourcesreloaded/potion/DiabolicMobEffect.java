
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.DiabolicOnEffectActiveTickProcedure;

public class DiabolicMobEffect extends MobEffect {
	public DiabolicMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1165770);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.diabolic";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DiabolicOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
