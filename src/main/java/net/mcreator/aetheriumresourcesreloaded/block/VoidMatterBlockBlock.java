
package net.mcreator.aetheriumresourcesreloaded.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

import java.util.List;
import java.util.Collections;

public class VoidMatterBlockBlock extends Block {
	public VoidMatterBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK).sound(SoundType.SOUL_SAND).strength(2f, 10f).requiresCorrectToolForDrops().speedFactor(0.8f).jumpFactor(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof ShovelItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(AetheriumResourcesReloadedModItems.DARK_MATTER.get(), 2));
	}
}
