package com.sciencedrummer.firemod.init;

import java.util.ArrayList;
import java.util.List;

import com.sciencedrummer.firemod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FIRE = new BlockBase("fire", Material.FIRE);

}
