package colonelkai.psmplugin.bordermaker;

import colonelkai.psmplugin.PSMPlugin;
import org.dynmap.markers.Marker;
import org.dynmap.markers.MarkerAPI;
import org.dynmap.markers.MarkerSet;

public class Anchor {

    int x;
    int z;
    int anchorID;
    Marker anchorMarker;

    public Anchor(int x, int z, int anchorID) {
        this.x = x;
        this.z = z;
        this.anchorID = anchorID;
    }

    private void setAnchor() {
        MarkerAPI mapi = PSMPlugin.getDynmapApi().getMarkerAPI();


    }


}
