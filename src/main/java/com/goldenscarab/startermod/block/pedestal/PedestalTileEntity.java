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

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

/**
 * @author Michael
 *
 */
public class PedestalTileEntity extends TileEntity
{
	private ItemStackHandler inventory = new ItemStackHandler(1);

	@ Override
	public NBTTagCompound writeToNBT ( NBTTagCompound compound )
	{
		compound.setTag("inventory", inventory.serializeNBT());
		return super.writeToNBT(compound);
	}

	@ Override
	public void readFromNBT ( NBTTagCompound compound )
	{
		inventory.deserializeNBT(compound.getCompoundTag("inventory"));
		super.readFromNBT(compound);
	}

	//@form:off
	@ Override
	public boolean hasCapability ( Capability<?> capability , @ Nullable EnumFacing facing )
	{
		return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || 
			                 super.hasCapability(capability, facing);
	}
	
	@ SuppressWarnings ( "unchecked" )
	@Nullable
	@Override
	public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) 
	{
		return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ? 
			                 (T)inventory : super.getCapability(capability, facing);
	}
}
