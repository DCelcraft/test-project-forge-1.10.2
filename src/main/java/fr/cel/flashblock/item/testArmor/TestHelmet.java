package fr.cel.flashblock.item.testArmor;

import fr.cel.flashblock.Flashblock;
import fr.cel.flashblock.creativetab.FlashblockCreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TestHelmet extends ItemArmor {

    public TestHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(FlashblockCreativeTabs.FLASHBLOCK);
    }

}
