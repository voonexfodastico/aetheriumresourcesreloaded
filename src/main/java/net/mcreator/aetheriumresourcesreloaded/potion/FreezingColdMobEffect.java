
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.FreezingColdOnEffectActiveTickProcedure;

public class FreezingColdMobEffect extends MobEffect {
	public FreezingColdMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12944260);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.freezing_cold";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezingColdOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
