package net.shylex.semod.setup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.shylex.semod.SeMod;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    CUM(SeMod.MOD_ID+":cum", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.CUM_JELLY.get());});



    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private ModArmorMaterial(String nameIn, int durabilityMultiplier, int[] slot, int enchantmentValue, SoundEvent soundtype, float toughness, float p_i231593_9_, Supplier<Ingredient> repairIngredient) {
        this.name = nameIn;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slot;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundtype;
        this.toughness = toughness;
        this.knockbackResistance = p_i231593_9_;
        this.repairIngredient = repairIngredient;
    }



    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn) {
        return HEALTH_PER_SLOT[slotIn.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn) {
        return this.slotProtections[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.getEnchantmentValue();
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
