package colonelkai.psmplugin.psmbattle;

import colonelkai.psmplugin.plugin.Values;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BattleListener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        if(Values.currentBattleSession != null) {

            Set<BattleUser> allBattleUsers = new HashSet<>();
            allBattleUsers.addAll(Values.currentBattleSession.getSideA());
            allBattleUsers.addAll(Values.currentBattleSession.getSideB());

            Optional<BattleUser> optionalBattleUser = allBattleUsers
                        .stream()
                        .filter(battleUser -> battleUser.getUuid().equals(e.getEntity().getUniqueId()))
                        .findAny();

            optionalBattleUser.ifPresent(battleUser -> battleUser.die(e));

        }
    }
}
