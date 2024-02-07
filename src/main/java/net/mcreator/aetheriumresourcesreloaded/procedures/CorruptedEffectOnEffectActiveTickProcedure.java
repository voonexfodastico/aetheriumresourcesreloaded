package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
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
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (entity instanceof Player _player_) {
			if (!_player_.getMainHandItem().isEmpty()) {
				_player_.drop(_player_.getMainHandItem(), true);
				_player_.setItemInHand(InteractionHand.MAIN_HAND, ItemStack.EMPTY);
			}
			_player_.getInventory().setChanged();
		}
		if (entity instanceof Player _player_) {
			if (!_player_.getOffhandItem().isEmpty()) {
				_player_.drop(_player_.getOffhandItem(), true);
				_player_.setItemInHand(InteractionHand.OFF_HAND, ItemStack.EMPTY);
				_player_.getInventory().setChanged();
			}
		}
	}
}
