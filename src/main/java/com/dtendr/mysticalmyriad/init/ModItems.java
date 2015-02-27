package com.dtendr.mysticalmyriad.init;

import com.dtendr.mysticalmyriad.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemMM myriadGrimore = new ItemGrimore();
    public static final ItemMM cromEye = new ItemCromEye();
    public static final ItemMM leylineOculus = new ItemLeylineOculus();
    public static final ItemMM manifoldGauntlets = new ItemManifoldGauntlets();
    public static final ItemMM puzzleBox = new ItemPuzzleBox();

    public static void init()
    {
        GameRegistry.registerItem(myriadGrimore, "Myriad Grimore");
        GameRegistry.registerItem(cromEye, "Eye of Crom");
        GameRegistry.registerItem(leylineOculus, "Leyline Oculus");
        GameRegistry.registerItem(manifoldGauntlets, "Manifold Gauntlets");
        GameRegistry.registerItem(puzzleBox, "Puzzle Box");
    }
}
