package net.grpgamesltd.monkeymischief.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.grpgamesltd.monkeymischief.MonkeyMischief;
import net.grpgamesltd.monkeymischief.entity.client.Gibson;
import net.grpgamesltd.monkeymischief.entity.custom.GibsonEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModEntities {
    public static final EntityType<GibsonEntity> GIBSON = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MonkeyMischief.MOD_ID, "gibson"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GibsonEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

}
