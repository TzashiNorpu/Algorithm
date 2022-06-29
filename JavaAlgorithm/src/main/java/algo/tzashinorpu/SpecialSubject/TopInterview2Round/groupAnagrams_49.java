package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String t = transfer(s);
            map.putIfAbsent(t, new ArrayList<>());
            map.get(t).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String transfer(String s) {
        char[] arr = new char[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        return new String(arr);
    }
}
