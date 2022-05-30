package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.tileentity.TileEntityRedEmerauld;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, CSMM.ModID);

    public static final RegistryObject<TileEntityType<?>> RED_EMERAULD_TE = TILE_ENTITY.register("red_emerauld_te", () -> TileEntityType.Builder.of(TileEntityRedEmerauld::new, ModBlocks.RED_EMERAULD_BLOCK.get()).build(null));

}
