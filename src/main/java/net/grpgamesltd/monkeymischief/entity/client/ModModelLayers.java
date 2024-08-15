package net.grpgamesltd.monkeymischief.entity.client;

import net.grpgamesltd.monkeymischief.MonkeyMischief;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer GIBSON =
            new EntityModelLayer(new Identifier(MonkeyMischief.MOD_ID, "gibson"), "main");
}
