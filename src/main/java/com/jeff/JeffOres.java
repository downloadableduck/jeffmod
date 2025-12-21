package com.jeff;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class JeffOres implements ModInitializer {
    private static final ResourceKey<PlacedFeature> JEFF_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(JeffMod.MOD_ID, "jeff_ore"));

    @Override
    public void onInitialize() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, JEFF_ORE_PLACED_KEY);
    }
}
