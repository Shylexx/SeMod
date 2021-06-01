package net.shylex.semod.world;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.shylex.semod.SeMod;
import net.shylex.semod.setup.ModBlocks;
import net.shylex.semod.setup.Registration;
@Mod.EventBusSubscriber(modid = SeMod.MOD_ID)
public class ModWorldFeature {
    public static ConfiguredFeature<?, ?> JIZZ_ORE_FEATURE;
    // register to the Mod event bus
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            JIZZ_ORE_FEATURE = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.JIZZ_ORE.get().defaultBlockState(), 9))
                    .range(32)
                    .squared()
                    .count(2);

            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(SeMod.MOD_ID, "jizz_ore"), JIZZ_ORE_FEATURE);
        });
    }


}


