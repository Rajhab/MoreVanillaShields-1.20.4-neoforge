package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.MoreVanillaShieldsConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.rajhab.morevanillashields_mod.morevanillashields.MOD_ID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    //Shield
    public static final DeferredItem<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(196)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.LEATHER_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.leather_shield").append(String.valueOf(MoreVanillaShieldsConfig.LEATHER_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });



    public static final DeferredItem<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(322)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.GOLD_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.gold_shield").append(String.valueOf(MoreVanillaShieldsConfig.GOLD_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.DIAMOND_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.diamond_shield").append(String.valueOf(MoreVanillaShieldsConfig.DIAMOND_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.glass_shield").append(String.valueOf(MoreVanillaShieldsConfig.GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.TINTED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.tinted_glass_shield").append(String.valueOf(MoreVanillaShieldsConfig.TINTED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(2042)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.NETHERITE_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.netherite_shield").append(String.valueOf(MoreVanillaShieldsConfig.NETHERITE_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }

                @Override
                public boolean isFireResistant() {
                    return true;
                }
            });

    public static final DeferredItem<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.EMERALD_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.emerald_shield").append(String.valueOf(MoreVanillaShieldsConfig.EMERALD_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(432)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.AMETHYST_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.amethyst_shield").append(String.valueOf(MoreVanillaShieldsConfig.AMETHYST_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(610)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.OBSIDIAN_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.obsidian_shield").append(String.valueOf(MoreVanillaShieldsConfig.OBSIDIAN_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(268)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.COAL_SHIELD_DURABILITY.get();
                }

                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.coal_shield").append(String.valueOf(MoreVanillaShieldsConfig.COAL_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(750)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return MoreVanillaShieldsConfig.END_CRYSTAL_SHIELD_DURABILITY.get();
                }

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.end_crystal_shield").append(String.valueOf(MoreVanillaShieldsConfig.END_CRYSTAL_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }


            });
}
