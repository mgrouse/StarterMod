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
package com.goldenscarab.startermod.block.crop;

import com.goldenscarab.startermod.StarterMod;
import com.goldenscarab.startermod.init.StarterItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * @author Michael
 *
 */
public class CornBlockCrop extends BlockCrops
{
	public CornBlockCrop ( )
	{
		setUnlocalizedName(StarterMod.MODID + ".corn_crop");
		setRegistryName("corn_crop");
		setCreativeTab(StarterMod.STARTER_TAB);
	}

	@ Override
	protected Item getSeed ( )
	{
		return StarterItems.CORN_SEED;
	}

	@ Override
	protected Item getCrop ( )
	{
		return StarterItems.CORN_COB;
	}
}
