package com.severedinfinity.tn.utility.handlers;

import com.severedinfinity.tn.initialise.TnModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(TnModItems.INGOT_COPPER);
//        ModelLoader.setCustomModelResourceLocation(TnModItems.INGOT_COPPER, 0, new ModelResourceLocation(TnModItems.INGOT_COPPER.getRegistryName(), "inventory"));
    }

    public static void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
