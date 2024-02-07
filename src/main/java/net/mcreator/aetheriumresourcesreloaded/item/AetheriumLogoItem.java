
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class AetheriumLogoItem extends Item {
	public AetheriumLogoItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(10).saturationMod(10f).alwaysEat().meat().build()));
	}
}
