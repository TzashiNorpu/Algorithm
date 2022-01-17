package algo.tzashinorpu.Daily.COM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class wordPattern_290 {
    public boolean wordPattern(String pattern, String s) {
        // Input: pattern = "abba", s = "dog cat cat fish"
        // Output: false
        String[] sArr = s.split(" ");
        char[] pArr = pattern.toCharArray();
        HashMap<Character, HashSet<String>> map1 = new HashMap<>();
        for (int i = 0; i < pArr.length; i++) {
            HashSet<String> list = map1.getOrDefault(pArr[i], new HashSet<>());
            list.add(sArr[i]);
            if (list.size() > 1) {
                return false;
            }
            map1.put(pArr[i], list);
        }

        HashMap<String, HashSet<Character>> map2 = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            HashSet<Character> list = map2.getOrDefault(sArr[i], new HashSet<>());
            list.add(pArr[i]);
            if (list.size() > 1) {
                return false;
            }
            map2.put(sArr[i], list);
        }

        return true;
    }
}
