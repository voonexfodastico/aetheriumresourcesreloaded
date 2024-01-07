
package net.mcreator.aetheriumresourcesreloaded.world.biome;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;

public class VoidIslandsBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(-16316665).waterFogColor(-15592942).skyColor(-16777216).foliageColorOverride(-16185079).grassColorOverride(-15790321)
				.ambientLoopSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.soul_sand_valley.loop")))
				.ambientMoodSound(new AmbientMoodSettings(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.soul_sand_valley.mood")), 6000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.soul_sand_valley.additions")), 0.0111D))
				.backgroundMusic(new Music(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("music.nether.soul_sand_valley")), 12000, 24000, true)).ambientParticle(new AmbientParticleSettings(ParticleTypes.ASH, 0.007f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
