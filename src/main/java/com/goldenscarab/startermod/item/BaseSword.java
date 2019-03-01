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

import net.minecraft.item.ItemSword;

/**
 * @author Michael
 *
 */
public class BaseSword extends ItemSword
{
	public BaseSword(ToolMaterial material, String unlocalizedName)
	{
		super(material);

		setUnlocalizedName(StarterMod.MODID + "." + unlocalizedName);
		setRegistryName(unlocalizedName);
		setCreativeTab(StarterMod.STARTER_TAB);
	}
}
