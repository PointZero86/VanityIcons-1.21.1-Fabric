package pointzero.vanityicons.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pointzero.vanityicons.VanityIcons;

public class ModItems {
    public static final Item HIGH_HEEL = registerItem("high_heel", new Item(new Item.Settings()));
    public static final Item MOTHER_EARTH = registerItem("mother_earth", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanityIcons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanityIcons.LOGGER.info("Registering Mod Items For " + VanityIcons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.HOTBAR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(HIGH_HEEL);
            fabricItemGroupEntries.add(MOTHER_EARTH);
        });
    }
}
