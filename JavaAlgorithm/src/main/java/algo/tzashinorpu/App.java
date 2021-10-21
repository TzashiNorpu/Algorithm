package algo.tzashinorpu;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        class Test {
            Date date;
            int age;

            public Test(Date date, int age) {
                this.date = date;
                this.age = age;
            }
        }
        class User {
            Date date;
            String s;
            Test test;

            public User(Date date, String s, Test test) {
                this.date = date;
                this.s = s;
                this.test = test;
            }
        }
        class Transfer {
            Map m;

            public Transfer(Map m) {
                this.m = m;
            }
        }
        HashSet<Class> primitive = new HashSet<>();
        primitive.add(int.class);
        primitive.add(Integer.class);
        primitive.add(String.class);
        primitive.add(boolean.class);
        primitive.add(Boolean.class);
        Test test = new Test(new Date(), 20);
        User user = new User(new Date(2020, 7, 22), "hello", test);
        HashMap<String, User> hashMap = new HashMap<>();
        hashMap.put("1", user);
        Transfer transfer = new Transfer(hashMap);
        traverse(transfer, primitive);
    }

    private static void traverse(Object obj, HashSet<Class> primitive) throws IllegalAccessException, NoSuchFieldException {
        if (primitive.contains(obj.getClass())) {
            return;
        }
        if (obj instanceof Date) {
            System.out.println(obj);
        }
        System.out.println(obj.getClass());
        for (Field field : obj.getClass().getDeclaredFields()) {
            Object o = field.get(obj);
        }


    }
}
