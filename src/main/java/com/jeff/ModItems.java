//Allows for the registering of items.

package com.jeff;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;


public class ModItems {

    private static final String MOD_ID = "jeffmod";

    public static Item register(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<@NotNull Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ModItems.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
}
