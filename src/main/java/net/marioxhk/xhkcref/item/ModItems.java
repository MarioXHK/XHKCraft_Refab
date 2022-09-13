package net.marioxhk.xhkcref.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marioxhk.xhkcref.XHKCRef;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BIG_STICK = registerItem("big_stick",
            new Item( new FabricItemSettings().group(ItemGroup.MISC).maxDamage(5)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(XHKCRef.MODID, name), item);
    }


    public static void registerModItems() {
       XHKCRef.LOGGER.debug("Registering Mod Items for " + XHKCRef.MODID);
    }
}
