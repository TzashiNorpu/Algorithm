package algo.tzashinorpu;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        instance.set(2021, 0, 10);
        int maximum = instance.getActualMaximum(Calendar.DAY_OF_MONTH);
        Date time = instance.getTime();
        instance.setTimeZone(TimeZone.getDefault());
        System.out.println(time);
    }
}
