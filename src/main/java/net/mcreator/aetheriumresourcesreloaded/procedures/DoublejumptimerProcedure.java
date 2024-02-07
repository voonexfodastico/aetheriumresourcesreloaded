package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.aetheriumresourcesreloaded.network.AetheriumResourcesReloadedModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DoublejumptimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).doublejump - 1;
			entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.doublejump = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
