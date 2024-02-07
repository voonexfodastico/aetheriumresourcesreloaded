
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.aetheriumresourcesreloaded.world.features.plants.YellowPoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.WhitePoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.PurplePoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.PinkPoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.OrangePoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.LightBluePoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.GreenPoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.world.features.plants.BluePoppyFeature;
import net.mcreator.aetheriumresourcesreloaded.AetheriumResourcesReloadedMod;

@Mod.EventBusSubscriber
public class AetheriumResourcesReloadedModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AetheriumResourcesReloadedMod.MODID);
	public static final RegistryObject<Feature<?>> PURPLE_POPPY = REGISTRY.register("purple_poppy", PurplePoppyFeature::feature);
	public static final RegistryObject<Feature<?>> BLUE_POPPY = REGISTRY.register("blue_poppy", BluePoppyFeature::feature);
	public static final RegistryObject<Feature<?>> LIGHT_BLUE_POPPY = REGISTRY.register("light_blue_poppy", LightBluePoppyFeature::feature);
	public static final RegistryObject<Feature<?>> PINK_POPPY = REGISTRY.register("pink_poppy", PinkPoppyFeature::feature);
	public static final RegistryObject<Feature<?>> GREEN_POPPY = REGISTRY.register("green_poppy", GreenPoppyFeature::feature);
	public static final RegistryObject<Feature<?>> YELLOW_POPPY = REGISTRY.register("yellow_poppy", YellowPoppyFeature::feature);
	public static final RegistryObject<Feature<?>> ORANGE_POPPY = REGISTRY.register("orange_poppy", OrangePoppyFeature::feature);
	public static final RegistryObject<Feature<?>> WHITE_POPPY = REGISTRY.register("white_poppy", WhitePoppyFeature::feature);
}
