package net.shylex.semod.setup;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Potion;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.shylex.semod.SeMod;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = create(ForgeRegistries.BLOCKS);
    public static final DeferredRegister<Item> ITEMS = create(ForgeRegistries.ITEMS);
    public static final DeferredRegister<Item> TOOLS = create(ForgeRegistries.ITEMS);
    public static final DeferredRegister<Item> ARMOR = create(ForgeRegistries.ITEMS);
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = create(ForgeRegistries.CONTAINERS);
    public static final DeferredRegister<Potion> POTION = create(ForgeRegistries.POTION_TYPES);


    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        TOOLS.register(modEventBus);
        ARMOR.register(modEventBus);
        POTION.register(modEventBus);
        CONTAINERS.register(modEventBus);

        ModItems.register();
        ModBlocks.register();
        ModTools.register();
        ModArmor.register();
    }

    private static <T extends IForgeRegistryEntry<T>> DeferredRegister<T> create(IForgeRegistry<T> registry){
        return DeferredRegister.create(registry, SeMod.MOD_ID);
    }
}
