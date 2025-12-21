//This file contains all of the items, armor, and effects that were used in this mod.

package com.jeff;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.jeff.ModItems.register;
import static net.minecraft.world.effect.MobEffectInstance.INFINITE_DURATION;

public class JeffMod implements ModInitializer {

    public static final String MOD_ID = "jeffmod";
    //Registering the effects.
    public static final FoodProperties INSTANT_DAMAGE_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable LEVITATION_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.LEVITATION, 100 * 20), 1.0f))
            .build();
    public static final FoodProperties LEVITATION_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable INFESTED_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INFESTED, 60 * 20), 10.0f))
            .build();
    public static final FoodProperties INFESTED_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable WATER_BREATHING_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 5 * 20), 10.0f))
            .build();
    public static final FoodProperties WATER_BREACHING_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable BLINDNESS_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500 * 20), 10.0f))
            .build();
    public static final FoodProperties BLINDNESS_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable MINING_FATIGUE_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.MINING_FATIGUE, 500 * 20, 255), 10.0f))
            .build();
    public static final FoodProperties MINING_FATIGUE_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable NAUSEA_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 30 * 20, 255), 5.0f))
            .build();
    public static final FoodProperties NAUSEA_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable JUMP_BOOST_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 20 * 30, 255), 255.0f))
            .build();
    public static final FoodProperties JUMP_BOOST_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable GLOWING_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.GLOWING, INFINITE_DURATION), 1f))
            .build();
    public static final FoodProperties GLOWING_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final Consumable SLOWNESS_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 60 * 20, 255), 255f))
            .build();
    public static final FoodProperties SLOWNESS_FOOD_COMPONENT = new FoodProperties.Builder()
            .build();
    public static final TagKey<Item> REPAIRS_JEFF_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(JeffMod.MOD_ID, "repairs_jeff_armor"));
    public static final ToolMaterial JEFF_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.ANVIL,
            1,
            0.1f,
            0.1f,
            1,
            REPAIRS_JEFF_ARMOR);
    public static final Item JEFF_PICKAXE = register("jeff_pickaxe", Item::new, new Item.Properties()
            .pickaxe(JeffMod.JEFF_TOOL_MATERIAL, 1f, 1f)
            .food(INFESTED_FOOD_COMPONENT, INFESTED_FOOD_CONSUMABLE_COMPONENT));
    public static final Item JEFF_SWORD = register("jeff_sword", Item::new, new Item.Properties()
            .sword(JeffMod.JEFF_TOOL_MATERIAL, 200f, 20f)
            .food(WATER_BREACHING_FOOD_COMPONENT, WATER_BREATHING_FOOD_CONSUMABLE_COMPONENT));

    //Registering the items.
    public static final Item JEFF_AXE = register("jeff_axe", Item::new, new Item.Properties()
            .axe(JeffMod.JEFF_TOOL_MATERIAL, 1f, 1f)
            .food(BLINDNESS_FOOD_COMPONENT, BLINDNESS_FOOD_CONSUMABLE_COMPONENT));
    public static final Item JEFF_HOE = register("jeff_hoe", Item::new, new Item.Properties()
            .hoe(JeffMod.JEFF_TOOL_MATERIAL, 1f, 1f)
            .food(SLOWNESS_FOOD_COMPONENT, SLOWNESS_FOOD_CONSUMABLE_COMPONENT));
    public static final Item JEFF_INGOT = register("jeff_ingot", Item::new, new Item.Properties().food(LEVITATION_FOOD_COMPONENT, LEVITATION_FOOD_CONSUMABLE_COMPONENT));
    public static final Item JEFF_HELMET = register("jeff_helmet", Item::new, new Item.Properties()
            .humanoidArmor(JeffArmor.INSTANCE, ArmorType.LEGGINGS)
            .durability(ArmorType.LEGGINGS.getDurability(JeffArmor.BASE_DURABILITY))
            .food(MINING_FATIGUE_FOOD_COMPONENT, MINING_FATIGUE_FOOD_CONSUMABLE_COMPONENT));
    public static final Item JEFF_CHESTPLATE = register("jeff_chestplate", Item::new, new Item.Properties()
            .humanoidArmor(JeffArmor.INSTANCE, ArmorType.HELMET)
            .durability(ArmorType.HELMET.getDurability(JeffArmor.BASE_DURABILITY))
            .food(NAUSEA_FOOD_COMPONENT, NAUSEA_FOOD_CONSUMABLE_COMPONENT));

    //Registering the armor.
    public static final Item JEFF_LEGGINGS = register("jeff_leggings", Item::new, new Item.Properties()
            .humanoidArmor(JeffArmor.INSTANCE, ArmorType.BOOTS)
            .durability(ArmorType.BOOTS.getDurability(JeffArmor.BASE_DURABILITY))
            .food(JUMP_BOOST_FOOD_COMPONENT, JUMP_BOOST_FOOD_CONSUMABLE_COMPONENT));
    public static final Item JEFF_BOOTS = register("jeff_boots", Item::new, new Item.Properties()
            .humanoidArmor(JeffArmor.INSTANCE, ArmorType.CHESTPLATE)
            .durability(ArmorType.CHESTPLATE.getDurability(JeffArmor.BASE_DURABILITY))
            .food(GLOWING_FOOD_COMPONENT, GLOWING_FOOD_CONSUMABLE_COMPONENT));
    public static final Block JEFF_BLOCK = ModBlocks.register(
            "jeff_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .sound(SoundType.ANVIL)
                    .destroyTime(5),
            true
    );
    public static final Block JEFF_ORE = ModBlocks.register(
            "jeff_ore",
            Block::new,
            BlockBehaviour.Properties.of()
                    .sound(SoundType.LADDER)
                    .destroyTime(1),
            true
    );
    public static final Block DEEPSLATE_JEFF_ORE = ModBlocks.register(
            "deepslate_jeff_ore",
            Block::new,
            BlockBehaviour.Properties.of()
                    .sound(SoundType.MUD)
                    .destroyTime(2),
            true
    );
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    static final Consumable INSTANT_DAMAGE_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 20, 1), 2.0f))
            .build();
    public static final Item JEFF_SHOVEL = register("jeff_shovel", Item::new, new Item.Properties()
            .shovel(JeffMod.JEFF_TOOL_MATERIAL, 1f, 1f)
            .food(INSTANT_DAMAGE_FOOD_COMPONENT, INSTANT_DAMAGE_FOOD_CONSUMABLE_COMPONENT));

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_INGOT));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_AXE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_SWORD));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_HELMET));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(JeffMod.JEFF_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(JeffMod.JEFF_BLOCK.asItem());
        });
        LOGGER.info("jeff");
    }
}

