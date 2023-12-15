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

                    }).build());

    public static void registerItemGroups() {

    }
}
