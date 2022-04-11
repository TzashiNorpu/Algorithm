package algo.tzashinorpu.ThirdRound.Chapter05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = calcKeys(strs[i]);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    private String calcKeys(String str) {
        char[] cnt = new char[26];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 'a']++;
        }
        return new String(cnt);
    }
}
