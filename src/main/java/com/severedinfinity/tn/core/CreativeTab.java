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
 * CreativeTab.java was created 15/2/2015 and last updated 2/15/15 3:43 PM
 */
package com.severedinfinity.tn.core;

import com.severedinfinity.tn.initialise.*;
import com.severedinfinity.tn.reference.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class CreativeTab extends CreativeTabs {

//    public final static CreativeTab TN_TAB = new CreativeTab(Reference.MOD_ID);
    public CreativeTab(String label) {
        super(label + ".tab");
    }

//    public CreativeTab(String label) {
//        super("Technium");
//    }
//
//    public CreativeTab(int index, String label) {
//        super(index, "Technium");
//    }
//
//    @Override
//    public ItemStack getTabIconItem() {
//        return new ItemStack(TnModItems.COPPER_INGOT);
//    }

//  public static final CreativeTabs TN_TAB = new CreativeTabs(Reference.MOD_ID) {
//    @Override
//    public ItemStack getTabIconItem() {
//      //TODO add creative tab icon
//      return new ItemStack(TnModItems.INGOT_COPPER);
//    }
//  };

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack((TnModItems.INGOT_COPPER));
    }
}
