package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

public class SyringeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack seringa_sangue = ItemStack.EMPTY;
		if (sourceentity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(AetheriumResourcesReloadedModItems.SYRINGE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(AetheriumResourcesReloadedModItems.BLOOD_SYRINGE.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1, false, false));
		((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setHoverName(Component.literal((Component.translatable("procedure.text.syringe").getString() + "" + entity.getDisplayName().getString())));
	}
}
