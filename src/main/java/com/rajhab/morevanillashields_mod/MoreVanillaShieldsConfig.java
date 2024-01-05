package com.rajhab.morevanillashields_mod;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreVanillaShieldsConfig
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec.ConfigValue<Integer> DIAMOND_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Diamond Shield. Default Value is 512")
            .define("diamondShieldDurability", 512);

    static final ModConfigSpec SPEC = BUILDER.build();
    public static int diamondShieldDurability;

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        diamondShieldDurability = DIAMOND_SHIELD_DURABILITY.get();
    }
}