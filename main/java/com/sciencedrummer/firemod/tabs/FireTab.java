package com.sciencedrummer.firemod.tabs;

import com.sciencedrummer.firemod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FireTab extends CreativeTabs 
{
	public FireTab(String label) { super("firetab");
	this.setBackgroundImageName("fire.png");
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FIRE_EXTINGUISHER);
	}

}
