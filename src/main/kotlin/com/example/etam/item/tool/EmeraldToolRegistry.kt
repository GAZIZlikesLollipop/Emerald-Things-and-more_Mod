package com.example.etam.item.tool

import net.minecraft.util.registry.Registry
import net.minecraft.util.Identifier
import net.minecraft.item.ItemGroup
import net.minecraft.item.Item.Settings as FabricItemSettings
import net.minecraft.item.PickaxeItem
import net.minecraft.item.AxeItem
import net.minecraft.item.ShovelItem
import net.minecraft.item.SwordItem
import net.minecraft.item.HoeItem
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.item.Items

object EmeraldToolMaterial : ToolMaterial {
    override fun getDurability() = 750  // Прочность (как у алмазного)
    override fun getMiningSpeedMultiplier() = 8.0f  // Скорость добычи
    override fun getAttackDamage() = 6.5f  // Урон от оружия
    override fun getMiningLevel() = 2  // Уровень добычи (подходит для железных и выше)
    override fun getEnchantability() = 12  // Шанс на зачарование
    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Items.EMERALD)  // Для ремонта используем изумруды
    }
}

val EMERALD_PICKAXE = PickaxeItem(
    CustomToolMaterial,
    1,  // Урон
    -2.8f,  // Скорость атаки
    FabricItemSettings().group(ItemGroup.TOOLS) // Группа предметов
)

val EMERALD_AXE = AxeItem(
    CustomToolMaterial,
    6.0f, // Урон
    -3.0f, // Скорость атаки
    FabricItemSettings().group(ItemGroup.TOOLS)
)

val EMERALD_SHOVEL = ShovelItem(
    CustomToolMaterial,
    6.5f, // Урон
    -3.0f, // Скорость атаки
    FabricItemSettings().group(ItemGroup.TOOLS)
)

val EMERALD_SWORD = SwordItem(
    CustomToolMaterial,
    3, // Урон
    -2.4f, // Скорость атаки
    FabricItemSettings().group(ItemGroup.COMBAT)
)

val EMERALD_HOE = HoeItem(
    CustomToolMaterial,
    1, // Урон
    -1.0f, // Скорость атаки
    FabricItemSettings().group(ItemGroup.TOOLS)
)

fun registerItems() {
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_pickaxe"), EMERALD_PICKAXE)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_axe"), EMERALD_AXE)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_shovel"), EMERALD_SHOVEL)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_sword"), EMERALD_SWORD)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_hoe"), EMERALD_HOE)
}