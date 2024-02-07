
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModTabs;

public class CorruptedFragmentItem extends Item {
	public CorruptedFragmentItem() {
		super(new Item.Properties().tab(AetheriumResourcesReloadedModTabs.TAB_ITENS_CREATIVE_TAB).stacksTo(8).rarity(Rarity.EPIC));
	}
}
