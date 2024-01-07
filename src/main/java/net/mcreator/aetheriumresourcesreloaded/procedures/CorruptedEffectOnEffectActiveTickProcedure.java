package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CorruptedEffectOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double efeito = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("corruption").bypassArmor(), 1);
		{
			Entity _ent = entity;
			_ent.setYRot(Mth.nextInt(RandomSource.create(), 0, 120));
			_ent.setXRot(Mth.nextInt(RandomSource.create(), 0, 120));
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
