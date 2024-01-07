
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.aetheriumresourcesreloaded.procedures.GlitchSyringePlayerFinishesUsingItemProcedure;
import net.mcreator.aetheriumresourcesreloaded.procedures.GlitchSyringeLivingEntityIsHitWithItemProcedure;
import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModTabs;
import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

public class GlitchSyringeItem extends Item {
	public GlitchSyringeItem() {
		super(new Item.Properties().tab(AetheriumResourcesReloadedModTabs.TAB_ITENS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.1f).alwaysEat()

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(AetheriumResourcesReloadedModItems.SYRINGE.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GlitchSyringePlayerFinishesUsingItemProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GlitchSyringeLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
		return retval;
	}
}
