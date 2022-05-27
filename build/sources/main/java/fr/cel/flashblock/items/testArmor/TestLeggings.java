package fr.cel.flashblock.items.testArmor;

import fr.cel.flashblock.Flashblock;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TestLeggings extends ItemArmor {

    public TestLeggings(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Flashblock.tab);
    }

}
