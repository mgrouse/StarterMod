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

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * @author Michael
 *
 */
public class StarterModMaterials
{
	//@form:off
	// Name  harvest, uses, effic, dmg, ench
	//-------------------------------------
	// WOOD    (0,     59,  2.0F, 0.0F, 15),
	// STONE   (1,    131,  4.0F, 1.0F,  5),
	// COPPER  (1,    200,  5.0F, 2.0F, 14), *** this mod
	// IRON    (2,    250,  6.0F, 2.0F, 14),
	// DIAMOND (3,   1561,  8.0F, 3.0F, 10),
	// GOLD    (0,     32, 12.0F, 0.0F, 22);
	
	public static final int COPPER_HARVEST_LEVEL = 1;
	public static final int COPPER_MAX_USES = 200;
	public static final int COPPER_EFFICIENCY = 5;
	public static final int COPPER_DAMAGE = 2;
	public static final int COPPER_ENCHANTABILITY = 14;

	
	public static final Item.ToolMaterial COPPER_TOOL_MATERIAL = 
		EnumHelper.addToolMaterial("COPPER",COPPER_HARVEST_LEVEL, 
									COPPER_MAX_USES, 
									COPPER_EFFICIENCY, 
									COPPER_DAMAGE,
									COPPER_ENCHANTABILITY);
	

	
	public static final int COPPER_ARMOR_DURABILITY = 15;

	// {Helm, Chest, Leg, Boot} 
	public static final int[] COPPER_ARMOR_DMG_RED = { 2, 5, 6, 3 };
	public static final int COPPER_ARMOR_ENCHANTABILITY = 9;
	public static final int COPPER_ARMOR_TOUGHNESS = 0;

	
	public static final ArmorMaterial COPPER_ARMOR_MATERIAL = 
		EnumHelper.addArmorMaterial(StarterMod.MODID + ":COPPER", // Enum name
									StarterMod.MODID + ":copper", // texture loc
									COPPER_ARMOR_DURABILITY, 
									COPPER_ARMOR_DMG_RED, 
									COPPER_ARMOR_ENCHANTABILITY,
									SoundEvents.ITEM_ARMOR_EQUIP_IRON, 
									COPPER_ARMOR_TOUGHNESS);
	
	
	//@form:on
}
