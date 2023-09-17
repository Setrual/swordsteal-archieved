package me.projectswordsteal.org.projectswordsteal;

import me.projectswordsteal.org.projectswordsteal.listeners.events.test_events;
import me.projectswordsteal.org.projectswordsteal.listeners.test_listeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static me.projectswordsteal.org.projectswordsteal.listeners.message.cmd_logs.CompleteLog;
import static me.projectswordsteal.org.projectswordsteal.listeners.message.cmd_logs.regEventsLog;

public final class ProjectSwordsteal extends JavaPlugin implements Listener {



    @Override
    public void onEnable() {
        // Plugin startup logic
        regEventsLog();
        Bukkit.getPluginManager().registerEvents(new test_listeners(), this);
        CompleteLog();


    }


    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.RED + "You cannot move right now!");

    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {
        e.getPlayer().sendMessage(ChatColor.BLUE + "You just threw an egg!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
