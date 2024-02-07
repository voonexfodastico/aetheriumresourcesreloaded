
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresourcesreloaded.potion.SwimmerEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.SunshineEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.RealityBreakerEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.MountaineerMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.MoonlightEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.MagneticEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.FreezingColdMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.FlowerFieldEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.EnergizedEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.DiabolicMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.CyberLevitationMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.CorruptedEffectMobEffect;
import net.mcreator.aetheriumresourcesreloaded.potion.BurningWheelsMobEffect;
import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

public class AetheriumResourcesReloadedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<MobEffect> FLOWER_FIELD_EFFECT = REGISTRY.register("flower_field_effect", () -> new FlowerFieldEffectMobEffect());
	public static final RegistryObject<MobEffect> CORRUPTED_EFFECT = REGISTRY.register("corrupted_effect", () -> new CorruptedEffectMobEffect());
	public static final RegistryObject<MobEffect> SUNSHINE_EFFECT = REGISTRY.register("sunshine_effect", () -> new SunshineEffectMobEffect());
	public static final RegistryObject<MobEffect> MAGNETIC_EFFECT = REGISTRY.register("magnetic_effect", () -> new MagneticEffectMobEffect());
	public static final RegistryObject<MobEffect> SWIMMER_EFFECT = REGISTRY.register("swimmer_effect", () -> new SwimmerEffectMobEffect());
	public static final RegistryObject<MobEffect> MOONLIGHT_EFFECT = REGISTRY.register("moonlight_effect", () -> new MoonlightEffectMobEffect());
	public static final RegistryObject<MobEffect> REALITY_BREAKER_EFFECT = REGISTRY.register("reality_breaker_effect", () -> new RealityBreakerEffectMobEffect());
	public static final RegistryObject<MobEffect> DIABOLIC = REGISTRY.register("diabolic", () -> new DiabolicMobEffect());
	public static final RegistryObject<MobEffect> CYBER_LEVITATION = REGISTRY.register("cyber_levitation", () -> new CyberLevitationMobEffect());
	public static final RegistryObject<MobEffect> MOUNTAINEER = REGISTRY.register("mountaineer", () -> new MountaineerMobEffect());
	public static final RegistryObject<MobEffect> BURNING_WHEELS = REGISTRY.register("burning_wheels", () -> new BurningWheelsMobEffect());
	public static final RegistryObject<MobEffect> FREEZING_COLD = REGISTRY.register("freezing_cold", () -> new FreezingColdMobEffect());
	public static final RegistryObject<MobEffect> ENERGIZED_EFFECT = REGISTRY.register("energized_effect", () -> new EnergizedEffectMobEffect());
}
