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

import net.minecraft.item.ItemFood;

/**
 * @author Michael
 *
 */
public class CornItemFood extends ItemFood
{
	public static int RESTORED_HUNGER = 3;
	public static float SATURATION = 0.6f;
	public static boolean FEEDS_WOLVES = false;

	public CornItemFood ( )
	{
		super(RESTORED_HUNGER, SATURATION, FEEDS_WOLVES);
		setUnlocalizedName(StarterMod.MODID + ".corn_cob");
		setRegistryName("corn_cob");
		setCreativeTab(StarterMod.STARTER_TAB);
	}
}
