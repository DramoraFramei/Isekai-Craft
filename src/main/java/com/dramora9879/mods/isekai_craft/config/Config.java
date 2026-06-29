package com.dramora9879.mods.isekai_craft.config;

import com.dramora9879.mods.isekai_craft.Isekai_craft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
@EventBusSubscriber(modid = Isekai_craft.MODID)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue MOD_ENABLED = BUILDER.comment("Whether the mod should be enabled").define("modEnabled", true);

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean modEnabled;

    private static boolean validateBoolean(final Object obj) {
        return obj instanceof Boolean;
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        modEnabled = MOD_ENABLED.get();
    }
}
