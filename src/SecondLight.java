/**
 * Created by Madzia on 2016-03-02.
 */
public class SecondLight {
    /**
     * Light representing seconds - odd/even parity
     */
    Character light;
    /**
     * Current number of seconds unconverted
     */
    private int currentSeconds;
    private static final int SECDIV = 2;

    public SecondLight(int currentSeconds) {
        this.currentSeconds = currentSeconds;
        light = LightType.OFF;
    }

    /**
     * Method converts seconds to light representation
     * @return converted to lights representation of seconds - odd/even parity
     */
    String convert2Lights() {
        if (currentSeconds % SECDIV == 0) {
            light = LightType.YELLOW;
        }
        return light.toString();
    }
}
