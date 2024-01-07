package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

public class SyringeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AetheriumResourcesReloadedModItems.SYRINGE.get()) {
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
		}
	}
}
