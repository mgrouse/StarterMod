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
package com.goldenscarab.startermod.proxy;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Michael
 *
 */
public class ClientProxy implements IProxy
{

	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		// TODO Auto-generated method stub
		
	}

	@ Override
	public String localize ( String unlocalized , Object ... args )
	{
		return I18n.format(unlocalized, args);
	}

}
