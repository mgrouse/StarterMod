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

import com.goldenscarab.startermod.StarterMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

/**
 * @author Michael
 *
 */
public class BaseBlock extends Block
{

	public BaseBlock(Material material, String unlocalizedName)
	{
		this(material, SoundType.STONE, unlocalizedName);
	}

	public BaseBlock(Material material, SoundType sound, String unlocalizedName)
	{
		super(material);
		setUnlocalizedName(StarterMod.MODID + "." + unlocalizedName);
		setRegistryName(unlocalizedName);
		setCreativeTab(StarterMod.STARTER_TAB);
		setSoundType(sound);
	}

	public ItemBlock createItemBlock ( )
	{
		ItemBlock retVal = new ItemBlock(this);

		retVal.setRegistryName(getRegistryName());

		return retVal;
	}
}
