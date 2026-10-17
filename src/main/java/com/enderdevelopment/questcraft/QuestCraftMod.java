package com.enderdevelopment.questcraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class QuestCraftMod implements ModInitializer {
    public static final String MOD_ID = "questcraft";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MOD_ID);

    public static final RegistryObject<Item> DIAMOND_REMOVER = ITEMS.register("diamond_remover", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_REMOVER = ITEMS.register("emerald_remover", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_REMOVER = ITEMS.register("gold_remover", () -> new Item(new Item.Properties()));

    public static final RegistryObject<MenuType<ClothingRemoverMenu>> CLOTHING_REMOVER_MENU = MENU_TYPES.register("clothing_remover_menu", () -> IForgeMenuType.create((windowId, inv, data) -> new ClothingRemoverMenu(windowId, inv, data.readBlockPos())));

    @Override
    public void onInitialize() {
        ITEMS.register();
        MENU_TYPES.register();
    }
}