package fr.program.csmm.tileentity;

import fr.program.csmm.init.ModTileEntities;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRedEmerauld extends TileEntity implements ITickableTileEntity {

    private int counter = 0;

    public TileEntityRedEmerauld() {
        super(ModTileEntities.RED_EMERAULD_TILE_ENTITY.get());
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT nbt) { // func_230337_a_ = read
        super.func_230337_a_(state, nbt); // = super.read

        this.setCounter(nbt.getInt("counter"));
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);

        compound.putInt("counter", this.getCounter());

        return compound;
    }

    @Override
    public void tick() {
        setCounter(getCounter()+1);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
