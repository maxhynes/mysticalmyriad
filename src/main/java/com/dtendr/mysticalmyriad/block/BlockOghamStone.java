package com.dtendr.mysticalmyriad.block;

public class BlockOghamStone extends BlockMM
{
    public BlockOghamStone()
    {
        super();
        this.setBlockName("oghamStone");
        this.setBlockTextureName("oghamStone");

        //this.setStepSound(SoundType.)
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
}
