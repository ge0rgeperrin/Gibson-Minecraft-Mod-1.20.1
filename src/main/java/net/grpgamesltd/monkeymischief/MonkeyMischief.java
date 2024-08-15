package net.grpgamesltd.monkeymischief;

import com.ibm.icu.impl.TextTrieMap;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.grpgamesltd.monkeymischief.entity.ModEntities;
import net.grpgamesltd.monkeymischief.entity.custom.GibsonEntity;
import net.grpgamesltd.monkeymischief.item.ModItems;
import net.grpgamesltd.monkeymischief.world.gen.ModEntityGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class MonkeyMischief implements ModInitializer {
	public static final String MOD_ID = "monkeymischief";
	public static final Logger LOGGER = LoggerFactory.getLogger("monkeymischief");

	@Override
	public void onInitialize(){
		FabricDefaultAttributeRegistry.register(ModEntities.GIBSON, GibsonEntity.createGibsonAttributes());
		ModEntityGeneration.addSpawns();
		ModItems.registerModItems();
	}
}