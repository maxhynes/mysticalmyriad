package com.dtendr.mysticalmyriad.init;

import com.dtendr.mysticalmyriad.item.ItemLeylineOculus;
import com.dtendr.mysticalmyriad.item.ItemMM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMM leylineOculus = new ItemLeylineOculus();

    public static void init()
    {
        GameRegistry.registerItem(leylineOculus, "Leyline Oculus");
    }
}
