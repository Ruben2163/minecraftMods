package net.ruben.plants_vs_zombies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ruben.plants_vs_zombies.Plants_vs_zombies;

public class ModItems {
    public static final Item SUNFLOWERSEEDS= registerItems("sunflowerseeds", new Item(new FabricItemSettings()));
    public static final Item CHERRYBOMBSEEDS= registerItems("cherrybombseeds", new Item(new FabricItemSettings()));
    public static final Item CHOMPERSEEDS= registerItems("chomperseeds", new Item(new FabricItemSettings()));
    public static final Item GRAVEBUSTERSEEDS= registerItems("gravebusterseeds", new Item(new FabricItemSettings()));
    public static final Item PEASHOOTERSEEDS= registerItems("peashooterseeds", new Item(new FabricItemSettings()));
    public static final Item POTATOMINESEEDS= registerItems("potatomineseeds", new Item(new FabricItemSettings()));
    public static final Item PUFFSHROOMSEEDS= registerItems("puffshroomseeds", new Item(new FabricItemSettings()));
    public static final Item REPEATERSEEDS= registerItems("repeaterseeds", new Item(new FabricItemSettings()));
    public static final Item SNOWPEASEEDS= registerItems("snowpeaseeds", new Item(new FabricItemSettings()));
    public static final Item SUNSHROOMSEEDS= registerItems("sunshroomseeds", new Item(new FabricItemSettings()));
    public static final Item WALLNUTSEEDS= registerItems("wallnutseeds", new Item(new FabricItemSettings()));
    public static final Item SUN= registerItems("sun", new Item(new FabricItemSettings()));
    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SUNFLOWERSEEDS);
        entries.add(CHERRYBOMBSEEDS);
        entries.add(CHOMPERSEEDS);
        entries.add(GRAVEBUSTERSEEDS);
        entries.add(PEASHOOTERSEEDS);
        entries.add(POTATOMINESEEDS);
        entries.add(PUFFSHROOMSEEDS);
        entries.add(REPEATERSEEDS);
        entries.add(SNOWPEASEEDS);
        entries.add(SUNSHROOMSEEDS);
        entries.add(WALLNUTSEEDS);
        entries.add(SUN);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Plants_vs_zombies.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Plants_vs_zombies.LOGGER.info("Register Mod Items for" + Plants_vs_zombies.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
