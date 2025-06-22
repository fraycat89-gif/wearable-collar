/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.FabricItemSettings
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1768
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_5151
 */
package emanon.collars.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1768;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_5151;

public class WearableCollar
extends class_1792
implements class_5151,
class_1768 {
    public WearableCollar() {
        super((class_1792.class_1793)new FabricItemSettings().maxCount(1));
    }

    public class_1304 method_7685() {
        return class_1304.field_6169;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        return this.method_48576(this, world, user, hand);
    }

    public class_3414 method_31570() {
        return class_3417.field_15191;
    }
}
