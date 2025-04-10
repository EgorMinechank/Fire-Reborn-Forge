package net.em.firereborn.item;

import net.em.firereborn.FireReborn;
import net.em.firereborn.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FireReborn.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRE_REBORN_TAB = CREATIVE_MODE_TABS.register("fire_reborn_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INFERIUM.get()))
                    .title(Component.translatable("creativetab.firereborn.fire_reborn"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.INFERIUM.get());
                        output.accept(ModItems.RAW_INFERIUM.get());


                        output.accept(ModBlocks.INFERIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_INFERIUM_BLOCK.get());

                        output.accept(ModBlocks.INFERIUM_ORE.get());
                        output.accept(ModBlocks.INFERIUM_DEEPSLATE_ORE.get());
                    }) .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
