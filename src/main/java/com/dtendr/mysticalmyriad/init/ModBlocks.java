package com.dtendr.mysticalmyriad.init;

import com.dtendr.mysticalmyriad.block.BlockCromScale;
import com.dtendr.mysticalmyriad.block.BlockMM;
import com.dtendr.mysticalmyriad.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMM cromScale = new BlockCromScale();

    public static void init() {GameRegistry.registerBlock(cromScale, "Crom Scale");}
}
