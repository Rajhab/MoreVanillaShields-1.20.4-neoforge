package com.rajhab.morevanillashields_mod;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreVanillaShieldsConfig
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec.ConfigValue<Integer> LEATHER_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Leather Shield. Default Value is 196")
            .define("leatherShieldDurability", 196);

    public static final ModConfigSpec.ConfigValue<Integer> GOLD_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Gold Shield. Default Value is 322")
            .define("goldShieldDurability", 322);

    public static final ModConfigSpec.ConfigValue<Integer> DIAMOND_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Diamond Shield. Default Value is 512")
            .define("diamondShieldDurability", 512);

    public static final ModConfigSpec.ConfigValue<Integer> GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Glass Shield. Default Value is 300")
            .define("glassShieldDurability", 300);

    public static final ModConfigSpec.ConfigValue<Integer> TINTED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Tinted Glass Shield. Default Value is 300")
            .define("tintedGlassShieldDurability", 300);

    public static final ModConfigSpec.ConfigValue<Integer> NETHERITE_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Netherite Shield. Default Value is 2042")
            .define("netheriteShieldDurability", 2042);

    public static final ModConfigSpec.ConfigValue<Integer> EMERALD_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Emerald Shield. Default Value is 512")
            .define("emeraldShieldDurability", 512);

    public static final ModConfigSpec.ConfigValue<Integer> AMETHYST_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Amethyst Shield. Default Value is 432")
            .define("amethystShieldDurability", 432);

    public static final ModConfigSpec.ConfigValue<Integer> OBSIDIAN_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Obsidian Shield. Default Value is 610")
            .define("obsidianShieldDurability", 610);

    public static final ModConfigSpec.ConfigValue<Integer> COAL_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Coal Shield. Default Value is 268")
            .define("coalShieldDurability", 268);

    public static final ModConfigSpec.ConfigValue<Integer> END_CRYSTAL_SHIELD_DURABILITY = BUILDER
            .comment("Durability of End Crystal Shield. Default Value is 750")
            .define("endCrystalShieldDurability", 750);


    static final ModConfigSpec SPEC = BUILDER.build();
    public static int leatherShieldDurability;
    public static int goldShieldDurability;
    public static int diamondShieldDurability;
    public static int glassShieldDurability;
    public static int tintedGlassShieldDurability;
    public static int netheriteShieldDurability;
    public static int emeraldShieldDurability;
    public static int amethystShieldDurability;
    public static int obsidianShieldDurability;
    public static int coalShieldDurability;
    public static int endCrystalShieldDurability;

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        leatherShieldDurability = LEATHER_SHIELD_DURABILITY.get();
        goldShieldDurability = GOLD_SHIELD_DURABILITY.get();
        diamondShieldDurability = DIAMOND_SHIELD_DURABILITY.get();
        glassShieldDurability = GLASS_SHIELD_DURABILITY.get();
        tintedGlassShieldDurability = TINTED_GLASS_SHIELD_DURABILITY.get();
        netheriteShieldDurability = NETHERITE_SHIELD_DURABILITY.get();
        emeraldShieldDurability = EMERALD_SHIELD_DURABILITY.get();
        amethystShieldDurability = AMETHYST_SHIELD_DURABILITY.get();
        obsidianShieldDurability = OBSIDIAN_SHIELD_DURABILITY.get();
        coalShieldDurability = COAL_SHIELD_DURABILITY.get();
        endCrystalShieldDurability = END_CRYSTAL_SHIELD_DURABILITY.get();
    }
}