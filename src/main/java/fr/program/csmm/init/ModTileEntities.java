package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.tileentity.TileEntityRedEmerauld;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, CSMM.ModID);

    public static final RegistryObject<TileEntityType<?>> RED_EMERAULD_TILE_ENTITY = TILE_ENTITIES.register("red_emerauld_tile_entity", () -> TileEntityType.Builder.of(TileEntityRedEmerauld::new, ModBlocks.RED_EMERALD_BLOCK.get()).build(null));
}