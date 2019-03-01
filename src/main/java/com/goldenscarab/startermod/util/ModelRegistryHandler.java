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
package com.goldenscarab.startermod.util;

import com.goldenscarab.startermod.init.StarterBlocks;
import com.goldenscarab.startermod.init.StarterItems;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
/**
 * @author Michael
 *
 */
@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler
{
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		// first models for items
		for (Item i : StarterItems.itemArray)
		{
			registerModel(i);
		}

		// next models for itemBlocks
		for (Block b : StarterBlocks.blocks)
		{
			registerModel(Item.getItemFromBlock(b));
		}

	}

	private static void registerModel(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
