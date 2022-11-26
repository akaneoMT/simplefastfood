package net.akaneo.simplefastfood.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodValues {

    // Fries
    public static final FoodProperties FRIES = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.6f).build();

    // Burgers
    public static final FoodProperties BURGER_TIER_0 = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build();
    public static final FoodProperties BURGER_TIER_1 = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f).build();
    public static final FoodProperties BURGER_TIER_2 = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f).build();
    public static final FoodProperties BURGER_TIER_3 = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.8f).build();

    public static final FoodProperties CHICKEN_NUGGETS = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.8f).build();

    // Desserts

    public static final FoodProperties DESSERT = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.5f).build();
}
