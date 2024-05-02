package fr.tibish.newcalmod.datagen;

import fr.tibish.newcalmod.block.ModBlocks;
import fr.tibish.newcalmod.newcalmod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, newcalmod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.NICKEL_BLOCK);
        blockWithItem(ModBlocks.NICKEL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_NICKEL_ORE);
        blockWithItem(ModBlocks.NETHER_NICKEL_ORE);
        blockWithItem(ModBlocks.END_NICKEL_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
