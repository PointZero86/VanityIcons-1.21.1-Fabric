package pointzero.vanityicons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pointzero.vanityicons.VanityIcons;

public class ModItemGroups
{
    public static final ItemGroup VANITY_ICONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanityIcons.MOD_ID, "vanity_icons_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBBER_DUCKY))
                    .displayName(Text.translatable("itemgroup.vanityicons.vanity_icons_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MOTHER_EARTH);
                        entries.add(ModItems.HIGH_HEEL);
                        entries.add(ModItems.RUBBER_DUCKY);
                        entries.add(ModItems.PLASTIC_DECAL);
                        entries.add(ModItems.VOLTAGE);
                        entries.add(ModItems.VOLTAGE_WARNING);
                    }).build());

    public static void registerItemGroups() {
        VanityIcons.LOGGER.info("Registering Item Groups For " + VanityIcons.MOD_ID);
    }
}
