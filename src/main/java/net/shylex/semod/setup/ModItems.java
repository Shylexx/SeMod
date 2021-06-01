package net.shylex.semod.setup;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.ItemGroup;

import java.util.Random;


public class ModItems {
    public static final RegistryObject<Item> CUM_JELLY = Registration.ITEMS.register("cum_jelly", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Potion> CUM_CHALICE = Registration.POTION.register("cum_chalice",() -> new Potion(
            new EffectInstance(Effects.LEVITATION, 600)));



    static void register() {}
}
