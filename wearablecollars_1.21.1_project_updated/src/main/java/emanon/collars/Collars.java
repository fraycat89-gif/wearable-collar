/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  emanon.collars.items.ModItems
 *  net.fabricmc.api.ModInitializer
 */
package emanon.collars;

import emanon.collars.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Collars
implements ModInitializer {
    public static final String ID = "collars";
    public static final Logger LOGGER = LoggerFactory.getLogger("collars");

    public void onInitialize() {
        LOGGER.info("Emanon - Initializing collars!");
        ModItems.registerItems();
    }
}
