package net.shylex.semod.setup;

import net.minecraft.block.Block;
import net.minecraft.item.PickaxeItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.shylex.semod.SeMod;

public class ModTags {
    public static final class Blocks{
        public static final ITag.INamedTag<Block> ORES_JIZZ = forge("ores/jizz");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_CUM = forge("storage_blocks/cum");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_CONGEALED_CUM = forge("storage_blocks/congealed_cum");

        private static ITag.INamedTag<Block> forge(String path){
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path){
            return BlockTags.bind(new ResourceLocation(SeMod.MOD_ID, path).toString());
        }



    }

    public static final class Items{
        public static final ITag.INamedTag<Item> ORES_JIZZ = forge("ores/jizz");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_CUM = forge("storage_blocks/cum");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_CONGEALED_CUM = forge("storage_blocks/congealed_cum");

        public static final ITag.INamedTag<Item> INGOTS_CUM = forge("ingots/cum");

        //Tool Tags
        public static final ITag.INamedTag<Item> PICKAXE_CUM = forge("tools/cum_pickaxe");
        public static final ITag.INamedTag<Item> AXE_CUM = forge("tools/cum_axe");
        public static final ITag.INamedTag<Item> SHOVEL_CUM = forge("tools/cum_shovel");
        public static final ITag.INamedTag<Item> HOE_CUM = forge("tools/cum_hoe");
        public static final ITag.INamedTag<Item> SWORD_CUM = forge("tools/cum_sword");

        //Armor Tags
        public static final ITag.INamedTag<Item> HELMET_CUM = forge("armor/cum_helmet");
        public static final ITag.INamedTag<Item> CHESTPLATE_CUM = forge("armor/cum_chestplate");
        public static final ITag.INamedTag<Item> GREAVES_CUM = forge("armor/cum_greaves");
        public static final ITag.INamedTag<Item> BOOTS_CUM = forge("armor/cum_boots");


        private static ITag.INamedTag<Item> forge(String path){
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.bind(new ResourceLocation(SeMod.MOD_ID, path).toString());
        }


    }
}
