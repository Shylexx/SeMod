package net.shylex.semod.setup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;

public class ModTools {
    public static final RegistryObject<PickaxeItem> CUM_PICKAXE = Registration.ITEMS.register("cum_pickaxe", () ->
            new PickaxeItem(ModItemTier.CUM, 1, -2.8F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<SwordItem> CUM_SWORD = Registration.ITEMS.register("cum_sword", () ->
            new SwordItem(ModItemTier.CUM, 3, -2.4F, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<HoeItem> CUM_HOE = Registration.ITEMS.register("cum_hoe", () ->
            new HoeItem(ModItemTier.CUM, -2, -1.0F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> CUM_AXE = Registration.ITEMS.register("cum_axe", () ->
            new AxeItem(ModItemTier.CUM, 6.0F, -3.1F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> CUM_SHOVEL = Registration.ITEMS.register("cum_shovel", () ->
            new ShovelItem(ModItemTier.CUM, 1.5F, -3F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));


    static void register(){}

}