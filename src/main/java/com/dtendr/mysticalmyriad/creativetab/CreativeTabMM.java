package com.dtendr.mysticalmyriad.creativetab;

import com.dtendr.mysticalmyriad.init.ModItems;
import com.dtendr.mysticalmyriad.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMM
{
    public static final CreativeTabs MM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem(){return ModItems.leylineOculus;}
    };
}
