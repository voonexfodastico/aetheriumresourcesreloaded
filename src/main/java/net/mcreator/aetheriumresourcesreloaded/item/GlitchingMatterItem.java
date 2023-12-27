
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModTabs;

import java.util.List;

public class GlitchingMatterItem extends Item {
	public GlitchingMatterItem() {
		super(new Item.Properties().tab(AetheriumResourcesReloadedModTabs.TAB_ITENS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.4f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A75Como isso funciona..?"));
	}
}
