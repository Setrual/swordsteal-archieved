package me.projectswordsteal.org.projectswordsteal.listeners.message;

import me.projectswordsteal.org.projectswordsteal.ProjectSwordsteal;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class cmd_logs extends JavaPlugin implements Listener {
    private static void test01() {
        System.out.println("msg ran!");
    }

    public static void startupmsg() {
        System.out.println("Started Swordsteal Plugin");
    }
    private static void pmsg(String message) {
        System.out.println(message);
    }

    public static void test02() {
        System.out.println("Test had ran sucessfully!");
    }

    public static void regEventsLog() {
        System.out.println("Registering Events...");

    }

    public static void CompleteLog() {
        System.out.println("Completed.");
    }
}
