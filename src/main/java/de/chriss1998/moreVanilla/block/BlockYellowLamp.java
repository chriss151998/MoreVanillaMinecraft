package de.chriss1998.moreVanilla.block;


public class BlockYellowLamp extends BlockMv {


    public BlockYellowLamp() {
        super();
        this.setBlockName("BlockYellowLamp");
        this.setLightLevel(1F);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5F);
    }
}
