package net.shylex.semod.setup;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> JIZZ_ORE = register("jizz_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 6)
                    .harvestLevel(2)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> CUM_BLOCK = register("cum_block", () ->
            new WebBlock(AbstractBlock.Properties.of(Material.CLAY)
                    .strength(2, 3)
                    .harvestLevel(0)
                    .sound(SoundType.SLIME_BLOCK)
                    .noOcclusion()
                    .noCollission()
                    .harvestTool(ToolType.PICKAXE)));

    private  static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private  static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }

    private BlockState defaultBlockState;
    public final BlockState defaultBlockState() {
        return this.defaultBlockState;
    }



    static void register(){}
}
