package me.projectswordsteal.org.projectswordsteal;

import me.projectswordsteal.org.projectswordsteal.listeners.events.test_events;
import me.projectswordsteal.org.projectswordsteal.listeners.test_listeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static me.projectswordsteal.org.projectswordsteal.listeners.message.cmd_logs.*;

public final class ProjectSwordsteal extends JavaPlugin implements Listener {



    @Override
    public void onEnable() {
        // Plugin startup logic
        regEventsLog();
        Bukkit.getPluginManager().registerEvents(this, this);
        CompleteLog();


    }
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        e.setDeathMessage("Test");

    }

    @EventHandler
    public void onPlayerKill(PlayerJoinEvent e) {
        e.getPlayer();
        e.setJoinMessage("test");
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
