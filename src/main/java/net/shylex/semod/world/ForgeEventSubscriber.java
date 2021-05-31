package net.shylex.semod.world;

import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shylex.semod.SeMod;

@Mod.EventBusSubscriber(modid = SeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber {
    // register to the Forge event bus
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void biomeModification(final BiomeLoadingEvent event) {
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ModWorldFeature.JIZZ_ORE_FEATURE);
    }
}
