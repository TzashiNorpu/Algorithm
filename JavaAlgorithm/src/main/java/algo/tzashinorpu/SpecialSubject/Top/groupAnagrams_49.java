package algo.tzashinorpu.SpecialSubject.Top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String temp = calcKey(s);
//            System.out.println(temp);
            map.putIfAbsent(temp, new ArrayList<>());
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String calcKey(String s) {
        char[] cnt = new char[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        return new String(cnt);
    }
}
