package colonelkai.psmplugin.plugin;

import colonelkai.psmplugin.PSMPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.dynmap.DynmapCommonAPI;

public class DynmapAPIProvider {
    public static DynmapCommonAPI dapi = null;

    public static DynmapCommonAPI registerDynmap() {
        JavaPlugin p = PSMPlugin.getPlugin();

        Bukkit.getLogger().info("Loading Dynmap...");
        dapi = (DynmapCommonAPI) Bukkit.getServer().getPluginManager().getPlugin("dynmap");
        if (dapi == null) {
            Bukkit.getLogger().warning("Failed loading Dynmap.");
            Bukkit.getServer().getPluginManager().disablePlugin(p);
        }
        Bukkit.getLogger().info("Loaded Dynmap.");
        return dapi;
    }
}
