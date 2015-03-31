package com.nincodedo.nincraftythings.handler;

import com.nincodedo.nincraftythings.init.ModItems;
import com.nincodedo.nincraftythings.utility.LogHelper;
import com.nincodedo.nincraftythings.utility.MoonModifierDamageSource;
import com.sun.org.apache.xpath.internal.operations.Mod;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DamageModifierHandler {

	@SubscribeEvent
	public void attackedEntity(LivingAttackEvent event) {
		if (event.source.getEntity() instanceof EntityPlayerMP
				&& event.source.damageType.equals("player")) {
			EntityPlayerMP player = (EntityPlayerMP) event.source.getEntity();
			if (player.getHeldItem() != null
					&& player.getHeldItem().getItem()
							.equals(ModItems.nincodiumSword)) {
				int moonPhase = player.worldObj.getMoonPhase();
				float damage = event.ammount;
				event.setCanceled(true);
				switch (moonPhase) {
				case 0:
				case 1:
					damage = damage * 0.7F;
					break;
				case 2:
				case 3:
					damage = damage * 0.85F;
					break;
				case 4:
				case 5:
					// no change in damage
					break;
				case 6:
				case 7:
					damage = damage * 1.15F;
					break;
				}
				event.entity.attackEntityFrom(new MoonModifierDamageSource(
						"moonModifier", player), damage);
			}
		}
	}

}
