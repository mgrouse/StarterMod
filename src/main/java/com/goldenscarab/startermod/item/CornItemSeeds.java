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
package com.goldenscarab.startermod.item;

import com.goldenscarab.startermod.StarterMod;
import com.goldenscarab.startermod.init.StarterBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

/**
 * @author Michael
 *
 */
public class CornItemSeeds extends ItemSeeds
{

	public CornItemSeeds ( )
	{
		super(StarterBlocks.CORN_CROP, Blocks.FARMLAND);

		setUnlocalizedName(StarterMod.MODID + ".corn_seed");
		setRegistryName("corn_seed");
		setCreativeTab(StarterMod.STARTER_TAB);
	}
}
