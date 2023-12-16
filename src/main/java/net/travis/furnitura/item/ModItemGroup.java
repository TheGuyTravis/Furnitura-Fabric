package net.travis.furnitura.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.travis.furnitura.Furnitura;
import net.travis.furnitura.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup FURNITURA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Furnitura.MOD_ID, "furnitura_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.furnitura_group"))
                    .icon(() -> new ItemStack(ModBlocks.DRAWER)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.DRAWER);
                        entries.add(ModBlocks.ACACIA_CABINET);
                        entries.add(ModBlocks.ACACIA_CHAIR);
                        entries.add(ModBlocks.ACACIA_LOG_SHELF);
                        entries.add(ModBlocks.ACACIA_SHELF);
                        entries.add(ModBlocks.ACACIA_SHELF_EXTENDERS);
                        entries.add(ModBlocks.ACACIA_TABLE);
                        entries.add(ModBlocks.BLUE_PET_BED);
                        entries.add(ModBlocks.CHERRY_CABINET);
                        entries.add(ModBlocks.CHERRY_CHAIR);
                        entries.add(ModBlocks.CHERRY_LOG_SHELF);
                        entries.add(ModBlocks.CHERRY_SHELF);
                        entries.add(ModBlocks.CHERRY_SHELF_EXTENDERS);
                        entries.add(ModBlocks.CHERRY_TABLE);
                        entries.add(ModBlocks.COUCH_EDGE_RIGHT_RED);
                        entries.add(ModBlocks.COUCH_EXTENDERS_BLUE);
                        entries.add(ModBlocks.COUCH_EXTENDERS_BROWN);
                        entries.add(ModBlocks.COUCH_EXTENDERS_CYAN);
                        entries.add(ModBlocks.COUCH_EXTENDERS_GRAY);
                        entries.add(ModBlocks.COUCH_EXTENDERS_GREEN);
                        entries.add(ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE);
                        entries.add(ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY);
                        entries.add(ModBlocks.COUCH_EXTENDERS_LIME);
                        entries.add(ModBlocks.COUCH_EXTENDERS_ORANGE);
                        entries.add(ModBlocks.COUCH_EXTENDERS_PINK);
                        entries.add(ModBlocks.COUCH_EXTENDERS_PURPLE);
                        entries.add(ModBlocks.COUCH_EXTENDERS_RED);
                        entries.add(ModBlocks.COUCH_EXTENDERS_WHITE);
                        entries.add(ModBlocks.COUCH_EXTENDERS_YELLOW);
                        entries.add(ModBlocks.COUCH_EXTENDORS);
                        entries.add(ModBlocks.COUCH_SINGLE_RED);
                        entries.add(ModBlocks.CRIMSON_CABINET);
                        entries.add(ModBlocks.CRIMSON_CHAIR);
                        entries.add(ModBlocks.CRIMSON_SHELF);
                        entries.add(ModBlocks.CRIMSON_SHELF_EXTENDERS);
                        entries.add(ModBlocks.CRIMSON_STEM_SHELF);
                        entries.add(ModBlocks.CRIMSON_TABLE);

                    }).build());

    public static void registerItemGroups() {

    }
}
