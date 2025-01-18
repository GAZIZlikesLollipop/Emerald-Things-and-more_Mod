package com.example.etam.item.tool

import net.minecraft.item.*
import net.minecraft.recipe.Ingredient
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.minecraft.item.Item.Settings as FabricItemSettings


object EmeraldToolMaterial : ToolMaterial {
    override fun getDurability() = 750  // Прочность (как у алмазного)
    override fun getMiningSpeedMultiplier() = 8.0f  // Скорость добычи
    override fun getAttackDamage() = 6.5f  // Урон от оружия
    override fun getMiningLevel() = 2  // Уровень добычи (подходит для железных и выше)
    override fun getEnchantability() = 10  // Шанс на зачарование
    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Items.EMERALD)  // Для ремонта используем изумруды
    }
}

val EMERALD_PICKAXE = PickaxeItem(
    EmeraldToolMaterial,
    1,  // Урон
    -2.8f,  // Скорость атаки
    Item.Settings() // Группа предметов
)

val EMERALD_AXE = AxeItem(
    EmeraldToolMaterial,
    6.0f, // Урон
    -3.0f, // Скорость атаки
    Item.Settings()
)

val EMERALD_SHOVEL = ShovelItem(
    EmeraldToolMaterial,
    6.5f, // Урон
    -3.0f, // Скорость атаки
    Item.Settings()
)

val EMERALD_SWORD = SwordItem(
    EmeraldToolMaterial,
    3, // Урон
    -2.4f, // Скорость атаки
    Item.Settings()
)

val EMERALD_HOE = HoeItem(
    EmeraldToolMaterial,
    1, // Урон
    -1.0f, // Скорость атаки
    Item.Settings()
)

fun registerItems() {
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_pickaxe"), EMERALD_PICKAXE)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_axe"), EMERALD_AXE)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_shovel"), EMERALD_SHOVEL)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_sword"), EMERALD_SWORD)
    Registry.register(Registries.ITEM, Identifier("etam", "emerald_hoe"), EMERALD_HOE)
}