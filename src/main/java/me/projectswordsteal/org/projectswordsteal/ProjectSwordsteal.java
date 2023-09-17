package me.projectswordsteal.org.projectswordsteal;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProjectSwordsteal extends JavaPlugin {


    private static void startupmsg() {
        System.out.println("Enabling Project Swordsteal....");
    }
    private static void pmsg(String message) {
        System.out.println(message);
    }

    public static void test() {
        System.out.println("Test had ran sucessfully!");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        startupmsg();

        pmsg("Checked! Method pmsg worked!");

        test();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
