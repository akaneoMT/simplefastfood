package net.akaneo.simplefastfood.common.registry;

import net.akaneo.simplefastfood.SimpleFastFood;
import net.akaneo.simplefastfood.common.block.CheckoutMachineBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleFastFood.MODID);

    public static final RegistryObject<Block> CHECKOUT_MACHINE = BLOCKS.register("checkout_machine",
            () -> new CheckoutMachineBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
}
