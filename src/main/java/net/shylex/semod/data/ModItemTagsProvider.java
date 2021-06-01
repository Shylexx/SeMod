package net.shylex.semod.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shylex.semod.SeMod;
import net.shylex.semod.setup.ModArmor;
import net.shylex.semod.setup.ModItems;
import net.shylex.semod.setup.ModTags;
import net.shylex.semod.setup.ModTools;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator generatorIn, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper){
     super(generatorIn, blockTagProvider, SeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        copy(ModTags.Blocks.ORES_JIZZ, ModTags.Items.ORES_JIZZ);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_CUM, ModTags.Items.STORAGE_BLOCKS_CUM);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(ModTags.Blocks.STORAGE_BLOCKS_CONGEALED_CUM, ModTags.Items.STORAGE_BLOCKS_CONGEALED_CUM);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_CUM).add(ModItems.CUM_JELLY.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_CUM);

        //Add Tool Tags
        tag(ModTags.Items.PICKAXE_CUM).add(ModTools.CUM_PICKAXE.get());
        tag(ModTags.Items.AXE_CUM).add(ModTools.CUM_AXE.get());
        tag(ModTags.Items.SHOVEL_CUM).add(ModTools.CUM_SHOVEL.get());
        tag(ModTags.Items.HOE_CUM).add(ModTools.CUM_HOE.get());
        tag(ModTags.Items.SWORD_CUM).add(ModTools.CUM_SWORD.get());
        //Add Armor Tags
        tag(ModTags.Items.HELMET_CUM).add(ModArmor.CUM_HELMET.get());
        tag(ModTags.Items.CHESTPLATE_CUM).add(ModArmor.CUM_CHESTPLATE.get());
        tag(ModTags.Items.GREAVES_CUM).add(ModArmor.CUM_GREAVES.get());
        tag(ModTags.Items.BOOTS_CUM).add(ModArmor.CUM_BOOTS.get());

    }

}
