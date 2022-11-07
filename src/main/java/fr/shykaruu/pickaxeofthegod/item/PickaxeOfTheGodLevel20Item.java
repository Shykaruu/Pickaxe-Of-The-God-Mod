
package fr.shykaruu.pickaxeofthegod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.shykaruu.pickaxeofthegod.PickaxeofthegodModElements;

@PickaxeofthegodModElements.ModElement.Tag
public class PickaxeOfTheGodLevel20Item extends PickaxeofthegodModElements.ModElement {
	@ObjectHolder("pickaxeofthegod:pickaxe_of_the_god_level_20")
	public static final Item block = null;

	public PickaxeOfTheGodLevel20Item(PickaxeofthegodModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 22f;
			}

			public float getAttackDamage() {
				return 21f;
			}

			public int getHarvestLevel() {
				return 19;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("pickaxe_of_the_god_level_20"));
	}
}
