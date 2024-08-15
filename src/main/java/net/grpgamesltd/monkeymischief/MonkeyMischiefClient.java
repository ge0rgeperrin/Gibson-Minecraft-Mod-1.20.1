package net.grpgamesltd.monkeymischief;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.grpgamesltd.monkeymischief.entity.ModEntities;
import net.grpgamesltd.monkeymischief.entity.client.Gibson;
import net.grpgamesltd.monkeymischief.entity.client.GibsonRenderer;
import net.grpgamesltd.monkeymischief.entity.client.ModModelLayers;

public class MonkeyMischiefClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GIBSON, Gibson::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.GIBSON, GibsonRenderer::new);

    }
}
