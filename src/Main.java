/**
 * Created by Madzia on 2016-03-02.
 */
import java.util.*;
import java.text.SimpleDateFormat;
public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
        LightTime lightTime = new LightTime(calendar);
        System.out.println(lightTime.convert());
    }

}
