import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Madzia on 2016-03-02.
 */
public class MinuteLights {
    /**
     * List fiveMinute contains 11 lights, each representing 5 minutes
     */
    List<Character> fiveMinute;
    /**
     * List oneMinute contains 4 lights, each representing 1 minute
     */
    List<Character> oneMinute;
    /**
     * Current number of minutes unconverted
     */
    private int currentMinutes;
    private static final int FIVEMINDIV = 5;

    public MinuteLights(int currentMinutes) {
        fiveMinute = new ArrayList<>();
        for(int i=0; i<11; i++) {
            fiveMinute.add(LightType.OFF);
        }
        oneMinute = new ArrayList<>(Arrays.asList(LightType.OFF,LightType.OFF,LightType.OFF,LightType.OFF));
        this.currentMinutes = currentMinutes;
    }

    /**
     * Method converts minutes to light representation
     * @return converted to lights representation of minutes
     */
    String convert2Lights() {
        int div = currentMinutes / FIVEMINDIV;
        int rest = currentMinutes % FIVEMINDIV;
        for(int i=0; i<div; i++) {
            if ((i+1) % 3 == 0) {
                fiveMinute.set(i,LightType.RED);
            } else {
                fiveMinute.set(i,LightType.YELLOW);
            }
        }
        for(int i=0; i<rest; i++) {
            oneMinute.set(i,LightType.YELLOW);
        }
        return (fiveMinute.toString().replaceAll(", ","") + " " + oneMinute.toString().replaceAll(", ","")).replaceAll("\\[|\\]", "");
    }
}
