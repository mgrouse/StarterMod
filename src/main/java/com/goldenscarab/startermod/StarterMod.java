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
package com.goldenscarab.startermod;

import org.apache.logging.log4j.Logger;

import com.goldenscarab.startermod.proxy.IProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Michael
 *
 */
@Mod(modid = StarterMod.MODID, name = StarterMod.NAME, version = StarterMod.VERSION, acceptedMinecraftVersions = StarterMod.MC_VERSION)
public class StarterMod 
{

	public static final String MODID = "startermod";
	public static final String NAME = "GoldenScarab's Starter Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT_PATH = "com.goldenscarab.startermod.proxy.ClientProxy";
	public static final String SERVER_PATH = "com.goldenscarab.startermod.proxy.ServerProxy";
 
    @SidedProxy(clientSide = StarterMod.CLIENT_PATH, serverSide = StarterMod.SERVER_PATH)
    public static IProxy proxy;
    
	public static Logger logger;

	@Mod.Instance(MODID)
	public static StarterMod instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		logger = event.getModLog();
		
		//logger.info(StarterMod.NAME + " preInit() ");
		
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		logger.info(StarterMod.NAME + " init() ");
		
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		//logger.info(StarterMod.NAME + " postInit() ");
		
		proxy.postInit(event);
	}

}