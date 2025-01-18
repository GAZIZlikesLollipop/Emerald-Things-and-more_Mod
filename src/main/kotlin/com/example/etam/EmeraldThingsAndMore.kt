package com.example.etam

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import com.example.etam.item.tool.registerItems

object EmeraldThingsAndMore : ModInitializer {
    const val MOD_ID : String = "emerald-things-and-more"
    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
	    registerItems()
	}
}