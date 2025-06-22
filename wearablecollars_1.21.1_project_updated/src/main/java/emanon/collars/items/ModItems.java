/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  emanon.collars.items.WearableCollar
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.minecraft.class_1792
 *  net.minecraft.class_1935
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_5321
 *  net.minecraft.class_7706
 *  net.minecraft.class_7923
 */
package emanon.collars.items;

import emanon.collars.items.WearableCollar;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_1792;
import net.minecraft.class_1935;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_7706;
import net.minecraft.class_7923;

public class ModItems {
    public static final WearableCollar COLLAR = new WearableCollar();

    private static void registerItem(String name, class_1792 item) {
        class_2378.method_10230((class_2378)class_7923.field_41178, (class_2960)new class_2960("collars", name), (Object)item);
    }

    public static void registerItems() {
        ModItems.registerItem("collar", (class_1792)COLLAR);
        ItemGroupEvents.modifyEntriesEvent((class_5321)class_7706.field_41060).register(content -> content.method_45421((class_1935)COLLAR));
    }
}
