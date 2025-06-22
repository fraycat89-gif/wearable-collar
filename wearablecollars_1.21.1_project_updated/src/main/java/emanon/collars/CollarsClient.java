/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  emanon.collars.items.ModItems
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin
 *  net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry
 *  net.minecraft.class_1091
 *  net.minecraft.class_1935
 *  net.minecraft.class_2960
 */
package emanon.collars;

import emanon.collars.items.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.class_1091;
import net.minecraft.class_1935;
import net.minecraft.class_2960;

@Environment(value=EnvType.CLIENT)
public class CollarsClient
implements ClientModInitializer {
    public static final class_1091 COLLAR_3D = new class_1091("collars", "collar_3d", "inventory");

    public void onInitializeClient() {
        ModelLoadingPlugin.register(context -> context.addModels(new class_2960[]{COLLAR_3D}));
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            if (tintIndex != 0) return -1;
            return ModItems.COLLAR.method_7800(stack);
        }, (Object[])new class_1935[]{ModItems.COLLAR});
    }
}
