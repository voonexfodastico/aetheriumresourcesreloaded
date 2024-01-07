package net.mcreator.aetheriumresourcesreloaded.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import javax.annotation.Nullable;

import com.mojang.math.Vector3f;
import com.mojang.math.Matrix4f;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class VoidskyProcedure {
	@SubscribeEvent
	public static void renderSky(RenderLevelStageEvent event) {
		try {
			if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
				Minecraft minecraft = Minecraft.getInstance();
				ClientLevel clientLevel = minecraft.level;
				PoseStack poseStack = event.getPoseStack();
				Camera camera = event.getCamera();
				Entity entity = camera.getEntity();
				Vec3 cameraPos = camera.getPosition();
				Vec3 entityPos = entity.getPosition(minecraft.getPartialTick());
				RenderSystem.depthMask(false);
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft", "textures/block/grass_block_side.png"));
				poseStack.pushPose();
				execute(null, clientLevel, clientLevel.dimension(), poseStack);
				poseStack.popPose();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.disableBlend();
				RenderSystem.enableCull();
				RenderSystem.enableDepthTest();
				RenderSystem.depthMask(true);
			}
		} catch (Exception e) {
		}
	}

	public static void execute(LevelAccessor world, ResourceKey<Level> dimension, PoseStack pose) {
		execute(null, world, dimension, pose);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, ResourceKey<Level> dimension, PoseStack pose) {
		if (dimension == null || pose == null)
			return;
		if (dimension == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aetherium_resources_reloaded:void_dimension")))) {
			RenderSystem.enableBlend();
			RenderSystem.blendFunc(GlStateManager.SourceFactor.DST_COLOR, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
			RenderSystem.setShaderTexture(0, new ResourceLocation(("aetherium_resources_reloaded" + ":textures/" + "darksky3" + ".png")));
			if (world instanceof ClientLevel _clientLevel) {
				boolean _b0 = true;
				if (_b0) {
					RenderSystem.enableTexture();
					RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
					BufferBuilder _bufferBuilder = Tesselator.getInstance().getBuilder();
					pose.popPose();
					float _u0 = 0.0F;
					float _v0 = 0.0F;
					float _u1 = 16.0F;
					float _v1 = 16.0F;
					for (int _i = 0; _i < 6; ++_i) {
						pose.pushPose();
						if (_i == 1) {
							pose.mulPose(Vector3f.XP.rotationDegrees(90.0F));
						} else if (_i == 2) {
							pose.mulPose(Vector3f.XP.rotationDegrees(-90.0F));
						} else if (_i == 3) {
							pose.mulPose(Vector3f.XP.rotationDegrees(180.0F));
						} else if (_i == 4) {
							pose.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
						} else if (_i == 5) {
							pose.mulPose(Vector3f.ZP.rotationDegrees(-90.0F));
						}
						Matrix4f _matrix4f = pose.last().pose();
						_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
						_bufferBuilder.vertex(_matrix4f, -100.0F, -100.0F, -100.0F).uv(_u0, _v0).color(255, 255, 255, 255).endVertex();
						_bufferBuilder.vertex(_matrix4f, -100.0F, -100.0F, 100.0F).uv(_u0, _v1).color(255, 255, 255, 255).endVertex();
						_bufferBuilder.vertex(_matrix4f, 100.0F, -100.0F, 100.0F).uv(_u1, _v1).color(255, 255, 255, 255).endVertex();
						_bufferBuilder.vertex(_matrix4f, 100.0F, -100.0F, -100.0F).uv(_u1, _v0).color(255, 255, 255, 255).endVertex();
						BufferUploader.drawWithShader(_bufferBuilder.end());
						pose.popPose();
					}
					pose.pushPose();
				}
			}
		}
	}
}
