package net.minecraft.server;

public class MobEffectAttackDamage extends MobEffectList {

    protected MobEffectAttackDamage(int i, MinecraftKey yolo,boolean flag, int j) {
        super(i, yolo, flag, j);
    }

    public double a(int i, AttributeModifier attributemodifier) {
        return this.id == MobEffectList.WEAKNESS.id ? (double) (-0.5F * (float) (i + 1)) : 0.3D * (double) (i + 1); /** Alkazia */
    }
}