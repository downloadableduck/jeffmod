//This file allows armor to be registered and sets the base stats for them.

package com.jeff;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

import static com.jeff.JeffMod.REPAIRS_JEFF_ARMOR;

public class JeffArmor {
    public static final int BASE_DURABILITY = 1;

    public static final ResourceKey<@NotNull EquipmentAsset> JEFF_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(JeffMod.MOD_ID, "jeff_armor"));
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            5,
            SoundEvents.HONEY_DRINK,
            0.0f,
            0.0f,
            REPAIRS_JEFF_ARMOR,
            JEFF_ARMOR_MATERIAL_KEY
    );
}