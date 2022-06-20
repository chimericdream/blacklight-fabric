package com.chimericdream.blacklight;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlacklightMod implements ModInitializer {
	public static final Logger LOGGER;

	static {
		LOGGER = LoggerFactory.getLogger(ModInfo.MOD_ID);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
