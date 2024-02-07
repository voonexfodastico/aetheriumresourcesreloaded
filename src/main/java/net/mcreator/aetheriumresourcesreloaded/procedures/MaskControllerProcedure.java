package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.aetheriumresourcesreloaded.network.AetheriumResourcesReloadedModVariables;

import java.util.Comparator;

public class MaskControllerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty() && !(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) == entity)) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getStringUUID()));
				}
			}
			if ((entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).mask >= 120) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:entity.warden.heartbeat master @p ~ ~ ~");
				if (Minecraft.getInstance().options.languageCode.equals("pt_br")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"title @p title {\"text\":\"MATE-O\",\"color\":\"light_purple\"}");
				} else if (Minecraft.getInstance().options.languageCode.equals("en_us")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"title @p title {\"text\":\"KILL IT\",\"color\":\"light_purple\"}");
				}
				{
					double _setval = 0;
					entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.mask = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		{
			double _setval = (entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AetheriumResourcesReloadedModVariables.PlayerVariables())).mask + 1;
			entity.getCapability(AetheriumResourcesReloadedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.mask = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
