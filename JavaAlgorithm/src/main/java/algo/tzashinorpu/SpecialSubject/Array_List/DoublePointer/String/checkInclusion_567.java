package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.String;

import java.util.HashMap;

public class checkInclusion_567 {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
        for (char c : s1.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);

        int left = 0, right = 0;
        int valid = 0;

        int len = s1.length();
        while (right < s2.length()) {
            // c 是将移⼊窗⼝的字符
            char c = s2.charAt(right);
            // 增⼤窗⼝
            right++;
            // 进⾏窗⼝内数据的⼀系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).equals(window.get(c))) valid++;
            }
            // 判断左侧窗⼝是否要收缩
            while (need.size() == valid) {
                // [,)  左闭又开
                if (right - left == len) {
                    return true;
                }
                // d 是将移出窗⼝的字符
                char d = s2.charAt(left);
                // 缩⼩窗⼝
                left++;
                // 进⾏窗⼝内数据的⼀系列更新
                if (need.containsKey(d)) {
                    window.put(d, window.getOrDefault(d, 0) - 1);
                    if (window.get(d) < need.get(d)) valid--;
                }
            }
        }
        return false;
    }
}
