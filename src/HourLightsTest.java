import junit.framework.TestCase;

/**
 * Created by Madzia on 2016-03-03.
 */
public class HourLightsTest extends TestCase {

    public void testConvert2Lights() throws Exception {
        int currentHour = 0;
        HourLights hourLights = new HourLights(currentHour);
        assertEquals(hourLights.convert2Lights(), "OOOO OOOO");

        currentHour = 13;
        hourLights = new HourLights(currentHour);
        assertEquals(hourLights.convert2Lights(), "RROO RRRO");

        currentHour = 23;
        hourLights = new HourLights(currentHour);
        assertEquals(hourLights.convert2Lights(), "RRRR RRRO");

        currentHour = 24;
        hourLights = new HourLights(currentHour);
        assertEquals(hourLights.convert2Lights(), "RRRR RRRR");
    }

}