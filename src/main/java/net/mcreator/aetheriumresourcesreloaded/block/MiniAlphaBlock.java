
package net.mcreator.aetheriumresourcesreloaded.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.aetheriumresourcesreloaded.init.AetheriumResourcesReloadedModItems;

import java.util.List;
import java.util.Collections;

public class MiniAlphaBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public MiniAlphaBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6, 0, 7, 10, 4.25, 9), box(5.5, 5.25, 6.25, 10.5, 8.5, 9.25), box(5, 4, 6.25, 11, 5.25, 9.5), box(5, 8.5, 6.25, 11, 9, 9.5), box(10.5, 5.25, 6.25, 11, 8.5, 9.5), box(5, 5.25, 6.25, 5.5, 8.5, 9.5),
					box(9.75, 0, 8, 11.25, 1.5, 12), box(8.4, 2.45, 7.15, 11.15, 3.95, 8.65), box(4.95, 4.05, 7.15, 7.7, 5.55, 8.65), box(5.25, 0, 10.25, 6.75, 1.5, 13.5));
			case NORTH -> Shapes.or(box(6, 0, 7, 10, 4.25, 9), box(5.5, 5.25, 6.75, 10.5, 8.5, 9.75), box(5, 4, 6.5, 11, 5.25, 9.75), box(5, 8.5, 6.5, 11, 9, 9.75), box(5, 5.25, 6.5, 5.5, 8.5, 9.75), box(10.5, 5.25, 6.5, 11, 8.5, 9.75),
					box(4.75, 0, 4, 6.25, 1.5, 8), box(4.85, 2.45, 7.35, 7.6, 3.95, 8.85), box(8.3, 4.05, 7.35, 11.05, 5.55, 8.85), box(9.25, 0, 2.5, 10.75, 1.5, 5.75));
			case EAST -> Shapes.or(box(7, 0, 6, 9, 4.25, 10), box(6.25, 5.25, 5.5, 9.25, 8.5, 10.5), box(6.25, 4, 5, 9.5, 5.25, 11), box(6.25, 8.5, 5, 9.5, 9, 11), box(6.25, 5.25, 5, 9.5, 8.5, 5.5), box(6.25, 5.25, 10.5, 9.5, 8.5, 11),
					box(8, 0, 4.75, 12, 1.5, 6.25), box(7.15, 2.45, 4.85, 8.65, 3.95, 7.6), box(7.15, 4.05, 8.3, 8.65, 5.55, 11.05), box(10.25, 0, 9.25, 13.5, 1.5, 10.75));
			case WEST -> Shapes.or(box(7, 0, 6, 9, 4.25, 10), box(6.75, 5.25, 5.5, 9.75, 8.5, 10.5), box(6.5, 4, 5, 9.75, 5.25, 11), box(6.5, 8.5, 5, 9.75, 9, 11), box(6.5, 5.25, 10.5, 9.75, 8.5, 11), box(6.5, 5.25, 5, 9.75, 8.5, 5.5),
					box(4, 0, 9.75, 8, 1.5, 11.25), box(7.35, 2.45, 8.4, 8.85, 3.95, 11.15), box(7.35, 4.05, 4.95, 8.85, 5.55, 7.7), box(2.5, 0, 5.25, 5.75, 1.5, 6.75));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(AetheriumResourcesReloadedModItems.ALPHA_PLUSHIE.get());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(AetheriumResourcesReloadedModItems.ALPHA_PLUSHIE.get()));
	}
}
