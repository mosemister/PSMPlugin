package colonelkai.psmplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.dynmap.DynmapCommonAPI;
import org.jetbrains.annotations.NotNull;

public final class PSMPlugin extends JavaPlugin {

    static PSMPlugin plugin;
    static DynmapCommonAPI dynmapAPI;

    public static @NotNull PSMPlugin getPlugin() {
        return plugin;
    }

    public static @NotNull DynmapCommonAPI getDynmapApi() {
        return dynmapAPI;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        dynmapAPI = getDynmapApi();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
