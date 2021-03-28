package com.codenamerevy.additionalbarsbyg.common;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdditionalBarsBYG.MODID)
public class AdditionalBarsBYG
{
	//TODO: add BYG blocks and items
	public static final String MODID = "additionalbarsbyg";
	public AdditionalBarsBYG() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		//ABBlocks.BYG_BLOCKS.register(modEventBus);
		//ABItems.BYG_ITEMS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);

		AdditionalBars.LOGGER.info("Additional Bars - Oh The Biomes You'll Go Addon has successfully loaded!");
	}
}
