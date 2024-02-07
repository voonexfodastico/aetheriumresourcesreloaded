
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.MountaineerOnEffectActiveTickProcedure;

public class MountaineerMobEffect extends MobEffect {
	public MountaineerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12378085);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.mountaineer";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MountaineerOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
