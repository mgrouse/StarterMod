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
import com.goldenscarab.startermod.block.crop.CornBlockCrop;
import com.goldenscarab.startermod.block.pedestal.PedestalBlock;
import com.goldenscarab.startermod.block.pedestal.PedestalTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * @author Michael
 *
 */
@ObjectHolder(StarterMod.MODID)
public class StarterBlocks
{
	public static BaseBlock COPPER_ORE = new BaseBlock(Material.ROCK, "copper_ore");
	public static ItemBlock ORE_COPPER_ITEM = COPPER_ORE.createItemBlock();

	public static PedestalBlock PEDESTAL = new PedestalBlock();
	public static ItemBlock PEDESTAL_ITEM = PEDESTAL.createItemBlock();
	public static PedestalTileEntity PEDESTAL_TILE = new PedestalTileEntity();

	public static CornBlockCrop CORN_CROP = new CornBlockCrop();


	public static Block[] blocks = { COPPER_ORE, CORN_CROP, PEDESTAL };



	public static TileEntity[] tiles = { PEDESTAL_TILE };







	public static ItemBlock[] itemBlocks = { ORE_COPPER_ITEM, PEDESTAL_ITEM };

}
