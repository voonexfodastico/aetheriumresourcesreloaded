package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.aetheriumresourcesreloaded.network.AetheriumResourcesReloadedModVariables;
import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModMobEffects;

public class DoubleJumpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).doublejump < 1
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AetheriumResourcesReloadedModMobEffects.MAGNETIC_EFFECT.get()) : false)
				|| (entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).doublejump < 1
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AetheriumResourcesReloadedModMobEffects.CYBER_LEVITATION.get()) : false)
				|| (entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).doublejump < 1
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AetheriumResourcesReloadedModMobEffects.MOUNTAINEER.get()) : false)) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 1), (entity.getDeltaMovement().z())));
			{
				double _setval = 60;
				entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.doublejump = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).doublejump >= 1) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						Component.literal(("Cooldown: " + (entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).doublejump)), true);
		}
	}
}
