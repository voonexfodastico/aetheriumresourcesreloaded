package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

public class InfectedOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == AetheriumResourcesReloadedModItems.HAUNTED_MASK_HELMET.get()
				&& Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
			return true;
		}
		return false;
	}
}
