package fr.cel.flashblock.entity;

import fr.cel.flashblock.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityRobotPig extends EntityAnimal {

    public EntityRobotPig(World worldIn){
        super(worldIn);

        this.setSize(0.9f, 0.9f);
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.tasks.addTask(0, new EntityAITempt(this, 0.70021546D, ModItems.flashblockLogo, false));

    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.66595D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(5);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }
}
