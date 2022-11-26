package net.akaneo.simplefastfood.common.registry;

import net.akaneo.simplefastfood.SimpleFastFood;
import net.akaneo.simplefastfood.common.FoodValues;
import net.akaneo.simplefastfood.common.item.ConsumableItem;
import net.akaneo.simplefastfood.common.item.SodaItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleFastFood.MODID);

    public static Item.Properties basicItem() {
        return new Item.Properties().tab(SimpleFastFood.CREATIVE_TAB);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(SimpleFastFood.CREATIVE_TAB);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16).tab(SimpleFastFood.CREATIVE_TAB);
    }

    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(SimpleFastFood.CREATIVE_TAB);
    }

    // Blocks
    public static final RegistryObject<Item> CHECKOUT_MACHINE = ITEMS.register("checkout_machine",
            () -> new BlockItem(ModBlocks.CHECKOUT_MACHINE.get(), basicItem()));

    // Fries
    public static final RegistryObject<Item> FRENCH_FRIES = ITEMS.register("french_fries",
            () -> new Item(foodItem(FoodValues.FRIES).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> RUSTIC_FRIES = ITEMS.register("rustic_fries",
            () -> new Item(foodItem(FoodValues.FRIES).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHIPS = ITEMS.register("chips",
            () -> new Item(foodItem(FoodValues.FRIES).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> LETTUCE_SALAD = ITEMS.register("lettuce_salad",
            () -> new ConsumableItem(foodItem(FoodValues.FRIES).craftRemainder(Items.BOWL)));
    public static final RegistryObject<Item> TOMATO_SALAD = ITEMS.register("tomato_salad",
            () -> new ConsumableItem(foodItem(FoodValues.FRIES).craftRemainder(Items.BOWL)));


    // Burgers
    public static final RegistryObject<Item> BEEF_BURGER = ITEMS.register("beef_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_2).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> PORK_BURGER = ITEMS.register("pork_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_2).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHICKEN_BURGER = ITEMS.register("chicken_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_1).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> MUTTON_BURGER = ITEMS.register("mutton_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_1).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> RABBIT_BURGER = ITEMS.register("rabbit_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_1).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> COD_BURGER = ITEMS.register("cod_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_1).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> SALMON_BURGER = ITEMS.register("salmon_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_1).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> ROTTEN_FLESH_BURGER = ITEMS.register("rotten_flesh_burger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_0).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHICKEN_NUGGETS = ITEMS.register("chicken_nuggets",
            () -> new Item(foodItem(FoodValues.CHICKEN_NUGGETS).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> BEEF_CHEESE_BURGER = ITEMS.register("beef_cheeseburger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_3).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> CHICKEN_CHEESE_BURGER = ITEMS.register("chicken_cheeseburger",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_3).tab(SimpleFastFood.CREATIVE_TAB)));
    public static final RegistryObject<Item> CROQUE_MONSIEUR = ITEMS.register("croque_monsieur",
            () -> new Item(foodItem(FoodValues.BURGER_TIER_2).tab(SimpleFastFood.CREATIVE_TAB)));

    // Drinks
    public static final RegistryObject<Item> COLA_SODA = ITEMS.register("cola_soda",
            () -> new SodaItem(drinkItem()));
    public static final RegistryObject<Item> ORANGE_SODA = ITEMS.register("orange_soda",
            () -> new SodaItem(drinkItem()));
    public static final RegistryObject<Item> LEMON_SODA = ITEMS.register("lemon_soda",
            () -> new SodaItem(drinkItem()));
    public static final RegistryObject<Item> CREAMING_SODA = ITEMS.register("creaming_soda",
            () -> new SodaItem(drinkItem()));
    public static final RegistryObject<Item> ICED_TEA = ITEMS.register("iced_tea",
            () -> new SodaItem(drinkItem()));

    // Desserts
    public static final RegistryObject<Item> ICE_CREAM = ITEMS.register("ice_cream",
            () -> new ConsumableItem(foodItem(FoodValues.DESSERT).craftRemainder(Items.BOWL)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream",
            () -> new ConsumableItem(foodItem(FoodValues.DESSERT).craftRemainder(Items.BOWL)));
    public static final RegistryObject<Item> RED_BERRIES_ICE_CREAM = ITEMS.register("red_berries_ice_cream",
            () -> new ConsumableItem(foodItem(FoodValues.DESSERT).craftRemainder(Items.BOWL)));
    public static final RegistryObject<Item> RAINBOW_ICE_CREAM = ITEMS.register("rainbow_ice_cream",
            () -> new ConsumableItem(foodItem(FoodValues.DESSERT).craftRemainder(Items.BOWL)));
    public static final RegistryObject<Item> APPLE_SAUCE = ITEMS.register("apple_sauce",
            () -> new ConsumableItem(foodItem(FoodValues.DESSERT).craftRemainder(Items.BOWL)));
}
