package com.severedinfinity.tn.utility.handlers;

import com.severedinfinity.tn.initialise.TnModItems;
import com.severedinfinity.tn.utility.IHasModel;
import com.severedinfinity.tn.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        LogHelper.info("################# Technium ################");
        LogHelper.info("Technium item registry event beginning");

        event.getRegistry().registerAll(TnModItems.ITEMS.toArray(new Item[0]));

        LogHelper.info("Technium item registry event complete");
        LogHelper.info("##########################################");
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        LogHelper.info("################# Technium ################");
        LogHelper.info("Technium item model registry event beginning");
//        for (Item item: TnModItems.ITEMS) {
//            if (item instanceof IHasModel) {
//                ((IHasModel) item).registerModel();
//            }
//        }
        TnModItems.ITEMS.forEach(item -> {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModel();
            }
        });

        LogHelper.info("Technium item model registry event complete");
        LogHelper.info("##########################################");
    }
}
