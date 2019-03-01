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
package com.goldenscarab.startermod.block.pedestal;

import com.goldenscarab.startermod.StarterMod;
import com.goldenscarab.startermod.init.StarterBlocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

/**
 * @author Michael
 *
 */
public class PedestalGUI extends GuiContainer
{

	private static final ResourceLocation BG_TEXTURE = new ResourceLocation(StarterMod.MODID,
		"textures/gui/pedestal.png");

	private InventoryPlayer playerInv;

	/**
	 * @param inventorySlotsIn
	 */
	public PedestalGUI ( Container container , InventoryPlayer playerInv )
	{
		super(container);
		this.playerInv = playerInv;
	}

	@ Override
	protected void drawGuiContainerBackgroundLayer ( float partialTicks , int mouseX , int mouseY )
	{
		GlStateManager.color(1, 1, 1, 1);
		mc.getTextureManager().bindTexture(BG_TEXTURE);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

	@ Override
	protected void drawGuiContainerForegroundLayer ( int mouseX , int mouseY )
	{
		String name = I18n.format(StarterBlocks.PEDESTAL.getUnlocalizedName() + ".name");
		fontRenderer.drawString(name,
			xSize / 2 - fontRenderer.getStringWidth(name) / 2,
			6,
			0x404040);
		fontRenderer.drawString(playerInv.getDisplayName().getUnformattedText(),
			8,
			ySize - 94,
			0x404040);
	}

}
