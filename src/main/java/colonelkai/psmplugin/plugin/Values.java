package colonelkai.psmplugin.plugin;

import colonelkai.psmplugin.battlesession.BattleSession;
import org.bukkit.ChatColor;

public interface Values {

    public static String prefix = ChatColor.BLUE + "[PSMPlugin]" + ChatColor.RESET;

    public static BattleSession currentBattleSession = null;
}
