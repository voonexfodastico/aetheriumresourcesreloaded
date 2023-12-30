
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.CorruptedEffectOnEffectActiveTickProcedure;
import net.mcreator.aetheriumresourcesreloaded.procedures.CorruptedEffectEffectStartedappliedProcedure;

public class CorruptedEffectMobEffect extends MobEffect {
	public CorruptedEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407668);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.corrupted_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CorruptedEffectEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CorruptedEffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
