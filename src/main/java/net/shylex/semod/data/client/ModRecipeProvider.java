package net.shylex.semod.data.client;

import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.shylex.semod.SeMod;
import net.shylex.semod.setup.ModArmor;
import net.shylex.semod.setup.ModBlocks;
import net.shylex.semod.setup.ModItems;
import net.shylex.semod.setup.ModTools;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator){
        super(generator);
    }

    @Override

    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer){
        //Turn Storage Block into 9 Jelly
        ShapelessRecipeBuilder.shapeless(ModItems.CUM_JELLY.get(), 9)
                .requires(ModBlocks.CUM_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer);

        //9 Jelly to Storage Block
        ShapedRecipeBuilder.shaped(ModBlocks.CUM_BLOCK.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer);

        //TOOLS RECIPES
        ShapedRecipeBuilder.shaped(ModTools.CUM_PICKAXE.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModTools.CUM_AXE.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("## ")
                .pattern("#x ")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_axe_01"));
        ShapedRecipeBuilder.shaped(ModTools.CUM_AXE.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern(" ##")
                .pattern(" x#")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_axe_02"));

        ShapedRecipeBuilder.shaped(ModTools.CUM_SWORD.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_sword_01"));
        ShapedRecipeBuilder.shaped(ModTools.CUM_SWORD.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("  #")
                .pattern("  #")
                .pattern("  x")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_sword_02"));
        ShapedRecipeBuilder.shaped(ModTools.CUM_SWORD.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("#  ")
                .pattern("#  ")
                .pattern("x  ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_sword_03"));

        ShapedRecipeBuilder.shaped(ModTools.CUM_SHOVEL.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern(" # ")
                .pattern(" x ")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_shovel_01"));
        ShapedRecipeBuilder.shaped(ModTools.CUM_SHOVEL.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("  #")
                .pattern("  x")
                .pattern("  x")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_shovel_02"));
        ShapedRecipeBuilder.shaped(ModTools.CUM_SHOVEL.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("#  ")
                .pattern("x  ")
                .pattern("x  ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_shovel_03"));

        ShapedRecipeBuilder.shaped(ModTools.CUM_HOE.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern("## ")
                .pattern(" x ")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_hoe_01"));
        ShapedRecipeBuilder.shaped(ModTools.CUM_HOE.get())
                .define('#', ModItems.CUM_JELLY.get())
                .define('x', Items.STICK)
                .pattern(" ##")
                .pattern(" x ")
                .pattern(" x ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_hoe_02"));

        //ARMOR RECIPES
        ShapedRecipeBuilder.shaped(ModArmor.CUM_HELMET.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_helm_01"));
        ShapedRecipeBuilder.shaped(ModArmor.CUM_HELMET.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("   ")
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_helm_02"));

        ShapedRecipeBuilder.shaped(ModArmor.CUM_CHESTPLATE.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_chestplate"));

        ShapedRecipeBuilder.shaped(ModArmor.CUM_GREAVES.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_greaves"));

        ShapedRecipeBuilder.shaped(ModArmor.CUM_BOOTS.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_boots_01"));
        ShapedRecipeBuilder.shaped(ModArmor.CUM_BOOTS.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer, modId("cum_boots_02"));

        //Ore Smelting Recipe
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.JIZZ_ORE.get()), ModItems.CUM_JELLY.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.JIZZ_ORE.get()))
                .save(consumer, modId("cum_jelly_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.JIZZ_ORE.get()), ModItems.CUM_JELLY.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.JIZZ_ORE.get()))
                .save(consumer, modId("cum_jelly_blasting"));


        //Chalice Recipe


    }

    private static ResourceLocation modId(String path){
        return new ResourceLocation(SeMod.MOD_ID, path);
    }

}
