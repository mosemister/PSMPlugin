package colonelkai.psmplugin.battlesession;

import colonelkai.psmplugin.plugin.Values;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.UUID;

public class BattleUser {

    private UUID uuid;
    private String username;
    private int deathCount;

    public void die(PlayerDeathEvent e) {
        this.deathCount += 1;
        e.getEntity().sendMessage(Values.prefix + "You have died " + deathCount + " times.");

        if (deathCount >= 3) {
            // oh boy you're fucked
            Bukkit.broadcast(new TextComponent(Values.prefix + e.getEntity().getName() + " has died 3 times and is out of the battle."));
            // TODO: Ask tim what happens when you die 3 times.
        }
    }

    // region GETTERS AND SETTERS
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public void setDeathCount(int deathCount) {
        this.deathCount = deathCount;
    }
    // endregion
}
