package net.minecord.testplugin

import net.minecord.testplugin.listener.TestListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.plugin.java.annotation.plugin.Description
import org.bukkit.plugin.java.annotation.plugin.Plugin
import org.bukkit.plugin.java.annotation.plugin.author.Author

@Plugin(name = "TestPlugin", version = "1.0")
@Description("BentoBox test plugin for events")
@Author("Rixafy")
class TestPlugin : JavaPlugin() {
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(TestListener(this), this)
    }
}
