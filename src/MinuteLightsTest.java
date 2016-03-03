import junit.framework.TestCase;

/**
 * Created by Madzia on 2016-03-03.
 */
public class MinuteLightsTest extends TestCase {

    public void testConvert2Lights() throws Exception {
        int currentMinutes = 0;
        MinuteLights minuteLights = new MinuteLights(currentMinutes);
        assertEquals(minuteLights.convert2Lights(), "OOOOOOOOOOO OOOO");

        currentMinutes = 17;
        minuteLights = new MinuteLights(currentMinutes);
        assertEquals(minuteLights.convert2Lights(), "YYROOOOOOOO YYOO");

        currentMinutes = 59;
        minuteLights = new MinuteLights(currentMinutes);
        assertEquals(minuteLights.convert2Lights(), "YYRYYRYYRYY YYYY");

    }
}