package com.rajhab.morevanillashields_mod.item;


import com.rajhab.morevanillashields_mod.MoreVanillaShieldsConfig.*;
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

import static com.rajhab.morevanillashields_mod.MoreVanillaShieldsConfig.DIAMOND_SHIELD_DURABILITY;
import static com.rajhab.morevanillashields_mod.MoreVanillaShieldsConfig.diamondShieldDurability;
import static com.rajhab.morevanillashields_mod.morevanillashields.MOD_ID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    //Shield
    public static final DeferredItem<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().durability(196)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.leather_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });



    public static final DeferredItem<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().durability(322)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.gold_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().durability(512))

    {

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.diamond_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.glass_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.tinted_glass_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().durability(2042)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.netherite_shield").withStyle(ChatFormatting.DARK_AQUA));
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

    /*public static final RegistryObject<Item> REDSTONE_SHIELD = ITEMS.register("redstone_shield",
            () -> new ShieldItem(new Item.Properties().durability(316)));*/

    public static final DeferredItem<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().durability(512)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.emerald_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().durability(432)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.amethyst_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().durability(610)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.obsidian_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().durability(268)) {
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.coal_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final DeferredItem<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().durability(750)) {

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.end_crystal_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }


            });
}
