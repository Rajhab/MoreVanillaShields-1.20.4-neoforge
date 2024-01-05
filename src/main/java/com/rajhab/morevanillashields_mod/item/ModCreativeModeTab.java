package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTab {

    @Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ModCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, morevanillashields.MOD_ID);

        @SubscribeEvent
        public static void buildContents(BuildCreativeModeTabContentsEvent pOutput) {

            if(pOutput.getTabKey() == CreativeModeTabs.COMBAT) {

                pOutput.accept(ModItems.LEATHER_SHIELD);
                pOutput.accept(ModItems.COAL_SHIELD);
                pOutput.accept(ModItems.GOLD_SHIELD);
                //pOutput.accept(ModItems.REDSTONE_SHIELD.get());
                pOutput.accept(ModItems.EMERALD_SHIELD);
                pOutput.accept(ModItems.AMETHYST_SHIELD);
                pOutput.accept(ModItems.GLASS_SHIELD);
                pOutput.accept(ModItems.TINTED_GLASS_SHIELD);
                pOutput.accept(ModItems.DIAMOND_SHIELD);
                pOutput.accept(ModItems.OBSIDIAN_SHIELD);
                pOutput.accept(ModItems.NETHERITE_SHIELD);
                pOutput.accept(ModItems.END_CRYSTAL_SHIELD);
            }
        }

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }
    }
}
