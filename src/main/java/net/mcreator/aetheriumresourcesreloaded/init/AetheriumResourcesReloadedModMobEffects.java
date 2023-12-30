
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.potion.CorruptedEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<MobEffect> CORRUPTED_EFFECT = REGISTRY.register("corrupted_effect", () -> new CorruptedEffectMobEffect());
}
