package com.dtendr.mysticalmyriad.init;

import com.dtendr.mysticalmyriad.block.*;
import com.dtendr.mysticalmyriad.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMM oghamStone = new BlockOghamStone();
    public static final BlockMM spatialPylon = new BlockSpatialPylon();
    public static final BlockMM spatialManifold = new BlockSpatialManifold();
    public static final BlockMM cromScale = new BlockCromScale();

    public static void init()
    {
        GameRegistry.registerBlock(oghamStone, "Ogham Stone");
        GameRegistry.registerBlock(spatialPylon, "Spatial Pylon");
        GameRegistry.registerBlock(spatialManifold, "Spatial Manifold");
        GameRegistry.registerBlock(cromScale, "Crom Scale");
    }
}
