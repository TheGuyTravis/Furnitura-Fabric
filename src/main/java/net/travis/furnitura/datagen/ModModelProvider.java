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
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EDGE_RIGHT_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COUCH_EXTENDERS_YELLOW);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
