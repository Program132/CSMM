package fr.program.csmm.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModFeatures {

    private ConfiguredFeature<?,?> TRADIUM_ORE_FEATURE;
    public ConfiguredFeature<?, ?> COPPER_ORE_FEATURE;

    public void init() {
        COPPER_ORE_FEATURE = register("ore_copper", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.COPPER_ORE.get().defaultBlockState(), 5))
                .squared()
                .range(20)
                .count(20));

        TRADIUM_ORE_FEATURE = register("ore_tradium", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TRADIUM_ORE.get().defaultBlockState(), 5))
                .squared()
                .range(20)
                .count(20));
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeLoading(BiomeLoadingEvent e)
    {
        BiomeGenerationSettingsBuilder generation = e.getGeneration();
        if(e.getCategory() != Biome.Category.NETHER)
        {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, COPPER_ORE_FEATURE);
        }
    }

}
