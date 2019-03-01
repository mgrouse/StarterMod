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
package com.goldenscarab.startermod.smelting;

import com.goldenscarab.startermod.init.StarterBlocks;
import com.goldenscarab.startermod.init.StarterItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Michael
 *
 */
public class SmeltingRecipes
{

	public static void init()
	{
		GameRegistry.addSmelting(StarterBlocks.COPPER_ORE, new ItemStack(StarterItems.COPPER_INGOT),
				0.7f);
	}
}
