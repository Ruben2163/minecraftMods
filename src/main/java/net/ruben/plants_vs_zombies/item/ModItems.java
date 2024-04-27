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
    public static final Item DOOMSHROOMSEEDS= registerItems("doomshroomseeds", new Item(new FabricItemSettings()));
    public static final Item ICESHROOMSEEDS= registerItems("iceshroomseeds", new Item(new FabricItemSettings()));
    public static final Item LILYPADSEEDS= registerItems("lilypadseeds", new Item(new FabricItemSettings()));
    public static final Item SCARDEYSEEDS= registerItems("scardeyseeds", new Item(new FabricItemSettings()));
    public static final Item SQUASHSEEDS= registerItems("squashseeds", new Item(new FabricItemSettings()));
    public static final Item THREEPEATERSEEDS= registerItems("threepeaterseeds", new Item(new FabricItemSettings()));
    public static final Item BLOVERSEEDS= registerItems("bloverseeds", new Item(new FabricItemSettings()));
    public static final Item CABBAGEPULTSEEDS= registerItems("cabbagepultseeds", new Item(new FabricItemSettings()));
    public static final Item CACTUSSEEDS= registerItems("cactusseeds", new Item(new FabricItemSettings()));
    public static final Item FUMESHROOMSEEDS= registerItems("fumeshroomseeds", new Item(new FabricItemSettings()));
    public static final Item HYPNOSHROOMSEEDS= registerItems("hypnoshroomseeds", new Item(new FabricItemSettings()));
    public static final Item JALAPENOSEEDS= registerItems("jalapenoseeds", new Item(new FabricItemSettings()));
    public static final Item MAGNETSHROOMSEEDS= registerItems("magnetshroomseeds", new Item(new FabricItemSettings()));
    public static final Item PLANTERNSEEDS= registerItems("planternseeds", new Item(new FabricItemSettings()));
    public static final Item PUMPKINSEEDS= registerItems("pumpkinseeds", new Item(new FabricItemSettings()));
    public static final Item SEASHROOMSEEDS= registerItems("seashroomseeds", new Item(new FabricItemSettings()));
    public static final Item SPIKEWEEDSEEDS= registerItems("spikeweedseeds", new Item(new FabricItemSettings()));
    public static final Item SPLITPEASEEDS= registerItems("splitpeaseeds", new Item(new FabricItemSettings()));
    public static final Item STARFRUITSEEDS= registerItems("starfruitseeds", new Item(new FabricItemSettings()));
    public static final Item TALLNUTSEEDS= registerItems("tallnutseeds", new Item(new FabricItemSettings()));
    public static final Item TANGLEKELPSEEDS= registerItems("tanglekelpseeds", new Item(new FabricItemSettings()));
    public static final Item TORCHWOODSEEDS= registerItems("torchwoodseeds", new Item(new FabricItemSettings()));
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
        entries.add(DOOMSHROOMSEEDS);
        entries.add(ICESHROOMSEEDS);
        entries.add(LILYPADSEEDS);
        entries.add(SCARDEYSEEDS);
        entries.add(SQUASHSEEDS);
        entries.add(THREEPEATERSEEDS);
        entries.add(BLOVERSEEDS);
        entries.add(CABBAGEPULTSEEDS);
        entries.add(CACTUSSEEDS);
        entries.add(FUMESHROOMSEEDS);
        entries.add(HYPNOSHROOMSEEDS);
        entries.add(JALAPENOSEEDS);
        entries.add(MAGNETSHROOMSEEDS);
        entries.add(PLANTERNSEEDS);
        entries.add(PUMPKINSEEDS);
        entries.add(SEASHROOMSEEDS);
        entries.add(SPIKEWEEDSEEDS);
        entries.add(SPLITPEASEEDS);
        entries.add(STARFRUITSEEDS);
        entries.add(TALLNUTSEEDS);
        entries.add(TANGLEKELPSEEDS);
        entries.add(TORCHWOODSEEDS);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Plants_vs_zombies.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Plants_vs_zombies.LOGGER.info("Register Mod Items for" + Plants_vs_zombies.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
