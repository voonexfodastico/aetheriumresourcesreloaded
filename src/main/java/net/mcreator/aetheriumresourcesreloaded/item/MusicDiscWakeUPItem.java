
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModTabs;

public class MusicDiscWakeUPItem extends RecordItem {
	public MusicDiscWakeUPItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetherium_resources_reloaded:music_disc_wakeup")), new Item.Properties().tab(AetheriumResourcesReloadedModTabs.TAB_ITENS_CREATIVE_TAB).stacksTo(1).rarity(Rarity.RARE),
				3080);
	}
}
