package net.mcreator.aetheriumresourcesreloaded.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhauntedmask2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aetherium_resources_reloaded", "modelhauntedmask_2"), "main");
	public final ModelPart mascara;

	public Modelhauntedmask2(ModelPart root) {
		this.mascara = root.getChild("mascara");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition mascara = partdefinition.addOrReplaceChild("mascara", CubeListBuilder.create().texOffs(8, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 18)
				.addBox(3.7F, -4.4F, -3.8F, 0.3F, 0.6F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-4.3F, -4.4F, -3.8F, 0.3F, 0.6F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mascara.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.mascara.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.mascara.xRot = headPitch / (180F / (float) Math.PI);
	}
}
