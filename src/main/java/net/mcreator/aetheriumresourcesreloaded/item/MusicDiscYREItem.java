
package net.mcreator.aetheriumresourcesreloaded.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscYREItem extends RecordItem {
	public MusicDiscYREItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetherium_resources_reloaded:music_disc_yre")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5040);
	}
}
