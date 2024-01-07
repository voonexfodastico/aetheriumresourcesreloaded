package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModMobEffects;
import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

public class GlitchSyringeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(AetheriumResourcesReloadedModMobEffects.CORRUPTED_EFFECT.get(), 100, 1));
		if (sourceentity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(AetheriumResourcesReloadedModItems.GLITCH_SYRINGE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (sourceentity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(AetheriumResourcesReloadedModItems.SYRINGE.get());
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}
