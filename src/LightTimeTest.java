import junit.framework.TestCase;

import java.util.Calendar;

/**
 * Created by Madzia on 2016-03-03.
 */
public class LightTimeTest extends TestCase {

    public void testConvert() throws Exception {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, 13);
        calendar.set(Calendar.MINUTE, 17);
        calendar.set(Calendar.SECOND, 01);
        LightTime lightTime = new LightTime(calendar);
        assertEquals(lightTime.convert(),"O RROO RRRO YYROOOOOOOO YYOO");

        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        lightTime = new LightTime(calendar);
        assertEquals(lightTime.convert(),"O RRRR RRRO YYRYYRYYRYY YYYY");

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        lightTime = new LightTime(calendar);
        assertEquals(lightTime.convert(),"Y OOOO OOOO OOOOOOOOOOO OOOO");
    }
}