package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.network.chat.Component;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

public class SyringeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double durabilidade = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AetheriumResourcesReloadedModItems.SYRINGE.get()) {
			{
				ItemStack _ist = new ItemStack(AetheriumResourcesReloadedModItems.SYRINGE.get());
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			durabilidade = (new ItemStack(AetheriumResourcesReloadedModItems.SYRINGE.get())).getDamageValue();
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(AetheriumResourcesReloadedModItems.BLOOD_SYRINGE.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1, false, false));
			((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setHoverName(Component.literal((Component.translatable("procedure.text.syringe").getString() + "" + entity.getDisplayName().getString())));
			if (durabilidade < 238) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) (durabilidade - 1));
				durabilidade = durabilidade - 1;
			} else if (durabilidade == 238) {
				{
					ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		}
	}
}
