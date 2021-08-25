package com.gamma1772.additionalbarsbyg.client;

import com.gamma1772.additionalbars.common.AdditionalBars;
import com.gamma1772.additionalbarsbyg.common.AdditionalBarsBYG;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = AdditionalBarsBYG.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientABBYG {

	public ClientABBYG()
	{
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		//modEventBus.addListener(this::clientSetup);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent event) {
		AdditionalBars.LOGGER.debug("[ADDITIONAL BARS BYG] Doing client stuff...");
	}
}
