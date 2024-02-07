
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.aetheriumresourcesreloaded.procedures.GoldenGearsOnPlayerStoppedUsingProcedure;
import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModTabs;

public class GoldenGearsItem extends Item {
	public GoldenGearsItem() {
		super(new Item.Properties().tab(AetheriumResourcesReloadedModTabs.TAB_ITENS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GoldenGearsOnPlayerStoppedUsingProcedure.execute(entity);
		return retval;
	}
}
