package com.example.examplemod.core;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    /**
     * The deferred register helps us to manage our registry entries.
     * Use the {@link #register(String itemName, Item itemType)} method to register the items.
     */
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    // Register your items below this line!



    // Register your items above this line!

    /**
     * Helper method used to register items.
     *<p>Example usage:</p>
     *<code>
     *  public static final RegistryObject<Item> EXAMPLE_GUN = register("example_gun", new GunItem(new Item.Properties().maxStackSize(1).group(group)));
     *</code>
     *
     * @author Autovw
     *
     * @param itemName Registry name of the item
     * @param itemType The item class, e.g. 'Item' or 'GunItem'
     * @return The item registry
     */
    private static RegistryObject<Item> register(String itemName, Item itemType)
    {
        return ITEM_REGISTRY.register(itemName, () -> itemType);
    }
}
