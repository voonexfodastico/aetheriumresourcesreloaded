
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresourcesreloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aetheriumresourcesreloaded.client.model.Modelhauntedmask2;
import net.mcreator.aetheriumresourcesreloaded.client.model.ModelJoiacat;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AetheriumResourcesReloadedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelJoiacat.LAYER_LOCATION, ModelJoiacat::createBodyLayer);
		event.registerLayerDefinition(Modelhauntedmask2.LAYER_LOCATION, Modelhauntedmask2::createBodyLayer);
	}
}
