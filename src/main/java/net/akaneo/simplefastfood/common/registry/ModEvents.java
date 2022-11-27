package net.akaneo.simplefastfood.common.registry;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.akaneo.simplefastfood.SimpleFastFood;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = SimpleFastFood.MODID)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void addCustomTrades(VillagerTradesEvent event) {

            // Fries
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.FRENCH_FRIES.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.RUSTIC_FRIES.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CHIPS.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.ONION_RINGS.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.LETTUCE_SALAD.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.TOMATO_SALAD.get(), 1);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }

            // Burgers tier 1
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CHICKEN_BURGER.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.MUTTON_BURGER.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.RABBIT_BURGER.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.COD_BURGER.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.SALMON_BURGER.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 5),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.ROTTEN_FLESH_BURGER.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 1),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CHICKEN_NUGGETS.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 4),
                        stack, 10, 5, 0.0F));
            }

            // Burgers tier 2

            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.BEEF_BURGER.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 6),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.PORK_BURGER.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 6),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.BEEF_CHEESE_BURGER.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 8),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CHICKEN_CHEESE_BURGER.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 8),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CROQUE_MONSIEUR.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 7),
                        stack, 10, 5, 0.0F));
            }

            // Drinks
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.COLA_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.ORANGE_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.LEMON_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CREAMING_SODA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.ICED_TEA.get(), 1);
                int villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 2),
                        stack, 10, 5, 0.0F));
            }

            // Desserts
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.CHOCOLATE_ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.SWEET_BERRIES_ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.RAINBOW_ICE_CREAM.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
            if (event.getType() == ModVillagers.FAST_FOOD_WAITER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.APPLE_SAUCE.get(), 1);
                int villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.GOLD_NUGGET, 3),
                        stack, 10, 5, 0.0F));
            }
        }
    }
}
