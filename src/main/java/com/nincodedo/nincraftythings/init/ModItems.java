package com.nincodedo.nincraftythings.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.nincodedo.nincraftythings.armor.ItemArmorNincodium;
import com.nincodedo.nincraftythings.armor.ItemArmorNincrafty;
import com.nincodedo.nincraftythings.item.ItemNincodiumIngot;
import com.nincodedo.nincraftythings.item.ItemNincrafty;
import com.nincodedo.nincraftythings.item.bucket.ItemBucketNincrafty;
import com.nincodedo.nincraftythings.item.bucket.ItemMoltenLapisBucket;
import com.nincodedo.nincraftythings.item.bucket.ItemMoltenNincodiumBucket;
import com.nincodedo.nincraftythings.item.sword.ItemSwordJimmysSword;
import com.nincodedo.nincraftythings.item.sword.ItemSwordNincodiumSword;
import com.nincodedo.nincraftythings.item.tool.ItemNincodiumPickaxe;
import com.nincodedo.nincraftythings.item.tool.ItemPickaxeNincrafty;
import com.nincodedo.nincraftythings.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static ItemNincrafty nincodiumIngot;
	public static ItemPickaxeNincrafty nincodiumPickaxe;
	public static ItemArmorNincrafty nincodiumHelmet;
	public static ItemArmorNincrafty nincodiumChestplate;
	public static ItemArmorNincrafty nincodiumLeggings;
	public static ItemArmorNincrafty nincodiumBoots;
	public static ItemBucketNincrafty bucketNincodium;
	public static ItemSwordNincodiumSword nincodiumSword;
	public static ItemBucketNincrafty bucketLapis;
	public static ItemSwordJimmysSword jimmysSword;

	public static void init() {
		nincodiumIngot = new ItemNincodiumIngot();
		nincodiumPickaxe = new ItemNincodiumPickaxe();
		nincodiumHelmet = new ItemArmorNincodium(0);
		nincodiumChestplate = new ItemArmorNincodium(1);
		nincodiumLeggings = new ItemArmorNincodium(2);
		nincodiumBoots = new ItemArmorNincodium(3);
		nincodiumSword = new ItemSwordNincodiumSword();
		jimmysSword = new ItemSwordJimmysSword();

		bucketNincodium = new ItemMoltenNincodiumBucket(
				ModBlocks.moltenNincodiumBlock);

		bucketNincodium = new ItemMoltenNincodiumBucket(
				ModBlocks.moltenNincodiumBlock);
		bucketLapis = new ItemMoltenLapisBucket(ModBlocks.moltenLapisBlock);
		FluidContainerRegistry.registerFluidContainer(
				ModBlocks.moltenNincodium, new ItemStack(bucketNincodium),
				new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(ModBlocks.moltenLapis,
				new ItemStack(bucketLapis), new ItemStack(Items.bucket));
		FluidContainerRegistry.registerFluidContainer(
				ModBlocks.moltenNincodium, new ItemStack(bucketNincodium),
				new ItemStack(Items.bucket));

		GameRegistry.registerItem(bucketNincodium, Names.Items.BUCKET_NINCODIUM);
		GameRegistry.registerItem(bucketLapis, Names.Items.BUCKET_LAPIS);
		GameRegistry.registerItem(nincodiumIngot, Names.Items.NINCODIUM_INGOT);
		OreDictionary.registerOre(Names.OreDictionary.NINCODIUM_INGOT, nincodiumIngot);
		GameRegistry.registerItem(nincodiumPickaxe, Names.Tools.NINCODIUM_PICKAXE);
		GameRegistry.registerItem(nincodiumSword, Names.Weapons.NINCODIUM_SWORD);
		GameRegistry.registerItem(jimmysSword, Names.Weapons.JIMMYS_SWORD);

		GameRegistry.registerItem(nincodiumHelmet, Names.Armor.NINCODIUM_HELMET);
		GameRegistry.registerItem(nincodiumChestplate, Names.Armor.NINCODIUM_CHESTPLATE);
		GameRegistry.registerItem(nincodiumLeggings, Names.Armor.NINCODIUM_LEGGINGS);
		GameRegistry.registerItem(nincodiumBoots, Names.Armor.NINCODIUM_BOOTS);
	}
}
