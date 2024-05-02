package fr.tibish.newcalmod.datagen;

import fr.tibish.newcalmod.block.ModBlocks;
import fr.tibish.newcalmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.NICKEL_BLOCK.get());

        add(ModBlocks.NICKEL_ORE.get(),
                (block -> createOreDrop(ModBlocks.NICKEL_ORE.get(), ModItems.RAW_NICKEL.get())));
        add(ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                (block -> createOreDrop(ModBlocks.DEEPSLATE_NICKEL_ORE.get(), ModItems.RAW_NICKEL.get())));
        add(ModBlocks.NETHER_NICKEL_ORE.get(),
                (block -> createOreDrop(ModBlocks.NETHER_NICKEL_ORE.get(), ModItems.RAW_NICKEL.get())));
        add(ModBlocks.END_NICKEL_ORE.get(),
                (block -> createOreDrop(ModBlocks.END_NICKEL_ORE.get(), ModItems.RAW_NICKEL.get())));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
