package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AlphaPlushieRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (!world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetherium_resources_reloaded:yipiminialpha")), SoundSource.NEUTRAL, 1,
								(float) Mth.nextDouble(RandomSource.create(), 0.1, 1));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetherium_resources_reloaded:yipiminialpha")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.1, 1), false);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 120);
			}
		}
	}
}
