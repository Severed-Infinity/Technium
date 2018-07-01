package com.severedinfinity.technium.utility.handlers;

import com.severedinfinity.technium.item.ItemIngotCopper;
import com.severedinfinity.technium.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        LogHelper.debug("################# Technium ################");
        LogHelper.debug("Technium item registry event beginning");

        final Item[] items = {new ItemIngotCopper()};
//        TnModItems.ITEMS.toArray(new Item[0])
        event.getRegistry().registerAll(items);

        LogHelper.debug("Technium item registry event complete");
        LogHelper.debug("##########################################");
    }

//    @SubscribeEvent
//    public static void onModelRegister(ModelRegistryEvent event) {
//        LogHelper.debug("################# Technium ################");
//        LogHelper.debug("Technium item model registry event beginning");
////        for (Item item: TnModItems.ITEMS) {
////            if (item instanceof IHasModel) {
////                ((IHasModel) item).registerModel();
////            }
////        }
//        TnModItems.ITEMS.forEach(item -> {
//            if (item instanceof IHasModel) {
//                ((IHasModel) item).registerModel();
//            }
//        });
//
//        LogHelper.debug("Technium item model registry event complete");
//        LogHelper.debug("##########################################");
//    }
}
