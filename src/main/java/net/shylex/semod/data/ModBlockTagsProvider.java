package net.shylex.semod.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shylex.semod.SeMod;
import net.shylex.semod.setup.ModBlocks;
import net.shylex.semod.setup.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper){
        super(generatorIn, SeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        tag(ModTags.Blocks.ORES_JIZZ).add(ModBlocks.JIZZ_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_JIZZ);
        tag(ModTags.Blocks.STORAGE_BLOCKS_CUM).add(ModBlocks.CUM_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_CUM);

    }
}
