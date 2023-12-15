package net.travis.furnitura.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.travis.furnitura.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DRAWER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_LOG_SHELF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_SHELF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_SHELF_EXTENDERS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACACIA_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLUE_PET_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_LOG_SHELF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_SHELF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_SHELF_EXTENDERS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHERRY_TABLE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
