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

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * @author Michael
 *
 */
public class BaseItemArmor extends ItemArmor
{
	private static final int RENDER_INDEX = 0;
	
	public BaseItemArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot,
			String unlocalizedName)
	{
		super(material, RENDER_INDEX, equipmentSlot);

		setUnlocalizedName(StarterMod.MODID + "." + unlocalizedName);
		setRegistryName(unlocalizedName);
		setCreativeTab(StarterMod.STARTER_TAB);
	}
}
