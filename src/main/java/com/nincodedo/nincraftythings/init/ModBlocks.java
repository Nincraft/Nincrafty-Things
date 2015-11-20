package com.nincodedo.nincraftythings.init;

import java.util.Arrays;

import com.nincodedo.nincraftythings.block.BlockNincodium;
import com.nincodedo.nincraftythings.block.BlockNincodiumOre;
import com.nincodedo.nincraftythings.block.BlockQuartzOre;
import com.nincodedo.nincraftythings.botania.block.subtile.functional.SubTileOrechidFinis;
import com.nincodedo.nincraftythings.botania.block.subtile.functional.SubTileOrechidMystica;
import com.nincodedo.nincraftythings.fluid.MoltenLapis;
import com.nincodedo.nincraftythings.fluid.MoltenNincodium;
import com.nincodedo.nincraftythings.reference.Names;
import com.nincodedo.nincraftythings.reference.Reference;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import vazkii.botania.api.BotaniaAPI;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static Fluid moltenNincodium;
	public static MoltenNincodium moltenNincodiumBlock;
	public static BlockNincodium nincodiumBlock;
	public static BlockNincodiumOre nincodiumOre;
	public static Fluid moltenLapis;
	public static MoltenLapis moltenLapisBlock;
	public static BlockQuartzOre quartzOre;

	public static void init() {
		moltenNincodium = new Fluid("moltenNincodium");
		nincodiumBlock = new BlockNincodium();
		nincodiumOre = new BlockNincodiumOre();
		quartzOre = new BlockQuartzOre();
		moltenLapis = new Fluid("moltenLapis");
		FluidRegistry.registerFluid(moltenNincodium);
		FluidRegistry.registerFluid(moltenLapis);
		moltenNincodiumBlock = new MoltenNincodium(moltenNincodium);
		moltenLapisBlock = new MoltenLapis(moltenLapis);

		GameRegistry.registerBlock(moltenNincodiumBlock, "moltenNincodiumBlock");
		GameRegistry.registerBlock(moltenLapisBlock, "moltenLapisBlock");
		GameRegistry.registerBlock(nincodiumBlock, "nincodiumBlock");
		GameRegistry.registerBlock(nincodiumOre, "nincodiumOre");
		GameRegistry.registerBlock(quartzOre, "quartzOre");

		BotaniaAPI.registerSubTile(Names.Blocks.SUBTILE_ORECHID_MYSTICA, SubTileOrechidMystica.class);
		BotaniaAPI.registerSubTile(Names.Blocks.SUBTILE_ORECHID_FINIS, SubTileOrechidFinis.class);
		BotaniaAPI.subtilesForCreativeMenu.addAll(Arrays
				.asList(new String[] { Names.Blocks.SUBTILE_ORECHID_MYSTICA, Names.Blocks.SUBTILE_ORECHID_FINIS }));

		OreDictionary.registerOre(Names.OreDictionary.QUARTZ_ORE, quartzOre);
		OreDictionary.registerOre(Names.OreDictionary.NINCODIUM_ORE, nincodiumOre);
	}

}
