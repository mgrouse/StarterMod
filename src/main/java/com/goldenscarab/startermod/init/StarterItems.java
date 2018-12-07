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
import com.goldenscarab.startermod.item.BaseItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * @author Michael
 *
 */

@ObjectHolder(StarterMod.MODID)
public class StarterItems
{
	public static Item COPPER_INGOT = new BaseItem("ingotCopper", "ingot_copper");

	public static Item[] itemList = { COPPER_INGOT };

	public static Item[] getItems()
	{
		return itemList;
	}
}
