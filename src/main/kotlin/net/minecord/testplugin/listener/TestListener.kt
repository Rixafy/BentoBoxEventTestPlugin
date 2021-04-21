package net.minecord.testplugin.listener

import net.minecord.testplugin.TestPlugin
import net.minecord.testplugin.utils.colored
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import world.bentobox.bentobox.api.events.BentoBoxEvent

class TestListener(private val testPlugin: TestPlugin) : Listener {
    @EventHandler
    fun onBentoBoxEvent(e: BentoBoxEvent) {
        Bukkit.broadcastMessage("&e${testPlugin.name} &7catched &eBentoBox &7event &b${e.eventName}".colored())
    }
}
