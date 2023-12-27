
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscCorruptioItem extends RecordItem {
	public MusicDiscCorruptioItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetherium_resources_reloaded:disc_corruptio")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1600);
	}
}
