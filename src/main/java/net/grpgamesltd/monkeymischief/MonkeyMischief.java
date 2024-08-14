package net.grpgamesltd.monkeymischief;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonkeyMischief implements ModInitializer {
	public static final String MOD_ID = "monkeymischief";
	public static final Logger LOGGER = LoggerFactory.getLogger("monkey-mischief");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}