package colonelkai.psmplugin.bordermaker;

import colonelkai.psmplugin.PSMPlugin;
import org.dynmap.DynmapCommonAPI;
import org.dynmap.markers.MarkerSet;

public class BorderMaker {
    // --- STATIC FINAL VALUES ---
    public static final String MSET_ID = "bordermaker.markerset";
    public static final String MSET_LABEL = "BorderMaker";
    public static final String WORLD = "world";
    public static final String MARKER_NAME = "pin";

    // --- ATTRIB ---
    private MarkerSet markerSet;

    public BorderMaker() {

        this.markerSet = createMarkerSet();
    }

    private MarkerSet createMarkerSet() {
        DynmapCommonAPI dapi = PSMPlugin.getDynmapApi();
        MarkerSet markerSet = dapi.getMarkerAPI().createMarkerSet(
                MSET_ID,
                MSET_LABEL,
                dapi.getMarkerAPI().getMarkerIcons(),
                false);

        return markerSet;
    }

}
