package fr.shykaruu.pickaxeofthegod.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.shykaruu.pickaxeofthegod.PickaxeofthegodMod;

public class PickaxeOfTheGodLevel2BlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PickaxeofthegodMod.LOGGER.warn("Failed to load dependency entity for procedure PickaxeOfTheGodLevel2BlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PickaxeofthegodMod.LOGGER.warn("Failed to load dependency itemstack for procedure PickaxeOfTheGodLevel2BlockDestroyedWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).setDamage((int) 0);
		((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag().putDouble(
				"PickaxeOfTheGodLevel2Xp", (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getOrCreateTag().getDouble("PickaxeOfTheGodLevel2Xp") + 1));
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					("\u00A72" + (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getOrCreateTag().getDouble("PickaxeOfTheGodLevel2Xp")) + "\u00A7c/500 xp.")),
					(true));
		}
	}
}
