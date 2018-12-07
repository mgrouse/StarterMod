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
package com.goldenscarab.startermod.init;

import com.goldenscarab.startermod.StarterMod;
import com.goldenscarab.startermod.block.BaseBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * @author Michael
 *
 */
@ObjectHolder(StarterMod.MODID)
public class StarterBlocks
{
	public static BaseBlock ORE_COPPER = new BaseBlock(Material.ROCK, "oreCopper", "ore_copper");

	public static Block[] blocks = { ORE_COPPER };

	public static ItemBlock ORE_COPPER_ITEM = (ItemBlock) new ItemBlock(ORE_COPPER)
			.setRegistryName(ORE_COPPER.getRegistryName());

	public static ItemBlock[] itemBlocks = { ORE_COPPER_ITEM };

	public static Block[] getBlocks()
	{
		return blocks;
	}

	public static ItemBlock[] getItemBlocks()
	{
		return itemBlocks;
	}

}
