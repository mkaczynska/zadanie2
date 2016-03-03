import junit.framework.TestCase;

/**
 * Created by Madzia on 2016-03-03.
 */
public class SecondLightTest extends TestCase {

    public void testConvert2Lights() throws Exception {

        int currentSeconds = 0;
        SecondLight secondLight = new SecondLight(currentSeconds);
        assertEquals(secondLight.convert2Lights(), String.valueOf(LightType.YELLOW));

        currentSeconds = 59;
        secondLight = new SecondLight(currentSeconds);
        assertEquals(secondLight.convert2Lights(), String.valueOf(LightType.OFF));
    }
}