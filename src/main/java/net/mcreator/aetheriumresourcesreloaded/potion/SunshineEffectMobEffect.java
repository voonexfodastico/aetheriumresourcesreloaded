
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.SunshineEffectOnTickProcedure;
import net.mcreator.aetheriumresourcesreloaded.procedures.SunshineEffectExpiresProcedure;

public class SunshineEffectMobEffect extends MobEffect {
	public SunshineEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -798938);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.sunshine_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SunshineEffectOnTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SunshineEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
