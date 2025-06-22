/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  emanon.collars.CollarsClient
 *  emanon.collars.items.ModItems
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1087
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_763
 *  net.minecraft.class_811
 *  net.minecraft.class_918
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package emanon.collars.mixin.client;

import emanon.collars.CollarsClient;
import emanon.collars.items.ModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1087;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_763;
import net.minecraft.class_811;
import net.minecraft.class_918;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_918.class})
public abstract class ItemRendererMixin {
    @Shadow
    @Final
    private class_763 field_4732;

    @ModifyVariable(method={"renderItem"}, at=@At(value="HEAD"), argsOnly=true)
    private class_1087 useCollarModel(class_1087 value, class_1799 stack, class_811 renderMode, boolean leftHanded, class_4587 matrices, class_4597 vertexConsumers, int light, int overlay) {
        if (!stack.method_31574((class_1792)ModItems.COLLAR)) return value;
        if (renderMode == class_811.field_4317) return value;
        return this.field_4732.method_3303().method_4742(CollarsClient.COLLAR_3D);
    }
}
