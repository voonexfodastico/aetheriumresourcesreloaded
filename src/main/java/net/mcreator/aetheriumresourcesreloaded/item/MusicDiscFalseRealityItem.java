
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscFalseRealityItem extends RecordItem {
	public MusicDiscFalseRealityItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetherium_resources_reloaded:music_disc_false_reality")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3160);
	}
}
