package colonelkai.psmplugin.battlesession;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class BattleSession {
    private Set<BattleUser> sideA = new HashSet<>();
    private Set<BattleUser> sideB = new HashSet<>();
    private Set<BattleUser> sideAMods = new HashSet<>();
    private Set<BattleUser> sideBMods = new HashSet<>();

    private String sideAName = "Side A";
    private String sideBName = "Side B";



    //region ----- GETTERS AND SETTERS -----

    public String getSideAName() {
        return sideAName;
    }

    public void setSideAName(String sideAName) {
        this.sideAName = sideAName;
    }

    public String getSideBName() {
        return sideBName;
    }

    public void setSideBName(String sideBName) {
        this.sideBName = sideBName;
    }

    public Set<BattleUser> getSideA() {
        return sideA;
    }

    public Set<BattleUser> getSideB() {
        return sideB;
    }

    public Set<BattleUser> getSideAMods() {
        return sideAMods;
    }

    public Set<BattleUser> getSideBMods() {
        return sideBMods;
    }
    //endregion
}
