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
import com.goldenscarab.startermod.item.BaseAxe;
import com.goldenscarab.startermod.item.BaseItem;
import com.goldenscarab.startermod.item.BaseItemArmor;
import com.goldenscarab.startermod.item.CornItemFood;
import com.goldenscarab.startermod.item.CornItemSeeds;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * @author Michael
 *
 */

@ObjectHolder(StarterMod.MODID)
public class StarterItems
{
	public static Item COPPER_INGOT = new BaseItem("copper_ingot");


	public static Item COPPER_AXE = new BaseAxe(StarterModMaterials.COPPER_TOOL_MATERIAL,
		"copper_axe");
	public static Item COPPER_HOE = new BaseAxe(StarterModMaterials.COPPER_TOOL_MATERIAL,
		"copper_hoe");
	public static Item COPPER_PICK_AXE = new BaseAxe(StarterModMaterials.COPPER_TOOL_MATERIAL,
		"copper_pickaxe");
	public static Item COPPER_SPADE = new BaseAxe(StarterModMaterials.COPPER_TOOL_MATERIAL,
		"copper_spade");
	public static Item COPPER_SWORD = new BaseAxe(StarterModMaterials.COPPER_TOOL_MATERIAL,
		"copper_sword");



	public static ItemArmor COPPER_HELMET = new BaseItemArmor(
		StarterModMaterials.COPPER_ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "copper_helmet");

	public static ItemArmor COPPER_CHESTPLATE = new BaseItemArmor(
		StarterModMaterials.COPPER_ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "copper_chestplate");

	public static ItemArmor COPPER_LEGGINGS = new BaseItemArmor(
		StarterModMaterials.COPPER_ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "copper_leggings");

	public static ItemArmor COPPER_BOOTS = new BaseItemArmor(
		StarterModMaterials.COPPER_ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "copper_boots");


	public static Item CORN_SEED = new CornItemSeeds();

	public static Item CORN_COB = new CornItemFood();


	public static Item[] itemArray = { COPPER_INGOT, COPPER_AXE, COPPER_HOE, COPPER_PICK_AXE,
			COPPER_SPADE, COPPER_SWORD, COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS,
			COPPER_BOOTS, CORN_SEED, CORN_COB };

}
