package net.shylex.semod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shylex.semod.SeMod;
import net.shylex.semod.setup.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper){
        super(gen, SeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        simpleBlock(ModBlocks.CUM_BLOCK.get());
        simpleBlock(ModBlocks.JIZZ_ORE.get());
    }
}
