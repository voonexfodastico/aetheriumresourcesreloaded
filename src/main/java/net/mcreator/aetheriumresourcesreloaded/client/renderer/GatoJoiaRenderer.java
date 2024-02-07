
package net.mcreator.aetheriumresourcesreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aetheriumresourcesreloaded.entity.GatoJoiaEntity;
import net.mcreator.aetheriumresourcesreloaded.client.model.ModelJoiacat;

public class GatoJoiaRenderer extends MobRenderer<GatoJoiaEntity, ModelJoiacat<GatoJoiaEntity>> {
	public GatoJoiaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJoiacat(context.bakeLayer(ModelJoiacat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GatoJoiaEntity entity) {
		return new ResourceLocation("aetherium_resources_reloaded:textures/entities/joiacat.png");
	}
}
