package net.em.firereborn.item;

import net.em.firereborn.FireReborn;
import net.em.firereborn.item.custom.BurnerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FireReborn.MOD_ID);

    public static final RegistryObject<Item> INFERIUM = ITEMS.register("inferium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_INFERIUM = ITEMS.register("raw_inferium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BURNER = ITEMS.register("burner",
            () -> new BurnerItem(new Item.Properties().durability(48)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
