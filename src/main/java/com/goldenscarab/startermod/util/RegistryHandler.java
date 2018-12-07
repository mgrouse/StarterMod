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
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Michael
 *
 */
@EventBusSubscriber
public class RegistryHandler
{

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event)
	{
		event.getRegistry().registerAll(StarterBlocks.getBlocks());
	}

	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{
		event.getRegistry().registerAll(StarterItems.getItems());

		event.getRegistry().registerAll(StarterBlocks.getItemBlocks());
	}

}
