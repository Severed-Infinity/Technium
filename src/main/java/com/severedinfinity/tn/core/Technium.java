/*
 * This File is apart of Technium
 * Copyright (c) 2013 - 2015, David Swift a.k.a Severed_Infinity, Severed-Infinity, Severed
 * Infinity, All rights reserved.
 *
 * Technium is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Technium is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Technium.  If not, see <http://www.gnu.org/licenses/lgpl>.
 *
 * Technium.java was created 15/2/2015 and last updated 2/15/15 3:43 PM
 */
package com.severedinfinity.tn.core;

//import com.severedinfinity.tn.configuration.*;
//import com.severedinfinity.tn.initialise.*;
import com.severedinfinity.tn.utility.*;
import com.severedinfinity.tn.proxy.*;
import com.severedinfinity.tn.reference.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Technium {
  @Mod.Instance(Reference.MOD_ID)
  public static Technium techniumInstance;
  @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
  public static IProxy proxy;
  public static final CreativeTabs TN_TAB = new CreativeTab(Reference.MOD_ID);

  @Mod.EventHandler
  public void preInitialisationEvent(FMLPreInitializationEvent event) {
    LogHelper.logger = event.getModLog();
    LogHelper.info("################# Technium ################");
    LogHelper.info("Technium pre-initialisation event beginning");

    proxy.preInitialization(event);
//    ConfigurationHandler.init(event.getSuggestedConfigurationFile());

//    TnModBlocks.initBlocks();
//    TnModItems.initItems();
//    TnModItems.initOreDictionary();

    LogHelper.info("Technium pre-initialisation event complete");
    LogHelper.info("##########################################");
  }

  @Mod.EventHandler
  public void initialisationEvent(FMLInitializationEvent event) {
    LogHelper.info("################# Technium ################");
    LogHelper.info("Technium initialisation event beginning");

    proxy.initialization(event);
//    proxy.initRenderingAndTextures();

    LogHelper.info("Technium initialisation event complete");
    LogHelper.info("##########################################");
  }

  @Mod.EventHandler
  public void postInitialisationEvent(FMLPostInitializationEvent event) {
    LogHelper.info("################# Technium ################");
    LogHelper.info("Technium post-initialisation event beginning");

    proxy.postInitialization(event);

    LogHelper.info("Technium post-initialisation event complete");
    LogHelper.info("###########################################");
  }
}
