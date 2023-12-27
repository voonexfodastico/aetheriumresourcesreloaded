
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<PaintingVariant> AGRS_LOGO_PAINTING = REGISTRY.register("agrs_logo_painting", () -> new PaintingVariant(64, 64));
}
