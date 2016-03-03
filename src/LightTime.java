import java.util.Calendar;

/**
 * Created by Madzia on 2016-03-02.
 */
public class LightTime {

    /**
     * Object to convert hours to lights
     */
    HourLights hourLights;
    /**
     * Object to convert minutes to lights
     */
    MinuteLights minuteLights;
    /**
     * Object to convert seconds lights
     */
    SecondLight secondLight;
    /**
     * Time converted to lights represented as a string
     */
    String convertedTime;

    public LightTime(Calendar calendar) {

        hourLights = new HourLights(calendar.get(Calendar.HOUR_OF_DAY));
        minuteLights = new MinuteLights(calendar.get(Calendar.MINUTE));
        secondLight = new SecondLight(calendar.get(Calendar.SECOND));
        convertedTime = "";
    }

    /**
     * Method converts time to light representation
     * @return converted to lights representation of time
     */
    public String convert() {
        convertedTime = secondLight.convert2Lights() + " " + hourLights.convert2Lights() + " " + minuteLights.convert2Lights();
        return convertedTime;
    }
}
