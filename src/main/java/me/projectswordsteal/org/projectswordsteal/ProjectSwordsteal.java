package me.projectswordsteal.org.projectswordsteal;

import me.projectswordsteal.org.projectswordsteal.listeners.events.test_events;
import me.projectswordsteal.org.projectswordsteal.listeners.test_listeners;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
