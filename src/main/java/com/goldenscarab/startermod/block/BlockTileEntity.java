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
package com.goldenscarab.startermod.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * @author Michael
 *
 */
public abstract class BlockTileEntity<TE extends TileEntity> extends BaseBlock
{

	public BlockTileEntity ( Material material , String name )
	{
		super(material, name);
	}

	public abstract Class<TE> getTileEntityClass ( );

	@ SuppressWarnings ( "unchecked" )
	public TE getTileEntity ( IBlockAccess world , BlockPos pos )
	{
		return (TE) world.getTileEntity(pos);
	}

	@ Override
	public boolean hasTileEntity ( IBlockState state )
	{
		return true;
	}

	@ Nullable
	@ Override
	public abstract TE createTileEntity ( World world , IBlockState state );

}
