package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAnagrams_438 {
    public List<Integer> findAnagrams_1(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        int pLen = p.length();
        for (int i = 0; i <= s.length() - pLen; i++) {
            if (isAnagram(s.substring(i, i + pLen), p)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isAnagram(String s, String p) {
        char[] sChar = new char[26];
        char[] pChar = new char[26];
        for (int i = 0; i < s.length(); i++) {
            sChar[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            pChar[p.charAt(i) - 'a']++;
        }
        return new String(sChar).equals(new String(pChar));
    }

    public List<Integer> findAnagrams_2(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
        for (char c : p.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);

        int left = 0, right = 0;
        int valid = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while (right < s.length()) {
            // c 是将移⼊窗⼝的字符
            char c = s.charAt(right);
            // 增⼤窗⼝
            right++;
            // 进⾏窗⼝内数据的⼀系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).equals(window.get(c))) valid++;
            }


            // 判断左侧窗⼝是否要收缩
            while (right - left >= p.length()) {
                if (valid == need.size()) res.add(left);
                // d 是将移出窗⼝的字符
                char d = s.charAt(left);
                // 缩⼩窗⼝
                left++;
                // 进⾏窗⼝内数据的⼀系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) valid--;
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        // 索引
        return res;
    }
}
