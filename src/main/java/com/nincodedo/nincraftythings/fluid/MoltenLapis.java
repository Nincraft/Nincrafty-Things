package com.nincodedo.nincraftythings.fluid;

import com.nincodedo.nincraftythings.block.BlockFluidClassicNincrafty;
import com.nincodedo.nincraftythings.creativetab.CreativeTabNincrafty;
import com.nincodedo.nincraftythings.init.ModBlocks;
import com.nincodedo.nincraftythings.reference.Names;
import com.nincodedo.nincraftythings.reference.Reference;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MoltenLapis extends BlockFluidClassicNincrafty {

	public MoltenLapis(Fluid fluid, Material material) {
		super(fluid, material);
		setCreativeTab(CreativeTabNincrafty.NINCRAFTY_TAB);
		setUnlocalizedName(Names.Blocks.MOLTEN_LAPIS_BLOCK);
		setRegistryName(Names.Blocks.MOLTEN_LAPIS_BLOCK);
	}

	public MoltenLapis(Fluid moltenLapis) {
		this(moltenLapis, Material.lava);
	}
}
