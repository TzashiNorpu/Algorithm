package algo.tzashinorpu;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        class User {
            String name = "Hello";
        }
        HashMap<Object, Object> map = new HashMap<>();
        User user = new User();
        map.put(1, user);
        map.put(2, "Hello");


        Map map1 = Collections.unmodifiableMap(map);
        User o = (User) map1.get(1);
        o.name = "xxxxx";
        System.out.println(map1.get(1));

        Class c = map1.getClass();
        Field m = c.getDeclaredField("m");
        m.setAccessible(true);
        Map ttt = (Map) m.get(map1);
        ttt.put(2, "Tzashi");
        System.out.println("...............");
    }
}
