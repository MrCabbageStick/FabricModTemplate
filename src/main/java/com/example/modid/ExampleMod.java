package com.example.modid;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String ID = "modid";
	public static final String NAME = "Example Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("{} is starting...", NAME);
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
