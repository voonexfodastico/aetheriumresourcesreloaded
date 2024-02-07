
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.CyberLevitationOnEffectActiveTickProcedure;

public class CyberLevitationMobEffect extends MobEffect {
	public CyberLevitationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3750202);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.cyber_levitation";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CyberLevitationOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
