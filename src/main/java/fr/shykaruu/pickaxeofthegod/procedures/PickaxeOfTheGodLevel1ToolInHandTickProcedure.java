package fr.shykaruu.pickaxeofthegod.procedures;

import net.minecraft.item.ItemStack;

import java.util.Map;

import fr.shykaruu.pickaxeofthegod.PickaxeofthegodMod;

public class PickaxeOfTheGodLevel1ToolInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PickaxeofthegodMod.LOGGER.warn("Failed to load dependency itemstack for procedure PickaxeOfTheGodLevel1ToolInHandTick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).setDamage((int) 0);
	}
}
