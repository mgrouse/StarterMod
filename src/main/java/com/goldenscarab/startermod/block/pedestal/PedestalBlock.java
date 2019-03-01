/*
 * This is an unpublished work protected by the United States copyright laws
 * and is proprietary to Michael A. Grouse.  Disclosure, copying,
 * reproduction, merger translation, modification, enhancement or use by
 * anyone other than authorized employees or licensees of Michael A. Grouse
 * without prior written consent of Michael A. Grouse is prohibited.
 *
 * Copyright (C) 1992 - 2018 Michael A. Grouse, All Rights Reserved.
 *
 * This copyright notice should not be construed as evidence of publication. 
 */
package com.goldenscarab.startermod.block.pedestal;

import com.goldenscarab.startermod.StarterMod;
import com.goldenscarab.startermod.block.BlockTileEntity;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

/**
 * @author Michael
 *
 */
public class PedestalBlock extends BlockTileEntity<PedestalTileEntity>
{

	public PedestalBlock ( )
	{
		super(Material.ROCK, "pedestal");
	}

	@ Override
	@ Deprecated
	public boolean isOpaqueCube ( IBlockState state )
	{
		return false;
	}

	@ Override
	@ Deprecated
	public boolean isFullCube ( IBlockState state )
	{
		return false;
	}

	@ Override
	public Class<PedestalTileEntity> getTileEntityClass ( )
	{
		// TODO Auto-generated method stub
		return PedestalTileEntity.class;
	}

	@ Override
	public PedestalTileEntity createTileEntity ( World world , IBlockState state )
	{
		// TODO Auto-generated method stub
		return new PedestalTileEntity();
	}

	//@form:off
	@ Override
	public boolean onBlockActivated ( World world, BlockPos pos, IBlockState state, EntityPlayer player, 
									EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ )
	{
		// if we are in client
		if (!world.isRemote)
		{
			PedestalTileEntity tile = getTileEntity(world, pos);
			IItemHandler itemHandler = tile.getCapability(
				CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
				side);
			if (!player.isSneaking())
			{
				ItemStack heldItem = player.getHeldItem(hand);
				if (heldItem.isEmpty())
				{
					player.setHeldItem(hand, itemHandler.extractItem(0, 64, false));
				}
				else
				{
					player.setHeldItem(hand, itemHandler.insertItem(0, heldItem, false));
				}
				tile.markDirty();
			}
			else
			{
				ItemStack stack = itemHandler.getStackInSlot(0);
				if (!stack.isEmpty())
				{
					String localized = StarterMod.proxy.localize(stack.getUnlocalizedName()
						+ ".name");
					player.sendMessage(new TextComponentString(stack.getCount() + "x " + localized));
					//.addChatMessage(new TextComponentString(stack.getCount() + "x " + localized));
				}
				else
				{
					player.sendMessage(new TextComponentString("Empty"));
				}
			}
		}
		return true;
	}

	@ Override
	public void breakBlock ( World world , BlockPos pos , IBlockState state )
	{
		PedestalTileEntity tile = getTileEntity(world, pos);
		
		IItemHandler itemHandler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, 
														EnumFacing.NORTH);
		ItemStack stack = itemHandler.getStackInSlot(0);
		if (!stack.isEmpty())
		{
			EntityItem item = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
			world.spawnEntity(item);
		}
		super.breakBlock(world, pos, state);
	}
}
