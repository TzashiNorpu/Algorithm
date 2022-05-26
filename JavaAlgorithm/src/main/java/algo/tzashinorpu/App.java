package algo.tzashinorpu;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateString = simpleDateFormat.format(new Date());
        System.out.println(Integer.parseInt(dateString));
        System.out.println(Integer.parseInt(dateString) + 100);
    }
}
