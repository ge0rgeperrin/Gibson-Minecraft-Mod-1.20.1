package net.grpgamesltd.monkeymischief.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.grpgamesltd.monkeymischief.MonkeyMischief;
import net.grpgamesltd.monkeymischief.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GIBSON_FUR = registerItem("gibson_fur", new Item(new FabricItemSettings()));
    public static final Item GIBSON_SPAWN_EGG = registerItem("gibson_spawn_egg",
            new SpawnEggItem(ModEntities.GIBSON, 0x0099cc, 0x0066cc, new FabricItemSettings()));
    public static final Item GIBSON_SLAYER = registerItem("gibson_slayer",
            new SwordItem(ModToolMaterial.GIBBION,5, 1.5f, new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MonkeyMischief.MOD_ID, name), item);
    }

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(GIBSON_FUR);
        entries.add(GIBSON_SPAWN_EGG);
        entries.add(GIBSON_SLAYER);
    }

    public static void registerModItems() {
        MonkeyMischief.LOGGER.info("Registering Mod Items for " + MonkeyMischief.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}