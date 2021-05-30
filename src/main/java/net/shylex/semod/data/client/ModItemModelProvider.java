package net.shylex.semod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shylex.semod.SeMod;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, SeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels(){
        withExistingParent("jizz_ore", modLoc("block/jizz_ore"));
        withExistingParent("cum_block", modLoc("block/cum_block"));



        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "cum_jelly");
        builder(itemGenerated, "cum_pickaxe");
        builder(itemGenerated, "cum_axe");
        builder(itemGenerated, "cum_hoe");
        builder(itemGenerated, "cum_sword");
        builder(itemGenerated, "cum_shovel");

        builder(itemGenerated, "cum_helmet");
        builder(itemGenerated, "cum_chestplate");
        builder(itemGenerated, "cum_greaves");
        builder(itemGenerated, "cum_boots");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
    }
}
