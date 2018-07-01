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
 * ItemTnBase.java was created 15/2/2015 and last updated 2/15/15 3:43 PM
 */
package com.severedinfinity.tn.item;

import com.severedinfinity.tn.core.CreativeTab;
import com.severedinfinity.tn.core.Technium;
import com.severedinfinity.tn.initialise.TnModItems;
import com.severedinfinity.tn.reference.Reference;
import com.severedinfinity.tn.utility.IHasModel;
import net.minecraft.item.Item;

//FIXME one class for them all not so sure
public class ItemTnBase extends Item  {


    public ItemTnBase(String name) {
        super();
//        this.setMaxStackSize(1);
//        this.setNoRepair();
        this.setCreativeTab(Technium.TN_TAB);
        this.setUnlocalizedName(Reference.MOD_ID + "." + name);
        //This fucking line was required for registry to work but not mention anywhere
        this.setRegistryName(Reference.MOD_ID, name);

//        TnModItems.ITEMS.add(this);
    }


//    public void registerModel() {
//        Technium.proxy.registerItemRender(this, 0, "inventory");
//    }
}
