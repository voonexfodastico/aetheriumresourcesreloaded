
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.aetheriumresourcesreloaded.world.biome.VoidIslandsBiome;
import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<Biome> VOID_ISLANDS = REGISTRY.register("void_islands", VoidIslandsBiome::createBiome);
}
