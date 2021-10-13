package algo.tzashinorpu;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        class User {
            String name = "Hello";
        }
        HashMap<Object, Object> map = new HashMap<>();
        User user = new User();
        map.put(1, user);
        Map<Object, Object> map1 = Collections.unmodifiableMap(map);
        User o = (User) map1.get(1);
        o.name = "Tzashi";
        System.out.println(map1.get(1));
    }
}
