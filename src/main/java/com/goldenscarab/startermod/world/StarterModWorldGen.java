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
package com.goldenscarab.startermod.world;

import java.util.Random;

import com.goldenscarab.startermod.init.StarterBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * @author Michael
 *
 */
public class StarterModWorldGen implements IWorldGenerator
{

	private static int CUNK_WIDTH = 16;

	//private static int MIN_VEIN_SIZE = 4;
	private static int MAX_VEIN_SIZE = 9;
	// see public class ChunkGeneratorSettings for Vanilla vein sizes.

	private static int SPAWN_TRIES = 10;

	private static int MIN_Y = 0;
	private static int MAX_Y = 200;


	public StarterModWorldGen()
	{

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionType())
		{

		case NETHER:
			break;

		case OVERWORLD:
			genCopper(world, random, chunkX, chunkZ, SPAWN_TRIES, MIN_Y, MAX_Y);
			break;

		case THE_END:
			break;

		}

	}

	private void genCopper(World world, Random random, int chunkX,
			int chunkZ, int spawnTries, int minHeight, int maxHeight)
	{
		BlockPos chunkPos = new BlockPos(chunkX * CUNK_WIDTH, MIN_Y, chunkZ * CUNK_WIDTH);
		int heightDiff = maxHeight - minHeight + 1;

		IBlockState blockState = StarterBlocks.COPPER_ORE.getDefaultState();

		BlockMatcher matcher = BlockMatcher.forBlock(Blocks.STONE);

		for (int i = 0; i < spawnTries; i++)
		{
			// int veinSize = MIN_VEIN_SIZE + random.nextInt(MAX_VEIN_SIZE -
			// MIN_VEIN_SIZE + 1);
			WorldGenMinable wGenMin = new WorldGenMinable(blockState, MAX_VEIN_SIZE, matcher);

			int deltaX = random.nextInt(CUNK_WIDTH);
			int deltaY = minHeight + random.nextInt(heightDiff);
			int deltaZ = random.nextInt(CUNK_WIDTH);

			// StarterMod.logger.info(StarterMod.NAME + " Gening copper @ () ");
			wGenMin.generate(world, random, chunkPos.add(deltaX, deltaY, deltaZ));
		}
	}

}
