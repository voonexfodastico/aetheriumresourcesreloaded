
package net.mcreator.aetheriumresourcesreloaded.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.procedures.FlowerFieldEffectOnEffectActiveTickProcedure;
import net.mcreator.aetheriumresourcesreloaded.procedures.FlowerFieldEffectEffectExpiresProcedure;

public class FlowerFieldEffectMobEffect extends MobEffect {
	public FlowerFieldEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65485);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetherium_resources_reloaded.flower_field_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FlowerFieldEffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FlowerFieldEffectEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
