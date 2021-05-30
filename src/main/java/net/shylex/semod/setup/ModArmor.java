package net.shylex.semod.setup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModArmor {
    public static final RegistryObject<ArmorItem> CUM_CHESTPLATE = Registration.ITEMS.register("cum_chestplate", () ->
            new ArmorItem(ModArmorMaterial.CUM, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> CUM_HELMET = Registration.ITEMS.register("cum_helmet", () ->
            new ArmorItem(ModArmorMaterial.CUM, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> CUM_BOOTS = Registration.ITEMS.register("cum_boots", () ->
            new ArmorItem(ModArmorMaterial.CUM, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> CUM_GREAVES = Registration.ITEMS.register("cum_greaves", () ->
            new ArmorItem(ModArmorMaterial.CUM, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));



    static void register(){}
}
