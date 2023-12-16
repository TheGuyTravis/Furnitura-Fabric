package net.travis.furnitura.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.travis.furnitura.Furnitura;
import net.travis.furnitura.block.custom.*;

public class ModBlocks {

    public static final Block DRAWER = registerBlock("drawer",
            new DrawerBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block ACACIA_CABINET = registerBlock("acacia_cabinet",
            new AcaciaCabinetBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
            new AcaciaChairBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block ACACIA_LOG_SHELF = registerBlock("acacia_log_shelf",
            new AcaciaLogShelfBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block ACACIA_SHELF = registerBlock("acacia_shelf",
            new AcaciaShelfBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block ACACIA_SHELF_EXTENDERS = registerBlock("acacia_shelf_extenders",
            new AcaciaShelfExtendersBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block ACACIA_TABLE = registerBlock("acacia_table",
            new AcaciaTableBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block BLUE_PET_BED = registerBlock("blue_pet_bed",
            new BluePetBedBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).nonOpaque()));

    public static final Block CHERRY_CABINET = registerBlock("cherry_cabinet",
            new CherryCabinetBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()));

    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
            new CherryChairBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()));

    public static final Block CHERRY_LOG_SHELF = registerBlock("cherry_log_shelf",
            new CherryLogShelfBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()));

    public static final Block CHERRY_SHELF = registerBlock("cherry_shelf",
            new CherryShelfBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()));

    public static final Block CHERRY_SHELF_EXTENDERS = registerBlock("cherry_shelf_extenders",
            new CherryShelfExtendersBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block CHERRY_TABLE = registerBlock("cherry_table",
            new CherryTableBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block COUCH_EDGE_RIGHT_RED = registerBlock("couch_edge_right_red",
            new CouchEdgeRightRedBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_BLUE = registerBlock("couch_extenders_blue",
            new CouchExtendersBlueBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_BROWN = registerBlock("couch_extenders_brown",
            new CouchExtendersBrownBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_CYAN = registerBlock("couch_extenders_cyan",
            new CouchExtendersCyanBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_GRAY = registerBlock("couch_extenders_gray",
            new CouchExtendersGrayBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_GREEN = registerBlock("couch_extenders_green",
            new CouchExtendersGreenBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_LIGHT_BLUE = registerBlock("couch_extenders_light_blue",
            new CouchExtendersLightBlueBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_LIGHT_GRAY = registerBlock("couch_extenders_light_gray",
            new CouchExtendersLightGrayBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_LIME = registerBlock("couch_extenders_lime",
            new CouchExtendersLimeBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_ORANGE = registerBlock("couch_extenders_orange",
            new CouchExtendersOrangeBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_PINK = registerBlock("couch_extenders_pink",
            new CouchExtendersPinkBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_PURPLE = registerBlock("couch_extenders_purple",
            new CouchExtendersPurpleBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_RED = registerBlock("couch_extenders_red",
            new CouchExtendersRedBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_WHITE = registerBlock("couch_extenders_white",
            new CouchExtendersWhiteBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));

    public static final Block COUCH_EXTENDERS_YELLOW = registerBlock("couch_extenders_yellow",
            new CouchExtendersYellowBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Furnitura.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Furnitura.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Furnitura.LOGGER.info("Registering ModBLocks for " + Furnitura.MOD_ID);
    }
}
