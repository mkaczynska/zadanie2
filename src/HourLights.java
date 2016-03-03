import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Madzia on 2016-03-02.
 */
public class HourLights {

    /**
     * List fiveHour contains 4 lights, each representing 5 hours
     */
    List<Character> fiveHour;
    /**
     * List fiveHour contains 4 lights, each representing 1 hour
     */
    List<Character> oneHour;
    /**
     * Current number of hours unconverted
     */
    private int currentHour;
    private static final int FIVEHOURDIV = 5;


    public HourLights(int currentHour) {
        fiveHour = new ArrayList<>(Arrays.asList(LightType.OFF,LightType.OFF,LightType.OFF,LightType.OFF));
        oneHour = new ArrayList<>(Arrays.asList(LightType.OFF,LightType.OFF,LightType.OFF,LightType.OFF));
        this.currentHour = currentHour;
    }


    /**
     * Method converts hour to light representation
     * @return converted to lights representation of hour
     */
    String convert2Lights() {
        int div = currentHour / FIVEHOURDIV;
        int rest = currentHour % FIVEHOURDIV;
        for(int i=0; i<div; i++) {
            fiveHour.set(i,LightType.RED);
        }
        for(int i=0; i<rest; i++) {
            oneHour.set(i,LightType.RED);
        }
        return (fiveHour.toString().replaceAll(", ","") + " " + oneHour.toString().replaceAll(", ","")).replaceAll("\\[|\\]", "");
    }
}
