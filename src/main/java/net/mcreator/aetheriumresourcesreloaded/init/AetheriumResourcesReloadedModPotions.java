
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<Potion> CORRUPTION = REGISTRY.register("corruption", () -> new Potion(new MobEffectInstance(AetheriumResourcesReloadedModMobEffects.CORRUPTED_EFFECT.get(), 200, 0, false, true)));
}
